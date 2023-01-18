package proveeduria_empresa_v3;

import java.io.Serializable;
import javax.swing.JOptionPane;
/**
 *
 * @author Grupo D, S.I. - 001 
 */
public class Requisicion implements Serializable{
   private int numeroSecuencia;
   private String fecha;
   private int cantidad;
   private double precio;
   private String idEmpleado;
   private String producto;

    public Requisicion(int numeroSecuencia, String fechaRequi, int cantProd, double precio, String idEmpleado, String producto) {
        this.numeroSecuencia = numeroSecuencia;
        this.fecha = fechaRequi;
        this.cantidad = cantProd;
        this.precio = precio;
        this.idEmpleado = idEmpleado;
        this.producto = producto;
    }

    public int getNumeroSecuencia() {
        return numeroSecuencia;
    }

    public void setNumeroSecuencia(int numeroSecuencia) {
        this.numeroSecuencia = numeroSecuencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
    public static Requisicion [] generarRequisicion(){
        Requisicion [] lista = new Requisicion[3];
        lista[0]= new Requisicion(001,"12/06/2021",5,0.99,"2543","Arroz");
        lista[1]= new Requisicion(002,"14/07/2021",5,2.99,"7483","Gaseosa");
        lista[2]= new Requisicion(003,"23/08/2021",5,1.00,"8493","Sal");
        return lista;
    }
    //buscar identificador (codigo = cd)
    public static Requisicion buscarRequisicion(Requisicion [] lista,int cod){
        Requisicion obj=null;
        try{
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].numeroSecuencia==cod) {
                obj = lista[i];
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se encuentra la Requisicion");
        }
        return obj;
    }
    //actualizar
    public static Requisicion [] agregarRequisicion(Requisicion [] lista,Requisicion n){
        Requisicion [] nlista=new Requisicion[lista.length+1];
        try{
        for (int i = 0; i < lista.length; i++) {
            nlista[i]=lista[i];
        }
        nlista[lista.length]=n;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se puede Agregar");
        }
        return nlista;
    }
    public static Requisicion[] actualizarRequisicion(Requisicion[] lista, Requisicion n) {
        
        Requisicion[] nlista = eliminarRequisicion(lista, n.getNumeroSecuencia());
        try{
        nlista = agregarRequisicion(nlista, n);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se puede Actualizar");
        }
        return nlista;
    }
    //eliminar
    public static Requisicion [] eliminarRequisicion(Requisicion [] lista,int cod){
        Requisicion [] nlista=new Requisicion[lista.length-1];
        try{
        int j = 0;
        for (int i = 0; i < lista.length; i++) {
            if (!(lista[i].numeroSecuencia==cod)) {
                nlista[j]=lista[i];
                j++;
            }   
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se puede Eliminar");
        }
        return nlista;
    }
    
}
