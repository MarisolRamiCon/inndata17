package compuestas;

public class Procesador {
    private String marca;
    private String tipo;
    private double velocidad;

    public Procesador(String marca, String tipo, double velocidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
