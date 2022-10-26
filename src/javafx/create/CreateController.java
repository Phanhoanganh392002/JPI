package javafx.create;

import javafx.Contact;
import javafx.Main;
import javafx.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.Objects;

import static com.sun.deploy.uitoolkit.impl.awt.AWTClientPrintHelper.print;
import static javafx.list.ListController.ls;

public class CreateController {
    public static Student editedStudent;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;

    public void backToList(ActionEvent event) throws Exception{
        Parent listScene = FXMLLoader.load((getClass().getResource("../list/list.fxml")));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void submit(ActionEvent event) throws Exception{
        // them sv
        // xong
        String name = txtName.getText();
        String email = txtEmail.getText();
        Integer mark = Integer.parseInt(txtMark.getText());
        Student st = new Student(name,email,mark);
        ls.add(st);
        backToList(null);
    }


}