package exercise2.exercise2;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ComboBoxController{

    @FXML
    private ComboBox<String> cBNames;
    @FXML
    private Label lblName;

    public void initialize() {
        //Loads all the names into the combo box
        cBNames.getItems().setAll("Will", "Megan", "Amanda", "Tyler");
    }
    @FXML
    public void displaySelectedItem() {
        //Displays the name that has been clicked from the combo box
        lblName.setText(cBNames.getSelectionModel().getSelectedItem() + "!");
    }
}