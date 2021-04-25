package vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuarios;
import modelo.UsuariosDAO;
import SEGURIDAD.seguridad;
import java.awt.Color;
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
        jMenu1 = new javax.swing.JMenu();
        jMenuProductos = new javax.swing.JMenu();
        jMenuItemInventario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuInforme = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRutKeyPressed(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
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

        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

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
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuProductos.add(jMenuItem1);

        jMenuBar1.add(jMenuProductos);

        jMenuInforme.setText("Informe");
        jMenuBar1.add(jMenuInforme);

        jMenuSalir.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemInventarioActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        ProductoForm admP = new ProductoForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //botones
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(Validador.validador.verificarVacio(txtRut.getText()) && Validador.validador.verificarVacio(txtNombre.getText()) && txtClave.getPassword().length>0){
            agregar();
            limpiarTabla();
            listar();
            limpiarCampos();
        }else{
            if(!Validador.validador.verificarVacio(txtRut.getText())){
                JOptionPane.showMessageDialog(null, "error el campo " + "RUT" + " debe ser un numero", "error!", JOptionPane.ERROR_MESSAGE);
                txtRut.setBackground(Color.red);
            }
            if(!Validador.validador.verificarVacio(txtNombre.getText())){
                JOptionPane.showMessageDialog(null, "error el campo " + "NOMBRE" + " debe ser un numero", "error!", JOptionPane.ERROR_MESSAGE);
                txtNombre.setBackground(Color.red);
            }
            if(txtClave.getPassword().length==0){
                JOptionPane.showMessageDialog(null, "error el campo " + "CONTRASEÑA" + " debe ser un numero", "error!", JOptionPane.ERROR_MESSAGE);
                txtClave.setBackground(Color.red);
                if(!jCheckClave.isSelected()){
                    jCheckClave.setSelected(true);
                    txtClave.setEnabled(true);
                }
            }
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(Validador.validador.verificarVacio(txtRut.getText()) && Validador.validador.verificarVacio(txtNombre.getText())){
            actualizar();
            limpiarTabla();
            listar();
            limpiarCampos();
        }else{
            if(!Validador.validador.verificarVacio(txtRut.getText())){
                JOptionPane.showMessageDialog(null, "error el campo " + "RUT" + " debe ser un numero", "error!", JOptionPane.ERROR_MESSAGE);
                txtRut.setBackground(Color.red);
            }
            if(!Validador.validador.verificarVacio(txtNombre.getText())){
                JOptionPane.showMessageDialog(null, "error el campo " + "NOMBRE" + " debe ser un numero", "error!", JOptionPane.ERROR_MESSAGE);
                txtNombre.setBackground(Color.red);
            }            
        }
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
        txtClave.setText("");
        if (txtClave.isEnabled()) {
            txtClave.setEnabled(false);
        } else {
            txtClave.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckClaveActionPerformed

    private void txtRutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyPressed
        txtRut.setBackground(Color.white);
    }//GEN-LAST:event_txtRutKeyPressed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        txtNombre.setBackground(Color.white);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        txtClave.setBackground(Color.white);
    }//GEN-LAST:event_txtClaveKeyPressed
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInforme;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemInventario;
    private javax.swing.JMenu jMenuProductos;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables

}
