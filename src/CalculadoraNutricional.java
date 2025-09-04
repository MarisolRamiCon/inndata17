import java.util.Scanner;

public class CalculadoraNutricional {
    public static void main(String[] args) {
        float p, h;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa tu peso por favor");
        p=entrada.nextFloat();
        System.out.println("Ingresa tu altura");
        h=entrada.nextFloat();
        float indiceMasaC=IMC(p,h);
        System.out.println("Tu IMC es "+indiceMasaC);

        CalculadoraNutricional cn= new CalculadoraNutricional();
        cn.suma();

        sumar("Alejandra",5);
        sumar("Berenice", 7,8,9,10,12);



    }

    static float IMC(float peso, float altura){
        float imc=peso/(altura*altura);
        return imc;
    }

    public void suma(){
        Scanner e2= new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int num1= e2.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2= e2.nextInt();
        System.out.println(num1+num2);
    }

    static void sumar(String nombre, double... numeros){
        double suma=0;
        for(double n: numeros){
            suma+=n;
        }
        System.out.println(nombre+ " tu suma es de: "+ suma);
    }
}
