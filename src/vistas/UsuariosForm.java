package vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuarios;
import modelo.UsuariosDAO;
import SEGURIDAD.seguridad;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class UsuariosForm extends javax.swing.JFrame {

    UsuariosDAO dao = new UsuariosDAO();
    Usuarios u = new Usuarios();
    List<String> sucursal = dao.listarSucursal();
    seguridad seg = new seguridad();

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableCellRenderer centrarTabla = new DefaultTableCellRenderer();

    String id_rut;

    public UsuariosForm() {
        initComponents();
        listar();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        cargarComboBox();
        txtClave.setEnabled(false);

    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon2.png"));
        return retValue;
    }

    void listar() {
        List<Usuarios> lista = dao.listar();

        modelo = (DefaultTableModel) TablaUsuarios.getModel();
        Object[] ob = new Object[11];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getRut_cajero();
            ob[1] = lista.get(i).getNombre();
            ob[2] = sucursal.get(lista.get(i).getId_sucursal() - 1);
            if (lista.get(i).getAdministrador() == 0) {
                ob[3] = "NO";
            } else {
                ob[3] = "SI";
            }
            if (lista.get(i).getEstado() == 0) {
                ob[4] = "NO";
            } else {
                ob[4] = "SI";
            }
            modelo.addRow(ob);
        }
        centrarTabla.setHorizontalAlignment(JLabel.LEFT);
        TablaUsuarios.getColumnModel().getColumn(0).setCellRenderer(centrarTabla);
        TablaUsuarios.getColumnModel().getColumn(3).setCellRenderer(centrarTabla);
        TablaUsuarios.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApPaterno = new javax.swing.JLabel();
        jLabelApMaterno = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabelUserTitle = new javax.swing.JLabel();
        jLabelComedor = new javax.swing.JLabel();
        CbSucursal = new javax.swing.JComboBox<>();
        txtClave = new javax.swing.JPasswordField();
        jLabelAdministrador = new javax.swing.JLabel();
        jLabelCajeroActivo = new javax.swing.JLabel();
        jCheckAdministrador = new javax.swing.JCheckBox();
        jCheckActivo = new javax.swing.JCheckBox();
        jCheckClave = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVentas = new javax.swing.JMenu();
        jMenuProductos = new javax.swing.JMenu();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuInforme = new javax.swing.JMenu();
        jMenuItemDiario = new javax.swing.JMenuItem();
        jMenuItemMensual = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(225, 139, 34));

        Logo.setBackground(new java.awt.Color(225, 139, 34));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSmall.png"))); // NOI18N

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Rut");

        jLabelApPaterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApPaterno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApPaterno.setText("Nombre");

        jLabelApMaterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApMaterno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApMaterno.setText("Clave");

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

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabelUserTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUserTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserTitle.setText("USUARIOS");

        jLabelComedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelComedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComedor.setText("Sucursal");

        jLabelAdministrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdministrador.setText("Administrador");

        jLabelCajeroActivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCajeroActivo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCajeroActivo.setText("Cajero Activo");

        jCheckActivo.setSelected(true);

        jCheckClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUserTitle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelApPaterno)
                                    .addComponent(jLabelComedor))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelApMaterno)
                                        .addGap(42, 42, 42)
                                        .addComponent(jCheckClave))
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbSucursal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRut))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelCajeroActivo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckActivo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelAdministrador)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckAdministrador))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUserTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelAdministrador)
                    .addComponent(jCheckAdministrador))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApPaterno)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCajeroActivo)
                    .addComponent(jCheckActivo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelApMaterno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelComedor)
                            .addComponent(CbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jCheckClave)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo)
                    .addComponent(btnActualizar))
                .addGap(69, 69, 69))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 270));

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut Cajero", "Nombre", "Sucursal", "Administrador", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        TablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 870, 380));

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

        jMenuProductos.setForeground(new java.awt.Color(255, 255, 255));
        jMenuProductos.setText("Edición");

        jMenuItemProductos.setText("Productos");
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemProductos);

        jMenuItemUsuarios.setText("Usuarios");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItemUsuarios);

        jMenuBar1.add(jMenuProductos);

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

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        this.setVisible(false);
        UsuariosForm admP = new UsuariosForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    //botones
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        limpiarCampos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        limpiarCampos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaUsuariosMouseClicked
        int fila = TablaUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            //txtNomUsuario.setEnabled(false);
            String rut = TablaUsuarios.getValueAt(fila, 0).toString();
            String nombre = TablaUsuarios.getValueAt(fila, 1).toString();
            String sucursal = TablaUsuarios.getValueAt(fila, 2).toString();
            String administrador = TablaUsuarios.getValueAt(fila, 3).toString();
            String estado = TablaUsuarios.getValueAt(fila, 4).toString();
            txtRut.setText(rut);
            txtNombre.setText(nombre);
            txtClave.setText("");
            CbSucursal.setSelectedIndex(sucursal.indexOf(sucursal));
            if (administrador.equals("NO")) {
                jCheckAdministrador.setSelected(false);
            } else {
                jCheckAdministrador.setSelected(true);
            }
            if (estado.equals("NO")) {
                jCheckActivo.setSelected(false);
            } else {
                jCheckActivo.setSelected(true);
            }
            id_rut = rut;
        }
    }//GEN-LAST:event_TablaUsuariosMouseClicked

    private void jCheckClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClaveActionPerformed
        if (txtClave.isEnabled()) {
            txtClave.setEnabled(false);
        } else {
            txtClave.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckClaveActionPerformed

    private void jMenuVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVentasMouseClicked
        this.setVisible(false);

        VentaForm admP = new VentaForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuVentasMouseClicked

    private void jMenuItemMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMensualActionPerformed
        this.setVisible(false);
        InformeForm admP = new InformeForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuItemMensualActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirMouseClicked
    void agregar() {
        //falta validar
        //campos no vacios
        //contraseña ingresada
        String rut = txtRut.getText();
        String nombre = txtNombre.getText();
        String clave_cajero = "";
        for (int i = 0; i < txtClave.getPassword().length; i++) {
            clave_cajero += txtClave.getPassword()[i];
        }
        String password_emp_casino = seg.encriptar(clave_cajero);
        int id_sucursal = CbSucursal.getSelectedIndex() + 1;
        int admin = 0;
        int est = 0;
        if (jCheckAdministrador.isSelected()) {
            admin = 1;
        }
        if (jCheckActivo.isSelected()) {
            est = 1;
        }
        Object[] ob = new Object[6];
        //Revisar
        ob[0] = rut;
        ob[1] = nombre;
        ob[2] = password_emp_casino;
        ob[3] = id_sucursal;
        ob[4] = admin;
        ob[5] = est;
        if (dao.add(ob) > 0) {
            JOptionPane.showMessageDialog(null, "Usuario Agregado correctamente", "Exito!", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "error al agregar usuario", "error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    void actualizar() {

        int fila = TablaUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {

            String rut = txtRut.getText();
            String nombre = txtNombre.getText();
            String clave_cajero = "";
            for (int i = 0; i < txtClave.getPassword().length; i++) {
                clave_cajero += txtClave.getPassword()[i];
            }
            int admin = 0;
            int est = 0;
            if (jCheckAdministrador.isSelected()) {
                admin = 1;
            }
            if (jCheckActivo.isSelected()) {
                est = 1;
            }
            String password_emp_casino = seg.encriptar(clave_cajero);            
            int sucursal = CbSucursal.getSelectedIndex() + 1;            
            Object[] ob = new Object[6];
            ob[0] = rut;
            ob[1] = nombre;
            ob[2] = sucursal;
            ob[3] = admin;
            ob[4] = est;
            ob[5] = id_rut;
            int r =0;
            if(txtClave.getPassword().length==0||!jCheckClave.isSelected()){
                System.out.println("actualizar sin clave");
                r=dao.actualizar(ob);
            }else{
                System.out.println("actualizar CON clave");
                r=dao.actualizar(ob, password_emp_casino);
            }            
            if (r > 0) {
                JOptionPane.showMessageDialog(null, "Usuario Actualizado correctamente", "Exito!", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "error al Actualizar usuario", "error!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    void eliminar() {

        int fila = TablaUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "Eliminar usuario?");
            if (respuesta == 0) {
                if (dao.eliminar(id_rut) > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "error al eliminar usuario", "error!", JOptionPane.ERROR_MESSAGE);
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
        for (int i = 0; i < sucursal.size(); i++) {
            CbSucursal.addItem(sucursal.get(i));
        }
    }

    void limpiarCampos() {

        txtRut.setText("");
        txtNombre.setText("");
        txtClave.setText("");
        txtClave.setEnabled(false);
        jCheckActivo.setSelected(false);
        jCheckAdministrador.setSelected(false);
        jCheckClave.setSelected(false);
        CbSucursal.setSelectedIndex(0);
        id_rut = "";
    }

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
            java.util.logging.Logger.getLogger(UsuariosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbSucursal;
    private javax.swing.JLabel Logo;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox jCheckActivo;
    private javax.swing.JCheckBox jCheckAdministrador;
    private javax.swing.JCheckBox jCheckClave;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelApMaterno;
    private javax.swing.JLabel jLabelApPaterno;
    private javax.swing.JLabel jLabelCajeroActivo;
    private javax.swing.JLabel jLabelComedor;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelUserTitle;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInforme;
    private javax.swing.JMenuItem jMenuItemDiario;
    private javax.swing.JMenuItem jMenuItemMensual;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables

}
