module labone.exercise3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens labone.exercise3 to javafx.fxml;
    exports labone.exercise3;
}