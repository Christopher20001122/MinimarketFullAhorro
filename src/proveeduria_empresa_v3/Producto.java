package proveeduria_empresa_v3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Grupo D, S.I. - 001 
 */
public class Producto implements Serializable, Comparable<Producto> {

    private String code;
    private String Nombre;
    private String Categoria;
    private double precio;
    private int stock;

    public Producto(String code, String Nombre, String Categoria, double precio, int stock) {
        this.code = code;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //crear
    public static Producto[] generarProductos() {
        Producto[] lista = new Producto[5];
        lista[0] = new Producto("8392", "Arroz", "Sin Categoria", 0.99, 20);
        lista[1] = new Producto("9273", "Gaseosa", "Sin Categoria", 2.99, 10);
        lista[2] = new Producto("0364", "Sal", "Sin Categoria", 1.00, 12);
        lista[3] = new Producto("8473", "Fideos", "Sin Categoria", 1.50, 15);
        lista[4] = new Producto("8363", "Agua", "Sin Categoria", 1.15, 11);
        return lista;
    }

    public static Producto buscarProductos(Producto[] lista, String cod) {
        Producto obj = null;
        try {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].getCode().equals(cod)) {
                    obj = lista[i];
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se encuentra el Producto");
        }

        return obj;
    }

    public static Producto buscarNombreProductos(Producto[] lista, String cod) {
        Producto obj = null;
        try {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].Nombre.equals(cod)) {
                    obj = lista[i];
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se encuentra el Producto");
        }

        return obj;
    }

    //actualizar
    public static Producto[] agregarProductos(Producto[] lista, Producto n) {
        Producto[] nlista = new Producto[lista.length + 1];
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

    public static Producto[] actualizarProductos(Producto[] lista, Producto n) {

        Producto[] nlista = eliminarProductos(lista, n.getCode());
        try {
            nlista = agregarProductos(nlista, n);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Actualizar");
        }
        return nlista;
    }

    //eliminar
    public static Producto[] eliminarProductos(Producto[] lista, String cod) {
        Producto[] nlista = new Producto[lista.length - 1];
        try {
            int j = 0;
            for (int i = 0; i < lista.length; i++) {
                if (!lista[i].getCode().equals(cod)) {
                    nlista[j] = lista[i];
                    j++;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Eliminar");
        }
        return nlista;
    }

    @Override
    public String toString() {
        return "Producto{" + ", Nombre= " + Nombre + ", Categoria " + Categoria + ", precio= " + precio + " stock=" + stock + ", code=" + code + '}';
    }

    @Override
    public int compareTo(Producto o) {
        return this.code.compareToIgnoreCase(o.code);
    }

    public static List<Producto> ordenarXCodigo(String tipoOrden) {
        List<Producto> aux = new ArrayList<Producto>();
        for (Producto cli : (Producto[]) Archivos.leerFichero("Productos.txt")) {
            aux.add(cli);
        }
        if (tipoOrden.equalsIgnoreCase("A")) {
            Collections.sort(aux);
        } else {
            Collections.sort(aux);
            Collections.reverse(aux);
        }
        return aux;
    }

    public static class NombreComparador implements Comparator<Producto> {

        @Override
        public int compare(Producto o1, Producto o2) {
            return o1.Nombre.compareToIgnoreCase(o2.Nombre);
        }

    }

    public static class PrecioComparador implements Comparator<Producto> {

        @Override
        public int compare(Producto o1, Producto o2) {
            return ("" + o1.precio).compareToIgnoreCase("" + o2.precio);
        }

    }

    public static class CategoriaComparador implements Comparator<Producto> {

        @Override
        public int compare(Producto o1, Producto o2) {
            return ("" + o1.Categoria).compareToIgnoreCase("" + o2.Categoria);
        }

    }

    public static class StockComparador implements Comparator<Producto> {

        @Override
        public int compare(Producto o1, Producto o2) {
            return ("" + o1.stock).compareToIgnoreCase("" + o2.stock);
        }

    }

    public static List<Producto> ordenarXStock(String tipoOrden) {
        List<Producto> aux = new ArrayList<Producto>();
        for (Producto cli : (Producto[]) Archivos.leerFichero("Productos.txt")) {
            aux.add(cli);
        }
        if (tipoOrden.equalsIgnoreCase("A")) {
            Collections.sort(aux, new StockComparador());
        } else {
            Collections.sort(aux, new StockComparador());
            Collections.reverse(aux);
        }
        return aux;
    }

    public static List<Producto> ordenarXCategoria(String tipoOrden) {
        List<Producto> aux = new ArrayList<Producto>();
        for (Producto cli : (Producto[]) Archivos.leerFichero("Productos.txt")) {
            aux.add(cli);
        }
        if (tipoOrden.equalsIgnoreCase("A")) {
            Collections.sort(aux, new CategoriaComparador());
        } else {
            Collections.sort(aux, new CategoriaComparador());
            Collections.reverse(aux);
        }
        return aux;
    }

    public static List<Producto> ordenarXNombre(String tipoOrden) {
        List<Producto> aux = new ArrayList<Producto>();
        for (Producto cli : (Producto[]) Archivos.leerFichero("Productos.txt")) {
            aux.add(cli);
        }
        if (tipoOrden.equalsIgnoreCase("A")) {
            Collections.sort(aux, new NombreComparador());
        } else {
            Collections.sort(aux, new NombreComparador());
            Collections.reverse(aux);
        }
        return aux;
    }

    public static List<Producto> ordenarXPrecio(String tipoOrden) {
        List<Producto> aux = new ArrayList<Producto>();
        for (Producto cli : (Producto[]) Archivos.leerFichero("Productos.txt")) {
            aux.add(cli);
        }
        if (tipoOrden.equalsIgnoreCase("A")) {
            Collections.sort(aux, new PrecioComparador());
        } else {
            Collections.sort(aux, new PrecioComparador());
            Collections.reverse(aux);
        }
        return aux;
    }

}
