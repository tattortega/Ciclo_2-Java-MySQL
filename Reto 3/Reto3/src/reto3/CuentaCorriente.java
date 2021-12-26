package reto3;

import java.util.Scanner;
public class CuentaCorriente extends Cliente implements Calcular{
    String n_cuenta, apertura;
    double saldo,sobregiro,interes;

    public String getNcuenta() {
        return n_cuenta;
    }

    public void setNumero(String n_cuenta) {
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

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
    
    @Override
    public double calcular() {
        double valor_interes;
        Scanner consola=new Scanner(System.in);
        n_cuenta="12345";
        apertura="29-07-21";
        System.out.println("Saldo de la cuenta: ");
        saldo=consola.nextDouble();
        System.out.println("Porcentaje de Interes: ");
        interes=consola.nextDouble();
        System.out.println("Valor permitido de sobregiro: ");
        sobregiro=consola.nextInt();
        if(this.saldo==0){
           valor_interes=0;
        }
        else{
            valor_interes=this.saldo*(this.interes/100);
        }
        return valor_interes;
    }    
}
