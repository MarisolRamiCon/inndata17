package POO;

public class Tortuga implements Terrestre, Marina{
    @Override
    public void nadar() {
        System.out.println("La tortuga nada");

    }

    public void patinar(){
        System.out.println("La tortuga patina");
    }

    @Override
    public void caminar() {
        System.out.println("La tortuga camina en la arena");

    }
}
