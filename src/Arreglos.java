import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String[] nombres= new String[5];
        for(int i=1;i<=5;i++){
            System.out.println("Ingresa el nombre "+ i);
            nombres[i-1]=entrada.nextLine();
        }
        //for each
        for(String name:nombres){
            System.out.print(name + "  ");
        }//[Ana, Beto, Clara,Ernesto, Araceli]
        int tamano=nombres.length;//Con esta función vamos a obtener el numero
        //de elementos que tiene el arreglo.
        System.out.println(" ");
        System.out.println("El numero de elementos que tiene el arreglo es: "+ tamano);
    }
}
