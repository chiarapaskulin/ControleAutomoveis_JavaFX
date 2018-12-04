import java.util.ArrayList;
import java.util.List;

public class Automovel {
    private String placa;
    private String modelo;
    private Integer ano;
    private String fabricante;
    private Integer capacidadeTanque;
    private double valorOdometro;
    private List<Abastecimento> abastecimentos;

    public Automovel(String placa, String modelo, Integer ano, String fabricante, Integer capacidadeTanque, Double valorOdometro){
        if(placa==null || placa.equals("") || modelo==null || modelo.equals("") || ano==null || ano<=0 || ano.equals("") || fabricante==null || fabricante.equals("") || capacidadeTanque==null || capacidadeTanque<=0 || capacidadeTanque.equals("") || valorOdometro==null || valorOdometro<0 || valorOdometro.equals("")){
            throw new IllegalArgumentException("Valor inválido");
        }else{
            this.placa = placa;
            this.modelo = modelo;
            this.ano = ano;
            this.fabricante = fabricante;
            this.capacidadeTanque = capacidadeTanque;
            this.valorOdometro = valorOdometro;
            abastecimentos = new ArrayList<>();
        }
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double getValorOdometro() {
        return valorOdometro;
    }

    public List<Abastecimento> getAbastecimentos() {
        return abastecimentos;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setValorOdometro(double valorOdometro) {
        this.valorOdometro = valorOdometro;
    }

    public void setAbastecimentos(List<Abastecimento> abastecimentos) {
        this.abastecimentos = abastecimentos;
    }

    public double mediaVolumeAbast(){
        double total = 0;
        for(Abastecimento abast: abastecimentos){
            total += abast.getQtLitros();
        }
        total = total/abastecimentos.size();

        return total;
    }

    public double mediaValorAbast(){
        double total = 0;
        for(Abastecimento abast : abastecimentos){
            total += abast.getPrecoPorLitro();
        }
        total = total/abastecimentos.size();

        return total;
    }

    public double rendimentoKmPorLitro(){
        double rendimentoMedio = 0;
        double km=0;
        double l=0;

        for(int i=0; i<abastecimentos.size()-2; i++){
            km = abastecimentos.get(i+1).getValorOdometro() - abastecimentos.get(i).getValorOdometro();
            l = abastecimentos.get(i).getQtLitros();
            rendimentoMedio += km/l;
        }
        rendimentoMedio = rendimentoMedio/(abastecimentos.size()-2);

        return rendimentoMedio;
    }

    public double custoMedioKm(){
        double total = valorOdometro - abastecimentos.get(0).getValorOdometro();

        return mediaValorAbast()/total;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Placa: " + placa +
                   "\nModelo: " + modelo +
                   "\nAno: " + ano +
                   "\nFabricante: " + fabricante +
                   "\nCapacidade do tanque de combustível: " + capacidadeTanque +
                   "\nValor atual do odômetro: " + valorOdometro);
        return str.toString();
    }
}