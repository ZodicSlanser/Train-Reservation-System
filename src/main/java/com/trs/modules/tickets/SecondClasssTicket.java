package com.trs.modules.tickets;

import java.time.LocalDateTime;

public class SecondClasssTicket extends Ticket {

    public SecondClasssTicket(String number, int fare, String TrainNumber, LocalDateTime reservationDate) {
        super(number, fare * 2, TrainNumber, reservationDate);
    }

    @Override
    public int getTicketClass() {
        return 2;
    }


}
