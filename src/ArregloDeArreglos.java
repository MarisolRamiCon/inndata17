import java.util.Scanner;

public class ArregloDeArreglos {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        // Si quiero inicializar con datos pues asi lo declaro
        String [][] palabras={{"triangulo", "circulo", "rectangulo"}, {"piramide", "prisma", "cubo"}};
        //Si deseo inicializarlo sin datos
        String[][] nombres= new String[3][2];
        for(int filas=0;filas<3;filas++){
            for(int col=0; col<2; col++){
                System.out.println("Ingresa un nombre");
                nombres[filas][col]=entrada.nextLine();

            }
        }
        //Mostrando los datos de mi arreglo bidimensional
        for(String[] fila: nombres){
            for(String valor: fila){

                System.out.print(valor + " ");
            }
            System.out.println(" ");
        }

        int longitud=palabras.length;


    }
}
