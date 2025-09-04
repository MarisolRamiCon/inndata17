package POO;

public class Auto extends Vehiculo{
    public Auto(String marca, int velocidad){
        super(marca,velocidad);
    }

    @Override
    public void acelerar(){
        setVelocidad(getVelocidad()+20);
        System.out.println("El auto acelero. Su velocidad actual es "+getVelocidad());
    }
}
