/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucas
 */
public class UsuariosTest {
    
    public UsuariosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getID method, of class Usuarios.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Usuarios instance = new Usuarios();
        Integer expResult = null;
        Integer result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Usuarios.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        Integer ID = null;
        Usuarios instance = new Usuarios();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Usuarios.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Usuarios.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String Login = "";
        Usuarios instance = new Usuarios();
        instance.setLogin(Login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Usuarios.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Usuarios.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String Senha = "";
        Usuarios instance = new Usuarios();
        instance.setSenha(Senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
