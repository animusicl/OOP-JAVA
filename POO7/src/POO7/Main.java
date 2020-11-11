/*
 *Hacer un programa para realizar gestiones en el banco, para las cuales tendremos las clases cliente y cuenta.
Considerar que un cliente se caracteriza por su nombre, apellido y dni. El cliente puede consultar saldo, retirar,
ingresar dinero. Ademas cada cuenta se caracteriza por un numero de cuenta y un saldo.
 */
package POO7;

import java.util.Scanner;

/**
 *
 * @author Guada Acosta
 */
public class Main {
    
    public static int BuscarNumeroCuenta (Cuenta cuentas[], int n) {
    int i = 0, indice = 0;
    boolean encontrado = false;
    
    while (i < cuentas.length && encontrado == false) {
    if (cuentas [i].getNumeroCuenta() == n) {
    encontrado = true; 
    indice = i; }
    
    i++;
    
    if (encontrado == false) {
    indice = -1; }
        
    }
    
    return indice;
    }
    
    
    public static void main (String [] args) {
    
    Scanner entrada = new Scanner (System.in);
    String nombre, apellido, dni;
    int numeroCuenta, nCuentas, opcion, indiceCuenta;
    double saldo, cantidad;
    Cuenta cuentas[];
    Cliente cliente;
    
    System.out.print("\tIngrese los datos del cliente: ");
    System.out.print("\nNombre: ");
    nombre = entrada.nextLine();
    System.out.print("\nApellido: ");
    apellido = entrada.nextLine();
    System.out.print("\nDNI: ");
    dni = entrada.nextLine();
    System.out.print("\nDigite el numero de cuentas que posee: ");
    nCuentas = entrada.nextInt();
    
    cuentas = new Cuenta [nCuentas];
    for (int i = 0; i < cuentas.length; i++ ) {
    System.out.print("\nIntroduzca los datos de la cuenta "+(i+1)+":");
    System.out.print("\nNumero de la cuenta: ");
    numeroCuenta = entrada.nextInt();
    System.out.print("\nSaldo de la cuenta: ");
    saldo = entrada.nextDouble();
    
    cuentas [i] = new Cuenta (numeroCuenta, saldo);
    }
    
    cliente = new Cliente (nombre, apellido, dni, cuentas);
    
    do {
    System.out.print("\n\t .: MENU :.");
    System.out.print("\n1. Ingresar dinero.");
    System.out.print("\n2. Retirar dinero.");
    System.out.print("\n3. Consultar saldo.");
    System.out.print("\n4. Salir.");
    
    
    System.out.print("\nIntroduzca la operacion que desea realizar: ");
    opcion = entrada.nextInt();
    
    switch (opcion) {
        case 1: System.out.print("Ingrese la cuenta que desea operar: ");
                numeroCuenta = entrada.nextInt();
                indiceCuenta = BuscarNumeroCuenta (cuentas, numeroCuenta);
                 
        if (indiceCuenta == -1) {
        System.out.print("La cuenta ingresada no existe."); }
        
        else { 
        System.out.print("\nDigite la cantidad de dinero que desea ingresar: $");
        cantidad = entrada.nextDouble();
        
        cliente.ingresarDinero(indiceCuenta, cantidad);
        System.out.print("\nEl dinero ha sido ingresado correctamente.");
        System.out.print("\nSu saldo actual es de: $"+cliente.consultarSaldo(indiceCuenta));
        
     } break;
       
        case 2: System.out.print("Ingrese la cuenta que desea operar: ");
                numeroCuenta = entrada.nextInt();
                indiceCuenta = BuscarNumeroCuenta (cuentas, numeroCuenta);
                 
        if (indiceCuenta == -1) {
        System.out.print("La cuenta ingresada no existe."); }
        
        else { 
        System.out.print("\nDigite la cantidad de dinero que desea retirar: $");
        cantidad = entrada.nextDouble();
        
        
        if (cliente.consultarSaldo(indiceCuenta) >= cantidad) {
           cliente.retirarDinero(indiceCuenta, cantidad);
           System.out.print("\nLa operacion ha sido realizada con exito.");
           System.out.print("\nSu saldo actual es de: $"+cliente.consultarSaldo(indiceCuenta));
       } 
        else { System.out.print("\nSaldo no disponible.");
    }
        }
        break;
        
        case 3: System.out.print("Ingrese la cuenta que desea operar: ");
                numeroCuenta = entrada.nextInt();
                indiceCuenta = BuscarNumeroCuenta (cuentas, numeroCuenta);
                 
        if (indiceCuenta == -1) {
        System.out.print("La cuenta ingresada no existe."); }
        
        else { 
        System.out.print("\nEl saldo actual de la cuenta es de: "+cliente.consultarSaldo(indiceCuenta));
    }   break;
    
        case 4: break;
        
        default: System.out.print("ERROR!");
                 break;
    } 
    
        } while (opcion != 4);
    }   
 
}
    
    
    
    

