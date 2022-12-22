package com.trs.api.managers;

import com.trs.api.database.CRUD;
import com.trs.modules.tickets.FirstClassTicket;
import com.trs.modules.tickets.SecondClasssTicket;
import com.trs.modules.tickets.ThirdClassTicket;
import com.trs.modules.tickets.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TicketManager extends CRUD {
    private final static List<String> TICKET_COLUMNS = List.of("number", "fare", "Number", "reservationDate", "class");

    public TicketManager() {
        super();
    }

    // a method that fixes the syntax of the Ticket  values in the list
    private static List<String> getTicketValues(Ticket ticket) {
        return List.of(
                ticket.getNumber(),
                String.valueOf(ticket.getFare()),
                String.valueOf(ticket.getTrainNumber()),
                "'" + ticket.getReservationDate() + "'",
                "'" + ticket.getTicketClass() + "'");
    }

    //a method that returns all Tickets from database
    public List<Ticket> getAllTickets() throws SQLException {
        List<Ticket> tickets = new ArrayList<>();
        ResultSet rs = getAll("tickets");
        while (rs.next()) {
            switch (rs.getInt("Class")) {
                case 1 -> tickets.add(new FirstClassTicket(rs.getString("Number"),
                        rs.getInt("Fare"),
                        rs.getInt("TrainNumber"),
                        rs.getTimestamp("Reservation").toLocalDateTime()));
                case 2 -> tickets.add(new SecondClasssTicket(rs.getString("Number"),
                        rs.getInt("Fare"),
                        rs.getInt("TrainNumber"),
                        rs.getTimestamp("Reservation").toLocalDateTime()));
                case 3 -> tickets.add(new ThirdClassTicket(rs.getString("Number"),
                        rs.getInt("Fare"),
                        rs.getInt("TrainNumber"),
                        rs.getTimestamp("Reservation").toLocalDateTime()));
                default -> throw new IllegalStateException("ticket class doesn't exist: " + rs.getInt("Class"));
            }
        }
        return tickets;
    }

    //a method that returns a single Ticket from database
    public Ticket getTicket(String number) throws SQLException {
        ResultSet rs = get("tickets", "Number", number);
        if (rs.next()) {
            switch (rs.getInt("class")) {
                case 1 -> {
                    return new FirstClassTicket(rs.getString("Number"),
                            rs.getInt("Fare"),
                            rs.getInt("TrainNumber"),
                            rs.getTimestamp("Reservation").toLocalDateTime());
                }
                case 2 -> {
                    return new SecondClasssTicket(rs.getString("Number"),
                            rs.getInt("Fare"),
                            rs.getInt("TrainNumber"),
                            rs.getTimestamp("Reservation").toLocalDateTime());
                }
                case 3 -> {
                    return new ThirdClassTicket(rs.getString("Number"),
                            rs.getInt("Fare"),
                            rs.getInt("TrainNumber"),
                            rs.getTimestamp("Reservation").toLocalDateTime());
                }
                default -> throw new IllegalStateException("ticket class doesn't exist: " + rs.getInt("Class"));
            }
        }
        return null;
    }

    //a method that removes a Ticket from database
    public void removeTicket(Ticket ticket) throws SQLException {
        deleteWhereEqual("tickets", "Number", ticket.getNumber());
    }

    //a method that adds a Ticket to database
    public void addTicket(Ticket ticket) throws SQLException {
        insert("tickets", TICKET_COLUMNS, getTicketValues(ticket));
    }

    //a method that updates a Ticket in database
    public void updateTicket(Ticket ticket) throws SQLException {
        update("tickets", TICKET_COLUMNS, getTicketValues(ticket), " number = " + ticket.getNumber());
    }

    //a method that removes all Tickets from database
    public void deleteAll() throws SQLException {
        prune("tickets");
    }


}

