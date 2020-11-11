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

METODOS: main, Menu, viajarEquipo, entrenarEquipo, jugarPartido, planificarEntrenamiento, darEntrevista,
curarLesion.
Arreglo dinamico: persona
 */
package POO10;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Guada Acosta
 */
public class Main {
static ArrayList <Persona> persona = new ArrayList <Persona>();    
static Scanner entrada = new Scanner (System.in);
 
// up casting = convertimo a los objetos de cada clase en objetos de la clase Persona
 static Persona futbolista1 = new Futbolista (9, "Delantero", "Gonzalo", "Higuain", 29); //polimorfismo
 static Persona futbolista2 = new Futbolista (21, "Delantero", "Paulo", "Dybala",23);
 static Persona entrenador = new Entrenador ("Defensiva", "Massimiliano","Allegri",49);
 static Persona medico = new Medico ("Licenciado en Fisioterapia", 20, "Alex", "Marroni", 55);
   

 public static void main (String [] args) {
    persona.add(futbolista1);
    persona.add(futbolista2);  // rellenando el arreglo dinamico
    persona.add(entrenador);
    persona.add(medico);
 
 Menu();
 
 }
    
public static void Menu () {
int opcion; 
do {
System.out.println(""); 
System.out.print("\n\t.:MENU:.");
System.out.print("\n1. Viaje de equipo.");
System.out.print("\n2. Entrenamiento.");
System.out.print("\n3. Partido de futbol.");
System.out.print("\n4. Planificar entrenamiento.");
System.out.print("\n5. Entrevista.");
System.out.print("\n6. Curar lesion.");
System.out.print("\n7. Salir.");
System.out.print("\nSeleccione opcion: ");
opcion = entrada.nextInt();

switch (opcion) {
    case 1: System.out.println(""); 
            viajarEquipo();
            break;
    case 2:System.out.println("");  
           entrenarEquipo();
           break;
    case 3: System.out.println("");  
            jugarPartido();
            break;
    case 4: System.out.println("");  
            planificarEntrenamiento();
            break;
    case 5: System.out.println("");  
            darEntrevista();
            break;
    case 6: System.out.println("");  
            curarLesion();
            break;
    case 7: break;
   default: System.out.println("");  
            System.out.print("\nError! opcion incorrecta");
    
       System.out.println("\n");
}

    } while (opcion != 7);
}

public static void viajarEquipo() {

for (Persona equipo: persona) {
System.out.print("\n"+equipo.getNombre()+ " "+equipo.getApellido()+" -> ");
equipo.viajar();  }
}

public static void entrenarEquipo() {

for (Persona equipo: persona) {
System.out.print("\n"+equipo.getNombre()+ " "+equipo.getApellido()+" -> ");
equipo.entrenamiento();   }

}

public static void jugarPartido() {

 for (Persona equipo: persona) {
 System.out.print("\n"+equipo.getNombre()+" "+equipo.getApellido()+" -> ");
 equipo.partidoFutbol();
    }
}

public static void planificarEntrenamiento() {
    
System.out.print("\n"+entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
((Entrenador)entrenador).planificarEntrenamiento(); //down casting. volvemos a bajar al objeto
                                                    //entrenador a la clase Entrenador.
}

public static void darEntrevista() {
System.out.print("\n"+futbolista1.getNombre()+" "+futbolista1.getApellido()+" -> ");
((Futbolista)futbolista1).entrevista(); //down casting
System.out.print("\n"+futbolista2.getNombre()+" "+futbolista2.getApellido()+" -> ");
((Futbolista)futbolista2).entrevista();

}

public static void curarLesion() {
System.out.print("\n"+medico.getNombre()+" "+medico.getApellido()+" -> ");
((Medico)medico).curarLesion(); }

}

          
