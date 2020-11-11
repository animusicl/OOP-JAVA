/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO10;

/**
 *
 * @author Guada Acosta
 */
public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    

    public String getEstrategia() {
        return estrategia;
    }
     
     @Override
    public void partidoFutbol () {
         System.out.print("Dirige el partido");
    }
     
    @Override
    public  void entrenamiento() {
        System.out.print("Dirige el entrenamiento ");
     }
    
     public void planificarEntrenamiento () {
     System.out.print("Planificar entrenamiento");}
    
}
