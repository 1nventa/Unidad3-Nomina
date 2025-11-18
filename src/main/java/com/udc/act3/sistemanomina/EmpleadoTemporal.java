package com.udc.act3.sistemanomina;

/**
 *
 * @author STEVEN AF
 */
public class EmpleadoTemporal extends Empleado {

    private double salarioMensual;

    public EmpleadoTemporal(String nombre, int anosAntiguedad, double salarioMensual) {
        super(nombre, anosAntiguedad);

        if (salarioMensual < 0) {
            throw new ValidationException("El salario mensual no puede ser negativo.");
        }

        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioMensual;
    }

    @Override
    public double calcularBeneficios() {
        // Solo bono de alimentación (temporal NO tiene bono por antigüedad)
        return PayrollConfig.MONTO_BONO_ALIMENTACION;
    }

    @Override
    public double calcularDeducciones() {
        // 16% igual que los demás
        return salarioMensual * 0.16;
    }

    @Override
    public String toString() {
        return "Empleado Temporal: " + getNombre() +
                " | Años Antigüedad: " + getAñosAntiguedad() +
                " | Salario Mensual: " + salarioMensual;
    }
}
