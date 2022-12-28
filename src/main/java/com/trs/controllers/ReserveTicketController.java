package com.trs.controllers;

import com.trs.api.managers.TrainManager;
import com.trs.modules.SystemAdmin;
import com.trs.modules.Train;
import com.trs.modules.tickets.FirstClassTicket;
import com.trs.modules.tickets.SecondClasssTicket;
import com.trs.modules.tickets.ThirdClassTicket;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.ResourceBundle;

public class ReserveTicketController extends FormNavigator implements Initializable {

    @FXML
    public Label totalPriceLabel;
    @FXML
    public TextField singlePriceTextField;
    @FXML
    public ComboBox degreeComboBox;
    @FXML
    public DatePicker reservationDatePicker;
    public ComboBox trainPickerComboBox;
    static Train selectedTrain;
    int number;
    int trainNumber;
    String degree;
    Date date;
    String price;
    ArrayList<Integer> trainIDs = new ArrayList<>();

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Label label;
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

    public ReserveTicketController() {
        super();
    }

    @FXML
    void backHandle(ActionEvent event) throws IOException {
        navigateTo(event, "AdminActionPage.fxml");
    }
    @FXML
    void bookHandle(ActionEvent event) throws SQLException {
        int numberOfTickets = Integer.parseInt(ticketsNumberTextField.getText());
        int price = Integer.parseInt(singlePriceTextField.getText());
        getValuesFromFields();
        switch (degree) {
            case "First Class" ->
                    new SystemAdmin().bookTicket(new FirstClassTicket(String.valueOf(Math.random() * 10), price / numberOfTickets, trainNumber, date), new SystemAdmin().findTrain(trainNumber));
            case "Second Class" ->
                    new SystemAdmin().bookTicket(new SecondClasssTicket(String.valueOf(Math.random() * 10), price / numberOfTickets, trainNumber, date), new SystemAdmin().findTrain(trainNumber));
            case "Third Class" ->
                    new SystemAdmin().bookTicket(new ThirdClassTicket(String.valueOf(Math.random() * 10), price / numberOfTickets, trainNumber,date), new SystemAdmin().findTrain(trainNumber));
        }
    }

    void getAllTrainIDs() throws SQLException {
        ArrayList<Train> trains = (ArrayList<Train>) TrainManager.getAllTrains();
        for(Train t : trains){
            trainIDs.add(t.getTrainNumber());
        }
    }
    void initializeComboBoxes () throws SQLException {
        degreeComboBox.getItems().addAll("First Class", "Second Class", "Third Class");
        degreeComboBox.getSelectionModel().select(0);
        trainPickerComboBox.getItems().addAll(trainIDs);
        trainPickerComboBox.getSelectionModel().select(0);
    }

    void setTicketClassPrice() throws SQLException {
        String degree = degreeComboBox.getValue().toString();
        int trainNumber = Integer.parseInt(trainPickerComboBox.getValue().toString());
        Train train = new SystemAdmin().findTrain(trainNumber);

        switch (degree) {
            case "First Class" -> singlePriceTextField.setText(String.valueOf(train.getPrice() * 3));
            case "Second Class" -> singlePriceTextField.setText(String.valueOf(train.getPrice() * 2));
            case "Third Class" -> singlePriceTextField.setText(String.valueOf(train.getPrice()));
        }
    }


    void getValuesFromFields(){
        number = trainPickerComboBox.getSelectionModel().getSelectedIndex();
        trainNumber = Integer.parseInt(trainPickerComboBox.getValue().toString());
        degree = degreeComboBox.getValue().toString();
        date =  Date.valueOf(reservationDatePicker.getValue().toString());
        price = singlePriceTextField.getText();
    }



    @Override
    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            isInitialized();
            getAllTrainIDs();
            initializeComboBoxes();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    void isInitialized(){
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert trainNumberTextField != null : "fx:id=\"trainNumberTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert totalPriceTextField != null : "fx:id=\"totalPriceTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert bookButton != null : "fx:id=\"bookButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert ticketsNumberTextField != null : "fx:id=\"ticketsNumberTextField\" was not injected: check your FXML file 'ReserveTicket.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ReserveTicket.fxml'.";

    }


}
