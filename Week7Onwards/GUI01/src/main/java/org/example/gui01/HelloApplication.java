package org.example.gui01;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

class HelloApplication extends Application {

    public void start(Stage stage)throws IOException {
        FlowPane flowPane=new FlowPane();

        Scene scene = new Scene(flowPane, 500,400);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
              launch();

    }
}