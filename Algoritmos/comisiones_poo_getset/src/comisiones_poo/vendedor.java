/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisiones_poo;

/**
 *
 * @author Cong. Carora
 */
public class vendedor {
    //Atributos
    private long documento;
    private int tipo;
    private double ventas;
    //Metodos
    public void setdocumento(long documento){
        this.documento=documento;
    }
    public long getdocumento(){
        return documento;
    }
    public void settipo(int tipo){
        this.tipo=tipo;
    }
    public int gettipo(){
        return tipo;
    }
    public void setventas(double ventas){
        this.ventas=ventas;
    }
    public double getventas(){
        return ventas;
    }
    public double calcular_comision(){
        double comision;
        if(this.tipo==1){
            comision=this.ventas*0.25;
        }
        else{
            comision=this.ventas*0.20;
        }
        return comision;
    }
}
