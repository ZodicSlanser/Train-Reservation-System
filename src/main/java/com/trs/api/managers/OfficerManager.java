package com.trs.api.managers;

import com.trs.api.database.CRUDS;
import com.trs.modules.SystemAdmin;
import com.trs.modules.TicketingOfficer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfficerManager extends CRUDS {
    private final static List<String> OFFICER_COLUMNS = List.of("AID", "salary", "FirstName", "LastName", "PhoneNumber", "Address");

    OfficerManager() {
        super();
    }

    // a method that fixes the syntax of the TicketingOfficer  values in the list
    private static List<String> getOfficerValues(TicketingOfficer officer) {
        return List.of(
                "'" + officer.getId() + "'",
                String.valueOf(officer.getSalary()),
                "'" + officer.getFirstName() + "'",
                "'" + officer.getLastName() + "'",
                "'" + officer.getPhoneNumber() + "'",
                "'" + officer.getAddress() + "'"
        );
    }

    //a method that returns all TicketingOfficer from database
    public List<TicketingOfficer> getAllTicketingOfficers() throws SQLException {
        List<TicketingOfficer> ticketingOfficers = new ArrayList<>();
        ResultSet rs = getAll("officers");
        while (rs.next()) {
            switch (rs.getInt("Type")) {
                case 1 ->
                        ticketingOfficers.add(new TicketingOfficer(rs.getInt("AID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("PhoneNumber"), rs.getInt("salary"), rs.getString("Address")));
                case 0 ->
                        ticketingOfficers.add(new SystemAdmin(rs.getInt("AID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("PhoneNumber"), rs.getInt("salary"), rs.getString("Address")));
            }
        }
        return ticketingOfficers;
    }

    //a method that returns a single TicketingOfficer from database
    public TicketingOfficer getTicketingOfficer(String condition) throws SQLException {
        ResultSet rs = get("officers", "*", condition);
        if (rs.next()) {
            switch (rs.getInt("Type")) {
                case 1 -> {
                    return new TicketingOfficer(rs.getInt("AID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("PhoneNumber"), rs.getInt("salary"), rs.getString("Address"));
                }
                case 0 -> {
                    return new SystemAdmin(rs.getInt("AID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("PhoneNumber"), rs.getInt("salary"), rs.getString("Address"));
                }
            }
        }
        return null;
    }

    //a method that inserts a TicketingOfficer into the database
    public void insertTicketingOfficer(TicketingOfficer ticketingOfficer) throws SQLException {
        if (isConnected()) {
            insert("officers", OFFICER_COLUMNS, getOfficerValues(ticketingOfficer));
        }
        throw new SQLException("Connection to the database failed.");
    }

    //a method that updates a TicketingOfficer in the database
    public void updateTicketingOfficer(TicketingOfficer ticketingOfficer, String condition) throws SQLException {
        if (isConnected()) {
            update("officers", OFFICER_COLUMNS, getOfficerValues(ticketingOfficer), condition);
        }
        throw new SQLException("Connection to the database failed.");
    }

    //a method that deletes a TicketingOfficer from the database
    public void deleteTicketingOfficer(String Column, String condition) throws SQLException {
        if (isConnected()) {
            deleteWhereEqual("officers", "*", condition);
        }
        throw new SQLException("Connection to the database failed.");
    }
}
