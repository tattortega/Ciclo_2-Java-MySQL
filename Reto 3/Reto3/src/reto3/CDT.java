package reto3;

import java.util.Scanner;

public class CDT extends Cliente implements Calcular{
    String n_cdt, apertura;
    int plazo;
    double monto, interes;

    public String getN_cdt() {
        return n_cdt;
    }

    public void setN_cdt(String n_cdt) {
        this.n_cdt = n_cdt;
    }

    public String getApertura() {
        return apertura;
    }

    public void setApertura(String apertura) {
        this.apertura = apertura;
    }    
    
    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public double calcular() {
        Scanner consola=new Scanner(System.in);
        double valor_entregar;
        n_cdt="12345";
        apertura="29-07-21";
        System.out.println("Valor(Monto): ");
        monto=consola.nextDouble();
        System.out.println("Plazo(Numero de meses): ");
        plazo=consola.nextInt();
        System.out.println("Interes a pagar: ");
        interes=consola.nextDouble();
        valor_entregar=monto+(monto*(interes/100))*plazo;
        return valor_entregar;
    }   
}
