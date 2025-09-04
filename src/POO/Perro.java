package POO;

public class Perro {
    //Atributos son las características de la clase
    private String raza;
    private String color;
    private String tamano;
    private String sexo;
    private String nombre;

    //Metodo constructor nos ayuda a crear objetos y a inicializar los atributos
    public Perro(String raza, String color, String tamano, String sexo, String nombre){
        this.raza=raza;
        this.color=color;
        this.tamano= tamano;
        this.sexo= sexo;
        this.nombre= nombre;
    }
    //constructor vacio o sin argumentos
    public Perro(){

    }
    //Para obtener los atributos que son privados en otra clase se utilizan los getter
    public String getRaza(){
        return this.raza;
    }
    //Para asignarle los atributos en otra clase se utilizan los setters
    public void setRaza(String raza){
        this.raza= raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Los métodos es lo que pueden realizar los perros
    public void ladrar(){
        System.out.println("El perro ladra");
    }
    public void comer(){
        System.out.println("Come croquetas");

    }
    public void correr(){
        System.out.println("El perro esta corriendo");

    }
    public void dormir(){
        System.out.println("El perro duerme");
    }
    public void jugar(){
        System.out.println("El perro juega");
    }

    public void mostrar(){
        System.out.println("Raza: "+ getRaza());
        System.out.println("Color: "+ getColor());
        System.out.println("Tamaño: "+getTamano());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Nombre: "+getNombre());
    }

}
