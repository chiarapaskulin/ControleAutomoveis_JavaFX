import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConjuntoAbastecimentos {
    private List<Abastecimento> abastecimentos;

    public ConjuntoAbastecimentos(){
        abastecimentos = new ArrayList<>();
    }

    public boolean addAbastecimento(Abastecimento abast){
        try{
            LocalDate data1 = abast.getData();

            //se a data que eu tenho (data1) é depois, retorna positivo
            //se a data que eu passei por parâmetro (data2) é depois, retorna negativo
            //se a data que eu tenho (data1) for antes, retorna negativo
            for(int i=0; i<abastecimentos.size(); i++){
                LocalDate data2 = abastecimentos.get(i).getData();
                if(data1.compareTo(data2)<0){
                    abastecimentos.add(i-1, abast);
                    return true;
                }
            }

            abastecimentos.add(abast);
            return true;
        }catch(Exception e) {
            System.out.println("Abastecimento inválido");
            return false;
        }
    }

    public List<Abastecimento> getAbastecimentos(){
        return abastecimentos;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for(Abastecimento abast : abastecimentos){
            str.append("\n" + abast.toString());
        }
        return str.toString();
    }
}
