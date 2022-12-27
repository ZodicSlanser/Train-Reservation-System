package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ManageOfficerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField salaryTextField;

    @FXML
    private TextField IDTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private Button addButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Button backButton;

    @FXML
    void addHandle(ActionEvent event) {

    }

    @FXML
    void backHandle(ActionEvent event) {

    }

    @FXML
    void cancleHandle(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert firstNameTextField != null : "fx:id=\"firstNameTextField\" was not injected: check your FXML file 'ManageOfficer.fxml'.";
        assert lastNameTextField != null : "fx:id=\"lastNameTextField\" was not injected: check your FXML file 'ManageOfficer.fxml'.";
        assert phoneNumberTextField != null : "fx:id=\"phoneNumberTextField\" was not injected: check your FXML file 'ManageOfficer.fxml'.";
        assert salaryTextField != null : "fx:id=\"salaryTextField\" was not injected: check your FXML file 'ManageOfficer.fxml'.";
        assert IDTextField != null : "fx:id=\"IDTextField\" was not injected: check your FXML file 'ManageOfficer.fxml'.";
        assert addressTextField != null : "fx:id=\"addressTextField\" was not injected: check your FXML file 'ManageOfficer.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'ManageOfficer.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'ManageOfficer.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ManageOfficer.fxml'.";

    }
}
