import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Abastecimento {

    public enum tipoDeComubustivel{
        Aditivada, Comum, Diesel, GNV, Etanol;
    }

    private tipoDeComubustivel tipoCombustivel;
    private LocalDate data;
    private double valorOdometro;
    private double qtLitros;
    private double custoTotal;
    private double precoPorLitro;

    public tipoDeComubustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValorOdometro() {
        return valorOdometro;
    }

    public double getQtLitros() {
        return qtLitros;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setTipoCombustivel(tipoDeComubustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setValorOdometro(double valorOdometro) {
        this.valorOdometro = valorOdometro;
    }

    public void setQtLitros(double qtLitros) {
        this.qtLitros = qtLitros;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    public void setPrecoPorLitro(double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Data do abastecimento: " + data +
                   "\nTipo de combustível: " + tipoCombustivel +
                   "\nValor do odômetro no momento do abastecimento: " + valorOdometro +
                   "\nQuantidade abastecida: " + qtLitros +
                   "\nPreço por litro: R$" + precoPorLitro +
                   "\nCusto total: R$" + custoTotal);
        return str.toString();
    }
}