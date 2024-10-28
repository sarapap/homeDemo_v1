package org.example.homedemo_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Label nameText;
    @FXML
    private Label date;
    @FXML
    private Label infoLabel;

    public void initialize(){
        //ResourceBundle bundle = ResourceBundle.getBundle("bundle2");
        //button1.setText(bundle.getString(button1.text));
        //button2.setText(bundle.getString(button2.text));
        //button3.setText(bundle.getString(button3.text));

    }

    public void setEN(ActionEvent actionEvent) {
        Locale l = new Locale("EN");
        nameText.setText("Sara");
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, l);
        String formattedDate = dateFormat.format(new Date(System.currentTimeMillis()));
        date.setText(formattedDate);

        infoLabel.setText(l.getDisplayLanguage());

        loadView(l);
    }

    public void setIR(ActionEvent actionEvent) {
        Locale l = new Locale("IR");
        nameText.setText("Sara");
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, l);
        String formattedDate = dateFormat.format(new Date(System.currentTimeMillis()));
        date.setText(formattedDate);

        infoLabel.setText(l.getDisplayLanguage());

        loadView(l);
    }

    public void setJP(ActionEvent actionEvent) {
        Locale l = new Locale("JP");
        nameText.setText("Sara");
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, l);
        String formattedDate = dateFormat.format(new Date(System.currentTimeMillis()));
        date.setText(formattedDate);

        infoLabel.setText(l.getDisplayLanguage());

        loadView(l);
    }

    public void loadView(Locale locale) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("bundle", locale));
        try {
            Parent root = fxmlLoader.load();
            Stage s = (Stage) button1.getScene().getWindow();
            s.setScene(new Scene(root));
            HelloController controller = fxmlLoader.getController();
            controller.nameText.setText(nameText.getText());
            controller.date.setText(date.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}