package jv2_190520_inclass_check;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class List implements Initializable {
    public TextArea txtList;

    public void toAdd() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Student.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String str = "";
        for (String s: Main.studentList){
            str += (s + "\n");
        }
        txtList.setText(str);
    }
}
