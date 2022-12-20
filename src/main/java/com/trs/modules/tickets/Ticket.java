package com.trs.modules.tickets;

import java.time.LocalDateTime;

public abstract class Ticket {
    public String number;
    public int fare;
    public String TrainNumber;
    public LocalDateTime reservationDate;

    public abstract void setFare(int ticketFare);
}
