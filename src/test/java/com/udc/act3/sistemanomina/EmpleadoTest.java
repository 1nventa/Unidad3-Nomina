/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.udc.act3.sistemanomina;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO84
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAñosAntiguedad method, of class Empleado.
     */
    @Test
    public void testGetAñosAntiguedad() {
        System.out.println("getA\u00f1osAntiguedad");
        Empleado instance = null;
        int expResult = 0;
        int result = instance.getAñosAntiguedad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSalarioBruto method, of class Empleado.
     */
    @Test
    public void testCalcularSalarioBruto() {
        System.out.println("calcularSalarioBruto");
        Empleado instance = null;
        double expResult = 0.0;
        double result = instance.calcularSalarioBruto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularBeneficios method, of class Empleado.
     */
    @Test
    public void testCalcularBeneficios() {
        System.out.println("calcularBeneficios");
        Empleado instance = null;
        double expResult = 0.0;
        double result = instance.calcularBeneficios();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDeducciones method, of class Empleado.
     */
    @Test
    public void testCalcularDeducciones() {
        System.out.println("calcularDeducciones");
        Empleado instance = null;
        double expResult = 0.0;
        double result = instance.calcularDeducciones();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSalarioNeto method, of class Empleado.
     */
    @Test
    public void testCalcularSalarioNeto() {
        System.out.println("calcularSalarioNeto");
        Empleado instance = null;
        double expResult = 0.0;
        double result = instance.calcularSalarioNeto();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Empleado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Empleado instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EmpleadoImpl extends Empleado {

        public EmpleadoImpl() {
            super("", 0);
        }

        public double calcularSalarioBruto() {
            return 0.0;
        }

        public double calcularBeneficios() {
            return 0.0;
        }
    }
    
}
