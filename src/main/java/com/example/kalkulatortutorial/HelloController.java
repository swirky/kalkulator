package com.example.kalkulatortutorial;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textfieldResult;
    @FXML
    private Button numberOne;
    @FXML
    private Button numberTwo;
    @FXML
    private Button numberThree;
    @FXML
    private Button numberFour;
    @FXML
    private Button numberFive;
    @FXML
    private Button numberSix;
    @FXML
    private Button numberSeven;
    @FXML
    private Button numberEight;
    @FXML
    private Button numberNine;
    @FXML
    private Button numberZero;
    @FXML
    private Button buttonEqual;
    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonSubstract;
    @FXML
    private Button buttonMultiply;
    @FXML
    private Button buttonDivide;
    @FXML
    private Button buttonClean;


    private int valueOfNumberOne;
    private int valueOfNumberTwo;

    private boolean addNumbers;
    private boolean substractNumbers;
    private boolean multiplyNumbers;
    private boolean divideNumbers;


    public void initialize() {

        numberOne.setOnAction(event -> textfieldResult.setText(String.valueOf(1)));
        numberTwo.setOnAction(event -> textfieldResult.setText(String.valueOf(2)));
        numberThree.setOnAction(event -> textfieldResult.setText(String.valueOf(3)));
        numberFour.setOnAction(event -> textfieldResult.setText(String.valueOf(4)));
        numberFive.setOnAction(event -> textfieldResult.setText(String.valueOf(5)));
        numberSix.setOnAction(event -> textfieldResult.setText(String.valueOf(6)));
        numberSeven.setOnAction(event -> textfieldResult.setText(String.valueOf(7)));
        numberEight.setOnAction(event -> textfieldResult.setText(String.valueOf(8)));
        numberNine.setOnAction(event -> textfieldResult.setText(String.valueOf(9)));
        numberZero.setOnAction(event -> textfieldResult.setText(String.valueOf(0)));


//Przycisk dodawania
        buttonAdd.setOnAction(event -> {
            getNumberOneAndCleanTextfieldToEnterNumberTwo();
            addNumbers = true;
        });

//Przycisk odejmowania
        buttonSubstract.setOnAction(event -> {
            getNumberOneAndCleanTextfieldToEnterNumberTwo();
            substractNumbers = true;
        });

// Przycisk mnożenia
        buttonMultiply.setOnAction(event -> {
            getNumberOneAndCleanTextfieldToEnterNumberTwo();
            multiplyNumbers = true;
        });

//Przycisk dzielenia
        buttonDivide.setOnAction(event -> {
            getNumberOneAndCleanTextfieldToEnterNumberTwo();
            divideNumbers = true;
        });


        buttonEqual.setOnAction(event -> {
            valueOfNumberTwo = Integer.valueOf(textfieldResult.getText());
            textfieldResult.setText(showResult(valueOfNumberOne, valueOfNumberTwo));
            resetButtons();
        });

        buttonClean.setOnAction(event -> {
            textfieldResult.clear();
            resetButtons();
        });

    }

    private void resetButtons() {
        addNumbers = false;
        substractNumbers = false;
        multiplyNumbers = false;
        divideNumbers = false;
    }


    private void getNumberOneAndCleanTextfieldToEnterNumberTwo() {
        valueOfNumberOne = Integer.valueOf(textfieldResult.getText());
        textfieldResult.clear();
    }

    private String showResult(int liczba1, int liczba2) {
        if (addNumbers) {
            return liczba1 + " + " + liczba2 + " = " + String.valueOf(liczba1 + liczba2);
        } else if (substractNumbers){
            return liczba1 + " - " + liczba2 + " = " +  String.valueOf(liczba1 - liczba2);
        } else if (multiplyNumbers) {
            return liczba1 + " * " + liczba2 + " = " + String.valueOf(liczba1 * liczba2);
        }   else if (divideNumbers) {
            double result = (double)liczba1 / liczba2;
            return liczba1 + " / " + liczba2 + " = " +  String.valueOf(result);
        } else
            return "Nie umiem przeliczyć";

    }
}
