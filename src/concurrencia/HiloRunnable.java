package concurrencia;

public class HiloRunnable implements Runnable{
    private String nombre;

    public HiloRunnable(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nombre + " ejecutando paso " + i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido");
            }
        }
        System.out.println(nombre + " termino.");
    }
}
