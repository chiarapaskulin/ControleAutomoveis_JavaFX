import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class ControllerEditarAutomovel {

    private ConjuntoAutomoveis conjAuto;

    @FXML
    private Pane paneEditAuto;

    @FXML
    private ChoiceBox CBlistaplacas;

    @FXML
    private TextField txtNovaPlaca;

    @FXML
    private TextField txtNovoModelo;

    @FXML
    private TextField txtNovoAno;

    @FXML
    private TextField txtNovoFabricante;

    @FXML
    private TextField txtNovaCapTanque;

    @FXML
    private TextField txtNovoValOd;

    @FXML
    private Button botaoEditar;

    public void setConjAuto(ConjuntoAutomoveis conjAuto){
        this.conjAuto = conjAuto;
    }

    @FXML
    private void editaPlaca(){

    }

    @FXML
    private void editaModelo(ActionEvent actionEvent) {

    }

    @FXML
    private void editaAno(ActionEvent actionEvent) {
    }

    @FXML
    private void editaFabricante(ActionEvent actionEvent) {
    }

    @FXML
    private void editaCapTanque(ActionEvent actionEvent) {
    }

    @FXML
    private void editaValOd(ActionEvent actionEvent) {
    }

    @FXML
    private void editaAuto(ActionEvent actionEvent) {
    }

    @FXML
    private void mostraPlacas(MouseEvent mouseEvent) {
    }
}