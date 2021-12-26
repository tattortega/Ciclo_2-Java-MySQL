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
public class clase_numero_entero {
    int numero;
    public clase_numero_entero(int numero){
        this.numero=numero;
    }
    public String par_impar(){
        String mensaje;
        if(this.numero%2==0){
            mensaje="El numero "+this.numero+" es PAR";
        }
        else{
            mensaje="El numero "+this.numero+" es IMPAR";
        }
        return mensaje;    
    }
    public String positivo_negativo(){
        String mensaje;
        if(this.numero>0){
            mensaje="El numero "+this.numero+" es POSITIVO";
        }
        else if(this.numero<0){
            mensaje="El numero "+this.numero+" es NEGATIVO";
        }
        else{
            mensaje="El numero "+this.numero+" es CERO";
        }
        return mensaje;
    }
}
