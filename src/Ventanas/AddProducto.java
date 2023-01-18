package Ventanas;

import javax.swing.JOptionPane;
import proveeduria_empresa_v3.Producto;
import proveeduria_empresa_v3.Archivos;
/**
 *
 * @author Grupo D, S.I. - 001 
 */
public class AddProducto extends javax.swing.JFrame {

    /**
     * Creates new form AddProducto
     */
    public String dirr = "Productos.txt";

    public AddProducto() {
        initComponents();
        setLocationRelativeTo(null);
        gCategoria.setModel(new javax.swing.DefaultComboBoxModel<>((String[]) Archivos.leerFichero("categoria.txt")));

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gNombre = new javax.swing.JTextField();
        gCodigo = new javax.swing.JTextField();
        gPrecio = new javax.swing.JTextField();
        gStock = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        gCategoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Producto");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nombre :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Stock:");

        gNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gNombreActionPerformed(evt);
            }
        });
        gNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gNombreKeyTyped(evt);
            }
        });

        gCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gCodigoActionPerformed(evt);
            }
        });
        gCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gCodigoKeyTyped(evt);
            }
        });

        gPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gPrecioKeyTyped(evt);
            }
        });

        gStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gStockKeyTyped(evt);
            }
        });

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregar.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compartimiento.png"))); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar-el-polvo.png"))); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Categoria");

        gCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton1.setText("Registrar Categoria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gCodigo)
                            .addComponent(gNombre)
                            .addComponent(gPrecio)
                            .addComponent(gStock)
                            .addComponent(gCategoria, 0, 150, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Atras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gStock, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gNombreActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        Producto[] a = (Producto[]) Archivos.leerFichero(dirr);
        boolean key = false;
        for (int i = 0; i < a.length; i++) {
            key = gCodigo.getText().equals(a[i].getCode());
            if (key) {
                JOptionPane.showMessageDialog(null, "El código pertenece a un Producto");
                break;
            }
        }
        if (!key) {
            if ((!((gCodigo.getText().equals(""))
                    || (gNombre.getText().equals(""))
                    || (gPrecio.getText().equals(""))
                    || (gStock.getText().equals(""))))) {

                Producto nuevo = new Producto(gCodigo.getText(), gNombre.getText(), gCategoria.getSelectedItem().toString(),
                        Double.parseDouble(gPrecio.getText()), Integer.parseInt(gStock.getText()));
                Archivos.escribirFichero(dirr, Producto.agregarProductos(a, nuevo));
                JOptionPane.showMessageDialog(null, "AGREGADO CON ÉXITO!");
            } else {
                JOptionPane.showMessageDialog(null, "CAMPOS VACIOS!");
            }
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        new VenProductos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        gNombre.setText("");
        gCodigo.setText("");
        gPrecio.setText("");
        gStock.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Producto[] a = (Producto[]) Archivos.leerFichero(dirr);
        Producto nuevo = Producto.buscarProductos(a, gCodigo.getText());
        if (nuevo == null) {
            JOptionPane.showMessageDialog(null, "Producto NO ENCONTRADO");
        } else {
            gNombre.setText(nuevo.getNombre());
            gCodigo.setText(nuevo.getCode());
            gPrecio.setText("" + nuevo.getPrecio());
            gStock.setText("" + nuevo.getStock());
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Producto[] a = (Producto[]) Archivos.leerFichero(dirr);
        Producto nuevo = Producto.buscarProductos(a, gCodigo.getText());
        if (nuevo == null) {
            JOptionPane.showMessageDialog(null, "El producto a Eliminar NO EXISTE");
        } else {
            Producto[] b = Producto.eliminarProductos(a, gCodigo.getText());
            Archivos.escribirFichero(dirr, b);
            JOptionPane.showMessageDialog(null, "ELIMINADO CON ÉXITO!");
        }

    }//GEN-LAST:event_BorrarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        Producto[] a = (Producto[]) Archivos.leerFichero(dirr);
        Producto nuevo = Producto.buscarProductos(a, gCodigo.getText());
        if (nuevo == null) {

            JOptionPane.showMessageDialog(null, "Producto NO ENCONTRADO");
        } else {
            if (!((gCodigo.getText().equals(""))
                    || (gNombre.getText().equals(""))
                    || (gPrecio.getText().equals(""))
                    || (gStock.getText().equals("")))) {
                Producto[] b = Producto.eliminarProductos(a, gCodigo.getText());
                Producto[] c = Producto.agregarProductos(b,
                        new Producto(gCodigo.getText(), gNombre.getText(), gCategoria.getSelectedItem().toString(),
                                Double.parseDouble(gPrecio.getText()), Integer.parseInt(gStock.getText())));
                Archivos.escribirFichero(dirr, c);
                JOptionPane.showMessageDialog(null, "ACTUALIZADO CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "CAMPOS VACIOS, NO se puede Actualizar");
            }

        }

    }//GEN-LAST:event_ActualizarActionPerformed

    private void gNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gNombreKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        if ((key < 'a' || key > 'z') && (key < 'A' || key > 'Z') && (key != ' ')) {
            evt.consume();
        }
        if (gNombre.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_gNombreKeyTyped

    private void gCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gCodigoKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        if (key < '0' || key > '9') {
            evt.consume();
        }
        if (gCodigo.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_gCodigoKeyTyped

    private void gPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gPrecioKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        if ((key < '0' || key > '9') && (key != '.')) {
            evt.consume();
        }
        if (gPrecio.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_gPrecioKeyTyped

    private void gStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gStockKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        if (key < '0' || key > '9') {
            evt.consume();
        }
        if (gCodigo.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_gStockKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new VenCategorias().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(AddProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Atras;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JComboBox<String> gCategoria;
    private javax.swing.JTextField gCodigo;
    private javax.swing.JTextField gNombre;
    private javax.swing.JTextField gPrecio;
    private javax.swing.JTextField gStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
