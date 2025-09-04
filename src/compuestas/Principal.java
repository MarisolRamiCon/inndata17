package compuestas;

public class Principal {
    public static void main(String[] args) {
        Bateria bateria= new Bateria(50,5,6);
        TarjetaSim sim= new TarjetaSim("5521966935","Telcel");
        Procesador miProcesador= new Procesador("intel","snapdragon",4);
        MicroSD tsd= new MicroSD("Kingston",128);
        Celular micel= new Celular("Samsung",bateria,sim,miProcesador,tsd,256);
        System.out.println("El numero del telefono es: "+ micel.getSim().getNumeroDeTelefono() +
                " de la compañia " + micel.getSim().getCompania());

    }
}
