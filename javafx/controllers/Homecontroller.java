package javafx.controllers;

import javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Homecontroller {




    public void gotodonelist(ActionEvent actionEvent) throws IOException {
        Stage stage =Main.rootStage;
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/car/Orders.fxml"));
        stage.setScene(new Scene(root,800,600));
        stage.setTitle("JavaFX Demo");
//        stage.setAlwaysOnTop(false);
        stage.show();
}
}
