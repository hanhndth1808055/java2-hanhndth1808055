package jv2_190520_inclass1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentName.fxml"));
        primaryStage.setTitle("Student Name");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
