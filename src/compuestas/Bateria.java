package compuestas;

public class Bateria {
    private double capacidad;
    private double voltaje;
    private double amperaje;

    public Bateria(double capacidad, double voltaje, double amperaje) {
        this.capacidad = capacidad;
        this.voltaje = voltaje;
        this.amperaje = amperaje;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public double getAmperaje() {
        return amperaje;
    }

    public void setAmperaje(double amperaje) {
        this.amperaje = amperaje;
    }
}
