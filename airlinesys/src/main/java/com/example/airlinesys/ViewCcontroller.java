package com.example.airlinesys;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewCcontroller implements Initializable {

@FXML
addCcontroller obj=new addCcontroller();



    public static TableView<customerView> table_info_app;

    public static ObservableList<customerView> data_table;
    @FXML
    private TableView<customerView> table_info;
    @FXML
    private TableColumn<customerView, String> name,cnic,address,number,id;

    public ViewCcontroller() throws IOException {
    }



@Override
public void initialize(URL url, ResourceBundle resourceBundle){
    System.out.println("enter 1");
    table_info_app=table_info;

    initializeCols();
    try {
        loadData();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

    private void initializeCols(){
        System.out.println("enter 2");


        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        cnic.setCellValueFactory(new PropertyValueFactory<>("cnic"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
    }
    private void loadData() throws IOException {
        System.out.println("enter 3");

        data_table= FXCollections.observableArrayList();
        int length=obj.c1.size();
        for(int i=0;i<length;i++){
            data_table.add(new customerView(String.valueOf(i+1),obj.c1.get(i).getName(),obj.c1.get(i).getCnic(),obj.c1.get(i).getContactnum(),obj.c1.get(i).getAddress()));
            System.out.println("enter 4" + obj.c1.get(i).getContactnum());

        }

        table_info.setItems(data_table);
    }
    @FXML
    HelloApplication shift6=new HelloApplication();
    @FXML
    void toCM(MouseEvent event) throws  IOException{
        shift6.changeScene("CustomerM.fxml");

    }


}
