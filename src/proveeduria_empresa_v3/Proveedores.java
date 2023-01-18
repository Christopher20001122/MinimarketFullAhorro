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
public class Proveedores implements Serializable,Comparable<Proveedores>{
   /** @pdOid 2b37411d-27ef-4c4a-9aa3-4b548904fe17 */
   private String identificacion;
   /** @pdOid 80f6e2c4-1b41-4a4c-8c2e-930e4f7db1f5 */
   private String nombre;
   /** @pdOid 4e8f99a7-59f9-4cc4-8238-a263bb253b93 */
   private String direccion;
   /** @pdOid 334c76db-7986-4c2e-a408-6aef080ff025 */
   private String telefono;
   /** @pdOid 08c45b46-420c-4050-b6b6-b91a68c4e804 */
   private String email;

    public Proveedores(String identificacion, String nombre, String direccion, String telefono, String email) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static Proveedores [] generarProveedor(){
        Proveedores [] lista = new Proveedores[5];
        lista[0]= new Proveedores("1784637495","Pedro Andrade","Las Casas","2834789", "pa@yopmail.com");
        lista[1]= new Proveedores("1874659374","Juan Cuzco","La Gasca","3534537","jc12@gmail.com");
        lista[2]= new Proveedores("1697429579","Cesar Pasquel","La Magdalena","243547","cp23@hotmail.com");
        lista[3]= new Proveedores("1798324592","Mario Nolivos","La Comuna","2524705","mn23@yopmail.com");
        lista[4]= new Proveedores("1798437545","Fausto Chiluisa","Solanda","2694737","fc53@yahoo.es");
        return lista;
    }
    //buscar identificador (codigo = cd)
    public static Proveedores buscarProveedores(Proveedores [] lista,String cod){
        Proveedores obj=null;
        try{
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getIdentificacion().equals(cod)) {
                obj = lista[i];
            }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se encuentra el Proveedor");
        }
        return obj;
    }
    //actualizar
    public static Proveedores [] agregarProveedores(Proveedores [] lista,Proveedores n){
        Proveedores [] nlista=new Proveedores[lista.length+1];
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
    public static Proveedores[] actualizarProveedores(Proveedores[] lista, Proveedores n) {
        
        Proveedores[] nlista = eliminarProveedores(lista, n.getIdentificacion());
        try{
        nlista = agregarProveedores(nlista, n);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se puede Actualizar");
        }
        return nlista;
    }
    //eliminar
    public static Proveedores [] eliminarProveedores(Proveedores [] lista,String cod){
        Proveedores [] nlista=new Proveedores[lista.length-1];
        try{
        int j = 0;
        for (int i = 0; i < lista.length; i++) {
            if (!lista[i].getIdentificacion().equals(cod)) {
                nlista[j]=lista[i];
                j++;
            }   
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se puede Eliminar");
        }
        return nlista;
    }
    @Override
    public int compareTo(Proveedores o) {
        return this.identificacion.compareToIgnoreCase(o.identificacion);
    }
    
    public static List<Proveedores> ordenarXCedula(String tipoOrden){
        List<Proveedores> aux = new ArrayList<Proveedores>();
        for(Proveedores cli:(Proveedores [])Archivos.leerFichero("Proveedores.txt")){
            aux.add(cli);
        }
        if(tipoOrden.equalsIgnoreCase("A")){
            Collections.sort(aux);
        }
        else{
            Collections.sort(aux);
            Collections.reverse(aux);
        }
        return aux;
    }
    public static class NombreComparador implements Comparator<Proveedores>{

        @Override
        public int compare(Proveedores o1, Proveedores o2) {
            return o1.nombre.compareToIgnoreCase(o2.nombre);
        }
    
    }
    public static List<Proveedores> ordenarXNombre(String tipoOrden){
        List<Proveedores> aux = new ArrayList<Proveedores>();
        for(Proveedores cli:(Proveedores [])Archivos.leerFichero("Proveedores.txt")){
            aux.add(cli);
        }
        if(tipoOrden.equalsIgnoreCase("A")){
            Collections.sort(aux,new NombreComparador());
        }
        else{
            Collections.sort(aux,new NombreComparador());
            Collections.reverse(aux);
        }
        return aux;
    }
}