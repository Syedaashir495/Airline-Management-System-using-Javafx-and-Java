package com.example.airlinesys;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class welcomeController {

    @FXML
    private Button login;
    @FXML

    private PasswordField password;
    @FXML

    private TextField username;
    @FXML
    private Label wrongLogin;

    @FXML
    HelloApplication shift=new HelloApplication();

    @FXML
    void tomenu(ActionEvent event1) throws IOException {
        System.out.println(("in to menu"));


     //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));

        String usernameValue=username.getText().toString();
        String passwordValue=password.getText().toString();
        Boolean check1=usernameValue.equals("fa21-bcs-125")&& passwordValue.equals("comsats");
        Boolean check2=usernameValue.equals("fa21-bcs-041")&& passwordValue.equals("comsats");
        Boolean check3=usernameValue.equals("fa21-bcs-059")&& passwordValue.equals("comsats");


        if((check1 || check2 || check3))

        {
                shift.changeScene("menu.fxml");


        }
        else{
            username.setStyle("-fx-text-box-border: #ef7680; -fx-focus-color:#B22222; -fx-background-radius: 40;-fx-border-width:50;");
            password.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;-fx-background-radius: 40;");
            wrongLogin.setText("Please enter valid credentials");
        }

    }


    public void exit(MouseEvent mouseEvent) {
        Platform.exit();
    }
}
