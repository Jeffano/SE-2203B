package exercise1.exercise1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.util.ArrayList;


public class ListViewController {

    //This particular ListView control can hold only String objects.
    @FXML
    private ListView<String> lvItem;

    ArrayList<String> strArrayList = new ArrayList<>();



    //Initialize method to add all the dogs
    public void initialize() {
        //Adds the animals to the arraylist
        strArrayList.add("Poodle");
        strArrayList.add("Great Dane");
        strArrayList.add("Labrador");
        strArrayList.add("Terrier");

        //Allowing the option to click multiple options
        lvItem.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //Populates the item view with all dog names from the array list
        lvItem.getItems().setAll(strArrayList);
    }

    @FXML
    private Button listViewBtn;
    @FXML
    private Label selectedItem;

    //Displays the dog that was clicked after the button press
    @FXML
    public void displaySelectedItem() {

        //Used to get the selected items
        ObservableList<String> selections = lvItem.getSelectionModel().getSelectedItems();

        //Displays the selected items
        selectedItem.setText(selections.toString());
    }
}