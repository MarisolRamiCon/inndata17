package POO;

public class Principal3 {
    public static void main(String[] args){
        Carro carrito= new Carro(800);
        Bicicleta miBicy= new Bicicleta(200);
        carrito.moverse();
        miBicy.moverse();
        miBicy.acelerar();
    }

}
