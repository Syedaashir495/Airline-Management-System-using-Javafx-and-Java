package com.example.airlinesys;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class RemoveC {

    @FXML
    private Button back;

    @FXML
    private Button exit;

    @FXML
    private Button removeC;
    @FXML
    private TextField Rname;
    @FXML
    private TextField Rcnic;
    @FXML
    HelloApplication shift4= new HelloApplication();
@FXML
addCcontroller arr=new addCcontroller();

@FXML
customer addrec=new customer();

    public RemoveC() throws IOException {
    }

    @FXML
    void backtoCM(MouseEvent event) throws IOException {
        shift4.changeScene("CustomerM.fxml");


    }

    @FXML
    void exit(MouseEvent event) {
        Platform.exit();

    }

    @FXML
    void removeCustomer(MouseEvent event) throws IOException {
        String RnameValue = Rname.getText().toString();
        String RcnicValue = Rcnic.getText().toString();


        int length = arr.c1.size();
        for (int i = 0; i < length; i++) {
            System.out.println("done");
            if (arr.c1.get(i).getName().equals(RnameValue) && arr.c1.get(i).getCnic().equals(RcnicValue)) {
                System.out.println("in if");
                arr.c1.remove(i);
                addrec.addingrecord(arr.c1);

                shift4.changeScene("CustomerM.fxml");



            }
        }

    }

    }


