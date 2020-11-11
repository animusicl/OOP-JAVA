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
public class Sucursal {
    
private int numeroSucursal;
private String direccion;
private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

public String mostrarDatosSucursal () {
return "Numero Sucursal: "+numeroSucursal+"\nDireccion: "+direccion+"\nCiudad: "+ciudad+"\n";
        }
public double calcularPrecio (Paquete t){ 
    double precio;

        precio = t.getPeso();
    if (t.getPrioridad() == 1) {
    precio += 10; }
    if (t.getPrioridad() == 2) {
    precio += 20; }
    return precio;
}



    }



    

