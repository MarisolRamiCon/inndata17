package POO;

public class Bicicleta implements Movil{
    private int velocidad;

    public Bicicleta(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void moverse() {
        System.out.println("La bicicleta avanza pedaleando");
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad()+10);
        System.out.println("La bicicleta acelero. Su velocidad actual es "+getVelocidad());

    }

}
