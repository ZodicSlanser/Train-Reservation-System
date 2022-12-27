package com.trs.api.managers;

import com.trs.api.database.CRUD;
import com.trs.modules.SystemAdmin;
import com.trs.modules.TicketingOfficer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfficerManager extends CRUD {
    public static ArrayList<Integer> OfficerIDs = new ArrayList<>();
    private final static List<String> OFFICER_COLUMNS = List.of("AID", "salary", "FName", "LName", "PhoneNumber", "Address", "username", "password","type");

    public OfficerManager() {
        super();
    }

    // a method that fixes the syntax of the TicketingOfficer  values in the list
    private static List<String> getOfficerValues(TicketingOfficer officer) {
       int type = officer.getPosition().equals("System Admin")? 0 : 1;
        return List.of(
                "'" + officer.getId() + "'",
                String.valueOf(officer.getSalary()),
                "'" + officer.getFirstName() + "'",
                "'" + officer.getLastName() + "'",
                "'" + officer.getPhoneNumber() + "'",
                "'" + officer.getAddress() + "'",
                "'" + officer.getUsername() + "'",
                "'" + officer.getPassword() + "'",
                "'" + type + "'"
        );
    }

    public static boolean IDExists(int id) {
        return OfficerIDs.contains(id);
    }

    //a method that deletes everything in the table
    public static void deleteAll() throws SQLException {
        if (isConnected()) {
            prune("officers");
            System.out.println("Everything Deleted");
            return;
        }
        throw new SQLException("Connection to the database failed.");
    }

    //a method that returns all TicketingOfficer from database
    public List<TicketingOfficer> getAllTicketingOfficers() throws SQLException {
        List<TicketingOfficer> ticketingOfficers = new ArrayList<>();
        ResultSet rs = getAll("officers");
        while (rs.next()) {
            OfficerIDs.add(rs.getInt("AID"));
            switch (rs.getInt("Type")) {
                case 1 ->
                        ticketingOfficers.add(new TicketingOfficer(rs.getInt("AID"),
                                rs.getString("FName"),
                                rs.getString("LName"),
                                rs.getString("PhoneNumber"),
                                rs.getInt("salary"),
                                rs.getString("Address"),
                                rs.getString("username"),
                                rs.getString("password")));
                case 0 ->
                        ticketingOfficers.add(new SystemAdmin(rs.getInt("AID"),
                                rs.getString("FName"),
                                rs.getString("LName"),
                                rs.getString("PhoneNumber"),
                                rs.getInt("salary"),
                                rs.getString("Address"),
                        rs.getString("username"),
                        rs.getString("password")));

            }
        }
        return ticketingOfficers;
    }

    //a method that returns a single TicketingOfficer from database
    public TicketingOfficer getTicketingOfficer(int AID) throws SQLException {
        ResultSet rs = get("officers", "AID", String.valueOf(AID));
        assert rs != null;
        return setOfficerType(rs);
    }

    //a method that returns a TicketingOfficer with a specific username and password
    public TicketingOfficer getTicketingOfficer(String username, String password, int type) throws SQLException {
        ResultSet rs = get("officers", "*"," `username` = " + "'" + username + "'" + " and `password` = " + "'" + password + "'" + " and `type` = " + type );
        assert rs != null : "No Ticketing Officer with this username and password";
        return setOfficerType(rs);
    }

    //a method to set officer type
    private TicketingOfficer setOfficerType(ResultSet rs) throws SQLException {
        if (rs.next()) {
            System.out.println(rs.getInt("type"));
            switch (rs.getInt("type")) {
                case 1 -> {
                    return new TicketingOfficer(rs.getInt("AID"),
                            rs.getString("FName"),
                            rs.getString("LName"),
                            rs.getString("PhoneNumber"),
                            rs.getInt("salary"),
                            rs.getString("Address"),
                            rs.getString("username"),
                            rs.getString("password"));
                }
                case 0 -> {
                    return new SystemAdmin(rs.getInt("AID"),
                            rs.getString("FName"),
                            rs.getString("LName"),
                            rs.getString("PhoneNumber"),
                            rs.getInt("salary"),
                            rs.getString("Address"),
                            rs.getString("username"),
                            rs.getString("password"));
                }
            }
        }
        return null;
    }
    //a method that inserts a TicketingOfficer into the database
    public void insertTicketingOfficer(TicketingOfficer ticketingOfficer) throws SQLException {
        if (isConnected()) {
            insert("officers", OFFICER_COLUMNS, getOfficerValues(ticketingOfficer));
            return;
        }
        throw new SQLException("Not connected to database");

    }

    //a method that updates a TicketingOfficer in the database
    public void updateTicketingOfficer(TicketingOfficer ticketingOfficer) throws SQLException {
        if (isConnected()) {
            try {
                update("officers", OFFICER_COLUMNS, getOfficerValues(ticketingOfficer), "AID = " + ticketingOfficer.getId());
                return;
            } catch (SQLException e) {
                throw new SQLException("Ticketing Officer doesn't exists");
            }
        }
        throw new SQLException("Connection to the database failed.");
    }

    //a method that deletes a TicketingOfficer from the database
    public void deleteTicketingOfficer(TicketingOfficer officer) throws SQLException {
        if (isConnected()) {
            deleteWhereEqual("officers", "AID", String.valueOf(officer.getId()));
            return;
        }
        throw new SQLException("Connection to the database failed.");
    }


}
