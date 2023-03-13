module exercise3.exercise3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens exercise3.exercise3 to javafx.fxml;
    exports exercise3.exercise3;
}