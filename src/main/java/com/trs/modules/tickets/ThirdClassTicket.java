package com.trs.modules.tickets;


import java.time.LocalDateTime;

public class ThirdClassTicket extends Ticket {
    public ThirdClassTicket(String number, int fare, int TrainNumber, LocalDateTime reservationDate) {
        super(number, fare, TrainNumber, reservationDate);
    }

    @Override
    public int getTicketClass() {
        return 3;
    }

}
