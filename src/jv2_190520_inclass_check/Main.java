package jv2_190520_inclass_check;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashSet;

public class Main extends Application {
    public static HashSet<String> studentList = new HashSet<>();
    public static Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Student.fxml"));
        primaryStage.setTitle("Add Students");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}