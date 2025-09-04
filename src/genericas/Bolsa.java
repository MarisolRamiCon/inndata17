package genericas;

import java.util.ArrayList;

public class Bolsa <T>{
    private ArrayList<T> bolsa= new ArrayList<>();

    public void add(T objeto){
        bolsa.add(objeto);

    }

    public ArrayList<T>  getLista(){
        return bolsa;
    }
}
//Bolsa de chocolates
//Bolsa de paletas
//Bolsa de accesorios
