package jv2_190607_lab9;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChangeController {

    public static boolean flag = true;

    public static final double rate = 23340;

    public Text txtLabel;
    public TextField txtAmount;
    public TextField txtResult;
    public RadioButton rbVN;
    public RadioButton rbUS;
    public RadioButton rbEN;
    public RadioButton rbVI;
    public Button change;
    public Text txtLabelAmount;
    public Text txtLabelChanged;

    public void convertVN() {
        rbVN.setSelected(true);
        rbUS.setSelected(false);
        flag = true;
    }

    public void convertUS() {
        rbVN.setSelected(false);
        rbUS.setSelected(true);
        flag = false;
    }

    public void change() {
        try {
            double money = Double.parseDouble(txtAmount.getText());
            String result;
            if (flag) {
                double n = money / rate;
                NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
                result = nf.format(n);
            } else {
                double n = money * rate;
                NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                result = nf.format(n);
            }
            txtResult.setText(result);
        } catch (Exception e) {

        }
    }

    public void rbEN() {
        rbEN.setSelected(true);
        rbVI.setSelected(false);
        ResourceBundle rb = ResourceBundle.getBundle("jv2_190607_lab9.lab9", Locale.US);
        txtLabel.setText(rb.getString("label"));
        txtLabelAmount.setText(rb.getString("labelAmount"));
        txtLabelChanged.setText(rb.getString("labelChanged"));
        txtAmount.setPromptText(rb.getString("amount"));
        txtResult.setPromptText(rb.getString("changed"));
        change.setText(rb.getString("exchange"));
    }

    public void rbVI() {
        rbEN.setSelected(false);
        rbVI.setSelected(true);
        ResourceBundle rb = ResourceBundle.getBundle("jv2_190607_lab9.lab9", new Locale("vi", "VN"));
        txtLabel.setText(rb.getString("label"));
        txtLabelAmount.setText(rb.getString("labelAmount"));
        txtLabelChanged.setText(rb.getString("labelChanged"));
        txtAmount.setPromptText(rb.getString("amount"));
        txtResult.setPromptText(rb.getString("changed"));
        change.setText(rb.getString("exchange"));
    }
}
