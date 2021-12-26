package creditos_herencia;

import java.util.Scanner;
public class Creditos_Herencia {

    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        double monto,interes,valor_interes,cuota;
        int plazo,opcion=0;
        CreditoPersonal objeto_creditoPersonal;
        CreditoEmpresarial objeto_creditoEmpresarial;
        CreditoEspecial objeto_creditoEspecial;
        do{
            System.out.println("MENU CREDITOS");
            System.out.println("1. Credito Personal");
            System.out.println("2. Credito Empresarial");
            System.out.println("3. Credito Especial");
            System.out.println("4. Salir");
            System.out.println("Opcion: ");
            opcion=consola.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("Monto: ");
                    monto=consola.nextDouble();
                    System.out.println("Porcentaje de interes: ");
                    interes=consola.nextDouble();
                    System.out.println("Plazo: ");
                    plazo=consola.nextInt();
                    objeto_creditoPersonal=new CreditoPersonal();
                    objeto_creditoPersonal.setMonto(monto);
                    objeto_creditoPersonal.setInteres(interes);
                    objeto_creditoPersonal.setPlazo(plazo);
                    cuota=objeto_creditoPersonal.calcular_cuota();
                    System.out.println("Cuota Credito Personal: "+cuota);
                    break;
                }
                case 2:{
                    System.out.println("Monto: ");
                    monto=consola.nextDouble();
                    System.out.println("Valor de interes negociado: ");
                    valor_interes=consola.nextDouble();
                    System.out.println("Plazo: ");
                    plazo=consola.nextInt();
                    objeto_creditoEmpresarial=new CreditoEmpresarial();
                    objeto_creditoEmpresarial.setMonto(monto);
                    objeto_creditoEmpresarial.setValor_interes(valor_interes);
                    objeto_creditoEmpresarial.setPlazo(plazo);
                    cuota=objeto_creditoEmpresarial.calcular_cuota();
                    System.out.println("Couta Credito Empresarial: "+cuota);
                    break;
                }
                case 3:{
                    System.out.println("Monto: ");
                    monto=consola.nextDouble();
                    System.out.println("Plazo: ");
                    plazo=consola.nextInt();
                    objeto_creditoEspecial=new CreditoEspecial();
                    objeto_creditoEspecial.setMonto(monto);
                    objeto_creditoEspecial.setPlazo(plazo);
                    cuota=objeto_creditoEspecial.calcular_cuota();
                    System.out.println("Cuota Credito Especial: "+cuota);
                    break;
                }                
            }    
        }while(opcion!=4);        
    }
    
}
