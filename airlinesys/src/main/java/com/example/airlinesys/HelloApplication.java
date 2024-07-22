package com.example.airlinesys;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stg;

    @Override
    public void start(Stage  stage) throws IOException {
        stg = stage;

        Parent root = FXMLLoader.load(HelloApplication.class.getResource("welcome.fxml"));

//        stage.setTitle("Login");
        stage.setScene(new Scene(root));
        stage.show();
    }

        public void changeScene(String fxml ) throws IOException {
            Parent pane = FXMLLoader.load(getClass().getResource(fxml));
            stg.getScene().setRoot(pane);
        }






    public static void main(String[] args) {
        launch();
    }
}