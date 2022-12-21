package com.trs.modules.tickets;

import java.time.LocalDateTime;

public class FirstClassTicket extends Ticket {

    public FirstClassTicket(String number, int fare, String TrainNumber, LocalDateTime reservationDate) {
        super(number, fare, TrainNumber, reservationDate);
        fare = fare * 3;
    }

    @Override
    public int getTicketClass() {
        return 1;
    }


}

