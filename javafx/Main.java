package javafx;

import javafx.application.Application;
import javafx.database.Connetor;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {
    public static Stage rootStage;
    public static Connetor connector;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("fxml/HomePage.fxml"));
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setAlwaysOnTop(false);
        primaryStage.show();
    }
}
