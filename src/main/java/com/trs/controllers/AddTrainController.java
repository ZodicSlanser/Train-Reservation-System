package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddTrainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField maxCapacityTextField;

    @FXML
    private TextField trainNumberTextField;

    @FXML
    private TextField departureHour;

    @FXML
    private TextField departureStationTextField;

    @FXML
    private TextField arrivalStationTextField;

    @FXML
    private TextField arrivalHour;

    @FXML
    private Button addtrainButton;

    @FXML
    private Button exitButton;

    @FXML
    private TextField standardPriceTextField;

    @FXML
    private TextField typeTextField;

    @FXML
    private TextField departureMinute;

    @FXML
    private TextField arrivalMinute;

    @FXML
    private DatePicker departureDatePicker;

    @FXML
    private DatePicker arrivalDatePicker;

    @FXML
    void addtrainhandle(ActionEvent event) {

    }

    @FXML
    void exithandle(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert maxCapacityTextField != null : "fx:id=\"maxCapacityTextField\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert trainNumberTextField != null : "fx:id=\"trainNumberTextField\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert departureHour != null : "fx:id=\"departureHour\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert departureStationTextField != null : "fx:id=\"departureStationTextField\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert arrivalStationTextField != null : "fx:id=\"arrivalStationTextField\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert arrivalHour != null : "fx:id=\"arrivalHour\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert addtrainButton != null : "fx:id=\"addtrainButton\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert exitButton != null : "fx:id=\"exitButton\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert standardPriceTextField != null : "fx:id=\"standardPriceTextField\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert typeTextField != null : "fx:id=\"typeTextField\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert departureMinute != null : "fx:id=\"departureMinute\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert arrivalMinute != null : "fx:id=\"arrivalMinute\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert departureDatePicker != null : "fx:id=\"departureDatePicker\" was not injected: check your FXML file 'AddTrainController.fxml'.";
        assert arrivalDatePicker != null : "fx:id=\"arrivalDatePicker\" was not injected: check your FXML file 'AddTrainController.fxml'.";

    }
}
