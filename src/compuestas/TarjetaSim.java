package compuestas;

public class TarjetaSim {
    private String compania;
    private String numeroDeTelefono;

    public TarjetaSim(String numeroDeTelefono, String compania) {
        this.numeroDeTelefono = numeroDeTelefono;
        this.compania = compania;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
