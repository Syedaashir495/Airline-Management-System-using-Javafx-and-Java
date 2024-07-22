package com.example.airlinesys;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class scheduleNewFLightController {


    @FXML
    private Button back2;

    @FXML
    private Button removeFD;

    @FXML
    HelloApplication shift7=new HelloApplication();


    @FXML
    void backToFM(MouseEvent event) throws IOException {
        shift7.changeScene("FlightM.fxml");

    }

    @FXML
    void SchedulenewF(MouseEvent event) {

    }





}









