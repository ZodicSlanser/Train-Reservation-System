package com.trs.modules;

import com.trs.modules.tickets.Ticket;

import java.util.List;

public class TicketingOfficer {
    int id;
    int salary;
    String FirstName;
    String LastName;
    String PhoneNumber;
    String Address;

    public TicketingOfficer(int id, String FirstName, String LastName, String PhoneNumber, int salary, String Address) {
        this.id = id;
        this.salary = salary;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PhoneNumber = PhoneNumber;
        this.Address = Address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    //TODO: add implementation
    public boolean bookTicket(Ticket ticket) {
        return true;
    }

    public Ticket findTicket(String ticketNumber) {

        return null;
    }

    public List<Ticket> viewTickets() {
        return null;
    }


    public List<Train> viewTrains() {
        return null;
    }

    public Train findTrain(String number) {
        return null;
    }
}
