package labone.exercise3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class BeautifulFlowersController implements Initializable {

    @FXML
    private ImageView flowersImageView;

    @FXML
    private Label flowersNote;

    @FXML
    private RadioButton roseRadioButton;

    @FXML
    private RadioButton callaLilyRadioButton;

    @FXML
    private RadioButton cannaRadioButton;

    @FXML
    private RadioButton bleedingHeartRadioButton;

    @FXML
    private RadioButton cherryBlossomRadioButton;

    @FXML
    private TitledPane aboutMe;
    // ADD LINES FOR TASK #3 HERE
    // Declare private fields for the images
    // Initialize method

    @FXML
    private Image roseImage;

    @FXML
    private Image bleedingHeart;

    @FXML
    private Image callaLily;

    @FXML
    private Image canna;

    @FXML
    private Image cherryBlossom;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // ADD LINES FOR TASK #3 HERE
        // Load the image files in the initialize method
        // Assigning the images to a file name
        roseImage = new Image("file:src/main/resources/labone/exercise3/Rose.gif");
        bleedingHeart = new Image("file:src/main/resources/labone/exercise3/Bleeding Heart.gif");
        callaLily = new Image("file:src/main/resources/labone/exercise3/Calla Lily.gif");
        canna = new Image("file:src/main/resources/labone/exercise3/Canna.gif");
        cherryBlossom = new Image("file:src/main/resources/labone/exercise3/Cherry Blossom.gif");

    }

    // Repeat and modify the above handler for the rest of the other flowers.
    public void roseRadioButtonListener() {
        // ADD THE LINES FOR TASK #3 HERE
        // If this radio button is selected,
        // display image and data for Rose.
        if(roseRadioButton.isSelected()){
            flowersImageView.setImage(roseImage);
            flowersNote.setText("This beautiful flower and symbol of love belongs the genus Rosa. The family name of this flower is Rosaceae and it contains different other species in almost all parts of the world. The flower of rose vary in size from each other depending upon the species to which they belong. A large number of species of this flower are found in different parts of Asia.");
        }
    }
    public void bleedingHeartRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for Bleeding Heart.
        if(bleedingHeartRadioButton.isSelected()){
            flowersImageView.setImage(bleedingHeart);
            flowersNote.setText("The bleeding heart flower belongs to the family known as Papaveraceae. This heart shaped flower is famous all over the world due to its unique beauty and is found in great numbers in Siberia and China. Blooming season of this flower starts in spring when there spread beautiful pink heart-shaped flowers in gardens. Lady-in-a-bath is also a common name of this flower.");

        }
    }

    public void callaLilyRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for Calla Lily.
        if(callaLilyRadioButton.isSelected()){
            flowersImageView.setImage(callaLily);
            flowersNote.setText("One simple and common name of this beautiful flower is arum lily and this flowering plant belongs to the family known as Araceae. This flowering plant is grown well in areas which have reasonable rainfall and moderate temperatures.");
        }
    }

    public void cannaRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for Canna.
        if(cannaRadioButton.isSelected()){
            flowersImageView.setImage(canna);
            flowersNote.setText("This beautiful flowering plant belongs to a genus that contain around 10 species and its family is known as Cannaceae. This flower plant also provides large quantity of starch which is further used for different purposes. This flower is mostly found in tropical regions of the world. The flowers of this plant have three sepals and three petals.");
        }
    }

    public void cherryBlossomRadioButtonListener() {
        // If this radio button is selected,
        // display image and data for Cherry Blossom.
        if(cherryBlossomRadioButton.isSelected()){
            flowersImageView.setImage(cherryBlossom);
            flowersNote.setText("Cherry blossom, a beautiful flowering plant is found in different parts of the world including the Northern Hemisphere. It is found in those areas which have moderate climate. All species of this flowering plant do not produce cherries as there are special species of this flower that produce edible cherries.");
        }
    }
}
