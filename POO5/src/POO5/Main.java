/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO5;

import java.util.Scanner;

/**
 *
 * @author Guada Acosta
 */
public class Main {
    
public static int IndiceArea (Triangulo isosceles []) {
int indice = 0; 
double area; 

area = isosceles[0].Area();
for (int i=1; i < isosceles.length; i++) {
if (isosceles[i].Area() > area ) {
area = isosceles[i].Area();
indice = 1;
}

} return indice;
}  
      
 public static void main (String [] args) {
 Scanner entrada = new Scanner (System.in);
 
 double lado, base;
 int cantidadTriangulos, MayorArea;
 double perimetro, area;
 
 System.out.print("Introduzca la cantidad de triangulos: ");
 cantidadTriangulos = entrada.nextInt();
 
 Triangulo isosceles [] = new Triangulo [cantidadTriangulos];
 for (int i = 0; i < isosceles.length; i++) {
 System.out.println("\nIngrese los datos del triangulo "+(i+1)+" : ");
 System.out.print("\nIngrese la longitud de los lados: ");
 lado = entrada.nextDouble();
 System.out.print("Ingrese la longitud de la base: ");
 base = entrada.nextDouble();
 
 isosceles [i] = new Triangulo (lado, base); 
 System.out.println("\nEl perimetro del triangulo "+(i+1)+" es: "+isosceles[i].Perimetro());
 System.out.println("El Area del triangulo "+(i+1)+" es: "+isosceles[i].Area());
  
 }
 
 MayorArea = IndiceArea (isosceles);
 System.out.print("\nLos datos del Triangulo Isosceles de mayor area son: ");
 System.out.print("\n"+isosceles[MayorArea].mostrarDatos()+"\n");
 
 }
 

 }

 
 
 
 
 
 
    

