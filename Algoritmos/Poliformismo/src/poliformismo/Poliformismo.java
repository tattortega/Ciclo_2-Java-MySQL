
package poliformismo;

import java.util.Scanner;
public class Poliformismo {

    
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        double lado,base,altura,radio,area,perimetro;
        int opcion;
        Cuadrado objeto_cuadrado;
        Rectangulo objeto_rectangulo;
        Circulo objeto_circulo;
        do{
            System.out.println("    MENU FIGURAS    ");
            System.out.println("1.  Cuadrado");
            System.out.println("2.  Rectangulo");
            System.out.println("3.  Circulo");
            System.out.println("4.  Salir");
            System.out.println("Opcion: ");
            opcion=consola.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("Lado: ");
                    lado=consola.nextDouble();
                    objeto_cuadrado=new Cuadrado();
                    objeto_cuadrado.setLado(lado);
                    area=objeto_cuadrado.area();
                    perimetro=objeto_cuadrado.perimetro();
                    System.out.println("Area del cuadrado: "+area);
                    System.out.println("Perimetro del cuadrado: "+perimetro);
                    break;
                }
                case 2:{
                    System.out.println("Base: ");
                    base=consola.nextDouble();
                    System.out.println("Altura: ");
                    altura=consola.nextDouble();
                    objeto_rectangulo=new Rectangulo();
                    objeto_rectangulo.setBase(base);
                    objeto_rectangulo.setAltura(altura);
                    area=objeto_rectangulo.area();
                    perimetro=objeto_rectangulo.perimetro();
                    System.out.println("Area del rectangulo: "+area);
                    System.out.println("Perimetro del rectangulo: "+perimetro);
                    break;
                }
                case 3:{
                    System.out.println("Radio: ");
                    radio=consola.nextDouble();
                    objeto_circulo=new Circulo();
                    objeto_circulo.setRadio(radio);
                    area=objeto_circulo.area();
                    perimetro=objeto_circulo.perimetro();
                    System.out.println("Area del circulo: "+area);
                    System.out.println("Perimetro del circulo: "+perimetro);
                    break;
                }
                case 4:{
                    break;
                }
            }
        }while(opcion!=4);
    }
    
}
