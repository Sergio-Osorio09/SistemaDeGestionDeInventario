/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasAdmin;

import VentanasAlmacenamiento.*;
import Clases.CConexion;
import com.mycompany.sistemadegestiondepuerto.InterfazAdministradorSistema;
import com.mycompany.sistemadegestiondepuerto.InterfazDespachador;
import com.mycompany.sistemadegestiondepuerto.InterfazLogin;
import static com.mycompany.sistemadegestiondepuerto.InterfazLogin.usuarioObtenido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlmacenamientoAdmin extends javax.swing.JFrame {

    CConexion con=new CConexion();
    Connection CConexion=con.estableceConexion();
    
    public AlmacenamientoAdmin() {
        initComponents();
        mostrardatos();
    }
    
    public AlmacenamientoAdmin(InterfazDespachador aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        txtcantidad_x_caja = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabledatos = new javax.swing.JTable();
        MenuInicio = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        CerrarSesion = new javax.swing.JMenuItem();
        AtrasAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CATÁLOGO DE PRODUCTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 600));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtmarca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MARCA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });

        txtdescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCION", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });

        btnregistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        txtcantidad_x_caja.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDAD POR CAJA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtpeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PESO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpeso)
                    .addComponent(txtdescripcion)
                    .addComponent(txtmarca)
                    .addComponent(txtnombre)
                    .addComponent(txtcantidad_x_caja)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnregistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcantidad_x_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jtabledatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtabledatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabledatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        Inicio.setText("Inicio");

        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        Inicio.add(CerrarSesion);

        AtrasAdmin.setText("Regresar");
        AtrasAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAdminActionPerformed(evt);
            }
        });
        Inicio.add(AtrasAdmin);

        MenuInicio.add(Inicio);

        setJMenuBar(MenuInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("GESTION DE PRODUCTOS");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

        try{
            PreparedStatement ps=CConexion.prepareStatement("INSERT INTO producto(Producto_id,Nombre,Marca,Descripcion,Cantidad_x_caja,Peso) VALUES(?,?,?,?,?,?)");
            ps.setString(1, txtid.getText());
            ps.setString(2, txtnombre.getText());
            ps.setString(3, txtmarca.getText());
            ps.setString(4, txtdescripcion.getText());
            ps.setString(5, txtcantidad_x_caja.getText());
            ps.setString(6, txtpeso.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados Correctamente");
            mostrardatos();
            //limpiarentradas();

        } catch(SQLException e){
            System.out.println("Error al registrar producto"+ e);
        }
 
        
// Obtener el di del usuario y guardarlo junto con el id del producto en una nueva tulpa de la tabla inventario con unidades 0


int usuarioId=0;
        
        try (  PreparedStatement sentencia = CConexion.prepareStatement("SELECT idUsuario FROM usuario WHERE dni = ?");) {

               sentencia.setInt(1, Integer.parseInt(usuarioObtenido)); // Parámetro de la consulta

               try (ResultSet rs = sentencia.executeQuery()) {
                   if (rs.next()) {
                       usuarioId = rs.getInt("idUsuario");
                   } 
               } catch (SQLException e) {
                   System.out.println("Error al obtener el idUsuario: " + e.getMessage());
               }
           } catch (SQLException e) {
               System.out.println("Error al conectar a la base de datos: " + e.getMessage());
           }
        
        int identifiProducto=0;
        identifiProducto=Integer.parseInt(txtid.getText());
        try{
            PreparedStatement psInventario=CConexion.prepareStatement("INSERT INTO `sistemadegestiondeinventario`.`inventario` (`Cantidad_Caja`, `Cantidad_Unidad`, `producto_Producto_id`, `usuario_idUsuario`) VALUES (?, ?,?, ?);");
            psInventario.setInt(1, 0);
            psInventario.setInt(2, 0);
            psInventario.setInt(3, identifiProducto);
            psInventario.setInt(4, usuarioId);
            //ps.setInt(4, 2);
            psInventario.executeUpdate();
        } catch(SQLException e){
            System.out.println("Error al registrar producto en inventario"+ e);
            JOptionPane.showMessageDialog(null, "idUser: "+usuarioId + "|| idProducot: " + identifiProducto);
        }
           
        
        limpiarentradas();       
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try{
            PreparedStatement ps=CConexion.prepareStatement
        ("Update producto set Nombre='"+txtnombre.getText()+"',Marca='"+txtmarca.getText()+"',Descripcion='"+txtdescripcion.getText()+"',Cantidad_x_caja='"+txtcantidad_x_caja.getText()+"', Peso = '"+txtpeso.getText()+"' where Producto_id='"+txtid.getText()+"'");
            int indice=ps.executeUpdate();
            
            if(indice>0){
                JOptionPane.showMessageDialog(rootPane, "Datos Actualizados Correctamente");
                mostrardatos();
                limpiarentradas();
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono Fila");
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al actualizar datos"+e);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jtabledatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatosMouseClicked
        btnregistrar.setEnabled(false);
        btnactualizar.setEnabled(true);
        int fila=this.jtabledatos.getSelectedRow();
        this.txtid.setText(this.jtabledatos.getValueAt(fila, 0).toString());
        this.txtnombre.setText(this.jtabledatos.getValueAt(fila, 1).toString());
        this.txtmarca.setText(this.jtabledatos.getValueAt(fila, 2).toString());
        this.txtdescripcion.setText(this.jtabledatos.getValueAt(fila, 3).toString());
        this.txtcantidad_x_caja.setText(this.jtabledatos.getValueAt(fila, 4).toString());
        this.txtpeso.setText(this.jtabledatos.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_jtabledatosMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        btnactualizar.setEnabled(false);
        btnregistrar.setEnabled(true);
        limpiarentradas();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarcaActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        InterfazLogin login = new InterfazLogin();
        login.setLocationRelativeTo(null);
        login.setSize(450,490);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void AtrasAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAdminActionPerformed
        InterfazAdministradorSistema AdminInterf = new InterfazAdministradorSistema();
        AdminInterf.setLocationRelativeTo(null);
        AdminInterf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAdminActionPerformed
    
    ///////////////////////////////////////
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar producto","Salir",JOptionPane.YES_NO_CANCEL_OPTION)==0){
        try{
            PreparedStatement ps=CConexion.prepareStatement("DELETE FROM producto where idProducto='"+txtid.getText()+"'");
        int indice=ps.executeUpdate();
        if(indice>0){
            mostrardatos();
        }else{
            System.out.println("No selecciono fila");
        }    
        }catch(SQLException e){
            System.out.println("Error al eliminar"+ e);
        }
        }
    }   
 
    
    private void mostrardatos() {
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("ID del Producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Marca");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Cantidad por caja");
        modelo.addColumn("Peso");
        jtabledatos.setModel(modelo);
        String consultasql="select * from producto";
        String data[]=new String[6];
        
        Statement st;
        try{
            st=CConexion.createStatement();
            ResultSet rs=st.executeQuery(consultasql);
            while(rs.next()){
                data[0]=rs.getString(1);
                data[1]=rs.getString(2);
                data[2]=rs.getString(3);
                data[3]=rs.getString(4);
                data[4]=rs.getString(5);
                data[5]=rs.getString(6);
                modelo.addRow(data);
            }
        } catch(SQLException e){
            System.out.println("Error al mostrar Datos "+ e);
        }
    }

    private void limpiarentradas() {
        txtid.setText("");
        txtnombre.setText("");
        txtmarca.setText("");
        txtdescripcion.setText("");
        txtcantidad_x_caja.setText("");
        txtpeso.setText("");
        
        btnregistrar.setEnabled(true);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AtrasAdmin;
    private javax.swing.JMenuItem CerrarSesion;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenuBar MenuInicio;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabledatos;
    private javax.swing.JTextField txtcantidad_x_caja;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
