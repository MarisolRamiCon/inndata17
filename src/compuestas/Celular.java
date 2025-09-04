package compuestas;

public class Celular {
    private String marca;
    private Bateria bateria;
    private TarjetaSim sim;
    private Procesador procesador;
    private MicroSD tarjetaSd;
    private int almacenamientoInterno;

    public Celular(String marca, Bateria bateria, TarjetaSim sim, Procesador procesador, MicroSD tarjetaSd, int almacenamientoInterno) {
        this.marca = marca;
        this.bateria = bateria;
        this.sim = sim;
        this.procesador = procesador;
        this.tarjetaSd = tarjetaSd;
        this.almacenamientoInterno = almacenamientoInterno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public TarjetaSim getSim() {
        return sim;
    }

    public void setSim(TarjetaSim sim) {
        this.sim = sim;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public MicroSD getTarjetaSd() {
        return tarjetaSd;
    }

    public void setTarjetaSd(MicroSD tarjetaSd) {
        this.tarjetaSd = tarjetaSd;
    }

    public int getAlmacenamientoInterno() {
        return almacenamientoInterno;
    }

    public void setAlmacenamientoInterno(int almacenamientoInterno) {
        this.almacenamientoInterno = almacenamientoInterno;
    }
}
