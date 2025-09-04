import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = entrada.nextLine() ;
        nombre=nombre.toUpperCase();//"BERENICE"
        System.out.println("Ingresa tu edad");
        byte edad = entrada.nextByte();
        System.out.println("Ingresa la calificación 1");
        double cal1=entrada.nextDouble();
        System.out.println("Ingresa la calificación 2");
        double cal2=entrada.nextDouble();
        System.out.println("Ingresa la calificación 3");
        double cal3=entrada.nextDouble();
        double promedio=(cal1+cal2+cal3)/3;
        if(promedio>=9){
            System.out.println(nombre +", tu promedio es sobresaliente");
        }else if(promedio>=7){
            System.out.println(nombre + " aprobaste");
        } else if(promedio>=6) {
            System.out.println(nombre + " estuviste cerca de aprobar");
        }else{
            System.out.println(nombre + " No aprobo");
        }
        if(edad>=18){
            System.out.println(nombre+ " Eres mayor de edad");
        }else{
            System.out.println(nombre + " Eres un niño o adolescente");
        }

        /*
        * Los wrappers son los primitivos envueltos y se distinguen de los primitivos porque
        * su primera letra es mayuscula
        * byte  Byte
        * short Short
        * int   Integer
        * long  Long
        * float Float
        * double Double
        * boolean Boolean
        * char  Character*/
    }
}