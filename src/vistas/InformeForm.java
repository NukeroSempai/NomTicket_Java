package vistas;

/**
 *
 * @author Jiss
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Informe;
import modelo.InformesDAO;

public class InformeForm extends javax.swing.JFrame {

    InformesDAO dao = new InformesDAO();
    Informe p = new Informe();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableCellRenderer centrarTabla = new DefaultTableCellRenderer();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    Calendar clndr;

    public InformeForm() {
        initComponents();
        FormatoDeFechas();
        limpiarFormulario();
        listar();
    }

    private void limpiarFormulario() {
        jTextCodigo.setEnabled(false);
        jTexCantidadBoletas.setEnabled(false);
        jTexCantidadBoletas.setText("");
        jTextCantidadTickets.setEnabled(false);
        jTextCantidadTickets.setText("");
        jTextTotalVenta.setEnabled(false);
        jTextTotalVenta.setText("");
        jTextCodigo.setText("");
        jBGenerar.setEnabled(false);
        jBGuardar.setEnabled(false);
        jDDesde.setEnabled(false);
        jDHasta.setEnabled(false);
        jDDesde.setCalendar(null);
        jDHasta.setCalendar(null);
        jDateFechaBuscar.setCalendar(null);
        jDateFechaBuscar.setEnabled(false);
        jRadioFecha.setSelected(false);
        jRadioCodigo.setSelected(false);
    }

    private void FormatoDeFechas() {
        jDateFechaBuscar.setEnabled(false);
        jDateFechaBuscar.setDateFormatString("dd/MM/yyyy");
        jDfecha.setEnabled(false);
        jDfecha.setDateFormatString("dd/MM/yyyy");
        jDDesde.setEnabled(false);
        jDDesde.setDateFormatString("dd/MM/yyyy");
        jDHasta.setEnabled(false);
        jDHasta.setDateFormatString("dd/MM/yyyy");
    }

    private void listar() {
        List<Informe> lista = dao.listar();

        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getCorrelativo();
            ob[1] = lista.get(i).getFechaInforme();
            ob[2] = lista.get(i).getCantidadBoletas();
            ob[3] = lista.get(i).getCantidadTicket();
            ob[4] = lista.get(i).getTotalVenta();
            ob[5] = lista.get(i).getFechaInicio();
            ob[6] = lista.get(i).getFechaTermino();
            modelo.addRow(ob);
        }
        centrarTabla.setHorizontalAlignment(JLabel.LEFT);
        tabla.getColumnModel().getColumn(0).setCellRenderer(centrarTabla);
        tabla.setModel(modelo);
        //ocultando filas (las filas son necesarias para cargar los detalles de los informes NO BORRAR)
        tabla.getColumn("Cantidad Boletas").setMinWidth(0);
        tabla.getColumn("Cantidad Boletas").setMaxWidth(0);
        tabla.getColumn("Cantidad Boletas").setWidth(0);

        tabla.getColumn("Cantidad Tickets").setMinWidth(0);
        tabla.getColumn("Cantidad Tickets").setMaxWidth(0);
        tabla.getColumn("Cantidad Tickets").setWidth(0);

        tabla.getColumn("Total Ventas").setMinWidth(0);
        tabla.getColumn("Total Ventas").setMaxWidth(0);
        tabla.getColumn("Total Ventas").setWidth(0);

        tabla.getColumn("Fecha Inicio").setMinWidth(0);
        tabla.getColumn("Fecha Inicio").setMaxWidth(0);
        tabla.getColumn("Fecha Inicio").setWidth(0);

        tabla.getColumn("Fecha Termino").setMinWidth(0);
        tabla.getColumn("Fecha Termino").setMaxWidth(0);
        tabla.getColumn("Fecha Termino").setWidth(0);

    }

    private void listar(String fecha) {
        List<Informe> lista = dao.listar(fecha);

        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getCorrelativo();
            ob[1] = lista.get(i).getFechaInforme();
            ob[2] = lista.get(i).getCantidadBoletas();
            ob[3] = lista.get(i).getCantidadTicket();
            ob[4] = lista.get(i).getTotalVenta();
            ob[5] = lista.get(i).getFechaInicio();
            ob[6] = lista.get(i).getFechaTermino();
            modelo.addRow(ob);
        }
        centrarTabla.setHorizontalAlignment(JLabel.LEFT);
        tabla.getColumnModel().getColumn(0).setCellRenderer(centrarTabla);
        tabla.setModel(modelo);
        //ocultando filas (las filas son necesarias para cargar los detalles de los informes NO BORRAR)
        tabla.getColumn("Cantidad Boletas").setMinWidth(0);
        tabla.getColumn("Cantidad Boletas").setMaxWidth(0);
        tabla.getColumn("Cantidad Boletas").setWidth(0);

        tabla.getColumn("Cantidad Tickets").setMinWidth(0);
        tabla.getColumn("Cantidad Tickets").setMaxWidth(0);
        tabla.getColumn("Cantidad Tickets").setWidth(0);

        tabla.getColumn("Total Ventas").setMinWidth(0);
        tabla.getColumn("Total Ventas").setMaxWidth(0);
        tabla.getColumn("Total Ventas").setWidth(0);

        tabla.getColumn("Fecha Inicio").setMinWidth(0);
        tabla.getColumn("Fecha Inicio").setMaxWidth(0);
        tabla.getColumn("Fecha Inicio").setWidth(0);

        tabla.getColumn("Fecha Termino").setMinWidth(0);
        tabla.getColumn("Fecha Termino").setMaxWidth(0);
        tabla.getColumn("Fecha Termino").setWidth(0);

    }

    private void listar(int codigo) {
        List<Informe> lista = dao.listar(codigo);

        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getCorrelativo();
            ob[1] = lista.get(i).getFechaInforme();
            ob[2] = lista.get(i).getCantidadBoletas();
            ob[3] = lista.get(i).getCantidadTicket();
            ob[4] = lista.get(i).getTotalVenta();
            ob[5] = lista.get(i).getFechaInicio();
            ob[6] = lista.get(i).getFechaTermino();
            modelo.addRow(ob);
        }
        centrarTabla.setHorizontalAlignment(JLabel.LEFT);
        tabla.getColumnModel().getColumn(0).setCellRenderer(centrarTabla);
        tabla.setModel(modelo);
        //ocultando filas (las filas son necesarias para cargar los detalles de los informes NO BORRAR)
        tabla.getColumn("Cantidad Boletas").setMinWidth(0);
        tabla.getColumn("Cantidad Boletas").setMaxWidth(0);
        tabla.getColumn("Cantidad Boletas").setWidth(0);

        tabla.getColumn("Cantidad Tickets").setMinWidth(0);
        tabla.getColumn("Cantidad Tickets").setMaxWidth(0);
        tabla.getColumn("Cantidad Tickets").setWidth(0);

        tabla.getColumn("Total Ventas").setMinWidth(0);
        tabla.getColumn("Total Ventas").setMaxWidth(0);
        tabla.getColumn("Total Ventas").setWidth(0);

        tabla.getColumn("Fecha Inicio").setMinWidth(0);
        tabla.getColumn("Fecha Inicio").setMaxWidth(0);
        tabla.getColumn("Fecha Inicio").setWidth(0);

        tabla.getColumn("Fecha Termino").setMinWidth(0);
        tabla.getColumn("Fecha Termino").setMaxWidth(0);
        tabla.getColumn("Fecha Termino").setWidth(0);

    }
    
    void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabelInformeTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioCodigo = new javax.swing.JRadioButton();
        jRadioFecha = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jLabelInformeTitle2 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jDateFechaBuscar = new com.toedter.calendar.JDateChooser();
        jBMostrarTodo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabelInformeTitle1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelInformeTitle3 = new javax.swing.JLabel();
        jDDesde = new com.toedter.calendar.JDateChooser();
        jLabelDesde = new javax.swing.JLabel();
        jLabelHasta = new javax.swing.JLabel();
        jDHasta = new com.toedter.calendar.JDateChooser();
        jLabelDesde1 = new javax.swing.JLabel();
        jDfecha = new com.toedter.calendar.JDateChooser();
        jLabelDesde2 = new javax.swing.JLabel();
        jLabelDesde3 = new javax.swing.JLabel();
        jLabelDesde4 = new javax.swing.JLabel();
        jTexCantidadBoletas = new javax.swing.JTextField();
        jTextCantidadTickets = new javax.swing.JTextField();
        jTextTotalVenta = new javax.swing.JTextField();
        jBGenerar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 139, 34));

        Logo.setBackground(new java.awt.Color(225, 139, 34));
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoSmall.png"))); // NOI18N

        jLabelInformeTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelInformeTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInformeTitle.setText("INFORME VENTAS");

        jPanel4.setBackground(new java.awt.Color(184, 115, 30));

        buttonGroup1.add(jRadioCodigo);
        jRadioCodigo.setText("Codigo");
        jRadioCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCodigoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioFecha);
        jRadioFecha.setText("Fecha");
        jRadioFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioFechaActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabelInformeTitle2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelInformeTitle2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInformeTitle2.setText("Buscador");

        jBMostrarTodo.setText("Mostrar Todo");
        jBMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioCodigo)
                            .addComponent(jLabelInformeTitle2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBMostrarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateFechaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInformeTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioCodigo)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioFecha)
                    .addComponent(jDateFechaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMostrarTodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInformeTitle))
                .addGap(18, 18, 18)
                .addComponent(Logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelInformeTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(225, 139, 34));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Correlativo", "Fecha Informe", "Cantidad Boletas", "Cantidad Tickets", "Total Ventas", "Fecha Inicio", "Fecha Termino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jLabelInformeTitle1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelInformeTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInformeTitle1.setText("INFORMES");

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelInformeTitle1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInformeTitle1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(225, 139, 34));

        jLabelInformeTitle3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelInformeTitle3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInformeTitle3.setText("DETALLE INFORME");

        jDDesde.setDateFormatString("dd/MM/yyyy");

        jLabelDesde.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDesde.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDesde.setText("Desde");

        jLabelHasta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelHasta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHasta.setText("Hasta");

        jDHasta.setDateFormatString("dd/MM/yyyy");

        jLabelDesde1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDesde1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDesde1.setText("Fecha");

        jLabelDesde2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDesde2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDesde2.setText("Cantidad de Boletas");

        jLabelDesde3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDesde3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDesde3.setText("Cantidad de Tickets");

        jLabelDesde4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDesde4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDesde4.setText("Total de Ventas");

        jBGenerar.setText("Generar Informe");
        jBGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGenerarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextTotalVenta)
                    .addComponent(jTextCantidadTickets)
                    .addComponent(jTexCantidadBoletas)
                    .addComponent(jDHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInformeTitle3)
                            .addComponent(jLabelDesde1)
                            .addComponent(jLabelDesde3)
                            .addComponent(jLabelDesde4)
                            .addComponent(jLabelDesde2)
                            .addComponent(jLabelDesde)
                            .addComponent(jLabelHasta))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInformeTitle3)
                .addGap(18, 18, 18)
                .addComponent(jLabelDesde1)
                .addGap(18, 18, 18)
                .addComponent(jDfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDesde)
                .addGap(13, 13, 13)
                .addComponent(jDDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelHasta)
                .addGap(18, 18, 18)
                .addComponent(jDHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDesde2)
                .addGap(18, 18, 18)
                .addComponent(jTexCantidadBoletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDesde3)
                .addGap(18, 18, 18)
                .addComponent(jTextCantidadTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDesde4)
                .addGap(18, 18, 18)
                .addComponent(jTextTotalVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGenerar)
                    .addComponent(jBGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCodigoActionPerformed
        jTextCodigo.setEnabled(true);
        jDateFechaBuscar.setEnabled(false);
        jDateFechaBuscar.setCalendar(null);

    }//GEN-LAST:event_jRadioCodigoActionPerformed

    private void jRadioFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioFechaActionPerformed
        jTextCodigo.setEnabled(false);
        jDateFechaBuscar.setEnabled(true);
        jTextCodigo.setText("");
    }//GEN-LAST:event_jRadioFechaActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
            limpiarFormulario();
            int TBoleta = (int) tabla.getValueAt(fila, 2);
            int TTicket = (int) tabla.getValueAt(fila, 3);
            int TVenta = (int) tabla.getValueAt(fila, 4);
            jTexCantidadBoletas.setText("" + TBoleta);
            jTextCantidadTickets.setText("" + TTicket);
            jTextTotalVenta.setText("" + TVenta);
            String fechahoy = (String) LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            try {
                java.util.Date fechaHoy = new SimpleDateFormat("dd/MM/yyyy").parse(fechahoy);
                jDfecha.setDate(fechaHoy);
                java.util.Date fechaDesde = new SimpleDateFormat("dd/MM/yyyy").parse(tabla.getValueAt(fila, 5).toString());
                jDDesde.setDate(fechaDesde);
                java.util.Date fechaHasta = new SimpleDateFormat("dd/MM/yyyy").parse(tabla.getValueAt(fila, 6).toString());
                jDHasta.setDate(fechaHasta);
            } catch (ParseException ex) {
                Logger.getLogger(InformeForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(fechahoy);

        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //limpiar formulario
        limpiarFormulario();
        jDHasta.setEnabled(true);
        jDDesde.setEnabled(true);
        jBGenerar.setEnabled(true);
        //esperar ingreso de fechas
        //hacer consulta con valores
        //guardar consultas por dao

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGenerarActionPerformed
        jBGenerar.setEnabled(false);
        jBGuardar.setEnabled(true);
        jDDesde.setEnabled(false);
        jDHasta.setEnabled(false);
        Object[] objcompleto = new Object[6];
        System.out.println(formatoFecha.format(jDDesde.getDate()));
        System.out.println(formatoFecha.format(jDHasta.getDate()));
        Object[] parcial = dao.generarInforme(new java.sql.Date(jDDesde.getDate().getTime()),new java.sql.Date(jDHasta.getDate().getTime()));
        objcompleto[0] = formatoFecha.format(jDateFechaBuscar.getDate());
        objcompleto[1] = parcial[0];
        objcompleto[2] = parcial[1];
        objcompleto[3] = parcial[2];
        objcompleto[4] = formatoFecha.format(jDDesde.getDate());
        objcompleto[5] = formatoFecha.format(jDHasta.getDate());
        for (int i = 0; i < objcompleto.length; i++) {
            System.out.println(objcompleto[i]);
            
        }
        
        
        
    }//GEN-LAST:event_jBGenerarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        //ejecutar guardado
        limpiarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        limpiarTabla();        
        if (jRadioCodigo.isSelected()) {
            System.out.println("estamos en codigo");
            listar(Integer.parseInt(jTextCodigo.getText()));
        }
        if(jRadioFecha.isSelected()){
            System.out.println("estamos en fecha");
            listar(formatoFecha.format(jDateFechaBuscar.getDate()));
        }
        limpiarFormulario();
        jBMostrarTodo.setEnabled(true);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarTodoActionPerformed
        limpiarTabla();
        limpiarFormulario();
        listar();
    }//GEN-LAST:event_jBMostrarTodoActionPerformed

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
            java.util.logging.Logger.getLogger(InformeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformeForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGenerar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBMostrarTodo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDDesde;
    private com.toedter.calendar.JDateChooser jDHasta;
    private com.toedter.calendar.JDateChooser jDateFechaBuscar;
    private com.toedter.calendar.JDateChooser jDfecha;
    private javax.swing.JLabel jLabelDesde;
    private javax.swing.JLabel jLabelDesde1;
    private javax.swing.JLabel jLabelDesde2;
    private javax.swing.JLabel jLabelDesde3;
    private javax.swing.JLabel jLabelDesde4;
    private javax.swing.JLabel jLabelHasta;
    private javax.swing.JLabel jLabelInformeTitle;
    private javax.swing.JLabel jLabelInformeTitle1;
    private javax.swing.JLabel jLabelInformeTitle2;
    private javax.swing.JLabel jLabelInformeTitle3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioCodigo;
    private javax.swing.JRadioButton jRadioFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTexCantidadBoletas;
    private javax.swing.JTextField jTextCantidadTickets;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextTotalVenta;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
