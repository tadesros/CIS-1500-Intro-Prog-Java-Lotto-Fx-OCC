module com.example.layout_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.layout_demo to javafx.fxml;
    exports com.example.layout_demo;
}