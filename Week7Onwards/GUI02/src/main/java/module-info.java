module org.example.gui02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gui02 to javafx.fxml;
    exports org.example.gui02;
}