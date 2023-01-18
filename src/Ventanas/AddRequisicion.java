package Ventanas;

import java.util.Calendar;
import javax.swing.JOptionPane;
import proveeduria_empresa_v3.Requisicion;
import proveeduria_empresa_v3.Kardex;
import proveeduria_empresa_v3.Empleado;
import proveeduria_empresa_v3.Archivos;
import proveeduria_empresa_v3.Producto;
/**
 *
 * @author Grupo D, S.I. - 001 
 */
public class AddRequisicion extends javax.swing.JFrame {

    /**
     * Creates new form AddRequisicion
     */
    private String dirr = "Requisicion.txt";
    private Calendar c = Calendar.getInstance();
    private String fecha = c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR);

    public AddRequisicion() {
        initComponents();
        setLocationRelativeTo(null);
        Empleado[] listaEmpleados = (Empleado[]) Archivos.leerFichero("Empleado.txt");
        String[] IdEmpleados = new String[listaEmpleados.length];
        for (int i = 0; i < listaEmpleados.length; i++) {
            IdEmpleados[i] = listaEmpleados[i].getCodigoID();
        }
        gEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(IdEmpleados));
        Producto[] listaProductos = (Producto[]) Archivos.leerFichero("Productos.txt");
        String[] productos = new String[listaProductos.length];
        for (int i = 0; i < listaProductos.length; i++) {
            productos[i] = listaProductos[i].getCode();
        }
        gProducto.setModel(new javax.swing.DefaultComboBoxModel<>(productos));
        Requisicion[] a = (Requisicion[]) Archivos.leerFichero(dirr);
        gSecuencia.setText("" + (a.length + 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gSecuencia = new javax.swing.JTextField();
        gCantidad = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gEmpleado = new javax.swing.JComboBox<>();
        gProducto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Requisicion");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Numero secuencial:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad:");

        gSecuencia.setEditable(false);
        gSecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gSecuenciaActionPerformed(evt);
            }
        });
        gSecuencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gSecuenciaKeyTyped(evt);
            }
        });

        gCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gCantidadActionPerformed(evt);
            }
        });
        gCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gCantidadKeyTyped(evt);
            }
        });

        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar-el-polvo.png"))); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        botonAtras.setText("Atras");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Producto:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Empleado:");

        gEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gEmpleadoActionPerformed(evt);
            }
        });

        gProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        jButton1.setText("Ver lista de Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/metodo-de-pago.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(botonAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)))))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(gProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        Requisicion[] a = (Requisicion[]) Archivos.leerFichero(dirr);
        boolean key = false;
        for (int i = 0; i < a.length; i++) {
            key = gSecuencia.getText().equals("" + a[i].getNumeroSecuencia());
            if (key) {
                JOptionPane.showMessageDialog(null, "Una requisicion posse este codigo");
                break;
            }
        }
        if (!key) {
            if (!((gSecuencia.getText().equals("")) || (gCantidad.getText().equals("")))) {
                //(int numeroSecuencia, String fechaRequi, int cantProd, double precio, String idEmpleado, String producto)
                Producto[] listaProductos = (Producto[]) Archivos.leerFichero("Productos.txt");
                Producto producto = Producto.buscarProductos(listaProductos, gProducto.getSelectedItem().toString());
                if (Integer.parseInt(gCantidad.getText()) <= producto.getStock()) {
                    Requisicion nuevo = new Requisicion(Integer.parseInt(gSecuencia.getText()), fecha,
                            Integer.parseInt(gCantidad.getText()), producto.getPrecio(),
                            gEmpleado.getSelectedItem().toString(), gProducto.getSelectedItem().toString());
                    Kardex[] kardex = (Kardex[]) Archivos.leerFichero("Kardex.txt");
                    Kardex registro = new Kardex("R" + gSecuencia.getText(), fecha,
                            Integer.parseInt(gCantidad.getText()), producto.getPrecio() * Integer.parseInt(gCantidad.getText()), "Egreso");
                    Archivos.escribirFichero("Kardex.txt", Kardex.agregarKardex(kardex, registro));
                    JOptionPane.showMessageDialog(null, "Se agrego con exito");
                    producto.setStock(producto.getStock() - Integer.parseInt(gCantidad.getText()));
                    Producto.eliminarProductos(listaProductos, gProducto.getSelectedItem().toString());
                    Producto.agregarProductos(listaProductos, producto);
                    nuevo.setProducto(producto.getNombre());
                    Archivos.escribirFichero("Productos.txt", listaProductos);
                    Archivos.escribirFichero(dirr, Requisicion.agregarRequisicion(a, nuevo));
                } else {
                    JOptionPane.showMessageDialog(null, "No hay suficiente Stock");
                }

            } else {
                JOptionPane.showMessageDialog(null, "NO ha llenado los campos");
            }
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void gSecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gSecuenciaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_gSecuenciaActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        new VenRequisicion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
        gSecuencia.setText("");
        gCantidad.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        Requisicion[] a = (Requisicion[]) Archivos.leerFichero(dirr);
        boolean key = gSecuencia.getText().equals("");
        Requisicion nuevo = Requisicion.buscarRequisicion(a, (key) ? 0 : Integer.parseInt(gSecuencia.getText()));
        if (nuevo == null) {
            JOptionPane.showMessageDialog(null, "No se encontro la Requisicion");
        } else {
            gSecuencia.setText("" + nuevo.getNumeroSecuencia());
            gCantidad.setText("" + nuevo.getCantidad());
            gProducto.setSelectedItem(nuevo.getProducto());
            gEmpleado.setSelectedItem(nuevo.getIdEmpleado());

        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void gSecuenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gSecuenciaKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        if (key < '0' || key > '9') {
            evt.consume();
        }
        if (gSecuencia.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_gSecuenciaKeyTyped

    private void gCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gCantidadKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        if (key < '0' || key > '9') {
            evt.consume();
        }
        if (gCantidad.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_gCantidadKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new VenProductosRequi().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gEmpleadoActionPerformed

    private void gCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gCantidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddRequisicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRequisicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRequisicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRequisicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRequisicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextField gCantidad;
    private javax.swing.JComboBox<String> gEmpleado;
    private javax.swing.JComboBox<String> gProducto;
    private javax.swing.JTextField gSecuencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}