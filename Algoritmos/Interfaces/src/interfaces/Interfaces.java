package interfaces;

import java.util.Scanner;
public class Interfaces {
    
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        Humano objeto_humano;
        Animal objeto_animal;
        Hombre objeto_hombre;
        objeto_humano=new Humano();
        objeto_humano.setDocumento("123456789");
        objeto_humano.razonar();
        objeto_humano.desplazar();
        objeto_humano.alimentar();
        objeto_humano.jugar();
        objeto_humano.trabajar();
        System.out.println("");
        objeto_animal=new Animal();
        objeto_animal.setRaza("Gorila");
        objeto_animal.cazar();
        objeto_animal.desplazar();
        objeto_animal.alimentar();  
        System.out.println("");
        objeto_hombre=new Hombre();
        objeto_hombre.setNombre("Luis");
        objeto_hombre.jugar();
        objeto_hombre.alimentar();
        objeto_hombre.razonar();
    }
    
}
