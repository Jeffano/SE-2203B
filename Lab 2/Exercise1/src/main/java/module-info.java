module exercise1.exercise1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens exercise1.exercise1 to javafx.fxml;
    exports exercise1.exercise1;
}