package myApplication;
import javafx.scene.canvas.*;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class GamePane extends BorderPane {

    public Label display = new Label("test");
    Canvas canvas = new Canvas(600,400);

    //GraphicsContext used to set the graphic settings of the canvas
    GraphicsContext context = canvas.getGraphicsContext2D();

    public GamePane(){

        this.setStyle("-fx-background-color: red;");
        this.setCenter(canvas);
    }
    //sprite: velocity, position, if 2 objects overlap, etc.

}
