package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewTicketsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> ticketTable;

    @FXML
    private TableColumn<?, ?> ticketIDColumn;

    @FXML
    private Label trainNumberLabel;

    @FXML
    private Label reservasionDateLabel;

    @FXML
    private Label degreeLabel;

    @FXML
    private Label ticketNumberLabel;

    @FXML
    private Label totalPriceLabel;

    @FXML
    private Button newButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button backButton;

    @FXML
    void backHandle(ActionEvent event) {

    }

    @FXML
    void deleteHandle(ActionEvent event) {

    }

    @FXML
    void editHandle(ActionEvent event) {

    }

    @FXML
    void newHandle(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert ticketTable != null : "fx:id=\"ticketTable\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert ticketIDColumn != null : "fx:id=\"ticketIDColumn\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert trainNumberLabel != null : "fx:id=\"trainNumberLabel\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert reservasionDateLabel != null : "fx:id=\"reservasionDateLabel\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert degreeLabel != null : "fx:id=\"degreeLabel\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert ticketNumberLabel != null : "fx:id=\"ticketNumberLabel\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert totalPriceLabel != null : "fx:id=\"totalPriceLabel\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert newButton != null : "fx:id=\"newButton\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert editButton != null : "fx:id=\"editButton\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'ViewTickets.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ViewTickets.fxml'.";

    }
}
