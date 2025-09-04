package concurrencia;

public class EjemploHilos {
    public static void main(String[] args) {
        //Creando hilos o tareas
        MiTarea tarea1= new MiTarea("Hilo 1");
        MiTarea tarea2= new MiTarea("Hilo 2");

        //Iniciamos los hilos con el metodo start
        tarea1.start();
        tarea2.start();
        System.out.println("El programa principal sigue corriendo...");
    }
}
