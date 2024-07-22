package com.example.airlinesys;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class FlightMController {

    @FXML
    private Button Schedule;

    @FXML
    private Button VallR;

    @FXML
    private Button back;

    @FXML
    private Button exit;

    @FXML
    private Button flightDes;

    @FXML
    private Button remove;


    @FXML
    HelloApplication shift4=new HelloApplication();


    @FXML
    void RemoveDes(MouseEvent event)throws IOException {
        shift4.changeScene("removeDescription.fxml");

    }

    @FXML
    void alldescriptions(MouseEvent event) throws IOException {
        shift4.changeScene("ViewAllDescription.fxml");


    }
    @FXML
    void back(MouseEvent event) throws IOException {
        shift4.changeScene("menu.fxml");


    }

    @FXML
    void exit(MouseEvent event) {
        Platform.exit();

    }

    @FXML
    void flightDescription(MouseEvent event)throws IOException {
        shift4.changeScene("AddDescription.fxml");

    }

    @FXML
    void scheduleNewFlight(MouseEvent event) throws IOException{
        shift4.changeScene("scheduleNewFlight.fxml");

    }

}
