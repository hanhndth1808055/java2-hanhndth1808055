package java2_190605_assignment6;

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

    public void update() throws Exception {
        userEdit.username = txtUsername.getText();
        userEdit.email = txtEmail.getText();
        userEdit.password = txtPassword.getText();
        UserDAO ud = UserDAO.getInstance();
        ud.update(userEdit);
        if (!ud.update(userEdit)) {
            txtEmail.setText("This email or this username is selected. Please select other choices.");
        } else {
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.MainStage.getScene().setRoot(root);
        }

    }

    public void home() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
