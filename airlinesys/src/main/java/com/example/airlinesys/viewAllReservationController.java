package com.example.airlinesys;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class viewAllReservationController implements Initializable {

    @FXML
    private Button back;
@FXML
HelloApplication shift6=new HelloApplication();

@FXML
Customerreservation obj=new Customerreservation();
    public static TableView<reservationView> table_info_app;

    public static ObservableList<reservationView> data_table;

    @FXML
    private TableView<reservationView> table_info;

    @FXML
    private TableColumn<reservationView, String> date,FlightNo, dep_from, arrive_at, name,cnic, address;

    public viewAllReservationController() throws IOException {
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        System.out.println("phatti array is" + );
        table_info_app = table_info;

        initializeCols();
        try {
            loadData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void initializeCols() {
        System.out.println("enter 2");
        //   System.out.println(FlightNo + " " + dep_from);
        FlightNo.setCellValueFactory(new PropertyValueFactory<>("FlightNo"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        dep_from.setCellValueFactory(new PropertyValueFactory<>("dep_from"));
        arrive_at.setCellValueFactory(new PropertyValueFactory<>("arrive_at"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        cnic.setCellValueFactory(new PropertyValueFactory<>("cnic"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));



    }

    private void loadData() throws IOException {
        System.out.println("phatti 3" + obj.newArray);

        data_table = FXCollections.observableArrayList();
        int length = obj.newArray.size();

        for (int i = 0; i < length; i++) {
            data_table.add(new reservationView(obj.newArray.get(i).getDate(),obj.newArray.get(i).getFlightNo(),  obj.newArray.get(i).getDep_from(), obj.newArray.get(i).getArrive_at(),obj.newArray.get(i).getName(),obj.newArray.get(i).getCnic(),obj.newArray.get(i).getAddress()));
            //System.out.println(obj.d1.get(i).getConnecting() );
            //    d.readDescription();

        }
        table_info.setItems(data_table);


    }
    @FXML
    void backtoCM(MouseEvent event) throws IOException {
        shift6.changeScene("CustomerM.fxml");

    }

}
