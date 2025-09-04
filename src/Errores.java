import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Errores {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Ingresa el numero de elementos que tendrá tu lista");
        int numero= entrada.nextInt();
        entrada.nextLine();
        try {
            for (int i = 0; i < numero; i++) {


                System.out.println("Ingresa el numero");
                int num = entrada.nextInt();
                numeros.add(num);
            }
        }catch(Exception e){
                System.out.println("Error "+ e.getMessage());
                System.out.println("Ingresa numeros, no letras");

            }finally{
                System.out.println("Fin del programa");
            }


        }



    }

