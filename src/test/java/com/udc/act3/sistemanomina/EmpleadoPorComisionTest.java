/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udc.act3.sistemanomina;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpleadoPorComisionTest {

    @Test
    public void testCalculoBrutoYBeneficiosConVentasAltas() {
        // salario base 1_000_000, ventas 25_000_000, comision 5%
        // bruto = 1_000_000 + 25_000_000 * 0.05 = 2_250_000
        // bono por ventas = 25_000_000 * 0.03 = 750_000
        EmpleadoPorComision e = new EmpleadoPorComision("Laura", 3, 1_000_000.0, 25_000_000.0, 0.05);

        double brutoEsperado = 1_000_000.0 + 25_000_000.0 * 0.05;
        assertEquals(brutoEsperado, e.calcularSalarioBruto(), 0.01);

        double beneficios = e.calcularBeneficios();
        assertTrue(beneficios >= 750_000.0, "Debe incluir bono por ventas");
    }

    @Test
    public void testSalarioNetoConsistente() {
        EmpleadoPorComision e = new EmpleadoPorComision("Laura", 3, 1_000_000.0, 25_000_000.0, 0.05);
        double bruto = e.calcularSalarioBruto();
        double ded = e.calcularDeducciones();
        double ben = e.calcularBeneficios();
        double netoEsperado = bruto - ded + ben;
        assertEquals(netoEsperado, e.calcularSalarioNeto(), 0.01);
    }
}