package genericas;

public class Soda {
    private String nombre;
    private String sabor;

    public Soda(String nombre, String sabor) {
        this.nombre = nombre;
        this.sabor = sabor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void mostrar(){
        System.out.println("Nombre: "+ getNombre() +
                "Sabor: "+ getSabor());
    }
}
