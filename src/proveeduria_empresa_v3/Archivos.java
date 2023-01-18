package proveeduria_empresa_v3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Grupo D, S.I. - 001 
 */
public class Archivos {

    public static String[] categoria() {
        String[] cat = new String[4];
        for (int i = 0; i < cat.length; i++) {
            cat[i] = "categoria " + i;
        }
        return cat;
    }

    public static void fichero1() {

        String[] a = (String[]) leerFichero("categoria.txt");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void fichero2() {

        Archivos.escribirFichero("Devolucion.txt", Devolucion.generarDevolucion());
        Devolucion[] b = (Devolucion[]) Archivos.leerFichero("Devolucion.txt");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static String[] agregar(String[] lista, String nuevo) {
        String[] nlista = new String[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            nlista[i] = lista[i];
        }
        nlista[lista.length] = nuevo;
        return nlista;
    }

    public static String[] eliminar(String[] lista, String elemento) {
        if ((lista.length == 1) && lista[0].equals(elemento)) {
            return null;
        } else {
            boolean key = false;
            for (int i = 0; i < lista.length; i++) {
                if (elemento.equals(lista[i])) {
                    key = true;
                }
            }
            if (key) {
                String[] nlista = new String[lista.length - 1];
                int j = 0;
                for (int i = 0; i < lista.length; i++) {
                    if (!lista[i].equals(elemento)) {
                        nlista[j] = lista[i];
                        j++;
                    }
                }
                return nlista;
            } else {
                return lista;
            }

        }
    }

    public static void escribirFichero(String dirr, Object a) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(dirr));
            oos.writeObject(a);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object leerFichero(String dirr) {
        Object aux = null;
        try {
            aux = null;

            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(dirr));

            aux = ois.readObject();

        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return aux;
    }
}

