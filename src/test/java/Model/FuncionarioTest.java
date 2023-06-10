/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import java.util.Date;
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
public class FuncionarioTest {
    
    public FuncionarioTest() {
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
     * Test of getID method, of class Funcionario.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Funcionario instance = new Funcionario();
        Integer expResult = null;
        Integer result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Funcionario.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        Integer ID = null;
        Funcionario instance = new Funcionario();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Funcionario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Funcionario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String Nome = "";
        Funcionario instance = new Funcionario();
        instance.setNome(Nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Funcionario.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Funcionario.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String Endereco = "";
        Funcionario instance = new Funcionario();
        instance.setEndereco(Endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Funcionario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Funcionario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "";
        Funcionario instance = new Funcionario();
        instance.setEmail(Email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class Funcionario.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Funcionario instance = new Funcionario();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class Funcionario.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String Telefone = "";
        Funcionario instance = new Funcionario();
        instance.setTelefone(Telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testGetDataDeNascimento() {
        System.out.println("getDataDeNascimento");
        Funcionario instance = new Funcionario();
        Date expResult = null;
        Date result = instance.getDataDeNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDeNascimento method, of class Funcionario.
     */
    @Test
    public void testSetDataDeNascimento() {
        System.out.println("setDataDeNascimento");
        Date DataDeNascimento = null;
        Funcionario instance = new Funcionario();
        instance.setDataDeNascimento(DataDeNascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
