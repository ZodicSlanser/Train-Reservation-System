package com.trs.api.managers;

import com.trs.api.database.CRUD;
import com.trs.modules.Train;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrainManager extends CRUD {
    private static List<Integer> trainNumbers = new ArrayList<>();
    private final static List<String> TRAIN_COLUMNS = List.of("number", "capacity", "type", "departureTime", "arrivalTime", "departureStation", "arrivalStation","price");

    public TrainManager() {
        super();
    }

    //a method that fixes the syntax of the train values in the list
    private List<String> getTrainValues(Train train) {
        return List.of(
                String.valueOf(train.getTrainNumber()),
                String.valueOf(train.getMaximumCapacity()),
                "\"" + train.getType() + "\"",
                "\"" + String.valueOf(train.getDepartureTime()) + "\"",
                "\"" + String.valueOf(train.getArrivalTime()) + "\"",
                "\"" + train.getDepartureStation() + "\"",
                "\"" + train.getArrivalStation() + "\"",
                "\"" + train.getPrice() + "\"");
    }

    public static boolean trainNumberExists(int trainNumber) {
        return trainNumbers.contains(trainNumber);
    }
    // a method that returns all trains from database
    public static List<Train> getAllTrains() throws SQLException {
        if (isConnected()) {
            List<Train> trains = new ArrayList<>();
            ResultSet rs = getAll("trains");
            assert rs != null;
            trainNumbers.add(rs.getInt("Number"));
            while (rs.next()) {
                System.out.println( rs.getInt("number") );
                trains.add(new Train(rs.getInt("Number"),
                        rs.getString("Type"),
                        rs.getTimestamp("departureTime"),
                        rs.getTimestamp("arrivalTime"),
                        rs.getString("departureStation"),
                        rs.getString("arrivalStation"),
                        rs.getInt("Capacity"),
                        rs.getInt("Price")));
            }
            return trains;
        }
        throw new SQLException("Connection to the database failed.");
    }

    //a method that returns a single train from database
    public Train getTrain(int number) throws SQLException {
        if (isConnected()) {
            ResultSet rs = get("trains", "Number", String.valueOf(number));
            if (rs.next()) {
                return new Train(rs.getInt("Number"),
                        rs.getString("Type"),
                        rs.getTimestamp("departureTime"),
                        rs.getTimestamp("arrivalTime"),
                        rs.getString("departureStation"),
                        rs.getString("arrivalStation"),
                        rs.getInt("Capacity"),
                rs.getInt("price"));
            }
            return null;
        }
        throw new SQLException("Connection to the database failed.");
    }

    // a method that inserts a train into the database
    public void insertTrain(Train train) throws SQLException {
        insert("trains", TRAIN_COLUMNS, getTrainValues(train));
    }

    //a method that updates a train in the database
    public void updateTrain(Train train) throws SQLException {
        if (isConnected()) {
            update("trains",
                    TRAIN_COLUMNS,
                    getTrainValues(train),
                    "number = " + train.getTrainNumber());
            return;
        }
        throw new SQLException("Connection to the database failed.");
    }

    //a method that deletes a train from the database
    public static void deleteTrain(Train train) throws SQLException {
        if (isConnected()) {
            deleteWhereEqual("trains", "number", String.valueOf(train.getTrainNumber()));
        }

    }
    public void deleteAll() throws SQLException {
        if (isConnected()) {
            prune("trains");
            return;
        }
        throw new SQLException("Connection to the database failed.");
    }
}

