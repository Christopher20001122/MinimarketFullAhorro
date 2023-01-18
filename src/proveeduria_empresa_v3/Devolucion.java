package proveeduria_empresa_v3;

import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author Grupo D, S.I. - 001 
 */
public class Devolucion implements Serializable {

    /**
     * @pdOid 133c6914-4451-47ad-8509-4be105a81025
     */
    private int codSecDevolucion;
    /**
     * @pdOid 196fb2f3-5c52-4a5d-8144-6633039fee6a
     */
    private String fecha;

    private String codEmpleado;

    private String producto;
    /**
     * @pdOid ca53135f-60a1-45d6-9dee-c200623e2ece
     */
    private int cantidad;
    /**
     * @pdOid 2c29fc90-6bc3-4ee1-9c01-1f78fa877feb
     */
    private double precio;

    public Devolucion(int numeroSecDevol, String fecha, String empleado, String producto, int cantidad, double precio) {
        this.codSecDevolucion = numeroSecDevol;
        this.fecha = fecha;
        this.codEmpleado = empleado;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public static Devolucion[] generarDevolucion() {
        Devolucion[] lista = new Devolucion[3];
        lista[0] = new Devolucion(001, "16/06/2021", "8475", "Agua", 5, 0.99);
        lista[1] = new Devolucion(002, "10/07/2021", "8764", "Arroz", 5, 3.16);
        lista[2] = new Devolucion(003, "13/08/2021", "8563", "Gaseosa", 5, 2.99);
        return lista;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodSecDevolucion() {
        return codSecDevolucion;
    }

    public void setCodSecDevolucion(int codSecDevolucion) {
        this.codSecDevolucion = codSecDevolucion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fechaDevol) {
        this.fecha = fechaDevol;
    }

    public int getCantProd() {
        return cantidad;
    }

    public void setCantProd(int cantProd) {
        this.cantidad = cantProd;
    }

    public double getPrecioTotal() {
        return precio;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precio = precioTotal;
    }

    //buscar identificador (codigo = cd)
    public static Devolucion buscarDevolucion(Devolucion[] lista, int cod) {
        Devolucion obj = null;
        try {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].getCodSecDevolucion() == cod) {
                    obj = lista[i];
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se encuentra la Devolución");
        }
        return obj;
    }

    //actualizar
    public static Devolucion[] agregarDevolucion(Devolucion[] lista, Devolucion n) {
        Devolucion[] nlista = new Devolucion[lista.length + 1];
        try {
            for (int i = 0; i < lista.length; i++) {
                nlista[i] = lista[i];
            }
            nlista[lista.length] = n;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Agregar");
        }
        return nlista;
    }

    public static Devolucion[] actualizarDevolucion(Devolucion[] lista, Devolucion n) {

        Devolucion[] nlista = eliminarDevolucion(lista, n.getCodSecDevolucion());
        try {
            nlista = agregarDevolucion(nlista, n);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Actualizar");
        }
        return nlista;
    }

    //eliminar
    public static Devolucion[] eliminarDevolucion(Devolucion[] lista, int cod) {
        Devolucion[] nlista = new Devolucion[lista.length - 1];
        try {
            int j = 0;
            for (int i = 0; i < lista.length; i++) {
                if (!(lista[i].getCodSecDevolucion() == cod)) {
                    nlista[j] = lista[i];
                    j++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Eliminar");
        }
        return nlista;
    }

}
