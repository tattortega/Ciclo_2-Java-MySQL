/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarifabasica;

/**
 *
 * @author Cong. Carora
 */
import java.util.Scanner;
public class TarifaBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        long documento;
        int estrato;
        char estado;
        float tb=0;
        System.out.println("Documento de identidad: ");
        documento=consola.nextLong();
        System.out.println("Estado del usuario: (A=Activo,S=Suspendido) ");
        estado=consola.next().charAt(0);
        System.out.println("Estrato del usuario:(1,2,3,4,5) ");
        estrato=consola.nextInt();
        if (estado=='S'){
            tb=0;
        }
        else{
            switch(estrato){
                case 1:tb=10000;break;
                case 2:tb=15000;break;
                case 3:tb=30000;break;
                case 4:tb=50000;break;
                case 5:tb=65000;break;
            }
        }
        System.out.println("TarifaBasica: "+tb);
    }
    
}
