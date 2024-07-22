package com.example.airlinesys;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerMController {


    @FXML
    HelloApplication shift3=new HelloApplication();

    @FXML
    private Button RemoveC;

    @FXML
    private Button VallC;

    @FXML
    private Button VallR;

    @FXML
    private Button addC;

    @FXML
    private Button addRes;

    @FXML
    private Button cancelres;

    @FXML
    void addres(MouseEvent event) throws IOException{

        shift3.changeScene("addReservation.fxml");

    }


    @FXML
    void cancelres(MouseEvent event) throws IOException{
        shift3.changeScene("CancelReservation.fxml");

    }

    @FXML
    void resList(MouseEvent event) throws  IOException{
        shift3.changeScene("viewAllReservation.fxml");

    }

    @FXML
    void toaddC(MouseEvent event) throws IOException {

        shift3.changeScene("addC.fxml");

    }

    @FXML
    void tolist(MouseEvent event) throws IOException {

        shift3.changeScene("viewC.fxml");

    }

    @FXML
    void toremoveC(MouseEvent event) throws IOException {
        try {
            shift3.changeScene("RemoveC.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void backtoMM(MouseEvent mouseEvent) throws IOException {
        shift3.changeScene("menu.fxml");

    }
}
