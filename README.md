# Sistema de Nomina - Unidad 3

Proyecto simple de nómina implementado en Java (POO).

## Contenido
- Empleadp (clase base) y 4 subclases:
  - EmpleadoAsalariado
  - EmpleadoPorHoras
  - EmpleadoPorComision
  - EmpleadoTemporar
- PayrollConfig: configuración global (porcentajes, bonos)
- Main: ejemplo de ejecución

## Requisitos
- Java 8+ (JDK instalado)
- IDE: NetBeans / IntelliJ / Eclipse (opcional)

## Cómo ejecutar
1. Abrir el proyecto en el IDE.
2. Ejecutar `Main.java`.
3. Verás en consola el resumen (salario bruto, beneficios, deducciones y salario neto).

## Supuestos / Notas
- ARL configurada en `PayrollConfig.PORCENTAJE_ARL` (por defecto 0).
- Fondo de ahorro para empleados por horas se aplica si tienen ≥1 año y aceptan.
- Validaciones básicas incluidas: nombres, horas, ventas y salarios no negativos.

## Evidencia
- Link al video de presentación:


## Autores
- Carlos Raul Hernandez Lopez
- Richard Reyes Jiménez
