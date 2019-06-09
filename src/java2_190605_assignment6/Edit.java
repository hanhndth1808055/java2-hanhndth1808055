package java2_190605_assignment6;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Edit implements Initializable {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public static User userEdit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtUsername.setText(userEdit.getUsername());
        txtEmail.setText(userEdit.getEmail());
        txtPassword.setText(userEdit.getPassword());
    }

    public void update(){

    }

    public void home() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
