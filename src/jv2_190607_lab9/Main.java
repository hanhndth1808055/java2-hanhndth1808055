package jv2_190607_lab9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("change.fxml"));
        primaryStage.setTitle("Change Currency");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
