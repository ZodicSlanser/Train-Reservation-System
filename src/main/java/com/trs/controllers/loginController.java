package com.trs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class loginController {
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


}
