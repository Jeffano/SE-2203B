package labone.exercise2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;

public class SampleHandlerController {
    @FXML
    private Label jumpingLabel;

    public void movingLabel(){
        Random randomPos = new Random();
        //Setting the text to appear at random spots through the window
        jumpingLabel.setLayoutX(randomPos.nextInt(500));
        jumpingLabel.setLayoutY(randomPos.nextInt(300));
    }
}