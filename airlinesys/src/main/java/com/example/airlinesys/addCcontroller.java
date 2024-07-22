package com.example.airlinesys;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class addCcontroller {


    @FXML
    private Label wrongName;
    @FXML
    private Button back;

    @FXML
    private Button ok;


    @FXML
    private TextField Cname;
    @FXML
    private TextField Cnum;
    @FXML
    private TextField Cnic;
    @FXML
    private TextField add;
    @FXML
    HelloApplication shift4 = new HelloApplication();

    @FXML
    customer mc = new customer();
    @FXML
    protected static int count = 0;

    @FXML
    ArrayList<customer> c1=mc.readingRecord() ;

    public addCcontroller() throws IOException {
    }


    @FXML
    void backToCM(MouseEvent event) throws IOException {
        shift4.changeScene("CustomerM.fxml");
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CustomerM.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        Stage stage = new Stage();
//        stage.setTitle("menu");
//        stage.setScene(scene);
//        stage.show();

    }



        @FXML
        void dataEntered (MouseEvent event) throws IOException {
         count++;
            String text= Cname.getText();
            boolean check = false;
            for(int i=0;i< c1.size();i++){


            if (text.equals(c1.get(i).getName())) {

                check = true;
                wrongName.setText("customer already exists");

            }
            }

            if(!check) {
                mc.setName(Cname.getText());
                mc.setCnic(Cnic.getText());
                mc.setContactnum(Cnum.getText());
                mc.setAddress(add.getText());
                mc.setCount(count);
                c1.add(mc);

                System.out.println(mc.getName().matches("^[a-zA-Z]*$"));

                mc.addingrecord(c1);


                shift4.changeScene("CustomerM.fxml");
            }
        }

    }
