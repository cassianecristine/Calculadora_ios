package com.example.CalculadoraIOS;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class CalculadoraController {

    private long num1;
    private String operador;

    @FXML
    private Label output;


    @FXML
    private void processTeclado(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void processOperador(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if (!value.equals("=")) {
            if (!operador.isEmpty()){
                return;
            }
            operador = value;
            num1 = Long.parseLong(output.getText());
            output.setText("");
        } else {
            if(operador.isEmpty()){
                return;
            }
            if(output.getText().isEmpty()){
                output.setText("ERRO");
                operador = "";
            }
            output.setText(calcular(num1,Long.parseLong(output.getText()),operador));
            operador = "";
        }
    }

    private String calcular(long num1, long num2, String op){
        switch(op){
            case"+":
                return String.valueOf(num1 + num2);
            case "-":
                return String.valueOf(num1 - num2);
            case "x":
                return String.valueOf(num1 * num2);
            case"÷":
                if (num2 == 0){
                    return "ERRO";
                }
                return String.valueOf(num1 / num2);
        }
        return "ERRO";
    }

}