import java.util.ArrayList;
import java.util.List;

public class Frutas {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Mango");
        frutas.add("Naranja");
        frutas.add("Melocotón");
        frutas.add("Uva");
        System.out.println(frutas);
        List<String> frutasConM = new ArrayList<>();
        frutasConM= frutas.stream().filter(
                f-> f.startsWith("M")
        ).toList();
        System.out.println(frutasConM);
        long tamanho= frutasConM.stream().count();
        System.out.println("Tienes "+ tamanho +" frutas que empiezan con M");
        //Imprimir todas las frutas con mayusculas
        List<String> frutasMayusculas= new ArrayList<>();
        frutasMayusculas=frutas.stream().map(f-> f.toUpperCase()).toList();
        System.out.println(frutasMayusculas);
    }
}
