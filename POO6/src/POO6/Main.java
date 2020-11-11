/*
 *Crear un programa para trabajar con dos numeros complejos, implementando el siguiente menu:
  1. Sumar dos numeros complejos.
  2. Multiplicar dos numeros complejos.
  3. Comparar 2 numeros complejos (iguales o no)
  4. Multiplicar un numero complejo por un entero.
 */
package POO6;

import java.util.Scanner;

/**
 *
 * @author Guada Acosta
 */
public class Main {
    
 public static void main (String [] args) {
 Scanner entrada = new Scanner (System.in);

double a, b, c, d; // numero 1= a + bi
                   // numero 2= c + di
int opcion, entero;
boolean igualdad = false;
                   


Complejo suma, mult, numero1, numero2, producto;

do {

    System.out.println("\n\t.:MENU:.");
    System.out.println("\n1. Sumar dos numeros Complejos.");
    System.out.println("\n2.Multiplicar dos numeros Complejos.");
    System.out.println("\n3. Comparar dos numeros Complejos.");
    System.out.println("\n4. Multiplicar un numero entero por un numero Complejo.");
    System.out.println("\n5. Salir.");
    
    System.out.print("\nSeleccione la opcion que desea: ");
    opcion = entrada.nextInt();
    
    switch (opcion) {
        case 1: 
            System.out.println("\n\tIntroduzca los numeros Complejos: ");
            System.out.print("\nIntroduzca la parte REAL del primer numero: ");
            a = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte IMAGINARIA del primer numero: ");
            b = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte REAL del segundo numero: ");
            c = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte IMGINARIA del segundo numero: ");
            d = entrada.nextDouble();
            
            numero1 = new Complejo (a,b);
            numero2 = new Complejo (c,d);
            
            suma = numero1.calcularSuma(numero2);
            System.out.print("\nLa sume es: "+suma.getA()+" + "+suma.getB()+"i");
            break;
            
        case 2: 
            System.out.println("\n\tIntroduzca los numeros Complejos: ");
            System.out.print("\nIntroduzca la parte REAL del primer numero: ");
            a = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte IMAGINARIA del primer numero: ");
            b = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte REAL del segundo numero: ");
            c = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte IMGINARIA del segundo numero: ");
            d = entrada.nextDouble();
            
            numero1 = new Complejo (a,b);
            numero2 = new Complejo (c,d);
            
            mult = numero1.calcularMultiplicacion(numero2);
            System.out.print("\nLa multiplicacion es: "+mult.getA()+" + "+mult.getB()+"i");
            break;
            
        case 3: 
            System.out.println("\n\tIntroduzca los numeros Complejos: ");
            System.out.print("\nIntroduzca la parte REAL del primer numero: ");
            a = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte IMAGINARIA del primer numero: ");
            b = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte REAL del segundo numero: ");
            c = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte IMGINARIA del segundo numero: ");
            d = entrada.nextDouble();
            
            numero1 = new Complejo (a,b);
            numero2 = new Complejo (c,d);
            
     if (numero1.comprobarIgualdad(numero2)) {
     System.out.print("\nLos numeros complejos son iguales.");
     }  
     else {
     System.out.print("\nLos numeros complejos son diferentes"); }
     break;
     
        case 4: 
            System.out.println("\n\tIntroduzca el numero Complejo: ");
            System.out.print("\nIntroduzca la parte REAL del numero: ");
            a = entrada.nextDouble();
            System.out.print("\nIntroduzca la parte IMAGINARIA del primer numero: ");
            b = entrada.nextDouble();
            
            System.out.print("\nIntroduzca un numero entero: ");
            entero = entrada.nextInt();
            
            numero1 = new Complejo (a,b);
            producto = numero1.multiplicarEntero(entero);
            
            System.out.print("El producto del numero complejo por el numero entero es: "+producto.getA()+" + "+producto.getB()+"i");
            break;
            
        case 5:  break;
        default: System.out.print("Error!");
     
    }

} while (opcion != 5);
 
 
 
 }
    
}
