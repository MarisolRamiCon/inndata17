import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Calificaciones {
    public static void main(String[] args) {
        Map<String, Double> notas= new LinkedHashMap<>();
        notas.put("Alejandro",8.5);
        notas.put("Marisela",7.5);
        notas.put("Aurora",7.5);
        notas.put("Aldo",8.9);
        System.out.println("La calificacion de Marisela es: "+ notas.get("Marisela"));
        System.out.println(notas);
        // Una forma de recorrer el map es:
        for(String nombre:notas.keySet()){
            Double n=notas.get(nombre);
            System.out.println(nombre + " tu calificación es "+ n);
        }
        System.out.println("¿Esta Pedro en la lista?");
        if(notas.containsKey("Pedro")){
            System.out.println("Si esta");
        }else{
            System.out.println("No esta");
        }


    }
}
