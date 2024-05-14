module com.example.tictaktoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.tictaktoe to javafx.fxml;
    exports com.example.tictaktoe;
}