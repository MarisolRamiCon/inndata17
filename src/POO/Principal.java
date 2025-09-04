package POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        //instanciar un objeto
        Perro perrito= new Perro("mestizo","blanco", "grande","macho","polvoron");
        System.out.println("Raza: "+perrito.getRaza());
        perrito.correr();
        perrito.comer();
        perrito.jugar();
        Perro miPerro= new Perro();
        System.out.println("¿Cuál es el nombre de tu perro");
        miPerro.setNombre(entrada.nextLine());
        System.out.println("Cuál es la raza");
        miPerro.setRaza(entrada.nextLine());
        perrito.mostrar();
        miPerro.mostrar();
    }
}
