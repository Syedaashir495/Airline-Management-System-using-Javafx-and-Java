package com.example.airlinesys;

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

public class Customerreservation extends addReservationController implements Initializable {


    @FXML
    private Label oldcustomer;
    public static TableView<customerView> table_info_app;

    public static ObservableList<customerView> data_table;
    @FXML
    private TableView<customerView> table_info;
    @FXML
    private TableColumn<customerView, String> name, cnic, address, number, id;

    String names,cnics,addresses;
    @FXML
    private Label wrongName;
    @FXML
    private TextField nameR;
    addCcontroller ctable = new addCcontroller();
    @FXML
    private Button addreservation;
 //   reservation rs=new reservation();

    ViewCcontroller vc = new ViewCcontroller();
    HelloApplication shift = new HelloApplication();
 //   addReservationController obj=;

   ArrayList <reservation> newArray = rs.readReservation();
//   ArrayList <Description> newArray1 = new

    public Customerreservation() throws IOException {
        System.out.println("constructor called");
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


        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        cnic.setCellValueFactory(new PropertyValueFactory<>("cnic"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
    }

    private void loadData() throws IOException {
        System.out.println("enter 3");

        data_table = FXCollections.observableArrayList();
        int length = ctable.c1.size();
        for (int i = 0; i < length; i++) {
            data_table.add(new customerView(String.valueOf(i + 1), ctable.c1.get(i).getName(), ctable.c1.get(i).getCnic(), ctable.c1.get(i).getContactnum(), ctable.c1.get(i).getAddress()));
            System.out.println("enter 4" + ctable.c1.get(i).getContactnum());

        }

        table_info.setItems(data_table);
    }



    public void addR(MouseEvent event) throws IOException {
        String text = nameR.getText();
        boolean check = false;

        for(int i=0;i<newArray.size();i++) {

            if (newArray.get(i).getName().equals(text))
            {
                oldcustomer.setText("customer has already been reserved ");
                check=true;
            }

        }


        System.out.println("cus array is" + ctable.c1);
        if (!check){
            for (int i = 0; i < ctable.c1.size(); i++) {

                System.out.println("flight no is");

                System.out.println("customer size is" + ctable.c1.size());

                if (text.equals(ctable.c1.get(i).getName())) {
                    System.out.println("in cus if" + index);
                    rs.setName(ctable.c1.get(i).getName());

                    rs.setCnic(ctable.c1.get(i).getCnic());
                    rs.setAddress(ctable.c1.get(i).getAddress());
                    rs.setFlightNo(obj.d1.get(index).getFlightNo());
                    rs.setArrive_at(obj.d1.get(index).getArrive_at());
                    rs.setDep_from(obj.d1.get(index).getDep_from());
                    rs.setDate(obj.d1.get(index).getDate());
//                System.out.println("name is " + rs.getName());
                    System.out.println("flight no is" + rs.getFlightNo());
//                System.out.println("arrive at" + rs.getArrive_at());
//                System.out.println("departure at" + rs.getDep_from());
//                System.out.println("address is" + rs.getAddress());
//                System.out.println("cnic is" + rs.getCnic());
                    System.out.println("ors is" + rs);
//                adding(rs,text,addresses,cnics,names);
                    newArray.add(rs);
                    rs.addReservation(newArray);

//                System.out.println("address is " + addresses );
                    System.out.println("file data is" + newArray);

                    check = true;
//                newArray.get(0).setCustomerName(text);
//                System.out.println("hello new array" + newArray);

                    shift.changeScene("CustomerM.fxml");


                }
            }
            wrongName.setText("enter valid customer name");


        }





        }


//    public void adding( ) {



//        rs.setFlightNo(sr.getFlightNo());
//        System.out.println("flight no is" + rs.getFlightNo());
//        String text1 = nameR.getText();
//        for (int i = 0; i < ctable.c1.size(); i++) {
//
//            if (text1.equals(ctable.c1.get(i).getName())) {
//
//
//                sr.setName(ctable.c1.get(i).getName());
//                sr.setCnic(ctable.c1.get(i).getCnic());
//                sr.setAddress(ctable.c1.get(i).getAddress());
//                newArray.add(sr);
//
//            }
        }



//}





//    void setArray(ArrayList<Description> a){
//        newArray.add(a.get(0));
//        System.out.println("new array is" + newArray);
//        }






