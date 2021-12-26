/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares_impares_vectores;

/**
 *
 * @author Cong. Carora
 */
import java.util.Scanner;
public class Pares_Impares_vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        long cp,ci,sp,si;
        long numeros[];
        numeros=new long[10];
        for(int i=0;i<6;i++){
            System.out.println("Numero: ");
            numeros[i]=consola.nextLong();
            
        }
        cp=0;ci=0;si=0;sp=0;
        for(int i=0;i<6;i++){
            if(numeros[i]%2==0){
                System.out.println("El numero es PAR "+numeros[i]);
                cp+=1;
                sp=sp+numeros[i];
            }
            else{
                System.out.println("El numero es IMPAR "+numeros[i]);
                ci+=1;
                si=si+numeros[i];
            }
        }
        System.out.println("Cantidad de pares: "+cp);
        System.out.println("Cantidad de impares: "+ci);
        System.out.println("Suma de pares: "+sp);
        System.out.println("Suma de impares: "+si);
    }
    
}
