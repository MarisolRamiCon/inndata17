package POO;

public class Carro implements Movil{
    private int velocidad;

    public Carro(int velocidad){
        this.velocidad=velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void moverse() {
        System.out.println("El carro se mueve por la carretera");
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad()+20);
        System.out.println("El auto acelero. Su velocidad actual es "+getVelocidad());
    }
}
