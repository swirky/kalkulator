module com.example.kalkulatortutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kalkulatortutorial to javafx.fxml;
    exports com.example.kalkulatortutorial;
}