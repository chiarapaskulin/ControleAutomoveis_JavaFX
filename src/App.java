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
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javafx.application.Application.launch;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        ConjuntoAutomoveis autos = new ConjuntoAutomoveis();
        autos.addAutomovel(new Automovel("IYO-8574", "Polo MSI", 2018, "Volksvagen", 45, 4700.0));
        autos.addAutomovel(new Automovel("JUD-9163", "Corolla", 2018, "Toyota", 47, 0.0));
        autos.addAutomovel(new Automovel("IZB-2738", "Celta", 1999, "Chevrolet", 35,90000.0));
        autos.addAutomovel(new Automovel("JRF-1056", "Palio", 2009, "Fiat", 40, 30000.0));
        autos.addAutomovel(new Automovel("IGS-2794", "Focus", 2017, "Ford", 45, 10000.0));
        autos.addAutomovel(new Automovel("JFN-1485", "Amarok", 2018, "Volksvagen", 50, 20.0));
        ConjuntoAbastecimentos abastecimentos = new ConjuntoAbastecimentos();
        abastecimentos.addAbastecimento(new Abastecimento("Comum", LocalDate.now(), 0.0, 40.0, 30.0, 15.0));
        abastecimentos.addAbastecimento(new Abastecimento("Etanol", LocalDate.now(), 100.0, 30.0, 20.0, 20.0));
        abastecimentos.addAbastecimento(new Abastecimento("GNV", LocalDate.now(), 5.0, 20.0, 10.0, 10.0));
        abastecimentos.addAbastecimento(new Abastecimento("Aditivada", LocalDate.now(), 4.0, 21.0, 25.0, 30.0));


        FXMLLoader loader = new FXMLLoader(getClass().getResource("telaInicial.fxml"));
        Parent root = loader.load();
        ControllerTelaInicial telaInicial = loader.getController();
        telaInicial.setConjAuto(autos);
        telaInicial.setConjAbast(abastecimentos);

        primaryStage.setTitle("Tela Inicial");
        primaryStage.setScene(new Scene(root, 630, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void populaAutos(ConjuntoAutomoveis autos){

    }
}