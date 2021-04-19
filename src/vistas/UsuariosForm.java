package vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuarios;
import modelo.UsuariosDAO;

public class UsuariosForm extends javax.swing.JFrame {

    UsuariosDAO dao = new UsuariosDAO();
    Usuarios u = new Usuarios();
    List<String> comedor = dao.listarComedor();
    List<String> comuna = dao.listarComuna();
    int identificador =0;

    DefaultTableModel modelo = new DefaultTableModel();
    int id_emp_casino;

    public UsuariosForm() {
        initComponents();
        listar();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        cargarComboBox();
    }

    void listar() {
        List<Usuarios> lista = dao.listar();

        modelo = (DefaultTableModel) TablaUsuarios.getModel();
        Object[] ob = new Object[11];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getPaterno();
            ob[3] = lista.get(i).getMaterno();
            ob[4] = lista.get(i).getRut();
            ob[5] = lista.get(i).getDv();
            ob[6] = lista.get(i).getTelefono();
            ob[7] = lista.get(i).getNomUsuario();
            ob[8] = lista.get(i).getPassword();
            ob[9] = comedor.get(lista.get(i).getComedor() - 1);
            ob[10] = comuna.get(lista.get(i).getComuna() - 1);
            modelo.addRow(ob);
        }
        TablaUsuarios.setModel(modelo);
        identificador = lista.get(lista.size()-1).getId()+1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApPaterno = new javax.swing.JLabel();
        jLabelApMaterno = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelRut = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        txtDv = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabelUserTitle = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelComedor = new javax.swing.JLabel();
        jLabelComuna = new javax.swing.JLabel();
        txtNomUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        CbComedor = new javax.swing.JComboBox<>();
        CbComuna = new javax.swing.JComboBox<>();
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
        jLabelNombre.setText("Nombre");

        jLabelApPaterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApPaterno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApPaterno.setText("Apellido Paterno");

        jLabelApMaterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApMaterno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApMaterno.setText("Apellido Materno");

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setText("Teléfono");

        jLabelRut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRut.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRut.setText("Rut");

        txtApMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMaternoActionPerformed(evt);
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

        jLabelId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Usuario");

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password");

        jLabelComedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelComedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComedor.setText("Comedor");

        jLabelComuna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelComuna.setForeground(new java.awt.Color(255, 255, 255));
        jLabelComuna.setText("Comuna");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefono)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelApPaterno)
                                    .addComponent(jLabelRut)
                                    .addComponent(jLabelApMaterno))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnAgregar)
                                            .addGap(26, 26, 26)
                                            .addComponent(btnActualizar))
                                        .addComponent(txtApMaterno)
                                        .addComponent(txtTel)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtApPaterno)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelId)
                                    .addComponent(jLabelPassword)
                                    .addComponent(jLabelComedor)
                                    .addComponent(jLabelComuna)))
                            .addComponent(jLabelUserTitle))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CbComedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(txtNomUsuario)
                                    .addComponent(CbComuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabelUserTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelId)
                    .addComponent(txtNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApPaterno)
                    .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelApMaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelComedor)
                        .addComponent(CbComedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRut)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComuna)
                    .addComponent(CbComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 340));

        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido Paterno", "Apellido Materno", "Rut", "Dv", "Teléfono", "Nombre Usuario", "Password", "Comedor", "Comuna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 870, 330));

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

    private void txtApMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApMaternoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);

        ProductoForm admP = new ProductoForm();
        admP.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    void agregar() {
        int id_emp_casino = identificador;
        String nom_emp_casino = txtNombre.getText();
        String appat_emp_casino = txtApPaterno.getText();
        String apmat_emp_casino = txtApMaterno.getText();
        String rut_emp_casino = txtRut.getText();
        String dv_rut_emp_casino = txtDv.getText();
        String tel_emp_casino = txtTel.getText();
        String nomUsu = txtNomUsuario.getText();
        String password_emp_casino = txtPassword.getText();
        int tipo = CbComedor.getSelectedIndex() + 1;
        int comuna = CbComuna.getSelectedIndex() + 1;
        //String fk_comuna_id = txtComuna.getText();
        Object[] ob = new Object[11];
        //Revisar
        ob[0] = id_emp_casino;
        ob[1] = nom_emp_casino;
        ob[2] = appat_emp_casino;
        ob[3] = apmat_emp_casino;
        ob[4] = rut_emp_casino;
        ob[5] = dv_rut_emp_casino;
        ob[6] = tel_emp_casino;
        ob[7] = nomUsu;
        ob[8] = password_emp_casino;
        ob[9] = comuna;
        ob[10] = tipo;
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
            
            String nom_emp_casino = txtNombre.getText();
            String appat_emp_casino = txtApPaterno.getText();
            String apmat_emp_casino = txtApMaterno.getText();
            String rut_emp_casino = txtRut.getText();
            String dv_rut_emp_casino = txtDv.getText();
            String tel_emp_casino = txtTel.getText();
            String nomUsuario = txtNomUsuario.getText();
            String password_emp_casino = txtPassword.getText();
            int tipo = CbComedor.getSelectedIndex() + 1;
            int comuna = CbComuna.getSelectedIndex() + 1;
            //String fk_comuna_id = txtComuna.getText();
            Object[] ob = new Object[10];            
            ob[0] = nom_emp_casino;
            ob[1] = appat_emp_casino;
            ob[2] = apmat_emp_casino;
            ob[3] = rut_emp_casino;
            ob[4] = dv_rut_emp_casino;
            ob[5] = tel_emp_casino;
            ob[6] = password_emp_casino;
            ob[7] = comuna;
            ob[8] = comedor;
            if (dao.actualizar(ob) > 0) {
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
            int respuesta = JOptionPane.showConfirmDialog(null, "Eliminar producto?");
            if (respuesta == 0) {
                if (dao.eliminar(id_emp_casino) > 0) {
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
        for (int i = 0; i < comedor.size(); i++) {
            CbComedor.addItem(comedor.get(i));
        }
        for (int i = 0; i < comuna.size(); i++) {
            CbComuna.addItem(comuna.get(i));
        }
    }

    void limpiarCampos() {
        txtNomUsuario.setText("");
        txtNombre.setText("");
        txtApPaterno.setText("");
        txtApMaterno.setText("");
        txtRut.setText("");
        txtDv.setText("");
        txtTel.setText("");
        txtPassword.setText("");
        CbComedor.setSelectedIndex(0);
        CbComuna.setSelectedIndex(0);

    }

    private void TablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {
        int fila = TablaUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            txtNomUsuario.setEnabled(false);
            String id = TablaUsuarios.getValueAt(fila, 0).toString();
            String nombre = TablaUsuarios.getValueAt(fila, 1).toString();
            String paterno = TablaUsuarios.getValueAt(fila, 2).toString();
            String materno = TablaUsuarios.getValueAt(fila, 3).toString();
            String rut = TablaUsuarios.getValueAt(fila, 4).toString();
            String dv = TablaUsuarios.getValueAt(fila, 5).toString();
            String telefono = TablaUsuarios.getValueAt(fila, 6).toString();
            String password = TablaUsuarios.getValueAt(fila, 7).toString();
            String comedor = TablaUsuarios.getValueAt(fila, 8).toString();
            String comuna = TablaUsuarios.getValueAt(fila, 9).toString();
            txtNomUsuario.setText(id);
            txtNombre.setText(nombre);
            txtApPaterno.setText(paterno);
            txtApMaterno.setText(materno);
            txtRut.setText(rut);
            txtDv.setText(dv);
            txtTel.setText(telefono);
            txtPassword.setText(password);
            CbComedor.setSelectedIndex(comedor.indexOf(comedor));
            CbComuna.setSelectedIndex(comuna.indexOf(comuna));
            System.out.println(comedor);
        }
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
    private javax.swing.JComboBox<String> CbComedor;
    private javax.swing.JComboBox<String> CbComuna;
    private javax.swing.JLabel Logo;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabelApMaterno;
    private javax.swing.JLabel jLabelApPaterno;
    private javax.swing.JLabel jLabelComedor;
    private javax.swing.JLabel jLabelComuna;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelTelefono;
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
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtDv;
    private javax.swing.JTextField txtNomUsuario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    
}
