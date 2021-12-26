
package conexion_mysql_clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion_mysql {
    private String usuario;
    private String clave;
    private String url;
    private String driver;

    public String getUsuario() {
        return usuario;
    }
    public String getClave() {
        return clave;
    }
    public String getUrl() {
        return url;
    }
    public String getDriver() {
        return driver;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public Connection abrir_bd(){
        Connection con=null;
        try {
            Class.forName(driver);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error en el DRIVER de la Conexión con MySQL");
            System.exit(0);
        }
        try {
            con=DriverManager.getConnection(url, usuario, clave);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Conexión con MySQL");
            System.exit(0);
        }
        return con;
    }
}
