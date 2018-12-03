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

public class ControllerTelaInicial{

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


    @FXML
    private void editarAutomovel() throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("testando.fxml"));
        Stage oi = new Stage();
        oi.setTitle("Editar Automóvel");
        oi.setScene(new Scene(root, 300, 275));
        oi.showAndWait();
    }

    @FXML
    private void novoAbastecimento(){
        stack.getChildren().clear();
        stack.getChildren().add(getNode("novoAbastecimento.fxml"));
    }

    @FXML
    private void novoAutomovel(){
        stack.getChildren().clear();
        stack.getChildren().add(getNode("novoAutomovel.fxml"));
    }
    @FXML
    private void listarAbastecimentos(ActionEvent event){

    }

    @FXML
    private void listarAutomoveis(ActionEvent event){

    }

    @FXML
    private void verAuto(ActionEvent event){

    }

    public Node getNode(String node){
        Node no = null;
        try {
            no = FXMLLoader.load(getClass().getResource(node));
        } catch (Exception e) {
        }
        return no;

    }
}
