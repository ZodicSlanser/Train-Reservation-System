package com.trs.controllers;

import java.net.URL;
import java.sql.Timestamp;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class ManageTrainController {

   public ManageTrainController(){
        super();
    }

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
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField maxCapacityTextField;

    @FXML
    private TextField trainNumberTextField;

    @FXML
    private TextField departureHourTextField;

    @FXML
    private TextField departureStationTextField;

    @FXML
    private TextField arrivalStationTextField;

    @FXML
    private TextField arrivalHourTextField;

    @FXML
    private Button addtrainButton;

    @FXML
    private Button exitButton;

    @FXML
    private TextField standardPriceTextField;

    @FXML
    private TextField typeTextField;

    @FXML
    private TextField departureMinuteTextField;

    @FXML
    private TextField arrivalMinuteTextField;

    @FXML
    private DatePicker departureDatePicker;

    @FXML
    private DatePicker arrivalDatePicker;


    @FXML
    public void viewSelectActionPage(ActionEvent actionEvent) {
    }
    @FXML
    public void viewAddTrainPage(ActionEvent actionEvent) {
    }

    @FXML
    public void viewEditTrainPage(ActionEvent actionEvent) {
    }

    @FXML
    public void deleteSelectedTrain(ActionEvent actionEvent) {
    }
    @FXML
    public void addTrain(ActionEvent actionEvent) {
    }

    @FXML
    public void exitHandle(ActionEvent actionEvent) {
    }

    private Timestamp getDateTime(String date, String hour, String minute){
        return getTimestamp(date, hour, minute);
    }

    static Timestamp getTimestamp(String date, String hour, String minute) {
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
    public void isInitialized(){
        assert maxCapacityTextField != null : "fx:id=\"maxCapacityTextField\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert trainNumberTextField != null : "fx:id=\"trainNumberTextField\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert departureHour != null : "fx:id=\"departureHour\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert departureStationTextField != null : "fx:id=\"departureStationTextField\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert arrivalStationTextField != null : "fx:id=\"arrivalStationTextField\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert arrivalHour != null : "fx:id=\"arrivalHour\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert addtrainButton != null : "fx:id=\"addtrainButton\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert exitButton != null : "fx:id=\"exitButton\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert standardPriceTextField != null : "fx:id=\"standardPriceTextField\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert typeTextField != null : "fx:id=\"typeTextField\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert departureMinute != null : "fx:id=\"departureMinute\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert arrivalMinute != null : "fx:id=\"arrivalMinute\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert departureDatePicker != null : "fx:id=\"departureDatePicker\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
        assert arrivalDatePicker != null : "fx:id=\"arrivalDatePicker\" was not injected: check your FXML file 'ManageTrainController.fxml'.";
    }



}
