package com.trs.modules.tickets;

import java.time.LocalDateTime;

public abstract class Ticket {

    protected String number;
    protected int fare;
    protected int TrainNumber;
    protected LocalDateTime reservationDate;

    public Ticket(String number, int fare, int TrainNumber, LocalDateTime reservationDate) {
        this.number = number;
        this.TrainNumber = TrainNumber;
        this.reservationDate = reservationDate;
    }
    public Ticket(int fare, int TrainNumber, LocalDateTime reservationDate) {
        this.TrainNumber = TrainNumber;
        this.reservationDate = reservationDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getTrainNumber() {
        return TrainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        TrainNumber = trainNumber;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    //get the ticket type
    public abstract int getTicketClass();
}
