
package Clases;

import com.mycompany.sistemadegestiondepuerto.InterfazAdministradorSistema;
import com.mycompany.sistemadegestiondepuerto.InterfazLogin;
import com.mycompany.sistemadegestiondepuerto.InterfazDespachador;
import com.mycompany.sistemadegestiondepuerto.InterfazVentas;
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
           
           String consulta = "select*from usuario where usuario.idUsuario = (?) and usuario.Contraseña = (?);";
           ps = objetoConexion.estableceConexion().prepareStatement(consulta);
           
           String contra = String.valueOf(contraseña.getPassword());
           
           ps.setString(1, usuario.getText());
           ps.setString(2, contra);
           
           rs = ps.executeQuery();
           
           if(rs.next()){
               String tipoUsuario = rs.getString("TipoDeUsuario");
               JOptionPane.showMessageDialog(null, "USUARIO CONFIRMADO");
               
               switch(tipoUsuario){
                   case "Vendedor":
                       InterfazVentas interfazVentas = new InterfazVentas();
                       interfazVentas.setLocationRelativeTo(null);
                       interfazVentas.setSize(540,480);
                       interfazVentas.setVisible(true);
                       break;

                   case "Despachador":
                       InterfazDespachador interfazAlmacenamiento = new InterfazDespachador();
                       interfazAlmacenamiento.setLocationRelativeTo(null);
                       interfazAlmacenamiento.setSize(890,490);
                       interfazAlmacenamiento.setVisible(true);
                       break;
                   case "Admin":
                       InterfazAdministradorSistema interfazAdmin = new InterfazAdministradorSistema();
                       interfazAdmin.setLocationRelativeTo(null);
                       interfazAdmin.setSize(1000,600);
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
