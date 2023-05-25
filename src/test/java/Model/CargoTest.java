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
public class CargoTest {
    
    public CargoTest() {
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
     * Test of getID method, of class Cargo.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Cargo instance = new Cargo();
        Integer expResult = null;
        Integer result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Cargo.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        Integer ID = null;
        Cargo instance = new Cargo();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Cargo.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cargo instance = new Cargo();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Cargo.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        Cargo instance = new Cargo();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalario method, of class Cargo.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Cargo instance = new Cargo();
        Float expResult = null;
        Float result = instance.getSalario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Cargo.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        Float Salario = null;
        Cargo instance = new Cargo();
        instance.setSalario(Salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComissao method, of class Cargo.
     */
    @Test
    public void testGetComissao() {
        System.out.println("getComissao");
        Cargo instance = new Cargo();
        Float expResult = null;
        Float result = instance.getComissao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComissao method, of class Cargo.
     */
    @Test
    public void testSetComissao() {
        System.out.println("setComissao");
        Float Comissao = null;
        Cargo instance = new Cargo();
        instance.setComissao(Comissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
