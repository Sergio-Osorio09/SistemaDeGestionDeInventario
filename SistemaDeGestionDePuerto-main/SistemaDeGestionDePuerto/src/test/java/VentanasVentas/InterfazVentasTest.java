/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package VentanasVentas;

import org.junit.Test;
import static org.junit.Assert.*;
import VentanasVentas.InterfazVentas.*;

/**
 *
 * @author thens
 */
public class InterfazVentasTest {
    
    public InterfazVentasTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;       
        
        InterfazVentas.main(args);
        fail("The test case is a prototype.");
        // Ejemplo:
        javax.swing.JComboBox<String> combotipo;
        javax.swing.JTextField txtid;
        combotipo = new javax.swing.JComboBox<>();
        txtid = new javax.swing.JTextField();
        InterfazVentas interfaz = new InterfazVentas(); // Crea un objeto de la clase   
        
        interfaz.limpiarentradas(); // Llama al método que quieres testear  
        assertEquals(0, combotipo.getSelectedIndex()); // Verifica el resultado
        assertEquals("", txtid.getText()); // Verifica el resultado
        
    }
    @Test
    public void testLimpiarentradas() {
        InterfazVentas interfaz = new InterfazVentas();
        javax.swing.JComboBox<String> combotipo;
        javax.swing.JTextField txtid;
        combotipo = new javax.swing.JComboBox<>();
        txtid = new javax.swing.JTextField();
        
        combotipo.setSelectedIndex(1); // Asignar un valor al combo
        txtid.setText("Valor"); // Asignar un valor al campo de texto
        
        interfaz.limpiarentradas();
        assertEquals(0, combotipo.getSelectedIndex()); // Verificar que el combo se resetea
        assertEquals("", txtid.getText()); // Verificar que el campo de texto se limpia
    }
    
    
    
}
