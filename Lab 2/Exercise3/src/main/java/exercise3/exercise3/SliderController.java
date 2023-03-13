package exercise3.exercise3;

import javafx.scene.control.*;
import javafx.fxml.FXML;

import java.text.DecimalFormat;

public class SliderController{
    @FXML
    private Slider sliderCelsius;
    @FXML
    private Label lblFahrenheit;
    @FXML
    private Label lblCelsius;

    public void convertCelsius(){

        //Formatting the temperature to display a value after the decimal point
        DecimalFormat df = new DecimalFormat("0.0");

        //Gets the celsius amount from the sliders
        double celsius = sliderCelsius.getValue();

        //Converts celsius to Fahrenheit
        double fahrenheit = (9.0/5.0) * celsius + 32;

        //Formats the celsius and fahrenheit and converts them to String
        String fahrenheitString = df.format(fahrenheit);
        String celsiusString = df.format(celsius);

        //Sets the labels with the appropriate temperature
        lblCelsius.setText(celsiusString);
        lblFahrenheit.setText(fahrenheitString);
    }
}