import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        int tabla, numero;
        Scanner entrada= new Scanner(System.in);
        System.out.println("¿Que tabla quieres?");
        tabla=entrada.nextInt();
        System.out.println("¿Hasta que tabla quieres llegar?");
        numero=entrada.nextInt();
        for(int i=1; i<=numero; i++){
            int resultado= tabla*i;
            System.out.println(tabla + "x"+i+"="+resultado);
        }
    }
}
