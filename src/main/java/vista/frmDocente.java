package vista;

import clases.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmDocente extends javax.swing.JFrame {

    Arreglo_Docente obj = new Arreglo_Docente();
    int tipo; // 0=Principal 1=Parcial
    Docente doc;

    public frmDocente() {
        initComponents();
        panel2.setVisible(false);
        muestra1();

    }

    // Metodo para todos
    public void muestra1() {

        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        dt.setColumnCount(0);
        dt.addColumn("CÓDIGO");
        dt.addColumn("NOMBRE");
        dt.addColumn("AÑO DE INGRESO");
        dt.addColumn("GRADO");

        for (Docente x : obj.listado()) {

            Object v[] = {x.getCodp(), x.getNomp(), x.getAing(), x.getGrado()};
            dt.addRow(v);

        }

    }

    // Metodo para Principal
    public void muestra2() {

        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        dt.setColumnCount(0);
        dt.addColumn("CÓDIGO");
        dt.addColumn("NOMBRE");
        dt.addColumn("AÑO DE INGRESO");
        dt.addColumn("GRADO");
        dt.addColumn("DÍAS");

        for (Docente x : obj.listado()) {

            if (x instanceof Principal) {
                Object v[] = {x.getCodp(), x.getNomp(), x.getAing(), x.getGrado(), ((Principal) x).getDias()};
                dt.addRow(v);
            }
        }
    }

    // Metodo para Parcial
    public void muestra3() {

        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        dt.setColumnCount(0);
        dt.addColumn("CÓDIGO");
        dt.addColumn("NOMBRE");
        dt.addColumn("AÑO DE INGRESO");
        dt.addColumn("GRADO");
        dt.addColumn("HORAS");

        for (Docente x : obj.listado()) {

            if (x instanceof Parcial) {
                Object v[] = {x.getCodp(), x.getNomp(), x.getAing(), x.getGrado(), ((Parcial) x).getHoras()};
                dt.addRow(v);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        txtIngreso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnLimpia = new javax.swing.JButton();
        btnGraba = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rbTodos = new javax.swing.JRadioButton();
        rbPrincipal = new javax.swing.JRadioButton();
        rbParcial = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIngresarCodigo = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();
        btnBorra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRINCIPAL", "PARCIAL" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jLabel5.setText("AÑO DE INGRESO:");

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Parcial"));

        jLabel2.setText("NÚMERO DE HORAS:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel6.setText("GRADO:");

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        jLabel1.setText("NÚMERO DE DIAS:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel4.setText("NOMBRE:");

        jLabel3.setText("CÓDIGO:");

        txtGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGradoActionPerformed(evt);
            }
        });

        jLabel7.setText("SELECCIONE TIPO:");

        btnLimpia.setText("LIMPIAR");
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });

        btnGraba.setText("GRABAR");
        btnGraba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabaActionPerformed(evt);
            }
        });

        jLabel10.setText("1: INGENIERO O LICENCIADO");

        jLabel11.setText("2: MAGISTER");

        jLabel12.setText("3: DOCTOR");

        jLabel9.setText("- - - - - - - - - - WELCOME TO PROGRAM - - - - - - - - - - ");

        jLabel13.setText("TIPOS DE GRADOS:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(62, 62, 62))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(50, 50, 50)))
                                .addComponent(jLabel3))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(320, 320, 320)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10))
                                        .addGap(0, 228, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(252, 252, 252))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(91, 91, 91))))))))
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnGraba)
                .addGap(109, 109, 109)
                .addComponent(btnLimpia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGraba)
                    .addComponent(btnLimpia))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INGRESAR", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione tipo"));

        buttonGroup1.add(rbTodos);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPrincipal);
        rbPrincipal.setText("Principal");
        rbPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrincipalActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbParcial);
        rbParcial.setText("Parcial");
        rbParcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParcialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rbTodos)
                .addGap(70, 70, 70)
                .addComponent(rbPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(rbParcial)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTodos)
                    .addComponent(rbPrincipal)
                    .addComponent(rbParcial))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE", "AÑO INGRESO", "GRADO"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTADO", jPanel3);

        jLabel8.setText("INGRESE CÓDIGO:");

        btnBusca.setText("BUSCAR");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        txtRes.setColumns(20);
        txtRes.setRows(5);
        jScrollPane2.setViewportView(txtRes);

        btnBorra.setText("BORRAR");
        btnBorra.setEnabled(false);
        btnBorra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtIngresarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnBusca))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnBorra)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIngresarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorra)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONSULTAR", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGradoActionPerformed

    }//GEN-LAST:event_txtGradoActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed

        muestra1();
        tipo = 1;
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrincipalActionPerformed

        muestra2();
        tipo = 2;

    }//GEN-LAST:event_rbPrincipalActionPerformed

    private void rbParcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParcialActionPerformed
        muestra3();
    }//GEN-LAST:event_rbParcialActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed

        tipo = cbTipo.getSelectedIndex();
        panel1.setVisible(tipo == 0);
        panel2.setVisible(tipo == 1);
    }//GEN-LAST:event_cbTipoActionPerformed

    private void btnGrabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabaActionPerformed

        int cod = Integer.parseInt(txtCodigo.getText());
        String nom = txtNombre.getText();
        int a_ing = Integer.parseInt(txtIngreso.getText());
        int gr = Integer.parseInt(txtGrado.getText());

        if (tipo == 0) {

            Principal pr = new Principal(cod, nom, a_ing, gr, Integer.parseInt(txtDias.getText()));
            obj.adi_Principal(pr);
        } else {

            Parcial pa = new Parcial(cod, nom, a_ing, gr, Integer.parseInt(txtHoras.getText()));
            obj.adi_Parcial(pa);
        }

        muestra1();
    }//GEN-LAST:event_btnGrabaActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

        int nro = Integer.parseInt(txtIngresarCodigo.getText());
        doc = obj.busca(nro);

        if (doc == null) {

            JOptionPane.showMessageDialog(this, "No existe código");
            return;
        }

        String cad;

        if (doc instanceof Principal) {

            cad = "Principal";

        } else {

            cad = "Parcial";
        }

        txtRes.setText("Tipo: " + cad);
        txtRes.append("\nCódigo: " + doc.getCodp());
        txtRes.append("\nNombre: " + doc.getNomp());
        txtRes.append("\nAño de ingreso: " + doc.getAing());
        txtRes.append("\nGrado: " + doc.getGrado());

        if (doc instanceof Principal) {

            txtRes.append("\nDías: " + ((Principal) doc).getDias());
            txtRes.append("\nNeto: " + ((Principal) doc).neto());
            txtRes.append("\nBonificación: " + ((Principal) doc).bonificacion());
            txtRes.append("\nPago Total: " + ((Principal) doc).pagoPrincipal());

        } else {

            txtRes.append("\nHoras: " + ((Parcial) doc).getHoras());
            txtRes.append("\nPago Total: " + ((Parcial) doc).pagoPacial());

        }

        btnBorra.setEnabled(true);
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnBorraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorraActionPerformed

        obj.borra(doc);
        JOptionPane.showMessageDialog(this, "Registro anulado");
        txtRes.setText("");
        muestra1();

    }//GEN-LAST:event_btnBorraActionPerformed

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed

        txtCodigo.setText("");
        txtDias.setText("");
        txtGrado.setText("");
        txtHoras.setText("");
        txtIngreso.setText("");
        txtNombre.setText("");

    }//GEN-LAST:event_btnLimpiaActionPerformed

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
            java.util.logging.Logger.getLogger(frmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorra;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnGraba;
    private javax.swing.JButton btnLimpia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbTipo;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JRadioButton rbParcial;
    private javax.swing.JRadioButton rbPrincipal;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtIngresarCodigo;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
}
