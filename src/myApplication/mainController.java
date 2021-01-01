package myApplication;

import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class mainController implements Initializable {
    @FXML
    Button startButton;
    @FXML
    MenuBar menuBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        menuBar.getMenus().addAll(new Menu("help"), new Menu("Setting"));
        startButton.setOnAction(e -> myApplication.generalStage.setScene(new Scene(new GamePane())));
        MenuItem menuItem = new MenuItem("dhfksjdhfks");
    }
}
