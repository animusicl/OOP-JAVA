/*
 Hacer un programa para realizar gestiones en el banco, para las cuales tendremos las clases cliente y cuenta.
Considerar que un cliente se caracteriza por su nombre, apellido y dni. El cliente puede consultar saldo, retirar,
ingresar dinero. Ademas cada cuenta se caracteriza por un numero de cuenta y un saldo.
 */
package POO7;

/**
 *
 * @author Guada Acosta
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void ingresarDinero (double cantidad) {
    saldo += cantidad;
    }
    
    public void retirarDinero (double cantidad) {
    saldo -= cantidad;
    }
    
    
    
    
    
    
    
}
