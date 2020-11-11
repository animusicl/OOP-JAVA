/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO4;

import java.util.Scanner;

/**
 *
 * @author Guada Acosta
 */
public class Main {
    
    
    
public static int IndiceGanador (Atleta competidores []) {
float tiempo;
int indice = 0;

tiempo = competidores [0].getTiempo();
for (int i = 0; i < competidores.length; i++) {
if (competidores [i].getTiempo() < tiempo){
    tiempo = competidores [i].getTiempo();
    indice = i;
}

} return indice;

}
    
 public static void main (String [] args) {
 Scanner entrada = new Scanner (System.in);
     
 int numero, cantidad, IndiceWin;
 String nombre;
 float tiempo;
 
 System.out.print("Ingrese la cantidad de atletas: ");
 cantidad = entrada.nextInt();
 
 Atleta competidores [] = new Atleta [cantidad];
 
 for (int i = 0; i < competidores.length; i++) {

 System.out.print("Ingrese los datos del atleta "+(i+1)+" :");
 System.out.print("\nNumero del atleta: ");
 numero = entrada.nextInt();
 System.out.print("\nNombre del atleta: ");
 nombre = entrada.nextLine();
 entrada.nextLine();
 System.out.print("\nTiempo de carrera del atleta: ");
 tiempo = entrada.nextFloat();
 
 competidores [i] = new Atleta (numero, nombre, tiempo);  }
 
 IndiceWin = IndiceGanador(competidores);
 System.out.println("El Atleta ganador es: ");
 System.out.println(competidores [IndiceWin].MostrarDatos());
 
 
 
 
 
 }
    
}
