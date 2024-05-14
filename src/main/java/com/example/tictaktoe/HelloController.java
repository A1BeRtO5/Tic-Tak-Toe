package com.example.tictaktoe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;

public class HelloController {
    private static int point = 0;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    private char gameField[][] = new char[3][3];
    boolean isGame = true;
    @FXML
    void buttonClick(ActionEvent event) {

        Button button = (Button)event.getSource();
        if (!isGame || button.getText() != "") return;
        int rowIndex = GridPane.getRowIndex(button)== null ? 0 : GridPane.getRowIndex(button);//те саме що і (якщоповертає налл то замінюємо на 0 інакше вертаємо координати рядка.
        int columnIndex = GridPane.getColumnIndex(button)== null ? 0 : GridPane.getColumnIndex(button);

        char mySumX = 'X';
        char mySum0= '0';
        if (point==0){
            button.setText(String.valueOf(mySumX));
            button.setStyle("-fx-text-fill: rgb(32, 57, 215);");
            gameField[rowIndex][columnIndex] =mySumX;

                    point =1;
        }else {
            button.setText(String.valueOf(mySum0));
            button.setStyle("-fx-text-fill: rgb(196, 48, 48);");
            gameField[rowIndex][columnIndex] =mySum0;

                    point=0;
        }
        if (gameField[0] [0] == gameField[0][1] && gameField[0] [0] == gameField[0][2] && (gameField[0][0] =='X' ||gameField[0][0] =='0') ) {
            Alert alert = new Alert(Alert.AlertType.NONE,"Вітаю " + button.getText() + " ти переміг", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameField[1] [0] == gameField[1][1] && gameField[0] [0] == gameField[1][2] && (gameField[1][0] =='X' ||gameField[1][0] =='0') ) {
            Alert alert = new Alert(Alert.AlertType.NONE,"Вітаю " + button.getText() + " ти переміг", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        }else if (gameField[2] [0] == gameField[2][1] && gameField[2] [0] == gameField[2][2] && (gameField[2][0] =='X' ||gameField[2][0] =='0') ) {
            Alert alert = new Alert(Alert.AlertType.NONE,"Вітаю " + button.getText() + " ти переміг", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        }else if (gameField[0] [0] == gameField[1][0] && gameField[0] [0] == gameField[2][0] && (gameField[0][0] =='X' ||gameField[0][0] =='0') ) {
            Alert alert = new Alert(Alert.AlertType.NONE,"Вітаю " + button.getText() + " ти переміг", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        }else if (gameField[0] [1] == gameField[1][1] && gameField[0] [1] == gameField[2][1] && (gameField[0][1] =='X' ||gameField[0][1] =='0') ) {
            Alert alert = new Alert(Alert.AlertType.NONE,"Вітаю " + button.getText() + " ти переміг", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        }else if (gameField[0] [2] == gameField[1][2] && gameField[0] [2] == gameField[2][2] && (gameField[0][2] =='X' ||gameField[0][2] =='0') ) {
            Alert alert = new Alert(Alert.AlertType.NONE,"Вітаю " + button.getText() + " ти переміг", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        } else if (gameField[0] [0] == gameField[1][1] && gameField[0] [0] == gameField[2][2] && (gameField[0][0] =='X' ||gameField[0][0] =='0') ) {
            Alert alert = new Alert(Alert.AlertType.NONE,"Вітаю " + button.getText() + " ти переміг", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        }else if (gameField[2] [0] == gameField[1][1] && gameField[2] [0] == gameField[0][2] && (gameField[2][0] =='X' ||gameField[2][0] =='0') ) {
            Alert alert = new Alert(Alert.AlertType.NONE,"Вітаю " + button.getText() + " ти переміг", ButtonType.OK);
            alert.showAndWait();
            isGame = false;
        }
    }
    @FXML
    void initialize() {

    }


}
