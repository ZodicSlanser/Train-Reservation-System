package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ViewOfficerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> officerTable;

    @FXML
    private TableColumn<?, ?> IDColumn;

    @FXML
    private TableColumn<?, ?> usernameColumn;

    @FXML
    private TableColumn<?, ?> positionCoulmn;

    @FXML
    private Button newButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label salaryLabel;

    @FXML
    private Label phoneNumberLabel;

    @FXML
    private Label addressLabel;

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
        assert officerTable != null : "fx:id=\"officerTable\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert IDColumn != null : "fx:id=\"IDColumn\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert usernameColumn != null : "fx:id=\"usernameColumn\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert positionCoulmn != null : "fx:id=\"positionCoulmn\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert newButton != null : "fx:id=\"newButton\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert editButton != null : "fx:id=\"editButton\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert firstNameLabel != null : "fx:id=\"firstNameLabel\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert lastNameLabel != null : "fx:id=\"lastNameLabel\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert salaryLabel != null : "fx:id=\"salaryLabel\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert phoneNumberLabel != null : "fx:id=\"phoneNumberLabel\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert addressLabel != null : "fx:id=\"addressLabel\" was not injected: check your FXML file 'ViewOfficer.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ViewOfficer.fxml'.";

    }
}
