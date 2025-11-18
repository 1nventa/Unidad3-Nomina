package com.udc.act3.sistemanomina;

/**
 *
 * @author STEVEN AF
 */
public class EmpleadoAsalariado extends Empleado {

    private double salarioBase;

    public EmpleadoAsalariado(String nombre, int anosAntiguedad, double salarioBase) {
        super(nombre, anosAntiguedad);

        if (salarioBase < 0) {
            throw new ValidationException("El salario base no puede ser negativo.");
        }

        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioBase;
    }

    @Override
    public double calcularBeneficios() {
        // Bono de alimentación + bono por antigüedad (2% por año)
        double bonoAlimentacion = PayrollConfig.MONTO_BONO_ALIMENTACION;
        double bonoAntiguedad = salarioBase * (0.02 * getAñosAntiguedad());
        return bonoAlimentacion + bonoAntiguedad;
    }

    @Override
    public double calcularDeducciones() {
        // 8% de salud y 8% de pensión = 16%
        return salarioBase * 0.16;
    }

    @Override
    public String toString() {
        return "Empleado Asalariado: " + getNombre() +
                " | Años Antigüedad: " + getAñosAntiguedad() +
                " | Salario Base: " + salarioBase;
    }
}

