package com.example.naomidejong562748endassignment.Controllers;

import com.example.naomidejong562748endassignment.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    protected void logInButtonClick() throws IOException {
        App.setRoot("MainWindow");
    }
}