/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.udc.act3.sistemanomina;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpleadoPorHorasTest {

    @Test
    public void testCalculoSalarioBrutoSinHorasExtra() {
        // tarifa 20.000, 40 horas -> 800.000
        EmpleadoPorHoras e = new EmpleadoPorHoras("Carlos", 2, 20000.0, 40.0, false);
        double esperado = 20000.0 * 40.0;
        assertEquals(esperado, e.calcularSalarioBruto(), 0.01);
    }

    @Test
    public void testCalculoSalarioBrutoConHorasExtra() {
        // tarifa 20.000, 45 horas -> 40*20k + 5*20k*1.5 = 950.000
        EmpleadoPorHoras e = new EmpleadoPorHoras("Carlos", 2, 20000.0, 45.0, false);
        double esperado = 40.0 * 20000.0 + 5.0 * 20000.0 * 1.5;
        assertEquals(esperado, e.calcularSalarioBruto(), 0.01);
    }
}