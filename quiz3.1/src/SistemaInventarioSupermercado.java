

import java.lang.Enum;
import javax.swing.JOptionPane;


public class SistemaInventarioSupermercado {

    public static void main(String[] args) {
        
        String nombreSupermercado = JOptionPane.showInputDialog("Ingrese el nombre del supermercado:");
        String codigoSupermercado = JOptionPane.showInputDialog("Ingrese el código del supermercado:");

        
        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado:");

        
        Producto[] productos = new Producto[3]; // Suponiendo 3 productos para la demostración
        for (int i = 0; i < productos.length; i++) {
            productos[i] = ingresarProducto(nombreEmpleado, idEmpleado);
        }

    
        StringBuilder todaInfoProductos = new StringBuilder();
        for (Producto producto : productos) {
         1
        }
        JOptionPane.showMessageDialog(null, todaInfoProductos.toString());

      
        double gananciaTotalEsperada = 0.0;
        for (Producto producto : productos) {
            gananciaTotalEsperada += producto.getGananciaEsperada();
        }

      
        JOptionPane.showMessageDialog(null, "Ganancia total esperada: " + gananciaTotalEsperada);
    }

   
    public static Producto ingresarProducto(String nombreEmpleado, String idEmpleado) {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del producto:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto:"));
        double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio base del producto:"));
        String tipoString = JOptionPane.showInputDialog("Ingrese el tipo del producto (ALIMENTOS, BEBIDAS, HIGIENE, LIMPIEZA):");
        TipoProducto tipo = TipoProducto.valueOf(tipoString.toUpperCase());

        return new Producto(codigo, nombre, nombreEmpleado, idEmpleado, cantidad, precioBase, tipo);
    }
}
