package com.trs.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public abstract class FormNavigator {
    LoginController loginController;
    ViewTrainController manageTrainController;

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }
    public void setManageTrainController(ViewTrainController manageTrainController) {
        this.manageTrainController = manageTrainController;
    }
    public void viewLoginPage(ActionEvent actionEvent) throws IOException {
        Parent loginParent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/trs/views/login.fxml")));
        Scene loginScene = new Scene(loginParent);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(loginScene);
        window.show();
    }
    public void viewManageOfficerPage(ActionEvent actionEvent) throws IOException {
        Parent officerPage = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/trs/forms/ManageOfficer.fxml")));
        Scene officerPageScene = new Scene(officerPage);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(officerPageScene);
        window.show();
    }
    public void viewTrainPage(ActionEvent actionEvent) throws IOException {
        Parent adminPage = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/trs/forms/ViewTrain.fxml")));
        Scene adminPageScene = new Scene(adminPage);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(adminPageScene);
        window.show();
    }

    public void viewManageTrainPage(ActionEvent actionEvent) throws IOException {
        Parent manageTrainPage = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/trs/forms/ManageTrain.fxml")));
        Scene manageTrainPageScene = new Scene(manageTrainPage);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(manageTrainPageScene);
        window.show();
    }
   public void viewReserveTicketPage(ActionEvent actionEvent) throws IOException {
        Parent reserveTicketPage = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/trs/forms/ReserveTicket.fxml")));
        Scene reserveTicketPageScene = new Scene(reserveTicketPage);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(reserveTicketPageScene);
        window.show();
    }
    public void viewOfficerPage(ActionEvent actionEvent) throws IOException {
        Parent reserveTicketPage = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/trs/forms/ViewOfficer.fxml")));
        Scene reserveTicketPageScene = new Scene(reserveTicketPage);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(reserveTicketPageScene);
        window.show();
    }
    public void navigateTo(ActionEvent actionEvent, String path) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(path)));
        Scene scene = new Scene(parent);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
