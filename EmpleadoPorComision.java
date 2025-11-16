package com.udc.act3.sistemanomina;


/**
 * Empleado con salario base + comisión sobre ventas.
 */
public class EmpleadoPorComision extends Empleado {

    private double salarioBase;
    private double ventas;
    private double porcentajeComision; // ejemplo 0.05 = 5%

    public EmpleadoPorComision(String nombre, int añosAntiguedad, double salarioBase, double ventas, double porcentajeComision) {
    super(nombre, añosAntiguedad);
    if (salarioBase < 0) throw new ValidationException("Salario base negativo");
    if (ventas < 0) throw new ValidationException("Ventas negativas");
    if (porcentajeComision < 0) throw new ValidationException("Porcentaje comisión negativo");

    this.salarioBase = salarioBase;
    this.ventas = ventas;
    this.porcentajeComision = porcentajeComision;
}

    @Override
    public double calcularSalarioBruto() {
        return salarioBase + ventas * porcentajeComision;
    }

    @Override
    public double calcularBeneficios() {
        double bonoVentas = (ventas > 20_000_000.0) ? ventas * 0.03 : 0.0; // 3% bono si ventas > 20M
        double bonoAlimentacion = PayrollConfig.MONTO_BONO_ALIMENTACION;
        return bonoVentas + bonoAlimentacion;
    }
}

