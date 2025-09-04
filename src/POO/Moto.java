package POO;

public class Moto extends Vehiculo{
    private String color;
    public Moto(String marca, int velocidad, String color) {
        super(marca, velocidad);
        this.color= color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void acelerar() {
        setVelocidad(getVelocidad()+30);
        System.out.println("La moto acelero, velocidad actual: "+getVelocidad());
    }

}
