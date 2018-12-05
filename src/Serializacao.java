import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Serializacao {
    public Serializacao(){
    }

    public static void serializaAbasts(ConjuntoAbastecimentos  conjAbast) throws IOException {
        Path caminho = Paths.get("abastecimentos.bin");
        try (ObjectOutputStream saida = new ObjectOutputStream(Files.newOutputStream(caminho))) {
            saida.writeObject(conjAbast);
            System.out.println("Arquivo escrito com sucesso.");
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo.");
            e.printStackTrace();
        }
    }

    public static ConjuntoAbastecimentos leSerializadoAbasts() throws IOException{
        Path caminho = Paths.get("abastecimentos.bin");
        try (ObjectInputStream entrada = new ObjectInputStream(Files.newInputStream(caminho))) {
            ConjuntoAbastecimentos obj = (ConjuntoAbastecimentos) entrada.readObject();
            System.out.println(obj);
            System.out.println("Arquivo lido com sucesso.");
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Falha na leitura do arquivo.");
            return null;
        }
    }

    public static void serializaAutos(ConjuntoAutomoveis conjAuto) throws IOException {
        Path caminho = Paths.get("automoveis.bin");
        try (ObjectOutputStream saida = new ObjectOutputStream(Files.newOutputStream(caminho))) {
            saida.writeObject(conjAuto);
            System.out.println("Arquivo escrito com sucesso.");
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo.");
            e.printStackTrace();
        }
    }

    public static ConjuntoAutomoveis leSerializadoAutos() throws IOException{
        Path caminho = Paths.get("automoveis.bin");
        try (ObjectInputStream entrada = new ObjectInputStream(Files.newInputStream(caminho))) {
            ConjuntoAutomoveis obj = (ConjuntoAutomoveis) entrada.readObject();
            System.out.println(obj);
            System.out.println("Arquivo lido com sucesso.");
            return obj;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Falha na leitura do arquivo.");
            return null;
        }
    }
}
