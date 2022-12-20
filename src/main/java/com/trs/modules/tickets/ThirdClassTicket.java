package com.trs.modules.tickets;

import com.trs.modules.tickets.Ticket;

public class ThirdClassTicket extends Ticket {
    @Override
    public void setFare(int ticketFare){
        fare = ticketFare ;
    }

}
