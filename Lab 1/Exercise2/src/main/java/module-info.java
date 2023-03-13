module labone.exercise2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens labone.exercise2 to javafx.fxml;
    exports labone.exercise2;
}