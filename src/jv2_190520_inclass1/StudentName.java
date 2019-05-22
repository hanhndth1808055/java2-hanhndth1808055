package jv2_190520_inclass1;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.HashSet;

public class StudentName {
    public TextField txtName;
    public TextArea txtResult;

    HashSet<String> Students = new HashSet<>();

    public void add() {
        if (Students.size() == 10) {
            print();
        } else {
            Students.add(txtName.getText());
        }
    }

    public void print() {
        String str = "";
        for (String s : Students) {
            str = str + System.lineSeparator() + s;
        }
        txtResult.setText(str);
    }

}
