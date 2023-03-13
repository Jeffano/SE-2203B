module exercise2.exercise2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens exercise2.exercise2 to javafx.fxml;
    exports exercise2.exercise2;
}