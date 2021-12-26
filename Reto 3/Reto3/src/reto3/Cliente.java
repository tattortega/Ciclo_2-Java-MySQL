package reto3;
import java.util.Scanner;
public class Cliente {
    private int documento;
    private String nombre, correo, direccion, telefono;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCelular(String telefono) {
        this.telefono = telefono;
    }
    
    public String crear_cliente(){
        Scanner consola=new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("*      CREAR CUENTA      *");
        System.out.println("**************************");
        System.out.println("Ingrese los datos del cliente\n");
        System.out.println("Nombre: ");
        nombre=consola.nextLine();
        System.out.println("Documento de identidad: ");
        documento=consola.nextInt();
        consola.nextLine();
        System.out.println("Correo electronico: ");
        correo=consola.nextLine();
        System.out.println("Celular: ");
        telefono=consola.nextLine();
        System.out.println("Dirección: ");
        direccion=consola.nextLine();             
        return "";
    }
}
