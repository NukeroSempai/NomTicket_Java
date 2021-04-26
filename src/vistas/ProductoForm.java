package vistas;


import java.awt.Image;
import java.awt.Toolkit;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductoDAO;

public class ProductoForm extends javax.swing.JFrame {

    ProductoDAO dao = new ProductoDAO();
    Producto p = new Producto();
    List<String> tipoProd = dao.listarTipo();

    DefaultTableModel modelo = new DefaultTableModel();
    int cod_prod;

    public ProductoForm() {
        initComponents();
        listar();
        cargarComboBox();
        this.setLocationRelativeTo(this);
        this.setResizable(false);

    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon2.png"));
        return retValue;

    }

    void listar() {
        List<Producto> lista = dao.listar();

        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getCodigo();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getDescripcion();
            //ob[3] = lista.get(i).getTipo();
            ob[3] = tipoProd.get(lista.get(i).getTipo() - 1);
            ob[4] = lista.get(i).getPrecio();
            modelo.addRow(ob);
        }
        tabla.setModel(modelo);
    }


    void agregar() {

        String nom_prod = txtNomProd.getText();
        String desc_prod = txtDesc.getText();
        int tipo = CbCategoria.getSelectedIndex() + 1;
        String precio_prod = txtPrecio.getText();

        Object[] ob = new Object[4];

        ob[0] = nom_prod;
        ob[1] = desc_prod;
        ob[2] = tipo;
        ob[3] = precio_prod;
        if (dao.add(ob) > 0) {
            JOptionPane.showMessageDialog(null, "Producto Agregado correctamente", "Exito!", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "error al agregar producto", "error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    void actualizar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            String nom_prod = txtNomProd.getText();
            String desc_prod = txtDesc.getText();
            int tipo = CbCategoria.getSelectedIndex() + 1;
            int precio_prod = Integer.parseInt(txtPrecio.getText());
            Object[] obj = new Object[6];
            obj[0] = cod_prod;
            obj[1] = nom_prod;
            obj[2] = desc_prod;
            obj[3] = tipo;
            obj[4] = precio_prod;
            obj[5] = cod_prod;
            if (dao.actualizar(obj) > 0) {
                JOptionPane.showMessageDialog(null, "Producto Actualizado correctamente", "Exito!", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "error al Actualizar producto", "error!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    void eliminar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "Eliminar producto?");
            if (respuesta == 0) {

                if (dao.eliminar(""+cod_prod) > 0) {
                    System.out.println(cod_prod);
                    JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente","Exito!",JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "error al eliminar producto", "error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void cargarComboBox() {
        for (int i = 0; i < tipoProd.size(); i++) {
            CbCategoria.addItem(tipoProd.get(i));
        }
    }


    void limpiarCampos() {
        txtNomProd.setText("");
        txtDesc.setText("");
        txtPrecio.setText("");
        CbCategoria.setSelectedIndex(0);
        txtNomProd.setBackground(Color.white);
        txtDesc.setBackground(Color.white);
        txtPrecio.setBackground(Color.white);
        //esto evita eliminar la ultima celda seleccionada despues de limpiar
        cod_prod = -1;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanelFondo = new javax.swing.JPanel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelNomProd = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        txtNomProd = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        CbCategoria = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jLabelProdTitle = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVentas = new javax.swing.JMenu();
        jMenuEdición = new javax.swing.JMenu();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuInforme = new javax.swing.JMenu();
        jMenuItemDiario = new javax.swing.JMenuItem();
        jMenuItemMensual = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelFondo.setBackground(new java.awt.Color(225, 139, 34));

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

        txtNomProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomProdKeyPressed(evt);
            }
        });

        txtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescKeyPressed(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
        });

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

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSmall.png"))); // NOI18N

        jLabelProdTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelProdTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProdTitle.setText("PRODUCTOS");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDescripcion)
                                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                                                .addComponent(jLabelPrecio)
                                                .addGap(82, 82, 82))
                                            .addComponent(jLabelNomProd))
                                        .addGroup(jPanelFondoLayout.createSequentialGroup()
                                            .addComponent(jLabelCategoria)
                                            .addGap(57, 57, 57))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDesc)
                                    .addComponent(CbCategoria, 0, 271, Short.MAX_VALUE)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtNomProd)))
                            .addComponent(jLabelProdTitle)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelProdTitle)
                        .addGap(26, 26, 26)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCategoria)
                            .addComponent(CbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNomProd)
                            .addComponent(txtNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescripcion))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecio)))
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre Producto", "Descripción", "Categoría", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(null);

        jMenuVentas.setForeground(new java.awt.Color(255, 255, 255));
        jMenuVentas.setText("Ventas");
        jMenuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVentasMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuVentas);

        jMenuEdición.setForeground(new java.awt.Color(255, 255, 255));
        jMenuEdición.setText("Edición");

        jMenuItemProductos.setText("Productos");
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenuEdición.add(jMenuItemProductos);

        jMenuItemUsuarios.setText("Usuarios");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuEdición.add(jMenuItemUsuarios);

        jMenuBar1.add(jMenuEdición);

        jMenuInforme.setForeground(new java.awt.Color(255, 255, 255));
        jMenuInforme.setText("Informes");

        jMenuItemDiario.setText("Diario");
        jMenuInforme.add(jMenuItemDiario);

        jMenuItemMensual.setText("Mensual");
        jMenuItemMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMensualActionPerformed(evt);
            }
        });
        jMenuInforme.add(jMenuItemMensual);

        jMenuBar1.add(jMenuInforme);

        jMenuSalir.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
        this.setVisible(false);

        ProductoForm admP = new ProductoForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        limpiarCampos();
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");

        } else {            
            String codigo = tabla.getValueAt(fila, 0).toString(); 

            String nombre = tabla.getValueAt(fila, 1).toString();
            String descripcion = tabla.getValueAt(fila, 2).toString();
            String tipoProducto = tabla.getValueAt(fila, 3).toString();

            String precio = tabla.getValueAt(fila, 4).toString();            

            txtNomProd.setText(nombre);
            txtDesc.setText(descripcion);
            CbCategoria.setSelectedIndex(tipoProd.indexOf(tipoProducto));
            txtPrecio.setText(precio);
            //rescatar codigo de la seleccion en el formulario

            cod_prod = Integer.parseInt(codigo);

        }
    }//GEN-LAST:event_tablaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (Validador.validador.verificarVacio(txtNomProd.getText()) && Validador.validador.verificarVacio(txtDesc.getText()) && Validador.validador.verificarVacio(txtPrecio.getText())) {
            if (Validador.validador.verificarNumero(txtPrecio.getText())) {
                actualizar();
                limpiarTabla();
                listar();
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "error el campo " + "PRECIO" + " debe ser un numero", "error!", JOptionPane.ERROR_MESSAGE);
                txtPrecio.setBackground(Color.red);
            }

        } else {
            if (!Validador.validador.verificarVacio(txtNomProd.getText())) {
                JOptionPane.showMessageDialog(null, "error el campo " + "NOMBRE PRODUCTO" + " No puede estar vacio", "error!", JOptionPane.ERROR_MESSAGE);
                txtNomProd.setBackground(Color.red);
            }
            if (!Validador.validador.verificarVacio(txtDesc.getText())) {
                JOptionPane.showMessageDialog(null, "error el campo " + "DESCRIPCION" + " No puede estar vacio", "error!", JOptionPane.ERROR_MESSAGE);
                txtDesc.setBackground(Color.red);
            }
            if (!Validador.validador.verificarVacio(txtPrecio.getText())) {
                JOptionPane.showMessageDialog(null, "error el campo " + "PRECIO" + " No puede estar vacio", "error!", JOptionPane.ERROR_MESSAGE);
                txtPrecio.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (Validador.validador.verificarVacio(txtNomProd.getText()) && Validador.validador.verificarVacio(txtDesc.getText()) && Validador.validador.verificarVacio(txtPrecio.getText())) {
            if (Validador.validador.verificarNumero(txtPrecio.getText())) {
                agregar();
                limpiarTabla();
                listar();
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(null, "error el campo " + "PRECIO" + " debe ser un numero", "error!", JOptionPane.ERROR_MESSAGE);
                txtPrecio.setBackground(Color.red);
            }

        } else {
            if (!Validador.validador.verificarVacio(txtNomProd.getText())) {
                JOptionPane.showMessageDialog(null, "error el campo " + "NOMBRE PRODUCTO" + " No puede estar vacio", "error!", JOptionPane.ERROR_MESSAGE);
                txtNomProd.setBackground(Color.red);
            }
            if (!Validador.validador.verificarVacio(txtDesc.getText())) {
                JOptionPane.showMessageDialog(null, "error el campo " + "DESCRIPCION" + " No puede estar vacio", "error!", JOptionPane.ERROR_MESSAGE);
                txtDesc.setBackground(Color.red);
            }
            if (!Validador.validador.verificarVacio(txtPrecio.getText())) {
                JOptionPane.showMessageDialog(null, "error el campo " + "PRECIO" + " No puede estar vacio", "error!", JOptionPane.ERROR_MESSAGE);
                txtPrecio.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();        
    }//GEN-LAST:event_btnNuevoActionPerformed


    private void jMenuVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVentasMouseClicked
        this.setVisible(false);

        VentaForm admP = new VentaForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuVentasMouseClicked

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        this.setVisible(false);
        UsuariosForm admP = new UsuariosForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMensualActionPerformed
        this.setVisible(false);
        InformeForm admP = new InformeForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuItemMensualActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirMouseClicked


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
    private javax.swing.JComboBox<String> CbCategoria;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelNomProd;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProdTitle;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdición;
    private javax.swing.JMenu jMenuInforme;
    private javax.swing.JMenuItem jMenuItemDiario;
    private javax.swing.JMenuItem jMenuItemMensual;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuVentas;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNomProd;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
