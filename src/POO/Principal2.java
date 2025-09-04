package POO;

public class Principal2 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora("Casio", "negro", 500);
        c.sumar();
        c.sumar(5,6,7,8,9);
        c.sumar(2.5,6.8);
    }
}
