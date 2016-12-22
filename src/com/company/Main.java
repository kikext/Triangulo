package com.company;

public class Main {

    public static void main(String[] args) {

        Triangulo num1 = new Triangulo(98, 3);


        System.out.println("Perimetro: "+num1.perimetro());
        System.out.println("Altura: "+num1.calculaH());
        System.out.println("Area: "+num1.calculaA());
    }
}
