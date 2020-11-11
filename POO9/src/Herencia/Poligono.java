/*
Hacer un programa para calcular el area de poligonos (triangulos y rectangulos) el programa debe ser capaz
de almacenar en un arreglo N triangulos y rectangulos, y al final mostrar el area y los datos de cada
uno. Para ello:
Super clase Poligono
sub clase Triangulo
sub clase Rectangulo
 */
package Herencia;


public abstract class Poligono {
    
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Numero de lados: "+numeroLados;
    }
    // declaramos el metodo area como abtracto.
    public abstract double area ();
   
  
    
}
