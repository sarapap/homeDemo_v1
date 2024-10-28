module org.example.homedemo_v1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.homedemo_v1 to javafx.fxml;
    exports org.example.homedemo_v1;
}