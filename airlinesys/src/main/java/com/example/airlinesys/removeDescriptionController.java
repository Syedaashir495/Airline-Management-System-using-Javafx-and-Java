package com.example.airlinesys;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class removeDescriptionController {

    @FXML
    private TextField flightNo;

    Description ds=new Description();
    @FXML
    private Button back2;

    @FXML
    AddDescriptionController arr=new AddDescriptionController();

    @FXML

    private Button removeFD;
    @FXML
    HelloApplication shift8= new HelloApplication();

    public removeDescriptionController() throws IOException {
    }


    @FXML
    void backToFM(MouseEvent event) throws IOException {
    shift8.changeScene("FlightM.fxml");
    }

    @FXML
    void removeDescription(MouseEvent event) throws IOException {
        String RnameValue = flightNo.getText();



        int length = arr.d1.size();
        for (int i = 0; i < length; i++) {
            System.out.println("done");
            if (arr.d1.get(i).getFlightNo().equals(RnameValue) ) {

                arr.d1.remove(i);
                ds.addDescription(arr.d1);

                shift8.changeScene("FlightM.fxml");



            }
        }

    }

}
