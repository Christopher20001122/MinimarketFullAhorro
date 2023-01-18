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
public class Kardex implements Serializable, Comparable<Kardex> {

    /**
     * @pdOid 7a6f4d5a-1a4b-49a5-8786-018aec5e8405
     */
    private String fecha;
    /**
     * @pdOid 185604aa-e026-4ef7-a6cc-6be150f845c9
     */
    private int numeroProdAdq;
    /**
     * @pdOid 9b6b72b0-af3b-4a6c-9428-2d4f3ac90145
     */
    private double precioCompra;
    /**
     * @pdOid 08a0fab1-7e97-4d9e-886f-1931fa6cdb1d
     */
    private String tipoTrans;
    /**
     * @pdOid b5050c29-102a-4b79-bae9-847cd2648732
     */

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Kardex(String code, String fecha, int numeroProdAdq, double precioCompra, String tipoTrans) {
        this.code = code;
        this.fecha = fecha;
        this.numeroProdAdq = numeroProdAdq;
        this.precioCompra = precioCompra;
        this.tipoTrans = tipoTrans;

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroProdAdq() {
        return numeroProdAdq;
    }

    public void setNumeroProdAdq(int numeroProdAdq) {
        this.numeroProdAdq = numeroProdAdq;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getTipoTrans() {
        return tipoTrans;
    }

    public void setTipoTrans(String tipoTrans) {
        this.tipoTrans = tipoTrans;
    }

    public static Kardex[] generarKardex() {
        Kardex[] lista = new Kardex[1];
        lista[0] = new Kardex("0", "00/00/0000", 1, 0.99, "Egreso");
        return lista;
    }

    public static Kardex buscarKardex(Kardex[] lista, String cd) {
        Kardex obj = null;
        try {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].getCode().equals(cd)) {
                    obj = lista[i];
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se encuentra el Kardex");
        }
        return obj;
    }

    public static Kardex[] agregarKardex(Kardex[] lista, Kardex nuevo) {
        Kardex[] nlista = new Kardex[lista.length + 1];
        try {
            for (int i = 0; i < lista.length; i++) {
                nlista[i] = lista[i];
            }
            nlista[lista.length] = nuevo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Agregar");
        }
        return nlista;
    }

    public static Kardex[] actualizarKardex(Kardex[] lista, Kardex nuevo) {

        Kardex[] nlista = eliminarKardex(lista, nuevo.getCode());
        try {
            nlista = agregarKardex(nlista, nuevo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Actualizar");
        }
        return nlista;
    }

    public static Kardex[] eliminarKardex(Kardex[] lista, String cd) {
        Kardex[] nlista = new Kardex[lista.length - 1];
        try {
            int j = 0;
            for (int i = 0; i < lista.length; i++) {
                if (!lista[i].getCode().equals(cd)) {
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
    public int compareTo(Kardex o) {
        return this.fecha.compareToIgnoreCase(o.fecha);
    }

    public static List<Kardex> ordenarXFecha(String tipoOrden) {
        List<Kardex> aux = new ArrayList<Kardex>();
        for (Kardex cli : (Kardex[]) Archivos.leerFichero("Kardex.txt")) {
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

}
