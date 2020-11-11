/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO5;

/**
 *
 * @author Guada Acosta
 */
public class Triangulo {
private double lado;
private double base;


    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    public double Perimetro() {
        double perimetro = (2*lado+base);
        return perimetro;
    }

    public double Area() {
        double area = (base * Math.sqrt((lado*lado) - ((base*base) /4) ))/2;
        return area;
    }

    public String mostrarDatos () {
    return "Base: "+base+". \nLado: "+lado+". \nPerimetro: "+Perimetro()+". \nArea: "+Area()+".";
            }





    
}

