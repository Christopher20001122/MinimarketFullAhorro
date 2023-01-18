package proveeduria_empresa_v3;

import java.io.Serializable;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Grupo D, S.I. - 001 
 */
public class Empleado implements Serializable, Comparable<Empleado> {

    /**
     * @pdOid ca18d783-1f23-4e6d-840d-a2aafb1095da
     */
    private String codigoID;
    /**
     * @pdOid e7559cff-5ba8-4394-a62f-9702a9795e64
     */
    private String identificacion;
    /**
     * @pdOid 2c3ec4fc-180e-458d-8022-401e2cbd6210
     */
    private String nombre;
    /**
     * @pdOid 23fedd05-0592-477f-b26f-eceae4a5d28e
     */
    private String direccion;
    /**
     * @pdOid 25273a95-e8b7-483c-87ed-6da336a04fa2
     */
    private String telefono;
    /**
     * @pdOid 16640f62-dbcc-4e12-8eee-881d5064e5c8
     */
    private double sueldo;

    public Empleado(String codigoID, String identificacion, String nombre, String direccion, String telefono, double sueldo) {
        this.codigoID = codigoID;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    public String getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(String codigoID) {
        this.codigoID = codigoID;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //crear
    public static Empleado[] generarEmpleado() {
        Empleado[] lista = new Empleado[5];
        lista[0] = new Empleado("8756", "1004128540", "Erick Saul Maigua Sarabino", "Otavalo", "0969668665", 1210.00);
        lista[1] = new Empleado("7568", "1751150093", "Jefferson Daniel Llerena Pilicita", "Quito", "0983944668", 1240.00);
        lista[2] = new Empleado("8868", "1004326813", "Julián Alejandro Luna Galarza", "Ibarra", "0998172353", 1350.00);
        lista[3] = new Empleado("9769", "0707073698", "Mayerli Gissella Navarro Zumba", "Huaquillas", "0988386622", 1280.00);

        return lista;
    }

    public static Empleado buscarEmpleado(Empleado[] lista, String cod) {
        Empleado obj = null;
        try {
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].getCodigoID().equals(cod)) {
                    obj = lista[i];
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se encuentra el Empleado");
        }
        return obj;
    }


    public static Empleado[] agregarEmpleado(Empleado[] lista, Empleado n) {
        Empleado[] nlista = new Empleado[lista.length + 1];
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

    public static Empleado[] actualizarEmpleado(Empleado[] lista, Empleado n) {

        Empleado[] nlista = eliminarEmpleado(lista, n.getCodigoID());
        try {
            nlista = agregarEmpleado(nlista, n);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se puede Actualizar");
        }
        return nlista;
    }

    //eliminar
    public static Empleado[] eliminarEmpleado(Empleado[] lista, String cod) {
        Empleado[] nlista = new Empleado[lista.length - 1];
        try {
            int j = 0;
            for (int i = 0; i < lista.length; i++) {
                if (!lista[i].getCodigoID().equals(cod)) {
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
    public int compareTo(Empleado o) {
        return this.identificacion.compareToIgnoreCase(o.identificacion);
    }

    public static List<Empleado> ordenarXCedula(String tipoOrden) {
        List<Empleado> aux = new ArrayList<Empleado>();
        for (Empleado cli : (Empleado[]) Archivos.leerFichero("Empleado.txt")) {
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

    public static class NombreComparador implements Comparator<Empleado> {

        @Override
        public int compare(Empleado o1, Empleado o2) {
            return o1.nombre.compareToIgnoreCase(o2.nombre);
        }

    }

    public static class SueldoComparador implements Comparator<Empleado> {

        @Override
        public int compare(Empleado o1, Empleado o2) {
            return ("" + o1.sueldo).compareToIgnoreCase("" + o2.sueldo);
        }

    }

    public static List<Empleado> ordenarXNombre(String tipoOrden) {
        List<Empleado> aux = new ArrayList<Empleado>();
        for (Empleado cli : (Empleado[]) Archivos.leerFichero("Empleado.txt")) {
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

    public static List<Empleado> ordenarXSueldo(String tipoOrden) {
        List<Empleado> aux = new ArrayList<Empleado>();
        for (Empleado cli : (Empleado[]) Archivos.leerFichero("Empleado.txt")) {
            aux.add(cli);
        }
        if (tipoOrden.equalsIgnoreCase("A")) {
            Collections.sort(aux, new SueldoComparador());
        } else {
            Collections.sort(aux, new SueldoComparador());
            Collections.reverse(aux);
        }
        return aux;
    }

}
