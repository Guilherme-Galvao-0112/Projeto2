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
public class ServicosTest {
    
    public ServicosTest() {
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
     * Test of getID method, of class Servicos.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Servicos instance = new Servicos();
        Integer expResult = null;
        Integer result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Servicos.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        Integer ID = null;
        Servicos instance = new Servicos();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Servicos.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Servicos instance = new Servicos();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Servicos.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String Descricao = "";
        Servicos instance = new Servicos();
        instance.setDescricao(Descricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Servicos.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Servicos instance = new Servicos();
        Integer expResult = null;
        Integer result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Servicos.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        Integer Quantidade = null;
        Servicos instance = new Servicos();
        instance.setQuantidade(Quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Servicos.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Servicos instance = new Servicos();
        Double expResult = null;
        Double result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Servicos.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Double Valor = null;
        Servicos instance = new Servicos();
        instance.setValor(Valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
