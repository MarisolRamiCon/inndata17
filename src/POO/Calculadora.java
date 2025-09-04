package POO;

import java.util.Scanner;

public class Calculadora {
    //Atributos de la clase o caracteristicas
    private String marca;
    private String color;
    private double precio;
    //Metodo constructor
    public Calculadora(String marca, String color, double precio){
        this.marca= marca;
        this.color=color;
        this.precio=precio;
    }
    //getter y setter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodos personalizados de Calculadora

    public int sumar(int num1, int num2){
        return num1+num2;
    }
    public double sumar(double num1, double num2){
        return num1+num2;
    }

    public void sumar(int... numeros){
        int suma=0;
        for(int n:numeros){
            suma+=n;
        }
        System.out.println("La suma es "+ suma);
    }
    public void sumar(){
        System.out.println("Estoy sumando");
    }
}
