package vistas;

import controladores.ControladorUsuario;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Usuario;

public class UsuarioVista extends javax.swing.JFrame {

    public UsuarioVista() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaAlias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CC = new javax.swing.JCheckBox();
        TI = new javax.swing.JCheckBox();
        CE = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cajaDoc = new javax.swing.JTextField();
        cajaContrasenia = new javax.swing.JPasswordField();
        botonactualizar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        cajaNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(219, 152, 33));
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("MISIONTICFLIX");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Demo usuarios");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Apellido");

        cajaApellido.setForeground(new java.awt.Color(204, 204, 204));
        cajaApellido.setText("Ingrese su apellido*");
        cajaApellido.setBorder(null);
        cajaApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaApellidoMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Alias");

        cajaAlias.setForeground(new java.awt.Color(204, 204, 204));
        cajaAlias.setText("Ingrese su alias*");
        cajaAlias.setBorder(null);
        cajaAlias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaAliasMouseClicked(evt);
            }
        });
        cajaAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAliasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Tipo de documento");

        CC.setText("CC");
        CC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCActionPerformed(evt);
            }
        });

        TI.setText("TI");
        TI.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CE.setText("CE");
        CE.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Documento");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Contraseña");

        cajaDoc.setForeground(new java.awt.Color(204, 204, 204));
        cajaDoc.setText("Ingrese su documento*");
        cajaDoc.setBorder(null);
        cajaDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaDocMouseClicked(evt);
            }
        });

        botonactualizar.setBackground(new java.awt.Color(255, 204, 102));
        botonactualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonactualizar.setText("Actualizar");
        botonactualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonactualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonactualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonactualizarMouseExited(evt);
            }
        });
        botonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonactualizarActionPerformed(evt);
            }
        });

        botonBorrar.setBackground(new java.awt.Color(255, 204, 102));
        botonBorrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBorrarMouseExited(evt);
            }
        });
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonCrear.setBackground(new java.awt.Color(255, 204, 102));
        botonCrear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCrear.setText("Crear");
        botonCrear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearMouseExited(evt);
            }
        });
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel10.setText("* Campo obligatorio");

        botonConsultar.setBackground(new java.awt.Color(255, 204, 102));
        botonConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonConsultar.setText("Consultar");
        botonConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonConsultarMouseExited(evt);
            }
        });
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        cajaNombre.setForeground(new java.awt.Color(204, 204, 204));
        cajaNombre.setText("Ingrese su nombre*");
        cajaNombre.setBorder(null);
        cajaNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaNombreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(307, 307, 307)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaNombre)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cajaApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                            .addComponent(cajaAlias)
                                            .addComponent(jSeparator3)
                                            .addComponent(jSeparator5)
                                            .addComponent(jSeparator6))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addComponent(cajaDoc)))
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(botonCrear)
                                .addGap(18, 18, 18)
                                .addComponent(botonConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(botonBorrar)
                                .addGap(18, 18, 18)
                                .addComponent(botonactualizar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cajaApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CC)
                    .addComponent(TI)
                    .addComponent(CE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cajaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cajaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar)
                    .addComponent(botonConsultar)
                    .addComponent(botonCrear)
                    .addComponent(botonactualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaNombreMouseClicked
        if (cajaNombre.getText().equals("Ingrese su nombre*")) {
            cajaNombre.setText("");
            cajaNombre.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_cajaNombreMouseClicked

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        int documento = Integer.parseInt(cajaDoc.getText());
        Usuario usuarioConsultar = ControladorUsuario.consultarUsuario(documento);
        if (usuarioConsultar != null) {
            JOptionPane.showMessageDialog(new JFrame(), "Se consulto el usuario correctamente", "Mensaje de confirmación", JOptionPane.INFORMATION_MESSAGE);
            cajaAlias.setText(usuarioConsultar.getAlias());
            cajaContrasenia.setText(usuarioConsultar.getContrasenia());
            cajaNombre.setText(usuarioConsultar.getNombre());
            cajaApellido.setText(usuarioConsultar.getApellido());
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "No se pudo consultar el usuario", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarMouseExited
        botonConsultar.setBackground(new Color(255, 204, 102));
    }//GEN-LAST:event_botonConsultarMouseExited

    private void botonConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarMouseEntered
        botonConsultar.setBackground(new Color(255, 204, 153));
    }//GEN-LAST:event_botonConsultarMouseEntered

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        boolean enviar = true;
        String alias = cajaAlias.getText();
        String contrasenia = cajaContrasenia.getText();
        String nombre = cajaNombre.getText();
        String apellido = cajaApellido.getText();
        int documento = Integer.parseInt(cajaDoc.getText());
        String tipoDocumento = " ";
        if (CC.isSelected()) {
            tipoDocumento = "CC";
        } else if (TI.isSelected()) {
            tipoDocumento = "TI";
        } else if (CE.isSelected()) {
            tipoDocumento = "CE";
        } else {
            enviar = false;
            JOptionPane.showMessageDialog(new JFrame(), "Selecciona el documento", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (enviar) {
            Usuario usuarioNuevo = ControladorUsuario.crearUsuario(alias, contrasenia, nombre, apellido, documento, tipoDocumento);
            if (usuarioNuevo != null) {
                JOptionPane.showMessageDialog(new JFrame(), "Se creo el usuario", "Mensaje de confirmación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "No se creo el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearMouseExited
        botonCrear.setBackground(new Color(255, 204, 102));
    }//GEN-LAST:event_botonCrearMouseExited

    private void botonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearMouseEntered
        botonCrear.setBackground(new Color(255, 204, 153));
    }//GEN-LAST:event_botonCrearMouseEntered

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int documento = Integer.parseInt(cajaDoc.getText());
        boolean usuarioBorrar = ControladorUsuario.eliminarUsuario(documento);
        if (usuarioBorrar) {
            JOptionPane.showMessageDialog(new JFrame(), "Se eliminó el usuario correctamente", "Mensaje de confirmación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "No se eliminó el usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseExited
        botonBorrar.setBackground(new Color(255, 204, 102));
    }//GEN-LAST:event_botonBorrarMouseExited

    private void botonBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseEntered
        botonBorrar.setBackground(new Color(255, 204, 153));
    }//GEN-LAST:event_botonBorrarMouseEntered

    private void botonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonactualizarActionPerformed
        String alias = cajaAlias.getText();
        String contrasenia = cajaContrasenia.getText();
        String nombre = cajaNombre.getText();
        String apellido = cajaApellido.getText();
        int documento = Integer.parseInt(cajaDoc.getText());
        String tipoDocumento = " ";
        if (CC.isSelected()) {
            tipoDocumento = "CC";
        } else if (TI.isSelected()) {
            tipoDocumento = "TI";
        } else if (CE.isSelected()) {
            tipoDocumento = "CE";
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Selecciona el documento", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Usuario actualizoUsuario = ControladorUsuario.actualizarUsuario(alias, contrasenia, nombre, apellido, documento, tipoDocumento);
        if (actualizoUsuario != null) {
            JOptionPane.showMessageDialog(new JFrame(), "Se actualizó el usuario", "Mensaje de confirmación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "No se actualizó el usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonactualizarActionPerformed

    private void botonactualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonactualizarMouseExited
        botonactualizar.setBackground(new Color(255, 204, 102));
    }//GEN-LAST:event_botonactualizarMouseExited

    private void botonactualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonactualizarMouseEntered
        botonactualizar.setBackground(new Color(255, 204, 153));
    }//GEN-LAST:event_botonactualizarMouseEntered

    private void cajaDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaDocMouseClicked
        if (cajaDoc.getText().equals("Ingrese su documento*")) {
            cajaDoc.setText("");
            cajaDoc.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_cajaDocMouseClicked

    private void CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCActionPerformed

    private void cajaAliasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaAliasMouseClicked
        if (cajaAlias.getText().equals("Ingrese su alias*")) {
            cajaAlias.setText("");
            cajaAlias.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_cajaAliasMouseClicked

    private void cajaApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaApellidoMouseClicked
        if (cajaApellido.getText().equals("Ingrese su apellido*")) {
            cajaApellido.setText("");
            cajaApellido.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_cajaApellidoMouseClicked

    private void cajaAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAliasActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CC;
    private javax.swing.JCheckBox CE;
    private javax.swing.JCheckBox TI;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonactualizar;
    private javax.swing.JTextField cajaAlias;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JPasswordField cajaContrasenia;
    private javax.swing.JTextField cajaDoc;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
