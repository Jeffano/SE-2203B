module labone.exercise1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens labone.exercise1 to javafx.fxml;
    exports labone.exercise1;
}