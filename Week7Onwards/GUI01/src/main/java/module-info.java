module org.example.gui01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gui01 to javafx.fxml;
    exports org.example.gui01;
}