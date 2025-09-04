public class Numeros {
    public static void main(String[] args) {
        int [] numeros = {2,4,6,8,10};
        numeros[3]=25;
        //2,4,6,25,10
        for(int numero: numeros){
            System.out.print(numero+ " ");
        }

    }

}
