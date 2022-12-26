package com.trs.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ManageTrainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label ArrivalStationL;

    @FXML
    private Button addBtn;

    @FXML
    private Label arrivalTimeL;

    @FXML
    private Button backBtn;

    @FXML
    private Button deleteBtn;

    @FXML
    private Label departureStationL;

    @FXML
    private Label departureTimeL;

    @FXML
    private Button editBtn;

    @FXML
    private Label maximumCapacityL;

    @FXML
    private Label priceL;

    @FXML
    private TableColumn<?, ?> trainNumberColumn;

    @FXML
    private TableView<?> trainTable;

    @FXML
    private TableColumn<?, ?> trainTypeColumn;

    @FXML
    void ViewSelectAction(ActionEvent event) {

    }

    @FXML
    void deleteSelectedTrain(ActionEvent event) {

    }

    @FXML
    void viewAddTrain(ActionEvent event) {

    }

    @FXML
    void viewEditTrain(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert ArrivalStationL != null : "fx:id=\"ArrivalStationL\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert addBtn != null : "fx:id=\"addBtn\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert arrivalTimeL != null : "fx:id=\"arrivalTimeL\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert deleteBtn != null : "fx:id=\"deleteBtn\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert departureStationL != null : "fx:id=\"departureStationL\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert departureTimeL != null : "fx:id=\"departureTimeL\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert editBtn != null : "fx:id=\"editBtn\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert maximumCapacityL != null : "fx:id=\"maximumCapacityL\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert priceL != null : "fx:id=\"priceL\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert trainNumberColumn != null : "fx:id=\"trainNumberColumn\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert trainTable != null : "fx:id=\"trainTable\" was not injected: check your FXML file 'ManageTrain.fxml'.";
        assert trainTypeColumn != null : "fx:id=\"trainTypeColumn\" was not injected: check your FXML file 'ManageTrain.fxml'.";

    }

}
