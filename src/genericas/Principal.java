package genericas;

public class Principal {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("chocolate1","negro");
        Chocolate choco= new Chocolate("cholate2","blanco");
        Soda soda1= new Soda("Soda1","Light");
        Soda soda2= new Soda("Soda2","Limón");

        Bolsa<Chocolate> bolsaDeChocolates= new Bolsa<>();
        bolsaDeChocolates.add(chocolate);
        bolsaDeChocolates.add(choco);
        System.out.println(bolsaDeChocolates.getLista().stream().map(elemento->
        "Nombre: "+ elemento.getNombre() + " presentación: "+ elemento.getPresentacion()
        ).toList());

        Bolsa<Soda> bolsaDeSodas = new Bolsa<>();
        bolsaDeSodas.add(soda1);
        bolsaDeSodas.add(soda2);
        System.out.println(
                bolsaDeSodas.getLista().stream().map(soda ->
                    soda.getNombre() + " sabor "+ soda.getSabor()
                ).toList()
        );


    }
}
