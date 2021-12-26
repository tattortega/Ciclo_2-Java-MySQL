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
import java.util.ArrayList;
import java.util.Scanner;
public class FacturaAgua_arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        long codigo;
        String nombre;
        int estrato,N;
        double consumo,vp,vtp;
        suscriptor objeto_suscriptor;
        ArrayList<suscriptor> lista=new ArrayList();
        System.out.println("Cantidad de suscriptores; ");
        N=consola.nextInt();
        for(int i=1;i<=N;i++){
            System.out.println("Codigo: ");
            codigo=consola.nextLong();
            System.out.println("Nombre: ");
            nombre=consola.next();
            consola.nextLine();
            System.out.println("Estrato(1,2,3,4,5): ");
            estrato=consola.nextInt();
            System.out.println("Consumo: ");
            consumo=consola.nextDouble();
            objeto_suscriptor= new suscriptor();
            objeto_suscriptor.setCodigo(codigo);
            objeto_suscriptor.setNombre(nombre);
            objeto_suscriptor.setEstrato(estrato);
            objeto_suscriptor.setConsumo(consumo);
            lista.add(objeto_suscriptor);            
        }
        vtp=0;
        for(int i=0;i<lista.size();i++){
            vp=lista.get(i).factura_suscriptor();
            vtp=vp+vtp;
            System.out.println("Nombre: "+lista.get(i).getNombre());
            System.out.println("Valor a pagar: "+vp);
        }
        System.out.println("Valor TOTAL a pagar: "+vtp);
    }
    
}
