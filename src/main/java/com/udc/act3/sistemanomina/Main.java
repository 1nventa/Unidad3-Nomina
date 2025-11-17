/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.udc.act3.sistemanomina;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Sistema de Nómina - Ejecución de ejemplo ===");

        try {
            // Crear empleados de cada tipo
            
            EmpleadoPorHoras e2 = new EmpleadoPorHoras("Carlos Gómez", 2, 20_000.0, 45, true);
            EmpleadoPorComision e3 = new EmpleadoPorComision("Laura Ruiz", 3, 1_000_000.0, 25_000_000.0, 0.05);
           

            // Imprimir resumen de cada empleado
            
            imprimirResumen(e2);
            imprimirResumen(e3);
           

        } catch (ValidationException ex) {
            System.err.println("Error de validación: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Error inesperado: " + ex.getMessage());
        }
    }

    private static void imprimirResumen(Empleado e) {
        System.out.println("-------------------------------------");
        System.out.println(e.toString());
        System.out.printf("Salario bruto: %.2f%n", e.calcularSalarioBruto());
        System.out.printf("Beneficios: %.2f%n", e.calcularBeneficios());
        System.out.printf("Deducciones: %.2f%n", e.calcularDeducciones());
        System.out.printf("Salario neto: %.2f%n", e.calcularSalarioNeto());
    }
}