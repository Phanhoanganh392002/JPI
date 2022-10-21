package assignment;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ContactController {
    public TextField txtName;

    public Text strName;
    public TextField txtEmail;
    public Text strEmail;
    public TextField txtAddress;
    public Text strAddress;
    public TextField txtAge;
    public Text strAge;
    public TextField txtPhone;
    public Text StrPhone;


    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        strName.setText(name);

        String email = txtEmail.getText();
        strEmail.setText(email);

        String address = txtAddress.getText();
        strAddress.setText(address);

        String age = txtAge.getText();
        strAge.setText(age);

        String phone = txtPhone.getText();
        StrPhone.setText(phone);
    }
}
