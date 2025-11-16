package com.udc.act3.sistemanomina;

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
}