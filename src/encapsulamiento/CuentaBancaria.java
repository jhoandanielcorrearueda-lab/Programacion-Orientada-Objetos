package encapsulamiento;

import java.sql.SQLOutput;

public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(){

    }

    public CuentaBancaria(String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getters - solo lesctura desde del exterior

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double cantidad){
        if (cantidad >0 ) {
            this.saldo += cantidad;
            System.out.println ("Desposito esxitoso de $"+ cantidad);
        }else{
            System.out.println("Error la cantidad debe ser positiva.");
        }
    }

    public void retirar (double cantidad){
        if (cantidad <=0){
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad >saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad);
        }
    }
}
