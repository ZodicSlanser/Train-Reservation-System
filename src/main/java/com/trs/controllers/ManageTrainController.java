package com.trs.controllers;

import java.net.URL;
import java.sql.Timestamp;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ManageTrainController {

    private int trainNumber;
    private String type;
    private String departureDate;
    private String departureHour;
    private String departureMinute;
    private String arrivalDate;
    private String arrivalHour;
    private String arrivalMinute;
    private String departureStation;
    private String arrivalStation;
    private Timestamp departureDateTime;
    private Timestamp arrivalDateTime;
    private int maximumCapacity;
    private int currentCapacity;
    @FXML
    private Label ArrivalStationL;
    @FXML
    private Label arrivalTimeL;
    @FXML
    private Button backBtn;
    @FXML
    private Label departureStationL;
    @FXML
    private Label departureTimeL;
    @FXML
    public Button addTrainBtn;
    @FXML
    public Button editTrainBtn;
    @FXML
    public Button deleteTrainBtn;
    @FXML
    private Label maximumCapacityL;
    @FXML
    private Label priceL;
    @FXML
    private TableColumn trainNumberColumn;
    @FXML
    private TableView trainTable;
    @FXML
    private TableColumn trainTypeColumn;

    @FXML
    public void viewSelectActionPage(ActionEvent actionEvent) {

    }

    @FXML
    void deleteSelectedTrain(ActionEvent event) {

    }

    public void viewAddTrainPage(ActionEvent actionEvent) {
    }

    @FXML
    public void viewEditTrainPage(ActionEvent actionEvent) {
    }

    //method to turn the date and time into a timestamp
    private Timestamp getDateTime(String date, String hour, String minute){
        String[] dateArray = date.split("-");
        int year = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int day = Integer.parseInt(dateArray[2]);
        int hourInt = Integer.parseInt(hour);
        int minuteInt = Integer.parseInt(minute);
        return new Timestamp(year, month, day, hourInt, minuteInt, 0, 0);
    }


    @FXML
    void initialize() {
        isInitialized();

    }
    private void  isInitialized(){
        assert ArrivalStationL != null : "fx:id=\"ArrivalStationL\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert arrivalTimeL != null : "fx:id=\"arrivalTimeL\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert departureStationL != null : "fx:id=\"departureStationL\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert departureTimeL != null : "fx:id=\"departureTimeL\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert maximumCapacityL != null : "fx:id=\"maximumCapacityL\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert priceL != null : "fx:id=\"priceL\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert trainNumberColumn != null : "fx:id=\"trainNumberColumn\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert trainTable != null : "fx:id=\"trainTable\" was not injected: check your FXML file 'ViewTrain.fxml'.";
        assert trainTypeColumn != null : "fx:id=\"trainTypeColumn\" was not injected: check your FXML file 'ViewTrain.fxml'.";
    }



}
