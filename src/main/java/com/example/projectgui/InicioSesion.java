package com.example.projectgui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioSesion extends Application {
    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtPass, txtUser;
    private Stage primaryStage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InicioSesion.class.getResource("InicioSesion.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1110, 640); //Creamos una nueva escena, con 1110 de ancho y 640 alto
        InicioSesion controller = fxmlLoader.getController(); // Obténgo el controlador
        controller.setPrimaryStage(stage); // Establecemos el Stage en el controlador
        stage.setTitle("INICIO DE SESION"); //Seteamos el tituloo de  la ventana GUI
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onBtnLoginClicked() throws IOException {
        String username =  txtUser.getText().toString();
        String password = txtPass.getText().toString();
        if(username.equals("Admin") && password.equals("1234")){
            FXMLLoader fxmlLoader = new FXMLLoader(InicioSesion.class.getResource("Main.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 640);
            primaryStage.setTitle("MENU PRINCIPAL");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

    }

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

}


