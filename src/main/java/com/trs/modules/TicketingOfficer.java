package com.trs.modules;

import com.trs.api.managers.OfficerManager;
import com.trs.api.managers.TicketManager;
import com.trs.api.managers.TrainManager;
import com.trs.modules.tickets.Ticket;

import java.sql.SQLException;
import java.util.List;

public class TicketingOfficer {
    int id;
    int salary;
    String FirstName;
    String LastName;
    String PhoneNumber;
    String Address;
    OfficerManager officerManager = new OfficerManager();
    TrainManager trainManager = new TrainManager();
    TicketManager ticketManager = new TicketManager();

    public TicketingOfficer(int id, String FirstName, String LastName, String PhoneNumber, int salary, String Address) {
        this.id = id;
        this.salary = salary;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
    }

    public TicketingOfficer(String FirstName, String LastName, String PhoneNumber, int salary, String Address) {
        this.salary = salary;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    //TODO: add implementation
    public boolean bookTicket(Ticket ticket, Train train) throws SQLException {
        try {
            ticketManager.addTicket(ticket);
            return train.addTicket(ticket);
        } catch (Exception e) {
            throw new SQLException("Error in booking ticket");
        }
    }

    public Ticket findTicket(String ticketNumber) {
        try {
            return ticketManager.getTicket(ticketNumber);
        } catch (Exception e) {
            return null;
        }
    }

    public List<Ticket> viewTickets() {
        try {
            return ticketManager.getAllTickets();
        } catch (Exception e) {
            return null;
        }
    }

    public List<Train> viewTrains() {
        try {
            return trainManager.getAllTrains();
        } catch (Exception e) {
            return null;
        }
    }

    public Train findTrain(int number) {
        try {
            return trainManager.getTrain(number);
        } catch (Exception e) {
            return null;
        }
    }

}
