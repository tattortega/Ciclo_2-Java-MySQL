/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturaagua_arraylist;

/**
 *
 * @author Cong. Carora
 */
public class suscriptor {
    private long codigo;
    private String nombre;
    private int estrato;
    private double consumo;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public double factura_suscriptor(){
        double vp,tb=0,vc;
        switch(this.estrato){
            case 1:tb=10000;break;
            case 2:tb=15000;break;
            case 3:tb=20000;break;
            case 4:tb=25000;break;
            case 5:tb=30000;break;
        }
        vc=this.consumo*100;
        vp=tb+vc;
        return vp;
    }
}
