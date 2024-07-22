package com.example.airlinesys;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;

public class AddDescriptionController {


    @FXML
    private Label wrongFno;
    @FXML
    private Button addedToFile;

    @FXML
    private Button back;

    @FXML
    private Button exit;

    @FXML
    private TextField  FlightNo;
    @FXML
    private TextField dep_from;
    @FXML
    private TextField arrive_at;
    @FXML
    private TextField dep_time;
    @FXML
    private TextField arrive_time;
    @FXML
    private TextField date;

    public TextField getDate() {
        return date;
    }

    public void setDate(TextField date) {
        this.date = date;
    }

    @FXML
    private TextField connecting;

    @FXML
    HelloApplication shift6= new HelloApplication();

    @FXML
    Description ds = new Description();

    @FXML
    protected static int count = 0;

    @FXML
    ArrayList<Description> d1=ds.readDescription() ;

    public AddDescriptionController() throws IOException {
    }


    @FXML
    void addTofile(MouseEvent event) throws IOException {
        count++;
        boolean check=false;
        System.out.println("array is" + d1);
        String text= FlightNo.getText();
        for (int i = 0; i < d1.size(); i++) {
            System.out.println("in loop" + text);
            if (text.equals(d1.get(i).getFlightNo())) {
                System.out.println("in if");
                wrongFno.setText("flight number already exists");
                check=true;
            }
        }
        if(!check){
            ds.setFlightNo(FlightNo.getText());
            ds.setDep_from(dep_from.getText());
            ds.setArrive_at(arrive_at.getText());
            ds.setConnecting(connecting.getText());
            ds.setDep_time(dep_time.getText());
            ds.setArrive_time(arrive_time.getText());
            ds.setDate(date.getText());


            ds.setCount(count);

            d1.add(ds);
            ds.addDescription(d1);
            System.out.println(d1);
            System.out.println("done");
            shift6.changeScene("FlightM.fxml");
        }

    }

    @FXML
    void backToFlightM(MouseEvent event) throws IOException {
        shift6.changeScene("FlightM.fxml");

    }

    @FXML
    void exit(MouseEvent event) {
        Platform.exit();

    }

}