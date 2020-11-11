/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import static Herencia.Main.entrada;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guada Acosta
 */
public class Main {
  static ArrayList <Poligono> poligono = new ArrayList<Poligono>(); //creamos un array dinamico.
  static Scanner entrada = new Scanner (System.in);
  
   public static void main (String [] args) {
      //llamamos al metodo llenar poligono
       llenarPoligono();
       
      //llamamos al metodo mostrar resultados 
       mostrarResultados();
   }
  
  
  public static void llenarPoligono () {
  int opcion;
  char respuesta;  
      do {
      
          do {
          System.out.print("\n\tIngrese el poligono que desea: ");
          System.out.print("\n1. Triangulo");
          System.out.print("\n2. Rectangulo");
          System.out.print("\nSeleccione la opcion: ");
          opcion = entrada.nextInt();
          
          }while(opcion<1 || opcion>2);
          
          switch (opcion) {
              case 1: llenarTriangulo(); //llamamos al metodo
                  break;
              case 2: llenarRectangulo(); //llamamos al metodo
                  break;
          }
          
           System.out.print("\nDesea ingresar otro poligono? digite s/n: ");
           respuesta = entrada.next().charAt(0);
           System.out.print("");
           
      } while(respuesta == 's' || respuesta == 'S');
  
  
  }
  
  public static void llenarTriangulo() {
  double lado1, lado2, lado3;
  
  System.out.print("\nIntroduzca el lado 1: ");
  lado1 = entrada.nextDouble();
  System.out.print("\nIntroduzca el lado 2: ");
  lado2 = entrada.nextDouble();
  System.out.print("\nIntroduzca el lado 3: ");
  lado3 = entrada.nextDouble();
  
  Triangulo triangulo = new Triangulo (lado1, lado2, lado3);
  // guardamos un triangulo dentro de nuestro arreglo de poligonos.
  poligono.add(triangulo);
  }
  
  public static void llenarRectangulo() {
  double lado1, lado2;
  
   System.out.print("\nIntroduzca el lado 1: ");
   lado1 = entrada.nextDouble();
   System.out.print("\nIntroduzca el lado 2: ");
   lado2 = entrada.nextDouble();
   
   Rectangulo rectangulo = new Rectangulo (lado1, lado2);
   
   poligono.add(rectangulo);
  }
  
  public static void mostrarResultados() {
  
  for (Poligono poli: poligono) { // bucle for each para mostrar todo el arreglo
      System.out.print("\n");
      System.out.print(poli.toString()); //dependiendo de que tipo de poligono detecte, toma el toString.
      System.out.print("\nArea = "+poli.area());
      System.out.println("\n");
  }
  }
  
  
  
  
  
  
  
}
