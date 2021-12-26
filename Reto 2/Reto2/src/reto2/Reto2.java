package reto2;

import java.util.Scanner;
public class Reto2 {

    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        long codigo;
        int N,prog_acad,ind_beca;
        double vm,vt;
        Estudiante objeto_estudiante;
        vt=0;
        System.out.println("Cantidad de estudiantes: ");
        N=consola.nextInt();            
        for(int i=1;i<=N;i++){
            System.out.println("\nCódigo: ");
            codigo=consola.nextLong();
            System.out.println("Programa académico: \n"
                    + "1.Técnico de Sistemas\n"
                    + "2.Técnico en Desarrollo de Videojuegos\n"
                    + "3.Técnico en Animación Digital");
            prog_acad=consola.nextInt();
            System.out.println("Indicador de Beca:\n"
                    + "1.Beca por rendimiento académico\n"
                    + "2.Beca Cultural-Deportes\n"
                    + "3.Sin Beca");
            ind_beca=consola.nextInt();
            objeto_estudiante=new Estudiante();
            objeto_estudiante.setCodigo(codigo);
            objeto_estudiante.setProg_acad(prog_acad);
            objeto_estudiante.setInd_beca(ind_beca);
            vm=objeto_estudiante.valor_matricula();
            System.out.println("Código: "+objeto_estudiante.getCodigo());
            System.out.println("Valor de matrícula: "+vm);
            vt=vt+vm;
            }
        System.out.println("\nValor total de matriculas: "+vt);
    }    
}
