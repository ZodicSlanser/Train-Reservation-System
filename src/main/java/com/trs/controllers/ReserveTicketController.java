package com.trs.controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import com.trs.api.managers.TicketManager;
import com.trs.api.managers.TrainManager;
import com.trs.modules.SystemAdmin;
import com.trs.modules.Train;
import com.trs.modules.tickets.FirstClassTicket;
import com.trs.modules.tickets.SecondClasssTicket;
import com.trs.modules.tickets.ThirdClassTicket;
import com.trs.modules.tickets.Ticket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ReserveTicketController extends FormNavigator {


    public ReserveTicketController(){
        super();
    }

    @FXML
    private ResourceBundle resources;
    @FXML
    public ComboBox degreeComboBox;
    @FXML
    private URL location;

    @FXML
    private Label label;

    @FXML
    public DatePicker reservationDatePicker;
    @FXML
    private TextField trainNumberTextField;

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
    void backHandle(ActionEvent event) throws IOException {
        navigateTo(event, "OfficerActionPage.fxml");

    }

    @FXML
    void bookHandle(ActionEvent event) throws SQLException {
      int number = Integer.parseInt(ticketsNumberTextField.getText());
        String trainNumber = trainNumberTextField.getText();
        String degree = degreeComboBox.getValue().toString();
        String date = reservationDatePicker.getValue().toString();
        int totalPrice = Integer.parseInt(totalPriceTextField.getText());
        switch (degree) {
            case "First Class" ->
                    new SystemAdmin().bookTicket(new FirstClassTicket(String.valueOf(Math.random() * 10), totalPrice / number, Integer.parseInt(trainNumber), LocalDateTime.parse(date)), new SystemAdmin().findTrain(Integer.parseInt(trainNumber)));
            case "Second Class" ->
                    new SystemAdmin().bookTicket(new SecondClasssTicket(String.valueOf(Math.random() * 10), totalPrice / number, Integer.parseInt(trainNumber), LocalDateTime.parse(date)), new SystemAdmin().findTrain(Integer.parseInt(trainNumber)));
            case "Third Class" ->
                    new SystemAdmin().bookTicket(new ThirdClassTicket(String.valueOf(Math.random() * 10), totalPrice / number, Integer.parseInt(trainNumber), LocalDateTime.parse(date)), new SystemAdmin().findTrain(Integer.parseInt(trainNumber)));
        }
    }

    @FXML
    void cancelHandle(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert trainNumberTextField != null : "fx:id=\"trainNumberTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert totalPriceTextField != null : "fx:id=\"totalPriceTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert bookButton != null : "fx:id=\"bookButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert ticketsNumberTextField != null : "fx:id=\"ticketsNumberTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        degreeComboBox.getItems().addAll("First Class","Second Class","Third Class");
    }
}
