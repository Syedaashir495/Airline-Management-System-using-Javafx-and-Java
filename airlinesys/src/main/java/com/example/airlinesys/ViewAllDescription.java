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
import javafx.scene.control.Button;
import java.io.IOException;
public class ViewAllDescription implements Initializable {

    @FXML
    AddDescriptionController obj = new AddDescriptionController();

    public static TableView<DescriptionView> table_info_app;

    public static ObservableList<DescriptionView> data_table;

    @FXML
    private TableView<DescriptionView> table_info;

    @FXML
    private TableColumn<DescriptionView, String> date,FlightNo, dep_from, arrive_at, dep_time,connecting, arrive_time;


    public ViewAllDescription() throws IOException {
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
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        FlightNo.setCellValueFactory(new PropertyValueFactory<>("FlightNo"));
        dep_time.setCellValueFactory(new PropertyValueFactory<>("dep_time"));
        dep_from.setCellValueFactory(new PropertyValueFactory<>("dep_from"));
        arrive_at.setCellValueFactory(new PropertyValueFactory<>("arrive_at"));
        connecting.setCellValueFactory(new PropertyValueFactory<>("connecting"));
        arrive_time.setCellValueFactory(new PropertyValueFactory<>("arrive_time"));



    }

    private void loadData() throws IOException {
        System.out.println("phatti 3" + obj.d1);

        data_table = FXCollections.observableArrayList();
        int length = obj.d1.size();

        for (int i = 0; i < length; i++) {
            data_table.add(new DescriptionView(obj.d1.get(i).getDate(),obj.d1.get(i).getFlightNo(), obj.d1.get(i).getDep_time(), obj.d1.get(i).getDep_from(), obj.d1.get(i).getArrive_at(), obj.d1.get(i).getConnecting(), obj.d1.get(i).getArrive_time()));
            //System.out.println(obj.d1.get(i).getConnecting() );
        //    d.readDescription();

        }
        table_info.setItems(data_table);


    }
    @FXML
    private Button back;
    @FXML
    HelloApplication shift8= new HelloApplication();



    @FXML
    void backtoFM(MouseEvent event) throws IOException {
        shift8.changeScene("FlightM.fxml");

    }
}
