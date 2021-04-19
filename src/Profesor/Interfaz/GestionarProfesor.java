package Profesor.Interfaz;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import profesorObjetos.GestorArchivo;
import profesorObjetos.Profesor;

public class GestionarProfesor extends javax.swing.JFrame {

    //Crear variables
    String ID = "", tipoEmpleado = "", Nombre = "", Profesion = "", numHorasTrabajadas = "", valorHora = "", Salario = "";
    private List<Profesor> lista = new LinkedList<>();

    boolean editar = false, removido = false;

    public GestionarProfesor() {
        initComponents();
        txtID.requestFocusInWindow();
        jPanel2.setVisible(false);
        setLocationRelativeTo(null);
        cargar();

        jtablaProfesor.addMouseListener(new MouseAdapter() {
            DefaultTableModel model = new DefaultTableModel();

            public void clicMause(MouseEvent e) {
                int i = jtablaProfesor.getSelectedRow();
                ID = (jtablaProfesor.getValueAt(i, 0).toString());
                tipoEmpleado = (jtablaProfesor.getValueAt(i, 1).toString());
                Nombre = (jtablaProfesor.getValueAt(i, 2).toString());
                Profesion = (jtablaProfesor.getValueAt(i, 3).toString());
                numHorasTrabajadas = (jtablaProfesor.getValueAt(i, 4).toString());
                valorHora = (jtablaProfesor.getValueAt(i, 5).toString());
                Salario = (jtablaProfesor.getValueAt(i, 6).toString());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgruparRadioOrdenar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtProfesion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        comboBoxTipoEmpleado = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNumHora = new javax.swing.JTextField();
        txtValorHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaProfesor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboFiltroTipo = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtSalarioInicial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSalarioFinal = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        radioOrdenarID = new javax.swing.JRadioButton();
        radioOrdenarNombres = new javax.swing.JRadioButton();
        radioOrdenarSalarios = new javax.swing.JRadioButton();
        checkFiltros = new javax.swing.JCheckBox();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Profesores");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Profesión:");

        txtProfesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProfesionKeyReleased(evt);
            }
        });

        jLabel4.setText("ID:");

        jLabel3.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        comboBoxTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cátedra", "Tiempo_Completo" }));
        comboBoxTipoEmpleado.setToolTipText("");
        comboBoxTipoEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBoxTipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoEmpleadoActionPerformed(evt);
            }
        });
        comboBoxTipoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboBoxTipoEmpleadoKeyReleased(evt);
            }
        });

        jLabel2.setText("Tipo De Empleado:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        txtNumHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumHoraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumHoraKeyReleased(evt);
            }
        });

        txtValorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorHoraActionPerformed(evt);
            }
        });
        txtValorHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorHoraKeyReleased(evt);
            }
        });

        jLabel6.setText("Número Hora:");

        jLabel7.setText("Valór Hora:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProfesion)
                                    .addComponent(txtNumHora, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(txtValorHora))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtablaProfesor);
        jtablaProfesor.getAccessibleContext().setAccessibleParent(jtablaProfesor);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Filtros:");

        jLabel10.setText("Tipo:");

        comboFiltroTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Cátedra", "Tiempo_Completo" }));
        comboFiltroTipo.setToolTipText("");
        comboFiltroTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltroTipoItemStateChanged(evt);
            }
        });
        comboFiltroTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroTipoActionPerformed(evt);
            }
        });

        jLabel11.setText("Salarios entre");

        txtSalarioInicial.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtSalarioInicialComponentAdded(evt);
            }
        });
        txtSalarioInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioInicialActionPerformed(evt);
            }
        });
        txtSalarioInicial.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtSalarioInicialPropertyChange(evt);
            }
        });
        txtSalarioInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioInicialKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalarioInicialKeyReleased(evt);
            }
        });

        jLabel12.setText("y");

        txtSalarioFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioFinalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalarioFinalKeyReleased(evt);
            }
        });

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setText("Ordenar");

        AgruparRadioOrdenar.add(radioOrdenarID);
        radioOrdenarID.setText("ID");
        radioOrdenarID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioOrdenarIDItemStateChanged(evt);
            }
        });
        radioOrdenarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOrdenarIDActionPerformed(evt);
            }
        });

        AgruparRadioOrdenar.add(radioOrdenarNombres);
        radioOrdenarNombres.setText("Nombre");
        radioOrdenarNombres.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioOrdenarNombresItemStateChanged(evt);
            }
        });

        AgruparRadioOrdenar.add(radioOrdenarSalarios);
        radioOrdenarSalarios.setText("Salario");
        radioOrdenarSalarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioOrdenarSalariosItemStateChanged(evt);
            }
        });
        radioOrdenarSalarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOrdenarSalariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioOrdenarID)
                .addGap(18, 18, 18)
                .addComponent(radioOrdenarNombres)
                .addGap(8, 8, 8)
                .addComponent(radioOrdenarSalarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioOrdenarID)
                    .addComponent(radioOrdenarNombres)
                    .addComponent(radioOrdenarSalarios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSalarioInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(comboFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFiltrar)
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(comboFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalarioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtSalarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkFiltros.setText("Activar Filtros");
        checkFiltros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkFiltrosStateChanged(evt);
            }
        });
        checkFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFiltrosActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Datos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkFiltros))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(btnGuardar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEditar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(checkFiltros))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void comboBoxTipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTipoEmpleadoActionPerformed
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtID.getText().equals("") || txtNombre.getText().equals("") || txtNumHora.getText().equals("") || txtProfesion.getText().equals("") || txtValorHora.getText().equals("")) {
            if (txtID.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ID Está vacío", "!Vaya, algo a sucedido!", JOptionPane.INFORMATION_MESSAGE);
                txtID.requestFocusInWindow();
            } else {
                if (txtNombre.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Nombre Está vacío", "!Vaya, algo a sucedido!", JOptionPane.INFORMATION_MESSAGE);
                    txtNombre.requestFocusInWindow();
                } else {
                    if (txtProfesion.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Profesion Está vacío", "!Vaya, algo a sucedido!", JOptionPane.INFORMATION_MESSAGE);
                        txtProfesion.requestFocusInWindow();
                    } else {
                        if (txtNumHora.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Número de horas Está vacío", "!Vaya, algo a sucedido!", JOptionPane.INFORMATION_MESSAGE);
                            txtNumHora.requestFocusInWindow();
                        } else {
                            JOptionPane.showMessageDialog(null, "Valór Hora Está vacío", "!Vaya, algo a sucedido!", JOptionPane.INFORMATION_MESSAGE);
                            txtValorHora.requestFocusInWindow();
                        }
                    }

                }
            }

        } else {

            NumberFormat formato = new DecimalFormat("#0.00");
            double Horas = Double.parseDouble(txtNumHora.getText());
            double Valor = Double.parseDouble(txtValorHora.getText());
            String SalarioNeto = String.valueOf(formato.format(Horas * Valor));
            Profesor profesor = new Profesor(txtID.getText(), comboBoxTipoEmpleado.getModel().getSelectedItem().toString(), txtNombre.getText(), txtProfesion.getText(), txtNumHora.getText(), txtValorHora.getText(), SalarioNeto);

            if (editar == false) {
                boolean repetido = false;
                for (Profesor lista1 : lista) {
                    if (lista1.getID().equals(txtID.getText())) {
                        repetido = true;
                    }
                }
                if (repetido == true) {
                    JOptionPane.showMessageDialog(null, "ID ya Existe", "Vaya, Algo a sucedido", JOptionPane.INFORMATION_MESSAGE);
                }
                if (repetido == false) {
                    if (txtID.getText().equals("0") || txtNumHora.getText().equals("0") || txtValorHora.getText().equals("0")) {
                        if (txtID.getText().equals("0")) {
                            JOptionPane.showMessageDialog(null, "ID no puede ser 0 ", "Vaya, Algo a sucedido", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            if (txtNumHora.getText().equals("0")) {
                                JOptionPane.showMessageDialog(null, "Número Horas no puede ser 0 ", "Vaya, Algo a sucedido", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Valor Hora no puede ser 0 ", "Vaya, Algo a sucedido", JOptionPane.INFORMATION_MESSAGE);
                            }

                        }
                    } else {
                        lista.add(profesor);
                    }
                }

            } else {

                for (int i = 0; i < lista.size(); i++) {

                    if (txtID.getText().equals(lista.get(i).getID())) {

                        lista.get(i).setID(txtID.getText());
                        lista.get(i).setTipoEmpleado(comboBoxTipoEmpleado.getModel().getSelectedItem().toString());
                        lista.get(i).setNombre(txtNombre.getText());
                        lista.get(i).setProfesion(txtProfesion.getText());
                        lista.get(i).setNumHorasTrabajadas(txtNumHora.getText());
                        lista.get(i).setValorHora(txtValorHora.getText());
                        lista.get(i).setSalario(SalarioNeto);

                    }

                }

            }

            mostrar();
            comboBoxTipoEmpleado.setSelectedItem("");
            txtID.setText("");
            txtNombre.setText("");
            txtProfesion.setText("");
            txtNumHora.setText("");
            txtValorHora.setText("");

            editar = false;
            txtID.setEnabled(true);
            guardar();
        }


    }//GEN-LAST:event_btnGuardarActionPerformed
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (jtablaProfesor.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un estudiante", "¡Vaya, ha algo a fallado!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (jtablaProfesor.getSelectedRow() >= 0) {
                int i = jtablaProfesor.getSelectedRow();
                txtID.setText(jtablaProfesor.getValueAt(i, 0).toString());
                comboBoxTipoEmpleado.setSelectedItem(jtablaProfesor.getValueAt(i, 1));
                txtNombre.setText(jtablaProfesor.getValueAt(i, 2).toString());
                txtProfesion.setText(jtablaProfesor.getValueAt(i, 3).toString());
                txtNumHora.setText(jtablaProfesor.getValueAt(i, 4).toString());
                txtValorHora.setText(jtablaProfesor.getValueAt(i, 5).toString());
                editar = true;
                txtID.setEnabled(false);
                guardar();
            }

        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (jtablaProfesor.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un estudiante", "¡Vaya, ha algo a fallado!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (jtablaProfesor.getSelectedRow() >= 0) {
                int j = jtablaProfesor.getSelectedRow();
                lista.remove(j);
                guardar();

                //Actualizar tabla
                String matris[][] = new String[lista.size()][7];
                for (int i = 0; i < lista.size(); i++) {
                    matris[i][0] = lista.get(i).getID();
                    matris[i][1] = lista.get(i).getTipoEmpleado();
                    matris[i][2] = lista.get(i).getNombre();
                    matris[i][3] = lista.get(i).getProfesion();
                    matris[i][4] = lista.get(i).getNumHorasTrabajadas();
                    matris[i][5] = lista.get(i).getValorHora();
                    matris[i][6] = lista.get(i).getSalario();

                }

                jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                        matris,
                        new String[]{
                            "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
                        }
                ));
            }

        }


    }//GEN-LAST:event_btnEliminarActionPerformed
    private void txtValorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorHoraActionPerformed
        // TDO add your handling code here:
    }//GEN-LAST:event_txtValorHoraActionPerformed
    private void radioOrdenarSalariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOrdenarSalariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOrdenarSalariosActionPerformed
    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (txtSalarioInicial.getText().equals("") || txtSalarioFinal.getText().equals("")) {
            mostrar();
        } else {
            mostrarPorSalarioMinimo();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarActionPerformed
    private void comboFiltroTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroTipoActionPerformed

        // TODO add your handling code here
    }//GEN-LAST:event_comboFiltroTipoActionPerformed
    private void comboFiltroTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltroTipoItemStateChanged
        if (comboFiltroTipo.getModel().getSelectedItem().toString().equals("Cátedra")) {
            mostrarCatedra();
        }
        if (comboFiltroTipo.getModel().getSelectedItem().toString().equals("Tiempo_Completo")) {
            mostrarTiempoCompleto();
        }
        if (comboFiltroTipo.getModel().getSelectedItem().toString().equals("Todos")) {
            mostrar();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroTipoItemStateChanged
    private void txtSalarioInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioInicialActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioInicialActionPerformed
    private void txtSalarioInicialPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtSalarioInicialPropertyChange

// TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioInicialPropertyChange
    private void txtSalarioInicialComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtSalarioInicialComponentAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioInicialComponentAdded
    private void txtSalarioInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioInicialKeyReleased

//  lectorSalarioInicial();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioInicialKeyReleased
    private void radioOrdenarIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioOrdenarIDItemStateChanged
        filtrarID();
// TODO add your handling code here:
    }//GEN-LAST:event_radioOrdenarIDItemStateChanged
    private void radioOrdenarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOrdenarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOrdenarIDActionPerformed
    private void radioOrdenarNombresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioOrdenarNombresItemStateChanged
        filtrarNombres();
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOrdenarNombresItemStateChanged
    private void radioOrdenarSalariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioOrdenarSalariosItemStateChanged
        filtrarSalarios();
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOrdenarSalariosItemStateChanged
    private void checkFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFiltrosActionPerformed
        if (checkFiltros.isSelected() == true) {
            jPanel2.setVisible(true);
        } else {
            jPanel2.setVisible(false);
        }
        mostrar();

    }//GEN-LAST:event_checkFiltrosActionPerformed
    private void comboBoxTipoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxTipoEmpleadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTipoEmpleadoKeyReleased
    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased
    private void txtProfesionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProfesionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfesionKeyReleased
    private void txtNumHoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumHoraKeyReleased

//  lectorNumHora();
    }//GEN-LAST:event_txtNumHoraKeyReleased
    private void txtValorHoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorHoraKeyReleased
        txtValorHora.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
//lectorValHora();
    }//GEN-LAST:event_txtValorHoraKeyReleased
    private void txtSalarioFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioFinalKeyReleased


    }//GEN-LAST:event_txtSalarioFinalKeyReleased
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        txtID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtNumHoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumHoraKeyPressed

        txtNumHora.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumHoraKeyPressed

    private void txtSalarioInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioInicialKeyPressed
        txtSalarioInicial.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioInicialKeyPressed

    private void txtSalarioFinalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioFinalKeyPressed
        txtSalarioFinal.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificar si la tecla pulsada no es un digito
                if (((caracter < '0')
                        || (caracter > '9'))
                        && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioFinalKeyPressed

    private void checkFiltrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkFiltrosStateChanged
           
    }//GEN-LAST:event_checkFiltrosStateChanged
    public void mostrar() {
        String matris[][] = new String[lista.size()][7];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getID();
            matris[i][1] = lista.get(i).getTipoEmpleado();
            matris[i][2] = lista.get(i).getNombre();
            matris[i][3] = lista.get(i).getProfesion();
            matris[i][4] = lista.get(i).getNumHorasTrabajadas();
            matris[i][5] = lista.get(i).getValorHora();
            matris[i][6] = lista.get(i).getSalario();

        }

        jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
                }
        ));

    }

    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public void mostrarCatedra() {
        List<Profesor> listaCopiada1 = new LinkedList<>(lista);
        String c = comboFiltroTipo.getModel().getSelectedItem().toString();

        String matris[][] = new String[listaCopiada1.size()][7];
        for (int i = 0; i < listaCopiada1.size(); i++) {

            if (listaCopiada1.get(i).getTipoEmpleado().equals(c)) {
                //no hace nada
            } else {
                if (i == 0) {
                    listaCopiada1.remove(i);
                }
                if (i > 0) {
                    listaCopiada1.remove(i);
                }
                i--;
            }
        }
        List<Profesor> listaFinal = new LinkedList<>(listaCopiada1);
        for (int i = 0; i < listaFinal.size(); i++) {
            if (listaFinal.get(i).getTipoEmpleado().equals(c)) {
                matris[i][0] = listaFinal.get(i).getID();
                matris[i][1] = listaFinal.get(i).getTipoEmpleado();
                matris[i][2] = listaFinal.get(i).getNombre();
                matris[i][3] = listaFinal.get(i).getProfesion();
                matris[i][4] = listaFinal.get(i).getNumHorasTrabajadas();
                matris[i][5] = listaFinal.get(i).getValorHora();
                matris[i][6] = listaFinal.get(i).getSalario();
            }
        }
        jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
                }
        ));
    }

    public void mostrarTiempoCompleto() {
        ArrayList<Profesor> listaCopiada1 = new ArrayList<>(lista);
        String c = comboFiltroTipo.getModel().getSelectedItem().toString();
        String matris[][] = new String[listaCopiada1.size()][7];
        for (int i = 0; i < listaCopiada1.size(); i++) {

            if (listaCopiada1.get(i).getTipoEmpleado().equals(c)) {
                //no hace nada
            } else {
                listaCopiada1.remove(i);
            }

        }
        ArrayList<Profesor> listaFinal = new ArrayList<>(listaCopiada1);
        for (int i = 0; i < listaFinal.size(); i++) {
            if (listaFinal.get(i).getTipoEmpleado().equals(c)) {
                matris[i][0] = listaFinal.get(i).getID();
                matris[i][1] = listaFinal.get(i).getTipoEmpleado();
                matris[i][2] = listaFinal.get(i).getNombre();
                matris[i][3] = listaFinal.get(i).getProfesion();
                matris[i][4] = listaFinal.get(i).getNumHorasTrabajadas();
                matris[i][5] = listaFinal.get(i).getValorHora();
                matris[i][6] = listaFinal.get(i).getSalario();
            }
        }

        jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
                }
        ));
    }

    public void mostrarPorSalarioMinimo() {
        ArrayList<Profesor> listaCopiada1 = new ArrayList<>(lista);
        float salarioMinimo = Float.parseFloat(txtSalarioInicial.getText());
        float salarioMaximo = Float.parseFloat(txtSalarioFinal.getText());
        String matris[][] = new String[listaCopiada1.size()][7];
        for (int i = 0; i < listaCopiada1.size(); i++) {
            if (Float.parseFloat(listaCopiada1.get(i).getSalario().replace(",", ".")) < salarioMinimo || Float.parseFloat(listaCopiada1.get(i).getSalario().replace(",", ".")) > salarioMaximo) {
                listaCopiada1.remove(i);
            }

        }
        ArrayList<Profesor> listaFinal = new ArrayList<>(listaCopiada1);
        for (int i = 0; i < listaFinal.size(); i++) {
            float salarioFormato = Float.parseFloat(listaFinal.get(i).getSalario().replace(",", "."));

            if (salarioFormato >= salarioMinimo && salarioFormato <= salarioMaximo) {
                matris[i][0] = listaFinal.get(i).getID();
                matris[i][1] = listaFinal.get(i).getTipoEmpleado();
                matris[i][2] = listaFinal.get(i).getNombre();
                matris[i][3] = listaFinal.get(i).getProfesion();
                matris[i][4] = listaFinal.get(i).getNumHorasTrabajadas();
                matris[i][5] = listaFinal.get(i).getValorHora();
                matris[i][6] = listaFinal.get(i).getSalario();
            }
        }

        jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
                }
        ));

    }

    public void filtrarID() {
        String matris[][] = new String[lista.size()][7];
        int k = 0;
        while (k < (lista.size() - 1)) {
            for (int i = 0; i < (lista.size() - 1); i++) {

                Integer ID1 = Integer.valueOf(lista.get(i).getID());
                Integer ID2 = Integer.valueOf(lista.get(i + 1).getID());
                if (ID1 > ID2) {
                    Profesor profesor = new Profesor(lista.get(i).getID(), lista.get(i).getTipoEmpleado(), lista.get(i).getNombre(), lista.get(i).getProfesion(), lista.get(i).getNumHorasTrabajadas(), lista.get(i).getValorHora(), lista.get(i).getSalario());
                    Profesor profesor2 = new Profesor(lista.get(i + 1).getID(), lista.get(i + 1).getTipoEmpleado(), lista.get(i + 1).getNombre(), lista.get(i + 1).getProfesion(), lista.get(i + 1).getNumHorasTrabajadas(), lista.get(i + 1).getValorHora(), lista.get(i + 1).getSalario());
                    lista.set(i, profesor2);
                    lista.set(i + 1, profesor);
                }
            }
            k++;
        }
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getID();
            matris[i][1] = lista.get(i).getTipoEmpleado();
            matris[i][2] = lista.get(i).getNombre();
            matris[i][3] = lista.get(i).getProfesion();
            matris[i][4] = lista.get(i).getNumHorasTrabajadas();
            matris[i][5] = lista.get(i).getValorHora();
            matris[i][6] = lista.get(i).getSalario();

        }

        jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
                }
        ));

    }

    public void filtrarNombres() {
        String matris[][] = new String[lista.size()][7];
        int k = 0;
        while (k < (lista.size() - 1)) {
            for (int i = 0; i < (lista.size() - 1); i++) {

                String ID1 = lista.get(i).getNombre().toLowerCase();
                String ID2 = lista.get(i + 1).getNombre().toLowerCase();
                if ((ID1.compareTo(ID2)) > 0) {
                    Profesor profesor = new Profesor(lista.get(i).getID(), lista.get(i).getTipoEmpleado(), lista.get(i).getNombre(), lista.get(i).getProfesion(), lista.get(i).getNumHorasTrabajadas(), lista.get(i).getValorHora(), lista.get(i).getSalario());
                    Profesor profesor2 = new Profesor(lista.get(i + 1).getID(), lista.get(i + 1).getTipoEmpleado(), lista.get(i + 1).getNombre(), lista.get(i + 1).getProfesion(), lista.get(i + 1).getNumHorasTrabajadas(), lista.get(i + 1).getValorHora(), lista.get(i + 1).getSalario());
                    lista.set(i, profesor2);
                    lista.set(i + 1, profesor);
                }
            }
            k++;
        }
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getID();
            matris[i][1] = lista.get(i).getTipoEmpleado();
            matris[i][2] = lista.get(i).getNombre();
            matris[i][3] = lista.get(i).getProfesion();
            matris[i][4] = lista.get(i).getNumHorasTrabajadas();
            matris[i][5] = lista.get(i).getValorHora();
            matris[i][6] = lista.get(i).getSalario();

        }

        jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
                }
        ));

    }

    public void filtrarSalarios() {
        String matris[][] = new String[lista.size()][7];
        int k = 0;

        while (k != 6) {
            for (int i = 0; i < (lista.size() - 1); i++) {

                float ID1 = Float.parseFloat(lista.get(i).getSalario().replace(",", "."));
                float ID2 = Float.parseFloat(lista.get(i + 1).getSalario().replace(",", "."));
                if (ID1 > ID2) {
                    Profesor profesor = new Profesor(lista.get(i).getID(), lista.get(i).getTipoEmpleado(), lista.get(i).getNombre(), lista.get(i).getProfesion(), lista.get(i).getNumHorasTrabajadas(), lista.get(i).getValorHora(), lista.get(i).getSalario());
                    Profesor profesor2 = new Profesor(lista.get(i + 1).getID(), lista.get(i + 1).getTipoEmpleado(), lista.get(i + 1).getNombre(), lista.get(i + 1).getProfesion(), lista.get(i + 1).getNumHorasTrabajadas(), lista.get(i + 1).getValorHora(), lista.get(i + 1).getSalario());
                    lista.set(i, profesor2);
                    lista.set(i + 1, profesor);
                }
            }
            k++;
        }
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getID();
            matris[i][1] = lista.get(i).getTipoEmpleado();
            matris[i][2] = lista.get(i).getNombre();
            matris[i][3] = lista.get(i).getProfesion();
            matris[i][4] = lista.get(i).getNumHorasTrabajadas();
            matris[i][5] = lista.get(i).getValorHora();
            matris[i][6] = lista.get(i).getSalario();

        }

        jtablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "ID", "Tipo", "Nombre", "Profesión", "Núm Hora", "Val Hora", "Salario"
                }
        ));

    }

    public void lectorID() {
        @SuppressWarnings("UnusedAssignment")
        String textoID = txtID.getText();
        int x = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            x = Integer.parseInt(textoID);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ID deber ser Númerico", "¡vaya algo salio mal!", JOptionPane.ERROR_MESSAGE);
            txtID.setText(null);
        }

    }

    public void lectorNumHora() {
        @SuppressWarnings("UnusedAssignment")
        String textoHora = txtNumHora.getText();
        int x = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            x = Integer.parseInt(textoHora);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Número Hora deber ser Númerico", "¡vaya algo salio mal!", JOptionPane.ERROR_MESSAGE);
            txtNumHora.setText(null);
        }

    }

    public void lectorValHora() {
        @SuppressWarnings("UnusedAssignment")
        String textoValHora = txtValorHora.getText();
        double x = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            x = Double.parseDouble(textoValHora);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valór no valido", "¡vaya algo salio mal!", JOptionPane.ERROR_MESSAGE);
            txtValorHora.setText(null);
        }

    }

    public void lectorSalarioInicial() {
        @SuppressWarnings("UnusedAssignment")
        String textoSalInicial = txtSalarioInicial.getText();
        double x = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            x = Double.parseDouble(textoSalInicial);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valór no valido", "¡vaya algo salio mal!", JOptionPane.ERROR_MESSAGE);
            txtSalarioInicial.setText(null);
        }

    }

    public void lectorSalarioFinal() {
        @SuppressWarnings("UnusedAssignment")
        String textoSalFinal = txtSalarioFinal.getText();
        double x = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            x = Double.parseDouble(textoSalFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valór no valido", "¡vaya algo salio mal!", JOptionPane.ERROR_MESSAGE);
            txtSalarioFinal.setText(null);
        }

    }

    private void guardar() {
        try {
            GestorArchivo.guardar(lista);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar", "Error de Archivo", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargar() {
        try {
            lista = GestorArchivo.cargar();
            mostrar();
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, fnfe.getMessage(), "Error de inicio", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ie) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar", "Error de Archivo", JOptionPane.ERROR_MESSAGE);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarProfesor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GestionarProfesor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AgruparRadioOrdenar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox checkFiltros;
    private javax.swing.JComboBox comboBoxTipoEmpleado;
    private javax.swing.JComboBox comboFiltroTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablaProfesor;
    private javax.swing.JRadioButton radioOrdenarID;
    private javax.swing.JRadioButton radioOrdenarNombres;
    private javax.swing.JRadioButton radioOrdenarSalarios;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumHora;
    private javax.swing.JTextField txtProfesion;
    private javax.swing.JTextField txtSalarioFinal;
    private javax.swing.JTextField txtSalarioInicial;
    private javax.swing.JTextField txtValorHora;
    // End of variables declaration//GEN-END:variables

}
