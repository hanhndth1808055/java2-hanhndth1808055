package jv2_190522_inclass2.studentfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class StudentList {
    public TextArea txtList;
    String str = "";

    public void show() throws Exception {
        File f = new File("data.txt");
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

        String line;
        while ((line = dis.readLine()) != null) {
            str += line + "\n";
        }

        dis.close();
        fis.close();

        txtList.setText(str);
    }

    public void toAdd() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentFX.fxml"));
        StudentFX.mainStage.setScene(new Scene(root, 600, 490));
    }
}
