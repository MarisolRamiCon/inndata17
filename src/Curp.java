import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Curp {
    public static void main(String[] args) {
        Set<String> curps= new TreeSet<>();
        curps.add("RACM250812");
        curps.add("RACM250813");
        curps.add("rACM250812");
        System.out.println(curps);
        curps.remove("rACM250812");
        System.out.println(curps);

        Set<Integer> numeros= new TreeSet<>();
        numeros.add(562818);
        numeros.add(5530);
        numeros.add(5526);
        System.out.println(numeros);
    }
}
