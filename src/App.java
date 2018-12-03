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
    //oi
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(App.class.getResource("telainicial.fxml"));
        primaryStage.setTitle("Hello World");
        //primaryStage.getIcons().add(new Image("file:imagens/CHOGIWWRITTING-02.png"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

//        URL arquivoFXML = getClass().getResource(
//                "testando.fxml");
//        Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
//        primaryStage.setScene(new Scene(fxmlParent, 300, 100));
//        primaryStage.setTitle("Olá mundo com FXML");
//        primaryStage.show();

//        try {
//            AnchorPane root = (AnchorPane) FXMLLoader.load(Main.class.getResource("/scr/testando.fxml"));
//            Scene scene = new Scene(root);
//            primaryStage.setScene(scene);
//            primaryStage.setTitle("Bluerift Timeline");
//            primaryStage.show();
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
