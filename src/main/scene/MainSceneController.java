package main.scene;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MainSceneController implements Initializable {
    //@Override
    private Button about;
    public void initialize(URL location, ResourceBundle resources) {



    }
    public void handleAbout(ActionEvent e){
        System.out.print("show about");
    }
}
