package com.company;

/**
 * Created by 25374183p on 20/12/2016.
 */
public class Triangulo {

    private double lado;
    private double base;



    //------- CONSTRUCTOR -------------
    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    //------- GETTERS ------------------

    public double getLado() {
        return lado;
    }

    public double getBase() {
        return base;
    }

    //--------- SETTERS ------------


    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setBase(double base) {
        this.base = base;
    }


//----- operaciones ------------
    public double calculaH(){
        double a = Math.pow(lado,2);
        double b = Math.pow(base,2);
        double altura = Math.sqrt(a-(b/4));
        return altura;
    }

    public double calculaA(){
        double Area = ((base*calculaH())/2);
        return Area;
    }

    public double perimetro(){
        double perimetro = ((2*lado)+base);
        return perimetro;
    }


    //------------- toString ------------------

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado=" + lado +
                ", altura=" + base +
                '}';
    }
}
