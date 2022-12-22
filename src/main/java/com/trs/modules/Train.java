package com.trs.modules;

import com.trs.modules.tickets.Ticket;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class Train {
    private int trainNumber;
    private String type;
    private Timestamp departureTime;
    private Timestamp arrivalTime;
    private String departureStation;
    private String arrivalStation;
    private int maximumCapacity;
    private int currentCapacity;

    public Train(int trainNumber, String type, Timestamp departureTime, Timestamp arrivalTime, String departureStation, String arrivalStation, int maximumCapacity) {
        this.trainNumber = trainNumber;
        this.type = type;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.maximumCapacity = maximumCapacity;
    }

    //generate trains as dummy data
    public static ArrayList<Train> generateTrains() {
        ArrayList<Train> trains = new ArrayList<>(List.of(
                new Train(1, "Express", Timestamp.valueOf("2020-01-01 10:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Cairo", "Alexandria", 100),
                new Train(2, "Express", Timestamp.valueOf("2020-01-01 10:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Cairo", "Alexandria", 100),
                new Train(3, "Express", Timestamp.valueOf("2020-01-01 10:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Cairo", "Alexandria", 100),
                new Train(4, "Express", Timestamp.valueOf("2020-01-01 10:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Cairo", "Alexandria", 100),
                new Train(5, "Express", Timestamp.valueOf("2020-01-01 10:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Cairo", "Alexandria", 100),
                new Train(6, "Express", Timestamp.valueOf("2020-01-01 10:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Cairo", "Alexandria", 100),
                new Train(7, "Express", Timestamp.valueOf("2020-01-01 10:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Cairo", "Alexandria", 100),
                new Train(8, "Express", Timestamp.valueOf("2020-01-01 10:00:00"), Timestamp.valueOf("2020-01-01 12:00:00"), "Cairo", "Alexandria", 100)));

        return trains;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean has(Ticket ticket) {
        return ticket.getTrainNumber() == trainNumber;
    }

    public boolean addTicket(Ticket ticket) {
        if (currentCapacity > maximumCapacity && this.has(ticket)) {
            currentCapacity++;
            ticket.setTrainNumber(trainNumber);
            return true;
        }
        return false;
    }

    public boolean removeTicket(Ticket ticket) {
        if (currentCapacity > 0 && has(ticket)) {
            currentCapacity--;
            ticket.setTrainNumber(0);
            return true;
        }
        return false;
    }


}
