
package Clases;

import com.mycompany.sistemadegestiondepuerto.InterfazAdministradorSistema;
import com.mycompany.sistemadegestiondepuerto.InterfazLogin;
import com.mycompany.sistemadegestiondepuerto.InterfazDespachador;
import VentanasVentas.InterfazVentas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class CLogin {
    
    public void validaUsuario(JTextField usuario, JPasswordField contraseña){
        
        try{
           ResultSet rs = null;
           PreparedStatement ps = null;
           Clases.CConexion objetoConexion = new Clases.CConexion();
           
           String consulta = "select*from usuario where usuario.DNI = (?) and usuario.Contraseña = (?);";
           ps = objetoConexion.estableceConexion().prepareStatement(consulta);           
           String contra = String.valueOf(contraseña.getPassword());
           /*
           ps.setString(1, usuario.getText());
           ps.setString(2, contra);
           */
           ps.setString(1, usuario.getText());
           ps.setString(2, contra);
           
           rs = ps.executeQuery();
           
           if(rs.next()){
               String tipoUsuario = rs.getString("TipoDeUsuario");
               JOptionPane.showMessageDialog(null, "USUARIO CONFIRMADO");
               
               switch(tipoUsuario){
                   case "Vendedor": //Vendedor
                       InterfazVentas interfazVentas = new InterfazVentas();
                       interfazVentas.setLocationRelativeTo(null);
                       interfazVentas.setSize(1030,630);
                       interfazVentas.setVisible(true);
                       break;

                   case "Despachador"://Despachador
                       InterfazDespachador interfazAlmacenamiento = new InterfazDespachador();
                       interfazAlmacenamiento.setLocationRelativeTo(null);
                       interfazAlmacenamiento.setSize(400,300);
                       interfazAlmacenamiento.setVisible(true);
                       break;
                   case "Admin"://Admin
                       InterfazAdministradorSistema interfazAdmin = new InterfazAdministradorSistema();
                       interfazAdmin.setLocationRelativeTo(null);
                       interfazAdmin.setSize(440,330);
                       interfazAdmin.setVisible(true);
                       break;
               }
               
           }else{
               JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTOS");
               InterfazLogin login = new InterfazLogin();
               login.setLocationRelativeTo(null);
               login.setSize(450,460);
               login.setVisible(true);
           }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
        }
        
    }
    
}
