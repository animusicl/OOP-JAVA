/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO3;

import java.util.Scanner;

/**
 *
 * @author Guada Acosta
 */
public class Main {

public static int IndiceMasBarato(Vehiculo coches[]) {
float precio;
int indice = 0;

precio = coches [0].getPrecio();
for (int i = 0; i < coches.length; i++) {
   if (coches[i].getPrecio() < precio) {
       precio = coches [i].getPrecio();
       indice = i; 
   }
    
   } return indice;
  
}    
        
public static void main (String [] args) {
Scanner entrada = new Scanner (System.in);
    
String marca, modelo;
float precio;
int CantidadCoches, indiceBarato;

System.out.print("Digite la cantidad de autos que desea ingresar: ");
CantidadCoches = entrada.nextInt();

Vehiculo coches [] = new Vehiculo [CantidadCoches];


    
for (int i = 0; i < coches.length; i++){
    entrada.nextLine();
    System.out.println("\nDigite las caracteristicas del coche "+(i+1)+" :");
    System.out.print("\n Digite la marca del auto: ");
    marca = entrada.nextLine();
    System.out.print("\n Digite el modelo del auto: ");
    modelo = entrada.nextLine();
    System.out.print("\n Digite el precio del auto: ");
    precio = entrada.nextFloat();
    
    coches [i] = new Vehiculo (marca, modelo, precio);  }

        

indiceBarato = IndiceMasBarato(coches);
System.out.println("El coche mas barato es: ");
System.out.println(coches [indiceBarato].mostrarDatos());

}
   } 

