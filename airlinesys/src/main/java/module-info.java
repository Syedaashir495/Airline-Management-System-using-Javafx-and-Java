module com.example.airlinesys {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.airlinesys to javafx.fxml;
    exports com.example.airlinesys;
}