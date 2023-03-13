package labone.exercise3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class BeautifulFlowersApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BeautifulFlowersApplication.class.getResource("BeautifulFlowers-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Beautiful Flowers");
        stage.setScene(scene);
        //stage.getIcons().add(new Image("file:/Users/jeffanojohn/Desktop/SE 2203B - 002/Labs/LabOne/Exercise3/src/main/java/labone/exercise3/WesternLogo.png"));
        stage.getIcons().add(new Image("file:src/main/java/labone/exercise3/WesternLogo.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}