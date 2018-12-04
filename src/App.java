import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.applet.Main;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javafx.application.Application.launch;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("telaInicial.fxml"));
        Parent root = loader.load();

        ConjuntoAutomoveis autos = new ConjuntoAutomoveis();
        ConjuntoAbastecimentos abastecimentos = new ConjuntoAbastecimentos();

        ControllerCadastrarAutomovel cadastrarAutomovel = loader.getController();
        cadastrarAutomovel.setConjAuto(autos);

        ControllerAbastecerAutomovel abastecerAutomovel = loader.getController();
        abastecerAutomovel.setConjAuto(autos);
        abastecerAutomovel.setConjAbast(abastecimentos);

        ControllerVisualizarAbastecimentos visualizarAbastecimentos = loader.getController();
        visualizarAbastecimentos.setConjAbast(abastecimentos);

        ControllerVisualizarTodosAutomoveis visualizarTodosAutomoveis = loader.getController();
        visualizarTodosAutomoveis.setConjAuto(autos);

        ControllerEditarAutomovel editarAutomovel = loader.getController();
        editarAutomovel.setConjAuto(autos);

        primaryStage.setTitle("Tela Inicial");
        primaryStage.setScene(new Scene(root, 630, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}