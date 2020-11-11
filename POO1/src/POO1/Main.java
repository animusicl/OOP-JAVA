/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO1;

import java.util.Scanner;

public class Main {
    
public static void main (String [] args) {
Scanner entrada = new Scanner(System.in);
    
float lado1, lado2;
Cuadrilatero C1;

System.out.print("Digite uno de los lados: ");
lado1 = entrada.nextInt();
System.out.print("Digite otro de los lados: ");
lado2 = entrada.nextInt();


if (lado1 == lado2) {
    
C1 = new Cuadrilatero (lado1);

 }

else {
C1 = new Cuadrilatero (lado1, lado2);
 
}
 System.out.println("el perimetro es: "+C1.getPerimetro());
 System.out.println("El area es: "+C1.getArea());
 

}
    
}
