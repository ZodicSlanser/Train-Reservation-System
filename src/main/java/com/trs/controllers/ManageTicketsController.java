package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ManageTicketsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private TextField trainNumberTextField;

    @FXML
    private TextField degreeTextField;

    @FXML
    private TextField totalPriceTextField;

    @FXML
    private Button editButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField ticketNumberTextField;

    @FXML
    private DatePicker reserveDateTimePicker;

    @FXML
    void cancelhandle(ActionEvent event) {

    }

    @FXML
    void editHandel(ActionEvent event) {

    }

    @FXML
    void initialize() {
        isInitialized();
        String trainNumber=trainNumberTextField.getText();
        String degree=degreeTextField.getText();
        int totalPrice=Integer.parseInt(totalPriceTextField.getText());
        int numberOfTickets =Integer.parseInt(ticketNumberTextField.getText());

    }
    void isInitialized() {
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'ManageTickets.fxml'.";
        assert trainNumberTextField != null : "fx:id=\"trainNumberTextField\" was not injected: check your FXML file 'ManageTickets.fxml'.";
        assert degreeTextField != null : "fx:id=\"degreeTextField\" was not injected: check your FXML file 'ManageTickets.fxml'.";
        assert totalPriceTextField != null : "fx:id=\"totalPriceTextField\" was not injected: check your FXML file 'ManageTickets.fxml'.";
        assert editButton != null : "fx:id=\"editButton\" was not injected: check your FXML file 'ManageTickets.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'ManageTickets.fxml'.";
        assert ticketNumberTextField != null : "fx:id=\"ticketNumberTextField\" was not injected: check your FXML file 'ManageTickets.fxml'.";
        assert reserveDateTimePicker != null : "fx:id=\"reserveDateTimePicker\" was not injected: check your FXML file 'ManageTickets.fxml'.";

    }
}
