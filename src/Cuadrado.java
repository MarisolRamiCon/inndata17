public class Cuadrado implements Figura {
    float lado;
    //Metodo constructor, inicializa los argumentos.
    public Cuadrado(float lado){
        this.lado= lado;
    }

   /* public float Area(){
        return this.lado*this.lado;
    }*/


    public static void main(String[] args) {
        //Instanciar el objeto de la clase
        Cuadrado c= new Cuadrado(8);
        System.out.println("El area del cuadrado es "+ c.area());


    }

    @Override
    public double area() {
        return this.lado*this.lado;
    }

    @Override
    public double perimetro() {
        return this.lado*4;
    }
}
