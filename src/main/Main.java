package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("/main/scene/Notes.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/main/scene/Login.fxml"));
       Parent root = FXMLLoader.load(getClass().getResource("/main/scene/MainScene.fxml"));
        primaryStage.setTitle("Personal Manager");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
