package com.example.CalculadoraIOS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculadoraIOS extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraIOS.class.getResource("calculadora-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 298, 537);
        stage.setTitle("CalculadoraIOS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}