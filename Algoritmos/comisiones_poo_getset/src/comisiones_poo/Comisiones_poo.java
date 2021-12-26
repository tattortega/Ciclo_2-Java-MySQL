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
import java.util.Scanner;
public class Comisiones_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        long documento;
        int tipo,N;
        double ventas,comision,vt;
        vendedor objeto_vendedor;
        System.out.println("Cantidad de vendedores: ");
        N=consola.nextInt();
        vt=0;
        for (int i=1;i<=N;i++){
            System.out.println("Ingresa documento: ");
            documento=consola.nextLong();
            System.out.println("Tipo de vendedor(1=Puerta a Puerta,2=Telemercadeo): ");
            tipo=consola.nextInt();
            System.out.println("Ventas del mes");
            ventas=consola.nextDouble();
            objeto_vendedor=new vendedor();
            objeto_vendedor.setdocumento(documento);
            objeto_vendedor.settipo(tipo);
            objeto_vendedor.setventas(ventas);           
            comision=objeto_vendedor.calcular_comision();
            System.out.println("Documento: "+objeto_vendedor.getdocumento());
            System.out.println("Comision: "+comision);
            vt=vt+comision;
        }
        System.out.println("Valor total comisiones: "+vt);
    }
    
}
