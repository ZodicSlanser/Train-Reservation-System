package com.trs.controllers;

import com.trs.api.managers.OfficerManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class LoginController extends FormNavigator implements Initializable {
   public LoginController(){
        super();
    }
    @FXML
    public Button loginBtn;
    @FXML
    public Label youFailedLabel;
    @FXML
    public Label timeLabel;
    @FXML
    public Label secondsLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private RadioButton officerRadio;
    @FXML
    private RadioButton adminRadio;
    @FXML
    private ToggleGroup typePicker;

    public static int type;
   private static short tryCounter = 0;
    OfficerManager officerManager = new OfficerManager();

    private boolean isTextEmpty(){
        return usernameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty();
    }

    private void timeout() throws InterruptedException {
        int secondsCounter = 10;
        youFailedLabel.setVisible(true);
        timeLabel.setVisible(true);
        secondsLabel.setVisible(true);
        loginBtn.setDisable(true);
        usernameTextField.setDisable(true);
        passwordTextField.setDisable(true);
        while (secondsCounter > 0){
            timeLabel.setText(String.valueOf(secondsCounter));
            secondsCounter--;
            TimeUnit.SECONDS.sleep(1);
        }
        loginBtn.setDisable(false);
        usernameTextField.setDisable(false);
        passwordTextField.setDisable(false);
    }
    @FXML
    public void processLogin(ActionEvent actionEvent) throws SQLException, InterruptedException, IOException {
        if (tryCounter == 3){
           // timeout();
        }
        if(isTextEmpty()) {
            new Alert(Alert.AlertType.ERROR, "Please enter username and password");
            return;
        }
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        type = adminRadio.isSelected()? 0 : 1;

        if(officerManager.getTicketingOfficer(username,password,type) == null){
            tryCounter++;
            new Alert(Alert.AlertType.ERROR, "username or password incorrect");
            return;
        }
        if(type == 0) {
            navigateTo(actionEvent, "/com/trs/forms/AdminActionPage.fxml");
        }else{
            navigateTo(actionEvent, "/com/trs/forms/OfficerActionPage.fxml");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        isInitialized();
        youFailedLabel.setVisible(false);
        timeLabel.setVisible(false);
        secondsLabel.setVisible(false);
    }
    public void isInitialized(){
        assert adminRadio != null : "fx:id=\"adminRadio\" was not injected: check your FXML file 'Login.fxml'.";
        assert loginBtn != null : "fx:id=\"loginBtn\" was not injected: check your FXML file 'Login.fxml'.";
        assert officerRadio != null : "fx:id=\"officerRadio\" was not injected: check your FXML file 'Login.fxml'.";
        assert passwordTextField != null : "fx:id=\"passwordTextField\" was not injected: check your FXML file 'Login.fxml'.";
        assert secondsLabel != null : "fx:id=\"secondsLabel\" was not injected: check your FXML file 'Login.fxml'.";
        assert timeLabel != null : "fx:id=\"timeLabel\" was not injected: check your FXML file 'Login.fxml'.";
        assert typePicker != null : "fx:id=\"typePicker\" was not injected: check your FXML file 'Login.fxml'.";
        assert usernameTextField != null : "fx:id=\"usernameTextField\" was not injected: check your FXML file 'Login.fxml'.";
        assert youFailedLabel != null : "fx:id=\"youFailedLabel\" was not injected: check your FXML file 'Login.fxml'.";
    }
}
