package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReserveTicketController {

   public ReserveTicketController(){
        super();
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    private TextField trainNumberTextField;

    @FXML
    private TextField dayTextField;

    @FXML
    private TextField totalPriceTextField;

    @FXML
    private Button bookButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField ticketsNumberTextField;

    @FXML
    private Button backButton;

    @FXML
    private TextField monthTextField;

    @FXML
    private TextField yearTextField;

    @FXML
    private ComboBox<?> degreeCOmpoBox;

    @FXML
    void backHandle(ActionEvent event) {

    }

    @FXML
    void bookHandle(ActionEvent event) {

    }

    @FXML
    void cancelHandle(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert trainNumberTextField != null : "fx:id=\"trainNumberTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert dayTextField != null : "fx:id=\"dayTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert totalPriceTextField != null : "fx:id=\"totalPriceTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert bookButton != null : "fx:id=\"bookButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert ticketsNumberTextField != null : "fx:id=\"ticketsNumberTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert monthTextField != null : "fx:id=\"monthTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert yearTextField != null : "fx:id=\"yearTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert degreeCOmpoBox != null : "fx:id=\"degreeCOmpoBox\" was not injected: check your FXML file 'ReserveTicket.fxml'.";

    }
}
