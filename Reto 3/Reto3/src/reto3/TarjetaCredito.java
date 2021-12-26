package reto3;

import java.util.Scanner;

public class TarjetaCredito extends Cliente implements Calcular{
    String n_tarjeta, apertura, vencimiento;
    double cupo, valor_utilizado,interes;

    public String getN_tarjeta() {
        return n_tarjeta;
    }

    public void setN_tarjeta(String n_tarjeta) {
        this.n_tarjeta = n_tarjeta;
    }

    public String getApertura() {
        return apertura;
    }

    public void setApertura(String apertura) {
        this.apertura = apertura;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }
    
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public double getValor_utilizado() {
        return valor_utilizado;
    }

    public void setValor_utilizado(double valor_utilizado) {
        this.valor_utilizado = valor_utilizado;
    }

    @Override
    public double calcular() {
        Scanner consola=new Scanner(System.in);
        double valor_interes;
        n_tarjeta="12345";
        apertura="29-07-21";
        vencimiento="29-07-22";
        System.out.println("Cupo de la tarjeta: ");
        cupo=consola.nextDouble();
        System.out.println("Interes a cobrar: ");
        interes=consola.nextDouble();
        System.out.println("Valor utilizado: ");
        valor_utilizado=consola.nextDouble();
        valor_interes=this.valor_utilizado*(this.interes/100);
        return valor_interes;
    }
}
