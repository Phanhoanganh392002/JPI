package assignment;

import com.sun.deploy.net.MessageHeader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ContactController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtAge;
    public TextField txtPhone;

    private ObservableList<javafx.Contact> ls = FXCollections.observableArrayList();

    public void submit(ActionEvent actionEvent) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String age = txtAge.getText();
        String phone = txtPhone.getText();
        Contact ct = new Contact(name,email,address,age,phone);
        ls.add(ct);
       print();
}

    public void print(){
        lv.setItems(ls);
    }
}
