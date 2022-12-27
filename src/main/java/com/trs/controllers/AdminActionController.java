package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdminActionController {
    @FXML
    private Button manageTrainButton;

    @FXML
    private Button manageTicketButton;

    @FXML
    private Button manageOfficerButton;

    @FXML
    private Button exitButton;

    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void viewOfficer(ActionEvent event) {

    }

    @FXML
    void viewTicket(ActionEvent event) {

    }

    @FXML
    void viewTrain(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert manageTrainButton != null : "fx:id=\"manageTrainButton\" was not injected: check your FXML file 'AdminActionPage.fxml'.";
        assert manageTicketButton != null : "fx:id=\"manageTicketButton\" was not injected: check your FXML file 'AdminActionPage.fxml'.";
        assert manageOfficerButton != null : "fx:id=\"manageOfficerButton\" was not injected: check your FXML file 'AdminActionPage.fxml'.";
        assert exitButton != null : "fx:id=\"exitButton\" was not injected: check your FXML file 'AdminActionPage.fxml'.";

    }
}
