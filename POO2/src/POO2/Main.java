/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

import java.util.Scanner;


public class Main {
    
public static void main (String [] args) {
Scanner entrada = new Scanner (System.in);
int x, y, opcion, n;
Tablero T1;

System.out.print("Digite el valor inicial de x: ");
x = entrada.nextInt();
System.out.print("Digite el valor inicial de y: ");
y = entrada.nextInt();

T1 = new Tablero(x, y);
do {

System.out.println("\n\t.:MENU:.");
System.out.println("1. Mover hacia arriba.");
System.out.println("2. Mover hacia abajo.");
System.out.println("3. Mover hacia la derecha.");
System.out.println("4. Mover hacia la izquierda.");
System.out.println("5. Salir.");
System.out.print("Digite la opcion que desea: ");
opcion = entrada.nextInt();

if (opcion != 5 ) {
System.out.print("Digite cuantas posiciones desea mover: ");
n = entrada.nextInt();
    
switch (opcion) {
    case 1: T1.moverArriba(n);
    break;
    case 2: T1.moverAbajo(n);
    break;
    case 3: T1.moverDerecha(n);
    break;
    case 4: T1.moverIzquierda(n);
    break;
    default: System.out.print("ERROR");
    break;
    
 }
    System.out.print("La nueva posicion es: ("+T1.getX()+","+T1.getY()+").");
    }

} while (opcion != 5);



}
    
}
