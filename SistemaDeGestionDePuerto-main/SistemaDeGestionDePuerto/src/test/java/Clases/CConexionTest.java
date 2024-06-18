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

        // Verifica si la conexión es válida (no es nula)
        assertNotNull(result);

        // Si necesitas verificar que la conexión es válida, puedes usar un método como:
        try {
            result.isValid(1); // Prueba si la conexión está activa
            System.out.println("Conexión válida");
        } catch (SQLException e) {
            // Si hay un error, la conexión no es válida
            System.out.println("Conexión inválida: " + e.getMessage());
            // Puedes agregar una aserción para fallar la prueba
            fail("La conexión no es válida: " + e.getMessage());
        } 
    }
    
}
