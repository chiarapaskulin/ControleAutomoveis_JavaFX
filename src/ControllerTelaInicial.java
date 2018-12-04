import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTelaInicial implements Initializable{

    @FXML
    private GridPane gridTelaInicial;

    @FXML
    private Button editarAuto;

    @FXML
    private Button abastecerAuto;

    @FXML
    private Button cadAuto;

    @FXML
    private Button listarAbast;

    @FXML
    private Button listarAuto;

    @FXML
    private Button verAuto;

    @FXML
    private StackPane stack;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        //TODO
    }

    @FXML
    private void editarAutomovel() throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("editarAutomovel.fxml"));
        Stage stg = new Stage();
        stg.setTitle("Editar Automóvel");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void novoAbastecimento() throws IOException{
        Parent root = FXMLLoader.load(App.class.getResource("abastecerAutomovel.fxml"));
        Stage stg = new Stage();
        stg.setTitle("Abastecer Automóvel");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void novoAutomovel() throws IOException{
        Parent root = FXMLLoader.load(App.class.getResource("cadastrarAutomovel.fxml"));
        Stage stg = new Stage();
        stg.setTitle("Cadastrar Automóvel");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void listarAbastecimentos() throws IOException{
        Parent root = FXMLLoader.load(App.class.getResource("visualizarAbastecimentos.fxml"));
        Stage stg = new Stage();
        stg.setTitle("Visualizar Abastecimentos");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void listarAutomoveis() throws IOException{
        Parent root = FXMLLoader.load(App.class.getResource("visualizarTodosAutomoveis.fxml"));
        Stage stg = new Stage();
        stg.setTitle("Visualizar Todos Automóveis");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void verAuto() throws IOException{
        Parent root = FXMLLoader.load(App.class.getResource("visualizarAutomovel2.fxml"));
        Stage stg = new Stage();
        stg.setTitle("Visualizar Automóvel");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    public Node getNode(String node){
        Node no = null;
        try {
            no = FXMLLoader.load(getClass().getResource(node));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return no;

    }
}
