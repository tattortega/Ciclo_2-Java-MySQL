
package conexion_mysql_clase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Sql_mysql {
    private String sql;
    private Connection con;

    public String getSql() {
        return sql;
    }
    public Connection getCon() {
        return con;
    }
    public void setSql(String sql) {
        this.sql = sql;
    }
    public void setCon(Connection con) {
        this.con = con;
    }
    public void realiza_actualizacion(){
        Statement stmt;
        try {
            stmt=this.con.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Operación Realizada");
 
    }
    public ResultSet realiza_consulta(){
        Statement stmt;
        ResultSet rs=null;
        
        try {
            stmt=this.con.createStatement();
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL");
            System.exit(0);
        }
        return rs;
    }
    
}
