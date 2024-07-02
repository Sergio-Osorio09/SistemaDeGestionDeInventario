/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package VentanasAdmin;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thens
 */
public class InterfazRegistrosAdminTest {
    
    public InterfazRegistrosAdminTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InterfazRegistrosAdmin.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testLimpiarentradas() {
        System.out.println("limpiarentradas");
        InterfazRegistrosAdmin instance = new InterfazRegistrosAdmin();
        instance.limpiarentradas();
        fail("The test case is a prototype.");
    }
    
}
