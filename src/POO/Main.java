package POO;

public class Main {
    public static void main(String[] args) {
        Auto miAuto= new Auto("Chevrolet",50);
        miAuto.frenar();
        miAuto.acelerar();

        Moto mimoto= new Moto("Italika",50,"rojo");
        mimoto.acelerar();
    }

}
