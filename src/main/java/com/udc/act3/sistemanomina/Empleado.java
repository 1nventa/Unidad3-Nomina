package com.udc.act3.sistemanomina;

 /**
 * Clase base para empleados.
 */
public abstract class Empleado { //Debe ser abstracta para que no se pueda instanciar, ya que no se pueden crear empleados genéricos sin tipo.


    protected String nombre;
    protected int añosAntiguedad;

    public Empleado(String nombre, int añosAntiguedad) {
    if (nombre == null || nombre.isEmpty())
        throw new ValidationException("Nombre inválido");

    if (añosAntiguedad < 0)
        throw new ValidationException("Antigüedad no puede ser negativa");

    this.nombre = nombre;
    this.añosAntiguedad = añosAntiguedad;
}

    public String getNombre() {
        return nombre;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public abstract double calcularSalarioBruto();
    public abstract double calcularBeneficios(); // bonos + beneficios (ej. bono alimentación)
    public double calcularDeducciones() {
        double bruto = calcularSalarioBruto();
        double seguridadYPension = bruto * PayrollConfig.PORCENTAJE_SEGURO_PENSION; // 4%
        double arl = bruto * PayrollConfig.PORCENTAJE_ARL; // configurable
        return seguridadYPension + arl;
    }

    public double calcularSalarioNeto() {
        double bruto = calcularSalarioBruto();
        double ded = calcularDeducciones();
        double ben = calcularBeneficios();
        double neto = bruto - ded + ben;
        if (neto < 0) throw new ValidationException("Salario neto negativo para " + nombre);
        return neto;
    }

    @Override
    public String toString() {
        return String.format("%s (antigüedad %d años)", nombre, añosAntiguedad);
    }
}