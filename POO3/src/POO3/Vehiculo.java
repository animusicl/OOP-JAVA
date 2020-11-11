/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO3;

/**
 *
 * @author Guada Acosta
 */
public class Vehiculo {
 //atributos.
 private String marca; 
 private String modelo;
 private float precio;

 //metodos.
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

   
    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos() { 
    return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: $"+precio+"\n";
    
    }
    
}
    

