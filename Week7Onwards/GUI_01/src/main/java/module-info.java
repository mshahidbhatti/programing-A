module org.example.gui_01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.gui_01 to javafx.fxml;
    exports org.example.gui_01;
}