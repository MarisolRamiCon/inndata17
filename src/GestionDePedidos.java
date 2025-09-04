import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GestionDePedidos {
    public static void main(String[] args) {
        //Queue donde se almacenan los id de los pedidos
        Queue<String> colaPedidos = new PriorityQueue<>();
        //Añadiendo pedidos
        System.out.println("Nuevos pedidos llegando...");
        colaPedidos.add("pedido_1"); //parte delantera o fue el primero en llega
        colaPedidos.add("Pedido_2"); //fue el segundo en llegar
        colaPedidos.add("pedido_3"); //parte trasera o fue el ultimo en llegar
        System.out.println(colaPedidos);
        //peek recupera pero no elimina al primero que esta en el queue
        System.out.println("El primer pedido en atender es "+colaPedidos.peek());
        //atendiendo los pedidos
        while(!colaPedidos.isEmpty()){
            System.out.println("Atendiendo el pedido con id "+ colaPedidos.poll());
        }
    }
}
