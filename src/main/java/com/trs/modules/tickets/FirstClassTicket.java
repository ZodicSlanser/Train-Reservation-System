package com.trs.modules.tickets;

import java.sql.Date;

public class FirstClassTicket extends Ticket {

    public FirstClassTicket(String ticketNumber, int fare, int trainNumber, Date reservationDate) {
        super(ticketNumber, fare * 3, trainNumber, reservationDate);
    }

    @Override
    public int getTicketClass() {
        return 1;
    }


}

