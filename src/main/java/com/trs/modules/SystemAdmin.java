package com.trs.modules;

import com.trs.modules.tickets.Ticket;

import java.sql.SQLException;
import java.util.List;

public class SystemAdmin extends TicketingOfficer {
    public SystemAdmin(int id, String FirstName, String LastName, String PhoneNumber, int salary, String Address,String username,String password) {
        super(id, FirstName, LastName, PhoneNumber, salary, Address,username,password);
    }

    public SystemAdmin(String FirstName, String LastName, String PhoneNumber, int salary, String Address, String username,String password) {
        super(FirstName, LastName, PhoneNumber, salary, Address,username,password);
    }


    public List<TicketingOfficer> viewOfficers() throws SQLException {
        return officerManager.getAllTicketingOfficers();
    }

    public boolean addOfficer(TicketingOfficer officer) {
        try {
            officerManager.insertTicketingOfficer(officer);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean deleteOfficer(TicketingOfficer officer) {
        try {
            officerManager.deleteTicketingOfficer(officer);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean updateOfficer(TicketingOfficer newOfficer) {
        try {
            officerManager.updateTicketingOfficer(newOfficer);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean addTrain(Train train) {
        try {
            trainManager.insertTrain(train);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean deleteTrain(Train train) {
        try {
            trainManager.deleteTrain(train);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean updateTrain(Train otherTrain) {
        try {
            trainManager.updateTrain(otherTrain);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean editTicket(Ticket otherTicket) {
        try {
            ticketManager.updateTicket(otherTicket);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean deleteTicket(Ticket ticket) {
        try {
            ticketManager.removeTicket(ticket);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}

