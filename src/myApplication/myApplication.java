package myApplication;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class myApplication extends Application {
    static Stage generalStage;
    static Scene Scene;
    @Override
    public void start(Stage primaryStage) throws Exception{

        generalStage = primaryStage;
        primaryStage.setTitle("Flappy bird!!!");

        Parent scene1 = FXMLLoader.load(getClass().getResource("mainUI.fxml"));
        Scene = new Scene(scene1);

        primaryStage.setScene(Scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
