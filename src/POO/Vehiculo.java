package POO;
//Clase padre.
public class Vehiculo {
    //Atributos
    private String marca;
    private int velocidad;
    //Metodo constructor
    public Vehiculo(String marca, int velocidad){
        this.marca= marca;
        this.velocidad= velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //metodo propio de vehiculo
    public void frenar(){
        if(velocidad>0){
            velocidad-=10;
            System.out.println("freno. Su velocidad actual es: "+getVelocidad());
        }else{
            System.out.println(getMarca()+ " ya esta detenido");
        }
    }

    public void acelerar(){
        System.out.println("Estoy acelerando");
    }
}
