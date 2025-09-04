package concurrencia;
//Crear hilos heredando de la clase Thread
public class MiTarea extends Thread{
    //Un atributo es la caracteristica de la clase
    private String nombre;

    public MiTarea(String nombre){
        this.nombre=nombre;
    }


    @Override
    public void run() {
        //Lo que coloco en el metodo run es lo que se ejecutara cuando el hilo empiece
        for(int i=1; i<=5;i++){
            System.out.println(nombre + " ejecutando paso "+ i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(nombre +" fue interrumpido");
            }
        }
        System.out.println(nombre + " termino.");
    }
}
