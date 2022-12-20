package com.trs.modules;

import com.trs.modules.tickets.Ticket;

import java.util.List;

public class SystemAdmin extends TicketingOfficer{
    SystemAdmin(int salary, String FirstName, String LastName, String PhoneNumber, String Address) {
        super(salary, FirstName, LastName, PhoneNumber, Address);
    }

    //TODO: add implementation
    public List<TicketingOfficer> viewOfficers(){
        return null;
    }
    public boolean addOfficer(TicketingOfficer officer){
        return true;
    }
    public boolean deleteOfficer(TicketingOfficer officer){
        return true;
    }
    public boolean updateOfficer(TicketingOfficer oldOfficer, TicketingOfficer newOfficer){
        return true;
    }
    public boolean addTrain(Train train){
        return true;
    }
    public boolean deleteTrain(Train train){
        return true;
    }
    public boolean updateTrain(Train oldTrain, Train otherTrain){
        return true;
    }
    public boolean editTicket(Ticket oldTicket, Ticket otherTicket){
        return true;
    }
    public boolean deleteTicket(Ticket ticket){
        return true;
    }

}

