/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

/**
 *
 * @author Cong. Carora
 */
import java.util.Scanner;
public class TiposDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola=new Scanner(System.in);
        byte var_byte;
        var_byte=120;
        System.out.println("Variable byte: "+var_byte);
        short var_short;
        var_short=32000;
        System.out.println("Variable short: "+var_short);
        int var_int;
        var_int=65000;
        System.out.println("Variable int: "+var_int);
        long var_long;
        var_long=623452334;
        System.out.println("Variable long: "+var_long);
        float var_float;
        var_float=(float)523.523;
        System.out.println("Variable float: "+var_float);
        double var_double;
        var_double=52345.123;
        System.out.println("Variable doble: "+var_double);
        boolean var_boolean;
        var_boolean=true;
        System.out.println("Variable boolean: "+var_boolean);
        char var_char;
        var_char='c';
        System.out.println("Variable char: "+var_char);
    }
    
}
