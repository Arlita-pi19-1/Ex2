package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.awt.*;

public class Controller {
    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonThree;

    @FXML
    private Label labelForButtons;

    @FXML
    public void clickButton1(ActionEvent eventOne) {labelForButtons.setText("Clicked Button1"); }

    @FXML
    public void clickButton2(ActionEvent eventTwo) {labelForButtons.setText("Clicked Button2"); }
    @FXML
    public void clickButton3(ActionEvent eventThree) {labelForButtons.setText("Clicked Button3"); }
}
