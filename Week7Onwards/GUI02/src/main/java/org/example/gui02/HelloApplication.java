package org.example.gui02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FlowPane flowPane=new FlowPane();
        GridPane gridPane=new GridPane();
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.setVgap(20);
        Text text=new Text("Welcome to App");
        text.setFont(new Font("Arial",20));

        Label userNameLabel=new Label("User Name");
        Label passwordLabel=new Label("Password");
        TextField userNameTextField=new TextField();
        TextField passwordField=new TextField();

        Button button=new Button("Login");





        Scene scene = new Scene(gridPane, 320, 240);

        stage.setResizable(false);
        gridPane.setHgap(10);
        gridPane.add(text,0,0,2,1);
        gridPane.add(userNameLabel,0,1);
        gridPane.add(userNameTextField,1,1);
        gridPane.add(passwordLabel,0,2);
        gridPane.add(passwordField,1,2);

        HBox hBox=new HBox();
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(button);
        gridPane.add(hBox,1,3);
        //gridPane.add(button,0,1);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}