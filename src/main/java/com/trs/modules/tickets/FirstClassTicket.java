package com.trs.modules.tickets;

import java.time.LocalDateTime;

public class FirstClassTicket extends Ticket {

    public FirstClassTicket(String number, int fare, int TrainNumber, LocalDateTime reservationDate) {
        super(number, fare * 3, TrainNumber, reservationDate);
    }

    @Override
    public int getTicketClass() {
        return 1;
    }


}

