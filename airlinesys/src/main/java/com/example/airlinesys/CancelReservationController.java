package com.example.airlinesys;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class CancelReservationController {

    reservation rs=new reservation();
    Customerreservation arr=new Customerreservation();
    @FXML
    Customerreservation cs=new Customerreservation();
    @FXML
    private TextField Cname;
    @FXML
    private TextField flightNo;
    @FXML
    private Button back;

    @FXML
    private Button cancelReservation;

    @FXML
    private Button exit;
    @FXML
    HelloApplication shift5=new HelloApplication();

    public CancelReservationController() throws IOException {
    }

    @FXML
    void backtocustomerMangment(MouseEvent event) throws IOException {
        shift5.changeScene("CustomerM.fxml");


    }

    @FXML
    void cancelReservation(MouseEvent event) throws IOException {
        String RnameValue = Cname.getText();
        String RcnicValue = flightNo.getText();


        int length = cs.newArray.size();
        System.out.println("done" + cs.newArray);
        System.out.println("done1" + RnameValue);
        System.out.println("done2" + RcnicValue);

        for (int i = 0; i < length; i++) {
            System.out.println("flight no is" +cs.newArray.get(i).getFlightNo());
            if (cs.newArray.get(i).getName().equals(RnameValue) && cs.newArray.get(i).getFlightNo().equals(RcnicValue)) {
                System.out.println("inn thee iff");
                cs.newArray.remove(i);
                rs.addReservation(cs.newArray);

                shift5.changeScene("CustomerM.fxml");
                break;


            }
        }



    }

    @FXML
    void exit(MouseEvent event) {
        Platform.exit();

    }

}
