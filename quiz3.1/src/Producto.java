/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodrigo
 */
import javax.swing.JOptionPane;
enum TipoProducto {
    ALIMENTOS,
    BEBIDAS,
    HIGIENE,
    LIMPIEZA
}


class Producto {
    private String codigo;
    private String nombre;
    private String nombreEmpleado;
    private String idEmpleado;
    private int cantidad;
    private double precioBase;
    private TipoProducto tipo;
    private double precioBruto;
    private double gananciaEsperada;

    
    public Producto(String codigo, String nombre, String nombreEmpleado, String idEmpleado, int cantidad,
                   double precioBase, TipoProducto tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreEmpleado = nombreEmpleado;
        this.idEmpleado = idEmpleado;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipo = tipo;
        calcularPrecioBruto();
        calcularGananciaEsperada();
    }

    
    private void calcularPrecioBruto() {
        switch (tipo) {
            case ALIMENTOS:
                precioBruto = precioBase * 0.20 + precioBase;
                break;
            case BEBIDAS:
                precioBruto = precioBase * 0.30 + precioBase;
                break;
            case HIGIENE:
                precioBruto = precioBase * 0.25 + precioBase + 500;
                break;
            case LIMPIEZA:
                precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
                break;
        }
    }

    private void calcularGananciaEsperada() {
        gananciaEsperada = (precioBruto - precioBase) * cantidad;
    }

   
    public String getInformacionProducto() {
        return "Código: " + codigo + "\n"
                + "Nombre: " + nombre + "\n"
                + "Nombre del Empleado: " + nombreEmpleado + "\n"
                + "ID del Empleado: " + idEmpleado + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Precio Base: " + precioBase + "\n"
                + "Precio Bruto: " + precioBruto + "\n"
                + "Ganancia Esperada: " + gananciaEsperada;
    }

 
    public double getGananciaEsperada() {
        return gananciaEsperada;
    }
}
