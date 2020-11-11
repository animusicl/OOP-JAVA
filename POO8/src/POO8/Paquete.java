/*
 Una empresa de envios de paquetes tiene sucursales en todo el pais. Cada sucursal esta definida por
1. numero de sucursal
2. Direccion.
3. Ciudad
Para calcular el precio que cuesta enviar un paquete se tiene en cuenta:
1. precio del paquete.
2. prioridad.

se cobra 1 dolar por kg.
prioridad alta: 10 dolares.
express: 20 dolares

cada paquete tendra
1. Numero de referencia
2. DNI de la persona que lo envia.
 */
package POO8;

/**
 *
 * @author Guada Acosta
 */
public class Paquete {
    
 private double peso;
 private int prioridad;
 private int numeroPaquete;
 private String dni;
    public Paquete(double peso, int prioridad, int numeroPaquete, String dni) {
        this.peso = peso;
        this.prioridad = prioridad;
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

 
    

 public String mostrarDatosPaquete() {
 return "Numero paquete: "+numeroPaquete+"\nDNI: "+dni+"\nPeso: "+peso+"\nPrioridad: "+prioridad+"\n";
 }
 
 
  }
