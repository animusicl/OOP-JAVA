/*
 *Hacer un programa para realizar gestiones en el banco, para las cuales tendremos las clases cliente y cuenta.
Considerar que un cliente se caracteriza por su nombre, apellido y dni. El cliente puede consultar saldo, retirar,
ingresar dinero. Ademas cada cuenta se caracteriza por un numero de cuenta y un saldo.
 */
package POO7;

/**
 *
 * @author Guada Acosta
 */
public class Cliente {
    
private String nombre;
private String apellido;
private String dni;
Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public double consultarSaldo (int n) {
     return cuentas [n].getSaldo();
     
    }

    public void ingresarDinero (int n, double cantidad) {
     cuentas [n].ingresarDinero(cantidad);
    }
    
    public void retirarDinero (int n, double cantidad) {
    cuentas [n].retirarDinero(cantidad);
    }
}
