/*
Crear un programa para simular un equipo de futbol (futbolista, entrenador y doctor), para lo cual 
tendremos lo siguiente: 
1. Super clase Persona con los siguientes datos: nombre, apellido, edad.
2. Sub clase Futbolista: dorsal y posicion.
3. sub clase Entrenador: tendra de tados la estrategia que utiliza
4. sub clase Doctor: tendra como datos titulacion y años de experiencia
hacer un menu con las siguientes opciones: 
- viaje de equipo.
- entrenamiendo.
- partido de futbol
- planificar entrenamiendo
- entrevista
- curar lesion
 */
package POO10;

/**
 *
 * @author Guada Acosta
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public void viajar () {
    System.out.print("Viajar \n");
    }
    
    public abstract void partidoFutbol ();
    public abstract void entrenamiento();
    
    
    
    
}
