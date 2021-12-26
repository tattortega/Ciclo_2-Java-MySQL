/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura_abonados_funciones;

/**
 *
 * @author Cong. Carora
 */
import java.util.Scanner;
public class Factura_abonados_funciones {

    /**
     * @param args the command line arguments
     */
    static float factura_abonado(int estrato,int impulsos){
        float tb=0,vi,vp;
        switch (estrato){
            case 1:tb=10000;break;
            case 2:tb=15000;break;
            case 3:tb=20000;break;
            case 4:tb=25000;break;
            case 5:tb=30000;break;  
        } 
        vi=impulsos*100;
        vp=tb+vi;
        return vp;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        int N,estrato,impulsos;
        long cedula;
        float vp,vta;
        System.out.println("Cantidad de abonados: ");
        N=consola.nextInt();
        vta=0;
        for(int i=1;i<=N;i++){
            System.out.println("Cedula: ");
            cedula=consola.nextLong();
            System.out.println("Estrato(1,2,3,4,5): ");
            estrato=consola.nextInt();
            System.out.println("Impulsos del mes: ");
            impulsos=consola.nextInt();
            vp=factura_abonado(estrato,impulsos);
            vta=vta+vp;
            System.out.println("Valor a pagar: "+vp);
        }
        System.out.println("Valor total a pagar: "+vta);
    }
    
}
