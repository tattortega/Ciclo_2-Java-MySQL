package reto3;

import java.util.Scanner;
public class Reto3 {

    public static void main(String[] args) {
       Scanner consola=new Scanner(System.in);
       int opcion,cantidad_clientes;
       String mensaje;
       double valor_entregar,valor_interes;            
       System.out.println("**************************");
       System.out.println("*    SISTEMA BANCARIO    *");
       System.out.println("**************************");
       System.out.println("Cantidad de clientes a ingresar: ");
       cantidad_clientes=consola.nextInt();
    for(int i=1;i<=cantidad_clientes;i++){
       Cliente objeto_cliente;
       objeto_cliente=new Cliente();
       mensaje=objeto_cliente.crear_cliente();
       System.out.println(mensaje);
       System.out.println("*******************************");
       System.out.println("*     PRODUCTOS BANCARIOS     *");
       System.out.println("*******************************");
       System.out.println("Ingrese la opcion deseada\n");
       System.out.println("1.Cuenta de Ahorro");
       System.out.println("2.Cuenta Corriente");
       System.out.println("3.Certificado de ahorro a término fijo-CDT");
       System.out.println("4.Tarjeta de Credito");
       opcion=consola.nextInt();
       switch(opcion){
           case 1:{
               CuentaAhorro objeto_cuentaAhorro;
               objeto_cuentaAhorro=new CuentaAhorro();
               valor_interes=objeto_cuentaAhorro.calcular();
               System.out.println("Valor de interes mensual: $"+Math.round(valor_interes));
               System.out.println("Saldo actual: $"+Math.round(objeto_cuentaAhorro.saldo+valor_interes));
               break;
               } 
            case 2:{
               CuentaCorriente objeto_cuentaCorriente;
               objeto_cuentaCorriente=new CuentaCorriente();
               valor_interes=objeto_cuentaCorriente.calcular();
               System.out.println("Valor de interes mensual: "+Math.round(valor_interes));
                System.out.println("Saldo actual: $"+Math.round(objeto_cuentaCorriente.saldo+valor_interes));
               break;
               }
            case 3:{
               CDT objeto_cdt; 
               objeto_cdt=new CDT();
               valor_entregar=objeto_cdt.calcular();
               System.out.println("Valor a entregar: $"+Math.round(valor_entregar));
               break;
               }
            case 4:{
               TarjetaCredito objeto_tarjetaCredito; 
               objeto_tarjetaCredito=new TarjetaCredito();
               valor_interes=objeto_tarjetaCredito.calcular();
               System.out.println("Valor de interes mensual: $"+Math.round(valor_interes));
               System.out.println("Saldo en la tarjeta: "+Math.round(objeto_tarjetaCredito.valor_utilizado-valor_interes));
               break;
               }
           }
    }
    }    
}
