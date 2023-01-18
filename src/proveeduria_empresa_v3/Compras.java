package proveeduria_empresa_v3;

import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author Grupo D, S.I. - 001 
 */
public class Compras implements Serializable {

    /**
     * @pdOid 966ad264-9358-4cf4-968f-9e9b02fdde84
     */
    private int codSecuencia;
    /**
     * @pdOid 4eb90996-62a8-4a3d-a1fd-143a8636474d
     */
    private String fecha;
    /**
     * @pdOid e68d57ad-fae6-4f2c-a971-75b3cfee0f78
     */
    private String prodAdquiridos;
    /**
     * @pdOid 0048e245-e6fd-44a6-a63b-0459b7674e27
     */
    private int cantProductos;
    /**
     * @pdOid 4bd60bfd-31de-4b1a-a5fc-4d27c8ed651e
     */
    private double precioUnit;

    public Compras(int numeroSecuen, String fecha, String productosAdq, int cantidad, double precioUnit) {
        this.codSecuencia = numeroSecuen;
        this.fecha = fecha;
        this.prodAdquiridos = productosAdq;
        this.cantProductos = cantidad;
        this.precioUnit = precioUnit;
    }

    public int getCodSecuencia() {
        return codSecuencia;
    }

    public void setCodSecuencia(int codSecuencia) {
        this.codSecuencia = codSecuencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProdAdquiridos() {
        return prodAdquiridos;
    }

    public void setProdAdquiridos(String prodAdquiridos) {
        this.prodAdquiridos = prodAdquiridos;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public static Compras[] generarCompras() {
        Compras[] lista = new Compras[5];
        lista[0] = new Compras(001, "24/06/2021", "Arroz", 14, 0.99);
        lista[1] = new Compras(002, "08/07/2021", "Gaseosa", 34, 2.99);
        lista[2] = new Compras(003, "23/07/2021", "Sal", 39, 1.00);
        lista[3] = new Compras(004, "14/08/2021", "Fideos", 27, 1.50);
        lista[4] = new Compras(005, "17/08/2021", "Agua", 12, 1.15);
        return lista;
    }

    public static Compras buscarCompras(Compras[] lista, int cod) {
        Compras obj = null;
        try {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].getCodSecuencia() == cod) {
                    obj = lista[i];
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no sé encuentra la Compra");
        }
        return obj;
    }

    public static Compras[] agregarCompras(Compras[] lista, Compras n) {
        Compras[] nlista = new Compras[lista.length + 1];
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

    public static Compras[] actualizarCompras(Compras[] lista, Compras n) {

        Compras[] nlista = eliminarCompras(lista, n.getCodSecuencia());
        try {
            nlista = agregarCompras(nlista, n);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Agregar");
        }
        return nlista;
    }

    public static Compras[] eliminarCompras(Compras[] lista, int cod) {
        Compras[] nlista = new Compras[lista.length - 1];
        try {
            int j = 0;
            for (int i = 0; i < lista.length; i++) {
                if (!(lista[i].getCodSecuencia() == cod)) {
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
