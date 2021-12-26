package reto1;
/**
 * @author Ricardo Ortega
 */
import java.util.Scanner;
public class Reto1 {
    static float facturacion_periodico(short periodicidad,char estado){
        float tb=0;
        if (estado=='S')
            tb=0;
        else
            switch (periodicidad){
                case 1:tb=30000;break;
                case 2:tb=70000;break;
                case 3:tb=150000;break;
                case 4:tb=270000;break;
        }
        return tb;
    }
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        short N;
        int codigo;
        short periodicidad;
        float va,vt;
        char estado;
        System.out.println("Liquidacion servicio de suscripcion a peridodico");
        System.out.println("Cantidad de suscriptores: ");
        N=consola.nextShort();
        vt=0;
        for (int i=0;i<N;i++){
            System.out.println("Codigo del suscriptor: ");
            codigo=consola.nextInt();
            System.out.println("Estado del suscriptor(V=Vigente,S=Suspendido): ");
            estado=consola.next().charAt(0);
            System.out.println("Periodicidad de suscripcion"
                    + "(1=Mensual, 2=Trimestral, 3=Semestral, 4= Anual): ");
            periodicidad=consola.nextShort();
            va=facturacion_periodico(periodicidad,estado);
            vt=vt+va;
            System.out.println("Valor a pagar: "+va);
        }       
        System.out.println("Valor total de todos los suscriptores: "+vt);
    }
    
}
