package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class OfficerActionController {
   public OfficerActionController(){
        super();
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button viewTrainButton;

    @FXML
    private Button addTicketButton;

    @FXML
    private Button ExitButton;

    @FXML
    void addTicketHandle(ActionEvent event) {

    }

    @FXML
    void exitHandle(ActionEvent event) {

    }

    @FXML
    void viewTrainHandle(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert viewTrainButton != null : "fx:id=\"viewTrainButton\" was not injected: check your FXML file 'OfficerActionPage.fxml'.";
        assert addTicketButton != null : "fx:id=\"addTicketButton\" was not injected: check your FXML file 'OfficerActionPage.fxml'.";
        assert ExitButton != null : "fx:id=\"ExitButton\" was not injected: check your FXML file 'OfficerActionPage.fxml'.";

    }
}
