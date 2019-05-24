package jv2_190522_inclass2.studentfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;

public class StudentController {
    public TextField txtName;
    public TextField txtClass;
    public TextField txtStudentNumber;
    public DatePicker dateDOB;
    public Text txtMsgSuccess;
    public Text txtMsgFail;

    public void submit() {
        boolean stop = false;
        if (txtName.getText().isEmpty() || dateDOB.getValue() == null || txtClass.getText().isEmpty() || txtStudentNumber.getText().isEmpty()) {
            stop = true;
            changeNotice(false);
        }
        String str = txtName.getText() + " - " + dateDOB.getValue() + " - " + txtClass.getText() + " - " + txtStudentNumber.getText();
        File f = new File("data.txt");
        if (f.canRead() && f.canWrite() && !stop) {
            try {
                String output = "";
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                String line;
                while ((line = dis.readLine()) != null) {
                    output += line + "\n";
                }
                fis.close();
                dis.close();

                output += str;

                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeBytes(output);
                dos.close();
                fos.close();

                txtName.setText("");
                dateDOB.setValue(null);
                txtClass.setText("");
                txtStudentNumber.setText("");

                changeNotice(true);
            } catch (Exception e) {
                changeNotice(false);
            }
        }
    }

    public void changeNotice(boolean flag) {
        if (flag) {
            txtMsgSuccess.setVisible(true);
            txtMsgFail.setVisible(false);
        } else {
            txtMsgSuccess.setVisible(false);
            txtMsgFail.setVisible(true);
        }
    }

    public void toList() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        StudentFX.mainStage.setScene(new Scene(root, 600, 400));
    }
}
