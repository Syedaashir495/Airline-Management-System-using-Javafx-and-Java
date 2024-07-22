package com.example.airlinesys;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class addReservationController  implements Initializable {

    @FXML
    private Label wrongNum;
    @FXML
    private TextField flnumber;
    @FXML
    private Button added;

    ArrayList<Description> description=new ArrayList<>();

    @FXML
    private Button back;

    @FXML
    private Button exit;

    reservation rs=new reservation();
    addCcontroller ctable = new addCcontroller();

//    Customerreservation cr=new Customerreservation();

  static   int index;
    @FXML
    HelloApplication shift4=new HelloApplication();
    @FXML
    AddDescriptionController obj = new AddDescriptionController();
    public static TableView<DescriptionView> table_info_app;

    public static ObservableList<DescriptionView> data_table;

    @FXML
    private TableView<DescriptionView> table_info;

    String flightNumber,depFrom,arriveAt;

    @FXML
    private TableColumn<DescriptionView, String> date,FlightNo, dep_from, arrive_at, dep_time,connecting, arrive_time;


    public ArrayList<Description> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<Description> description) {
        this.description = description;
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("enter 1");
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
        dep_time.setCellValueFactory(new PropertyValueFactory<>("dep_time"));
        dep_from.setCellValueFactory(new PropertyValueFactory<>("dep_from"));
        arrive_at.setCellValueFactory(new PropertyValueFactory<>("arrive_at"));
        connecting.setCellValueFactory(new PropertyValueFactory<>("connecting"));
        arrive_time.setCellValueFactory(new PropertyValueFactory<>("arrive_time"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));




    }

    private void loadData() throws IOException {
        System.out.println("enter 3" + obj.d1);

        data_table = FXCollections.observableArrayList();
        int length = obj.d1.size();

        for (int i = 0; i < length; i++) {
            data_table.add(new DescriptionView(obj.d1.get(i).getDate(),obj.d1.get(i).getFlightNo(), obj.d1.get(i).getDep_time(), obj.d1.get(i).getDep_from(), obj.d1.get(i).getArrive_at(), obj.d1.get(i).getConnecting(), obj.d1.get(i).getArrive_time()));


        }
        table_info.setItems(data_table);


    }
    public addReservationController() throws IOException {
    }

    @FXML
    void added(MouseEvent event) throws IOException {

        String flNum= flnumber.getText();
        boolean check = false;
        for(int i=0;i<obj.d1.size();i++) {
            System.out.println("in if");
            if (flNum.equals(obj.d1.get(i).getFlightNo())) {

//                flightNumber=obj.d1.get(i).getFlightNo();
//                arriveAt=obj.d1.get(i).getArrive_at();
//                depFrom=obj.d1.get(i).getArrive_at();
                System.out.println("flight number"+arriveAt);



//                cr.addData(obj.d1.get(i));



                rs.setFlightNo(obj.d1.get(i).getFlightNo());
                rs.setDep_from(obj.d1.get(i).getDep_from());
                rs.setArrive_at(obj.d1.get(i).getArrive_at());
                index=i;


//                System.out.println("array is" + rs);
//                System.out.println("flight no is" + rs.getDep_from());
//                System.out.println("flight no is" + rs.getArrive_at());
//               setDescription(obj.d1.get(i));
//                System.out.println("description is "+description);

                check = true;
//                System.out.println("done" + "size " + obj.d1.get(0).getFlightNo());
//
                shift4.changeScene("customerreservation.fxml");
//
//
            }

        }
//        if(description.size()!=0){
//            cr.setNewArray1(description);
//
//        }
        if(!check) {

            wrongNum.setText("enter valid flight No");
            System.out.println("not found");
        }
//
//
    }
//    public void adding(reservation sr, String text1, String addresses, String cnics, String names) {
//
//
//      //  rs.setFlightNo(sr.getFlightNo());
//        System.out.println("flight no is" + rs.getFlightNo());
//
//
//
//
//                sr.setFlightNo(flightNumber);
//                System.out.println("the flight number is " + sr.getFlightNo());
//                sr.setAddress(addresses);
//                sr.setName(names);
//                sr.setCnic(cnics);
//
//           //   sr.setArrive_at(arriveAt);
////                sr.setName(ctable.c1.get(i).getName());
////                sr.setCnic(ctable.c1.get(i).getCnic());
////                sr.setAddress(ctable.c1.get(i).getAddress());
////                newArray.add(sr);
//                System.out.println("name is" + sr.getName());
//                System.out.println("");
//                System.out.println("flight no is" + arriveAt);
//
//
//            }





    @FXML
    void back(MouseEvent event) throws IOException {
        shift4.changeScene("CustomerM.fxml");

    }

    @FXML
    void exit(MouseEvent event) {
        Platform.exit();

    }
//        ViewAllDescription vd=new ViewAllDescription();


}


