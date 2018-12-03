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

    public String addAbastecimento(Abastecimento abast){
        try{
            LocalDate data1 = abast.getData();

            for(int i=0; i<abastecimentos.size(); i++){
                LocalDate data2 = abastecimentos.get(i).getData();
                if(data1.compareTo(data2)<0){
                    abastecimentos.add(i-1, abast);
                    return "";
                }
            }

            abastecimentos.add(abast);
            return "";
        }catch(Exception e) {
            return "Abastecimento inválido";
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for(Abastecimento abast : abastecimentos){
            str.append("\n" + abast.toString());
        }
        return str.toString();
    }
}
