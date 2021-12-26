/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero_entero;

/**
 *
 * @author Cong. Carora
 */
import java.util.Scanner;
public class Numero_entero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        int numero;
        String mensaje;
        clase_numero_entero objeto_numero;
        System.out.println("Numero: ");
        numero=consola.nextInt();
        objeto_numero=new clase_numero_entero(numero);
        mensaje=objeto_numero.par_impar();
        System.out.println(mensaje);
        mensaje=objeto_numero.positivo_negativo();
        System.out.println(mensaje);
    }    
}
