/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisiones;

/**
 *
 * @author Cong. Carora
 */
import java.util.Scanner;
public class Comisiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        long cedula;
        int N,tipo;
        double ventas,comision,total;
        System.out.println("Cantidad de vendedores: ");
        N=consola.nextInt();
        total=0;
        for (int i=1;i<=N;i++){
            System.out.println("Cedula: ");
            cedula=consola.nextLong();
            System.out.println("Tipo vendedor(1=Puerta a puerta,2=Ejecutivo): ");
            tipo=consola.nextInt();
            System.out.println("Ventas del mes: ");
            ventas=consola.nextDouble();
            if(tipo==1){
                comision=ventas*0.20;
            }
            else{
                comision=ventas*0.30;
            }
            total=total+comision;
            System.out.println("Valor de comision: "+comision);                      
        }
        System.out.println("Total de comisiones: "+total);
    }
    
      
    
}
