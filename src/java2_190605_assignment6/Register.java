package java2_190605_assignment6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import jv2_190605_inclass7.UserDAO;
import java2_190605_assignment6.User;


public class Register {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public void register() {
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        try {
            User u = new User(null, username, email, password);
            UserDAO ud = UserDAO.getInstance();
//            ud.create(u);
        } catch (Exception e) {

        }
    }

    public void home() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void login() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.MainStage.getScene().setRoot(root);

    }
}
