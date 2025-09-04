package concurrencia;

public class EjemploRunnable {
    public static void main(String[] args) {
        //Creamos las tareas instanciando el hilo que creamos a partir de Runnable
        HiloRunnable tarea1= new HiloRunnable("tarea1");
        HiloRunnable tarea2 = new HiloRunnable("tarea2");

        //Asociar tareas con los hilos
        Thread hilo1= new Thread(tarea1);
        Thread hilo2= new Thread(tarea2);

        //Iniciar los hilos
        hilo1.start();
        hilo2.start();

        System.out.println("El hilo principal sigue corriendo");

    }
}
