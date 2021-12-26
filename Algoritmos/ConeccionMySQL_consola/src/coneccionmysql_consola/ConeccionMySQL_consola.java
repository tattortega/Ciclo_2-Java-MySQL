package coneccionmysql_consola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConeccionMySQL_consola {

    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        String usuario,contraseña,url,driver,sql;
        Connection con;
        Statement stmt;
        ResultSet rs;
        
        usuario="root";
        contraseña="tattortega.95";
        url="jdbc:mysql://localhost:3306/biblioteca";
        driver="com.mysql.cj.jdbc.Driver";
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver");
        }   
        
        try {
            con=DriverManager.getConnection(url, usuario, contraseña);
            stmt=con.createStatement();
            sql="insert into tema values('11','Tema 11')";
            stmt.executeUpdate(sql);
            
            sql="select * from tema";
            rs=stmt.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("Codigo Tema: "+rs.getString("codigo_tema"));
                System.out.println("Nombre Tema: "+rs.getString("nombre_tema"));
            }
            
            System.out.println("Operacion realizada");
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
        

    }
    
}
