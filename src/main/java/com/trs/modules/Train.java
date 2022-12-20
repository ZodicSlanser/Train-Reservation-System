package com.trs.modules;

import com.trs.modules.tickets.Ticket;

public class Train {
    String number;
    String name;
    int maximumCapacity;
    int currentCapacity;

    Train(String number, String name, int maximumCapacity){
        this.number = number;
        this.name = name;
        this.maximumCapacity = maximumCapacity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMaximumCapacity() {
        return maximumCapacity;
    }
    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
    public int getCurrentCapacity() {
        return currentCapacity;
    }
    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    //TODO: add Implementation
    public void addTicket(Ticket ticket){
        if(currentCapacity < maximumCapacity){
            currentCapacity++;
        }
    }
    public void removeTicket(Ticket ticket){
        if(currentCapacity > 0){
            currentCapacity--;
        }
    }

}
