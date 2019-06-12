package java2_190605_assignment6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Login {
    public TextField txtUsername;
    public TextField txtPassword;
    public Text txtSuccess;
    public Text txtError;

    public void login() {
        UserDAO ud = UserDAO.getInstance();
        boolean available = ud.login(txtUsername.getText(), txtPassword.getText());
        if (available) {
            txtSuccess.setVisible(true);
            txtError.setVisible(false);
        } else {
            txtSuccess.setVisible(false);
            txtError.setVisible(true);
        }
    }

    public void home() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void goToRegister() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}