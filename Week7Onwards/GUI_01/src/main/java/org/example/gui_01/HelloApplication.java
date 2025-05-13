package org.example.gui_01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  extends Application{

        public void start(Stage stage)throws IOException{
           // System.out.println("Hello from GUI");

            GridPane gridPane=new GridPane();
            gridPane.setPadding(new Insets(15,15,15,15));
            gridPane.setVgap(20);
            gridPane.setHgap(20);
            Scene loginScene=new Scene(gridPane,500,400);

            Text welcomeText=new Text("Welcome to Login Form");
            welcomeText.setFont(new Font("Arial",30));

            Label userNameLabel=new Label("User Name");

            TextField userNameTextField=new TextField();


            Label passwrodLabel=new Label("Password");
            //TextField passwordTextField=new TextField();
            PasswordField passwordTextField=new PasswordField();

            Button cancelButton=new Button("Cancel");

            Button loginButton=new Button("Login");

            //gridPane.add(welcomeText,0,0);
            gridPane.add(welcomeText,0,0,3,1);
            gridPane.add(userNameLabel,0,1);
            gridPane.add(userNameTextField,1,1);
            gridPane.add(passwrodLabel,0,2);
            gridPane.add(passwordTextField,1,2);



            HBox hBox=new HBox();
            hBox.setSpacing(10);
            hBox.setAlignment(Pos.BASELINE_RIGHT);
            //hBox.getChildren().add(cancelButton);
            hBox.getChildren().addAll(cancelButton,loginButton);
            gridPane.add(hBox,1,3);

            stage.setScene(loginScene);
            stage.setTitle("Login Screen");
            stage.setResizable(false);


            stage.show();
        }

    public static void main(String[] args) {

        launch();
    }
}