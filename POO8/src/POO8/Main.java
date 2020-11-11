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

import java.util.Scanner;

/**
 *
 * @author Guada Acosta
 */
public class Main {
    
    
    public static int buscarPaquete (Paquete t[],int numeroPaquete, int contadorPaquete) {
    int indice = 0;
    boolean encontrado = false;
    for (int i = 0; i<contadorPaquete; i++){
        if (t[i].getNumeroPaquete() == numeroPaquete) {
        encontrado = true;
        indice = i; }
    }
        if (encontrado == false) {
        indice = -1; }
       
        return indice; 
    }
    
    
    
    public static int buscarSucursal (Sucursal t[], int numeroSucursal,int contadorSucursal) {
    int indice = 0;
    boolean encontrado = false; 
    for (int i = 0; i<contadorSucursal; i++) {
    if (t[i].getNumeroSucursal() == numeroSucursal){
    encontrado = true;
    indice = i; }
    }
    
    if (encontrado == false) {
    indice = -1; }
    
    return indice;
    }
    
    
    
    public static void main (String [] args) {
Scanner entrada = new Scanner (System.in);

int numeroSucursal, numeroPaquete, prioridad, opcion;
int contadorSucursal = 0, contadorPaquete = 0, indiceSucursal, indicePaquete;
String direccion, ciudad;
String dni;
double peso, precio; 
Sucursal sucursal [] = new Sucursal [50];
Paquete paquete [] = new Paquete [100];

do {
System.out.print("\n\t.:MENU:.");
System.out.print("\n1. Crear una nueva sucursal.");
System.out.print("\n2. Enviar paquete.");
System.out.print("\n3. Consultar sucursal.");
System.out.print("\n4. Consultar paquete.");
System.out.print("\n5. Mostrar todas las sucursales.");
System.out.print("\n6. Mostrar todos los paquetes");
System.out.print("\n7. Salir.");
System.out.print("\nSeleccione la opcion que desea: ");
opcion = entrada.nextInt();

switch (opcion) {
    case 1: System.out.print("\nIntroduzca el numero de sucursal: ");
            numeroSucursal = entrada.nextInt();
            entrada.nextLine();
            System.out.print("\nIntroduzca la direccion de la sucursal: ");
            direccion = entrada.nextLine();
            System.out.print("\nIntroduzca la ciudad: ");
            ciudad = entrada.nextLine();
            
        sucursal [contadorSucursal] = new Sucursal (numeroSucursal, direccion, ciudad);       
        contadorSucursal++;
        break; 
    case 2:System.out.print("\nIntroduzca el  numero de sucursal: ");
           numeroSucursal = entrada.nextInt();
           
           indiceSucursal = buscarSucursal (sucursal, numeroSucursal, contadorSucursal);
           if (indiceSucursal == -1){
           System.out.print("\nLa sucursal no existe.");}
           else { 
                  System.out.print("\nDigite el peso del paquete: ");
                  peso = entrada.nextDouble();
                  entrada.nextLine();
                  System.out.print("\nDigite la prioridad (0 = ninguna, 1 = alta, 2 = express): ");
                  prioridad = entrada.nextInt();
                  System.out.print("\nDigite el numero del paquete: ");
                  numeroPaquete = entrada.nextInt();
                  entrada.nextLine();
                  System.out.print("\nDigite su DNI: ");
                  dni = entrada.nextLine();
                          
                 
                 paquete [contadorPaquete] = new Paquete (peso, prioridad, numeroPaquete, dni);
                  

                  precio = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquete]);
                  System.out.print("\nEl precio es: $"+precio);
                  
                  contadorPaquete++;    }
                  break;
                  
     case 3:      System.out.print("\nDigite el numero de sucursal: ");
                  numeroSucursal = entrada.nextInt();
                  
                  indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                  if (indiceSucursal == -1){
                   System.out.print("\nLa sucursal no existe.");}
                  else {
                    System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                  }
                  break;
     case 4:  System.out.print("\nDigite el numero del paquete: ");
              numeroPaquete = entrada.nextInt();
              
              indicePaquete = buscarPaquete (paquete, numeroPaquete, contadorPaquete);
              
              if (indicePaquete == -1) {
               System.out.print("\nEl paquete no existe.");}
              else {
               System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
              }
              break;
     case 5: for (int i = 0; i<contadorSucursal; i++) {
          System.out.print("\nLos datos de la sucursal N°"+(i+1)+" son: ");
          System.out.println(sucursal[i].mostrarDatosSucursal());
     }
           break;
     case 6: for (int i = 0; i<contadorPaquete; i++) {
      System.out.print("\nLos datos del paquete N°"+(i+1)+" son: ");
      System.out.println(paquete[i].mostrarDatosPaquete());
      }
     break;
     
     case 7: break;
     default:  System.out.print("\nERROR! Opcion de menu incorrecta");break;
           
}

 System.out.print("\n");


} while (opcion != 7); 

        }


    
    
    
    
    }
    

