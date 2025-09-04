import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                    1. Cuentos
                    2. Leyendas
                    3. Chistes
                    4. Salir
                    """);
            System.out.println("Ingresa la opcion que te interesa del menu.");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(" \n" +
                            "* Caperucita roja" +
                            "* La cenicienta" +
                            "* Blanca nieves");
                    break;
                case 2:
                    System.out.println("""
                            * La llorona
                            * El charro negro
                            """);
                    break;
                case 3:
                    System.out.println("chistes");
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Esa no es una opción");
                    break;
            }
        }while(opcion!=4);
    }
}
