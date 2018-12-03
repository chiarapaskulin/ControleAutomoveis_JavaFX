import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.applet.Main;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(App.class.getResource("telainicial.fxml"));
        primaryStage.setTitle("Hello World");
        //primaryStage.getIcons().add(new Image("file:imagens/CHOGIWWRITTING-02.png"));
        primaryStage.setScene(new Scene(root, 630, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
