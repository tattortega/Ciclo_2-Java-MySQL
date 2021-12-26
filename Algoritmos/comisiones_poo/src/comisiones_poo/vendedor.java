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
    long documento;
    int tipo;
    double ventas;
    //Metodos
    public vendedor(long doc,int tipo,double ventas){
        this.documento=doc;
        this.tipo=tipo;
        this.ventas=ventas;             
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
