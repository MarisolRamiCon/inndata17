public class OperadoresEspeciales {
    public static void main(String[] args) {
        int a=0;
        System.out.println("Postincremento de a = " + a++);//0
        //a=1
        System.out.println("Preincremento de a = "+ ++a);//2
        System.out.println("Postdecremento de a ="+ a--);//2
        //1
        System.out.println("Predecremento de a = "+ --a);//0
        int b=4, c=2;
        System.out.println("El cuadrado de "+b+"es "+ Math.pow(b,c));

    }
}
