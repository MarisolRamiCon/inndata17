package genericas;

public class Chocolate {
    private String nombre;
    private String presentacion;

    public Chocolate(String nombre, String presentacion) {
        this.nombre = nombre;
        this.presentacion = presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void mostrar(){
        System.out.println("Nombre: "+ getNombre() +
                "presentación: "+ getPresentacion());
    }
}
