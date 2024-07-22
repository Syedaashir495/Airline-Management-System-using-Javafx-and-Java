package com.example.airlinesys;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController {

    @FXML
    private Button back2;
    @FXML
    private Button Back;

    @FXML
    private Button exit;

    @FXML
    HelloApplication shift2=new HelloApplication();

//    private Stage stage1;


  /*  void backToLogin(MouseEvent event) throws IOException {



       FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(scene);
        stage.show();

    }
*/

    @FXML
    private Button flights;



    @FXML
    void flightsWeOffer(MouseEvent event) {

    }



    @FXML
    void exit(MouseEvent event) {
        Platform.exit();

    }


    public void backToLogin(MouseEvent mouseEvent) throws  IOException{

        shift2.changeScene("welcome.fxml");
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcome.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        Stage stage = new Stage();
//        stage.setTitle("login");
//        stage.setScene(scene);
//        stage.show();
    }

    public void toCM(MouseEvent mouseEvent) throws IOException{
        System.out.println("in cm");
        shift2.changeScene("CustomerM.fxml");
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CustomerM.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        Stage stage = new Stage();
//        stage.setTitle("Main Menu");
//        stage.setScene(scene);
//        stage.show();

    }

    public void toFM(MouseEvent mouseEvent) throws IOException{
        shift2.changeScene("FlightM.fxml");

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FlightM.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        Stage stage = new Stage();
//        stage.setTitle("Main Menu");
//        stage.setScene(scene);
//        stage.show();
    }
}








