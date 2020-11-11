/*
 *Crear un programa para trabajar con dos numeros complejos, implementando el siguiente menu:
  1. Sumar dos numeros complejos.
  2. Multiplicar dos numeros complejos.
  3. Comparar 2 numeros complejos (iguales o no)
  4. Multiplicar un numero complejo por un entero.
 */
package POO6;

/**
 *
 * @author Guada Acosta
 */
public class Complejo {
    
   private double a; //parte real
   private double b; // parte imaginaria

    public Complejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
   
   public Complejo calcularSuma (Complejo c) {
   Complejo suma = new Complejo (a+c.getA(), b+c.getB());
   return suma;
   }
    
   public Complejo calcularMultiplicacion (Complejo c) {
   Complejo multiplicacion = new Complejo ((a*c.getA()-b*c.getB()), (a*c.getB()+b*c.getA()));
   return multiplicacion;
   }
    
   public boolean comprobarIgualdad(Complejo c) {
   boolean igualdad = false;
       
   if ((a == c.getA() && b == c.getB())) {
   igualdad = true;
    }
   return igualdad;
   }
    
  public Complejo multiplicarEntero (int x) {
  Complejo producto = new Complejo (a*x,b*x);
  return producto;
  
  }

  
    
    
}
