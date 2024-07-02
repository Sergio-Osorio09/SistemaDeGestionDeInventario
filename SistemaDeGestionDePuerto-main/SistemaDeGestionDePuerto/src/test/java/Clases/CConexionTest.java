/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thens
 */
public class CConexionTest {
    
    public CConexionTest() {
    }

    @Test
    public void testEstableceConexion() {
        CConexion instance = new CConexion();
        Connection result = instance.estableceConexion();
        assertNotNull(result);
        try {
            result.isValid(1);
            System.out.println("Conexión válida");
        } catch (SQLException e) {
            System.out.println("Conexión inválida: " + e.getMessage());
            // Puedes agregar una aserción para fallar la prueba
            fail("La conexión no es válida: " + e.getMessage());
        } 
    }
    
}
