/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thens
 */
public class CLoginTest {
    
    public CLoginTest() {
    }

    @Test
    public void testValidaUsuario() {
        System.out.println("validaUsuario");
        JTextField usuario = null;
        JPasswordField contraseña = null;
        CLogin instance = new CLogin();
        instance.validaUsuario(usuario, contraseña);
        fail("The test case is a prototype.");
    }
    
}
