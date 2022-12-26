package com.trs.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button loginButton;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private RadioButton officerRadio;
    @FXML
    private RadioButton adminRadio;
    @FXML
    ToggleGroup typePicker = new ToggleGroup();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
