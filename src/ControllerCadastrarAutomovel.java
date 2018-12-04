import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ControllerCadastrarAutomovel{

    private ConjuntoAutomoveis conjAuto;

    @FXML
    private Pane paneCadAuto;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtAno;

    @FXML
    private TextField txtFabricante;

    @FXML
    private TextField txtCapTanque;

    @FXML
    private TextField txtValOd;

    @FXML
    private Button botaoCadastrar;

    public void setConjAuto(ConjuntoAutomoveis conjAuto){
        this.conjAuto = conjAuto;
    }

    public void cadastrarAutomovel(){
        String placa = "";
        String modelo = "";
        int ano = 0;
        String fabricante = "";
        int capacidadeTanque = 0;
        double valorOdometro = 0;

        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("ERRO");
        alerta.setHeaderText("ERRO");
        alerta.setContentText("Todos campos são obrigatórios. \nAlguns valores podem estar inválidos.");

        try{
            Automovel auto = new Automovel(txtPlaca.getText(), txtModelo.getText(), Integer.valueOf(txtAno.getText()),  txtFabricante.getText(), Integer.valueOf(txtCapTanque.getText()), Double.valueOf(txtValOd.getText()));
            if(conjAuto.addAutomovel(auto)){
                Alert al = new Alert(Alert.AlertType.INFORMATION);
                al.setTitle("");
                al.setHeaderText("Automóvel adicionado com sucesso!");
                al.showAndWait();
            }
        }catch(IllegalArgumentException e){
            alerta.showAndWait();
        }


//        while(txtPlaca.getText().trim().equals("") || txtModelo.getText().trim().equals("") || Integer.valueOf(txtAno.getText())==null || ano==0 ||  txtFabricante.getText().trim().equals("") || Integer.valueOf(txtCapTanque.getText())==null || capacidadeTanque==0 || Double.valueOf(txtValOd.getText())==null) {
//            alerta.showAndWait();
//            alerta.close();
//        }
//        if(!txtPlaca.getText().trim().equals("") && !txtModelo.getText().trim().equals("") && Integer.valueOf(txtAno.getText())!=null && ano!=0 &&  !txtFabricante.getText().trim().equals("") && Integer.valueOf(txtCapTanque.getText())!=null && capacidadeTanque!=0 && Double.valueOf(txtValOd.getText())!=null)

        //while(txtPlaca.getText().trim().equals("") || txtModelo.getText().trim().equals("") || Integer.valueOf(txtAno.getText())==null || ano==0 ||  txtFabricante.getText().trim().equals("") || Integer.valueOf(txtCapTanque.getText())==null || capacidadeTanque==0 || Double.valueOf(txtValOd.getText())==null){

//            if(!isValid(txtPlaca, placa)){
//                alerta.setContentText("A placa é um campo obrigatório.");
//                alerta.showAndWait();
//                alerta.close();
//            }
//
////            IllegalArgumentException excecao = new IllegalArgumentException("A placa é um campo obrigatório.");
////            throw excecao;
//            //placa = txtPlaca.getText();
//
//
//            alerta.setContentText("O modelo é um campo obrigatório.");
//            alerta.showAndWait();
////            IllegalArgumentException excecao = new IllegalArgumentException("O modelo é um campo obrigatório.");
////            throw excecao;
//            modelo = txtModelo.getText();
//
//
//            alerta.setContentText("O ano é um campo obrigatório.");
//            alerta.showAndWait();
////            IllegalArgumentException excecao = new IllegalArgumentException("O ano é um campo obrigatório.");
////            throw excecao;
//            ano = Integer.valueOf(txtAno.getText());
//
//            alerta.setContentText("O fabricante é um campo obrigatório.");
//            alerta.showAndWait();
////            IllegalArgumentException excecao = new IllegalArgumentException("O fabricante é um campo obrigatório.");
////            throw excecao;
//            fabricante = txtFabricante.getText();
//
//
//            alerta.setContentText("A capacidade do tanque é um campo obrigatório.");
//            alerta.showAndWait();
////            IllegalArgumentException excecao = new IllegalArgumentException("A capacidade do tanque é um campo obrigatório.");
////            throw excecao;
//            capacidadeTanque = Integer.valueOf(txtCapTanque.getText());
//
//
//            alerta.setContentText("O valor do odômetro é um campo obrigatório.");
//            alerta.showAndWait();
////            IllegalArgumentException excecao = new IllegalArgumentException("O valor do odômetro é um campo obrigatório.");
////            throw excecao;
//            valorOdometro = Double.valueOf(txtValOd.getText());
        //}

        //Automovel auto = new Automovel(placa, modelo, ano, fabricante, capacidadeTanque, valorOdometro);


    }
}
