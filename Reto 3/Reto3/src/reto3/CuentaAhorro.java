package reto3;

import java.util.Scanner;
public class CuentaAhorro extends Cliente implements Calcular{
    String n_cuenta, apertura;
    double interes, saldo;

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public String getApertura() {
        return apertura;
    }

    public void setApertura(String apertura) {
        this.apertura = apertura;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calcular() {
        Scanner consola=new Scanner(System.in);
        double valor_interes;
        n_cuenta="12345";
        apertura="29-07-21";
        System.out.println("Saldo de la cuenta: ");
        saldo=consola.nextDouble();
        System.out.println("Porcentaje de interes: ");
        interes=consola.nextDouble();        
        valor_interes=this.saldo*(this.interes/100);
        return valor_interes;
    }   
}
