
package conexion_mysql_clase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormularioNacionalidad extends javax.swing.JFrame {
        Connection con;
        Statement stmt;
        ResultSet rs;
        String usuario,clave,url,driver,sql;
        Conexion_mysql obj_con;
        Sql_mysql obj_sql;
   
    public FormularioNacionalidad() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        conexion_bd();
        mostrar("");
    }
    public void conexion_bd(){
        usuario="root";
        clave="123456";
        url="jdbc:mysql://localhost:3306/clase_2";
        driver="com.mysql.cj.jdbc.Driver";
        obj_con=new Conexion_mysql();
        obj_con.setUrl(url);
        obj_con.setUsuario(usuario);
        obj_con.setClave(clave);
        obj_con.setDriver(driver);
        con=obj_con.abrir_bd();
    }
    public void mostrar(String cod) throws SQLException {
        String datos[]=new String[2];
        DefaultTableModel nacionalidad=new DefaultTableModel();
        nacionalidad=(DefaultTableModel) tbNacionalidad.getModel();
        
        if (cod==""){
            sql="select * from nacionalidad";
        } 
        else{
            sql="select * from nacionalidad where codigo_nac='"+cod+"'";
        }
        obj_sql=new Sql_mysql();
        obj_sql.setCon(con);
        obj_sql.setSql(sql);
        rs=obj_sql.realiza_consulta();
        while (rs.next()){
            datos[0]=rs.getString("codigo_nac");
            datos[1]=rs.getString("nombre_nac");
            nacionalidad.addRow(datos);
        }
        nacionalidad=(DefaultTableModel) tbNacionalidad.getModel();
    }
    
    public String valida_datos(String codigo,String nombre) throws SQLException{
        String mensaje,sql;
        Sql_mysql obj_sql;
        mensaje="";
        if ((codigo.isEmpty()) || (nombre.isEmpty())){
            mensaje="Ingrese Código y/o Nombre";
        }
        else{
            sql="select * from nacionalidad where codigo_nac='"+codigo+"'";
            obj_sql=new Sql_mysql();
            obj_sql.setCon(con);
            obj_sql.setSql(sql);
            rs=obj_sql.realiza_consulta();
            if (rs.next()){
                mensaje="Nacionalidad ya Existe";
            }
        }
        return mensaje;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbNacionalidad = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiiento Tema");

        tbNacionalidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Nacionalidad", "Nombre Nacionalidad"
            }
        ));
        jScrollPane1.setViewportView(tbNacionalidad);

        lblCodigo.setText("Cóidgo Nacionalidad:");

        lblNombre.setText("Nombre Nacionalidad:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNombre))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnAgregar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Evento clic del botón Agregar
        String codigo,nombre,mensaje;
        codigo=txtCodigo.getText();
        nombre=txtNombre.getText();
        mensaje="";
            try {
                mensaje=valida_datos(codigo,nombre);
            } catch (SQLException ex) {
                Logger.getLogger(FormularioNacionalidad.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (mensaje==""){
                sql="insert into nacionalidad values('"+codigo+"','"+nombre+"')";
                obj_sql=new Sql_mysql();
                obj_sql.setCon(con);
                obj_sql.setSql(sql);
                obj_sql.realiza_actualizacion();
            try {
                mostrar(codigo);
            } catch (SQLException ex) {
                Logger.getLogger(FormularioNacionalidad.class.getName()).log(Level.SEVERE, null, ex);
            }
                txtCodigo.setText("");
                txtNombre.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,mensaje);
            }
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioNacionalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioNacionalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioNacionalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioNacionalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormularioNacionalidad().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormularioNacionalidad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tbNacionalidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
