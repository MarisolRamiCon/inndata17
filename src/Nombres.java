import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        List<String> nombres= new ArrayList<>();
        for(int i=1;i<=5;i++){
            System.out.println("Ingresa el nombre "+ i);
            nombres.add(entrada.nextLine()); // añadir al final de la lista
        }
        System.out.println(nombres);
        nombres.add(0, "Adriana");
        System.out.println(nombres);
        if(nombres.contains("Marisol")){
            System.out.println("Marisol esta en la lista");
        }else{
            System.out.println("Marisol no esta en la lista");
        }
        System.out.println("Al final de la lista esta "+ nombres.get(nombres.size()-1));
        nombres.set(0,"Marisol");
        nombres.remove("Adriana");
        System.out.println(nombres);
    }
}
