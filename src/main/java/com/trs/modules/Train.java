package com.trs.modules;

import com.trs.modules.tickets.Ticket;

import java.sql.Timestamp;


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

    //TODO: add Implementation
    public void addTicket(Ticket ticket) {
        if (currentCapacity < maximumCapacity) {
            currentCapacity++;
        }
    }

    public void removeTicket(Ticket ticket) {
        if (currentCapacity > 0) {
            currentCapacity--;
        }
    }

}
