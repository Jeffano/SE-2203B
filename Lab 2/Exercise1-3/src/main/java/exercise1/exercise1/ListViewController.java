package exercise1.exercise1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ListViewController {

    //This particular ListView control can hold only String objects.
    @FXML
    private ListView<String> lvItem;

    //Initialize method to add all the dogs
    public void initialize() {
        lvItem.getItems().addAll("Poodle", "Great Dane", "Labrador", "Terrier");
    }

    @FXML
    private Label selectedItem;

    //Displays the dog and the index value that was clicked after the button press
    @FXML
    public void displaySelectedItem() {
        selectedItem.setText(lvItem.getSelectionModel().getSelectedIndex() + "-" + lvItem.getSelectionModel().getSelectedItem());
    }
}