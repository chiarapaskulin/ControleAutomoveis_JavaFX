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

    private ConjuntoAutomoveis conjAuto;
    private ConjuntoAbastecimentos conjAbast;

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

    public void setConjAuto(ConjuntoAutomoveis conjAuto){
        this.conjAuto = conjAuto;
    }

    public void setConjAbast(ConjuntoAbastecimentos conjAbast){
        this.conjAbast = conjAbast;
    }

    @FXML
    private void editarAutomovel() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("editarAutomovel.fxml"));
        Parent root = loader.load();

        ControllerEditarAutomovel editarAutomovel = loader.getController();
        editarAutomovel.setConjAuto(this.conjAuto);

        Stage stg = new Stage();
        stg.setTitle("Editar Automóvel");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void novoAbastecimento() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("abastecerAutomovel.fxml"));
        Parent root = loader.load();

        ControllerAbastecerAutomovel abastecerAutomovel = loader.getController();
        abastecerAutomovel.setConjAuto(this.conjAuto);
        abastecerAutomovel.setConjAbast(this.conjAbast);

        Stage stg = new Stage();
        stg.setTitle("Abastecer Automóvel");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void novoAutomovel() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cadastrarAutomovel.fxml"));
        Parent root = loader.load();

        ControllerCadastrarAutomovel cadastrarAutomovel = loader.getController();
        cadastrarAutomovel.setConjAuto(this.conjAuto);

        Stage stg = new Stage();
        stg.setTitle("Cadastrar Automóvel");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void listarAbastecimentos() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visualizarAbastecimentos.fxml"));
        Parent root = loader.load();

        ControllerVisualizarAbastecimentos visualizarAbastecimentos = loader.getController();
        visualizarAbastecimentos.setConjAbast(this.conjAbast);

        Stage stg = new Stage();
        stg.setTitle("Visualizar Abastecimentos");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void listarAutomoveis() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visualizarTodosAutomoveis.fxml"));
        Parent root = loader.load();

        ControllerVisualizarTodosAutomoveis visualizarTodosAutomoveis = loader.getController();
        visualizarTodosAutomoveis.setConjAuto(this.conjAuto);

        Stage stg = new Stage();
        stg.setTitle("Visualizar Todos Automóveis");
        stg.setScene(new Scene(root, 630, 500));
        stg.showAndWait();
    }

    @FXML
    private void verAuto() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visualizarAutomovel2.fxml"));
        Parent root = loader.load();

        //ControllerVisualizarAutomovel2 visualizarAutomovel = loader.getController();
        //visualizarAutomovel.setConjAuto(this.conjAuto);

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
