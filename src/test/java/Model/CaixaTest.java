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
public class CaixaTest {
    
    public CaixaTest() {
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
     * Test of getID method, of class Caixa.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Caixa instance = new Caixa();
        Integer expResult = null;
        Integer result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Caixa.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        Integer ID = null;
        Caixa instance = new Caixa();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntrada method, of class Caixa.
     */
    @Test
    public void testGetEntrada() {
        System.out.println("getEntrada");
        Caixa instance = new Caixa();
        Float expResult = null;
        Float result = instance.getEntrada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntrada method, of class Caixa.
     */
    @Test
    public void testSetEntrada() {
        System.out.println("setEntrada");
        Float Entrada = null;
        Caixa instance = new Caixa();
        instance.setEntrada(Entrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaida method, of class Caixa.
     */
    @Test
    public void testGetSaida() {
        System.out.println("getSaida");
        Caixa instance = new Caixa();
        Float expResult = null;
        Float result = instance.getSaida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaida method, of class Caixa.
     */
    @Test
    public void testSetSaida() {
        System.out.println("setSaida");
        Float Saida = null;
        Caixa instance = new Caixa();
        instance.setSaida(Saida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotalCaixa method, of class Caixa.
     */
    @Test
    public void testGetValorTotalCaixa() {
        System.out.println("getValorTotalCaixa");
        Caixa instance = new Caixa();
        Float expResult = null;
        Float result = instance.getValorTotalCaixa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorTotalCaixa method, of class Caixa.
     */
    @Test
    public void testSetValorTotalCaixa() {
        System.out.println("setValorTotalCaixa");
        Float ValorTotalCaixa = null;
        Caixa instance = new Caixa();
        instance.setValorTotalCaixa(ValorTotalCaixa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
