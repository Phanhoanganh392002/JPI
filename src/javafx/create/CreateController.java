package javafx.create;

import javafx.Main;
import javafx.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.list.ListController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public class CreateController implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public ComboBox<String> cbGender;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> genders = FXCollections.observableArrayList();
        genders.add("Nam");
        genders.add("Nữ");
        genders.add("Khác");
        cbGender.setItems(genders);
    }

    public void backToList(ActionEvent event) throws Exception{
        Parent listScene = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void submit(ActionEvent event){
        try {
            Integer m = Integer.parseInt(txtMark.getText());
            if(m<0 || m > 10)
                throw new Exception("Điểm thi không hợp lệ");
            // them sv
            Student s=  new Student(null ,txtName.getText(),txtEmail.getText(),m,cbGender.getValue());
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(ListController.connectionString,ListController.user,ListController.pwd);
            Statement stt = conn.createStatement();
            String sql_txt = "insert into students(name,email,mark,gender) values('"
                    +txtName.getText()+"','"
                    +txtEmail.getText()+"',"
                    +m
                    +",'"+cbGender.getValue()+"')";
            stt.executeUpdate(sql_txt);
            // xong
            backToList(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }

    }
}