
package vistas;

import javax.swing.JOptionPane;
import modelo.ProductoDAO;

public class ProductoForm extends javax.swing.JFrame {
    ProductoDAO dao=new ProductoDAO();
    Producto p=new Producto();

    DefaultTableModel model=new DefaultTableModel();
   int cod_prod;
    public ProductoForm() {
        initComponents();
        listar();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    void listar(){
        List<Producto> lista=dao.listar();
        modelo=(DefaultTableModel)tabla.getModel();
        Object[]ob=new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0]=lista.get(i).getCod_prod();
            ob[1]=lista.get(i).getNom_prod();
            ob[2]=lista.get(i).getDesc_prod();
            ob[3]=lista.get(i).getFoto_prod();
            ob[4]=lista.get(i).getPrecio_prod();
            modelo.addRow(ob);
        }
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanelFondo = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelNomProd = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        txtNomProd = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNUevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuProductos = new javax.swing.JMenu();
        jMenuItemInventario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuInforme = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelFondo.setBackground(new java.awt.Color(255, 153, 0));

        jLabelFoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFoto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFoto.setText("Foto");

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setText("Código");

        jLabelCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categoría");

        jLabelNomProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNomProd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomProd.setText("Nombre Producto");

        jLabelDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("Descripción");

        jLabelPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setText("Precio");

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Menú", "Bebidas", "Cafetería", " " }));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNUevo.setText("Nuevo");
        btnNUevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrecio)
                            .addComponent(jLabelFoto)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabelCategoria)
                            .addComponent(jLabelDescripcion))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomProd)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNUevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelFoto)
                .addGap(106, 106, 106)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoria)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(jLabelNomProd)
                    .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNUevo)
                    .addComponent(jLabelDescripcion)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Foto", "Código", "Categoría", "Nombre Producto", "Descripción", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 0));
        jMenuBar1.setBorder(null);

        jMenu1.setText("Catálogo");
        jMenuBar1.add(jMenu1);

        jMenuProductos.setText("Productos");

        jMenuItemInventario.setText("Inventario");
        jMenuItemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInventarioActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemInventario);

        jMenuItem1.setText("Modificar");
        jMenuProductos.add(jMenuItem1);

        jMenuBar1.add(jMenuProductos);

        jMenuInforme.setText("Informe");
        jMenuBar1.add(jMenuInforme);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemInventarioActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNUevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNUevoActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        int fila=tabla.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(this,"Debe Seleccionar una Fila");
        }else{
            int cod_prod = Integer.parseInt(tabla.getValueAt(fila,0).toString()); // revisar si este campo se debe repetir con el de abajo
            String cod_prod= tabla.getValueAt(fila,1).toString();
            String nom_prod=tabla.getValueAt(fila,2).toString(); //Falta incorporar los campos categorias y foto
            String desc_prod=tabla.getValueAt(fila,3).toString();
            String precio_prod=tabla.getValueAt(fila,4).toString();
            txtCodigo.setText(cod_prod);
            txtNomProd.setText(nom_prod);
            txtDesc.setText(desc_prod);
            txtPrecio.setText(precio_prod);
        }
    }//GEN-LAST:event_TABLAMouseClicked

    void agregar() {
        String cod_prod=txtCodigo.getText();
        String nom_prod=txtNomProd.getText(); //Falta incorporar los campos categorias y foto
        String desc_prod=txtDesc.getText();
        String precio_prod=txtPrecio.getText();
        Object[] ob=new Object[4];
        ob[0]=cod_prod;
        ob[1]=nom_prod;
        ob[2]=desc_prod;
        ob[3]=precio_prod;
        dao.add(ob);
    }
    void actualizar() {
        int fila=tabla.getSelectedRow();
        if(fila==-1) {
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }
        else{
        String cod_prod=txtCodigo.getText();
        String nom_prod=txtNomProd.getText(); //Falta incorporar los campos categorias y foto
        String desc_prod=txtDesc.getText();
        String precio_prod=txtPrecio.getText();
        Object[] obj=new Object[5];
        obj[0]=cod_prod;   
        obj[1]=nom_prod;   
        obj[2]=desc_prod;   
        obj[3]=precio_prod;   
        dao.actualizar(obj);
        }
        
    }
    void eliminar() {
        int fila=tabla.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }else{
            dao.eliminar(cod_prod);
        }
        
    }
    void nuevo() {
        txtCodigo.setText("");
        txtNomProd.setText("");
        txtDesc.setText("");
        txtPrecio.setText("");
    }
    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++ ) {
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
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
            java.util.logging.Logger.getLogger(ProductoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNUevo;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelNomProd;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInforme;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemInventario;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
