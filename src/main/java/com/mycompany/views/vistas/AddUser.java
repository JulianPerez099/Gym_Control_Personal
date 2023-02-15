package com.mycompany.views.vistas;

import com.mycompany.interfaces.DAOpersonal;
import com.mycompany.models.Personal;
import com.mycompany.personal_sosa.DAOpersonalImpl;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class AddUser extends javax.swing.JPanel {

    boolean isEdition = false;
    Personal personalEdition;

    public AddUser() throws ParseException {
        initComponents();
        InitStyles();
    }

    public AddUser(Personal personal) throws ParseException {
        initComponents();
        isEdition = true;
        personalEdition = personal;
        InitStyles();
    }

    private void InitStyles() throws ParseException {
        //Colores de los Labels
        jLabel1.setForeground(Color.black);
        jLabel2.setForeground(Color.black);
        jLabel3.setForeground(Color.black);
        jLabel4.setForeground(Color.black);
        jLabel5.setForeground(Color.black);
        jLabel6.setForeground(Color.black);
        jLabel7.setForeground(Color.black);
        jLabel9.setForeground(Color.black);
        jLabel10.setForeground(Color.black);
        jLabel11.setForeground(Color.black);
        jLabel12.setForeground(Color.black);
        jLabel13.setForeground(Color.black);
        jLabel14.setForeground(Color.black);
        jLabel15.setForeground(Color.black);
        jLabel16.setForeground(Color.black);
        jLabel17.setForeground(Color.black);
        jLabel18.setForeground(Color.black);

        //Colores de los JTextField
        NameUser.setForeground(Color.black);
        LastNameUser.setForeground(Color.black);
        fecha_nacimiento.setForeground(Color.black);
        Contacto.setForeground(Color.black);
        Contacto_emergencia.setForeground(Color.black);
        Objetivo.setForeground(Color.black);
        revision_medica.setForeground(Color.black);
        Tiene_Enfermedades.setForeground(Color.black);
        Tiene_lesiones.setForeground(Color.black);
        Toma_medicamentos.setForeground(Color.black);
        Cual_enfermedad.setForeground(Color.black);
        Cual_medicamento.setForeground(Color.black);
        Cual_lesion.setForeground(Color.black);
        Peso.setForeground(Color.black);
        Talla.setForeground(Color.black);
        Perimetro.setForeground(Color.black);
        IMC.setForeground(Color.black);

        //Texto dentro de los textfield
        NameUser.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del usuario.");
        LastNameUser.putClientProperty("JTextField.placeholderText", "Ingrese el apellido del usuario.");
        fecha_nacimiento.putClientProperty("JDateChooser.placeholderText", "Indique la fecha de nacimiento del usuario.");
        Contacto.putClientProperty("JTextField.placeholderText", "Ingrese el número teléfonico del usuario.");
        Contacto_emergencia.putClientProperty("JTextField.placeholderText", "Ingrese el número teléfonico de emergencia del usuario.");
        Objetivo.putClientProperty("JTextField.placeholderText", "Ingrese el objetivo del usuario.");
        revision_medica.putClientProperty("JDateChooser.placeholderText", "Indique la fecha de la última revisión médica del usuario.");
        Cual_enfermedad.putClientProperty("JTextField.placeholderText", "Ingrese que enfermedad tiene del usuario.");
        Cual_medicamento.putClientProperty("JTextField.placeholderText", "Ingrese que medicamento(s) toma el usuario.");
        Cual_lesion.putClientProperty("JTextField.placeholderText", "Ingrese las lesiones que tiene el usuario.");
        Peso.putClientProperty("JTextField.placeholderText", "Ingrese el peso del usuario.");
        Talla.putClientProperty("JTextField.placeholderText", "Ingrese la talla del usuario.");
        Perimetro.putClientProperty("JTextField.placeholderText", "Ingrese el perimetro del usuario.");

        if (isEdition) {
            btn_Save.setText("Actualizar");

            if (personalEdition != null) {
                NameUser.setText(personalEdition.getNombre_Usuario());
                LastNameUser.setText(personalEdition.getApellido_Usuario());
                fecha_nacimiento.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(personalEdition.getFecha_Nacimiento_Usuario()));
                Contacto.setText(personalEdition.getTelefono_Usuario());
                Contacto_emergencia.setText(personalEdition.getTelefono_Emergencia_Usuario());
                Objetivo.setText(personalEdition.getObjetivo_Usuario());
                revision_medica.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(personalEdition.getUltima_Revision_Medica_Usuario()));
                Tiene_Enfermedades.setSelectedItem(personalEdition.getTiene_Enfermedades_Usuario());
                Tiene_lesiones.setSelectedItem(personalEdition.getTiene_Lesiones_Usuario());
                Toma_medicamentos.setSelectedItem(personalEdition.getConsume_Medicamentos_Usuario());
                Cual_enfermedad.setText(personalEdition.getEnfermedades_Usuario());
                Cual_medicamento.setText(personalEdition.getMedicamentos_Usuario());
                Cual_lesion.setText(personalEdition.getLesiones_Usuario());
                Peso.setText(String.format("%.2f", personalEdition.getPeso_Usuario()).replace(",", "."));
                Talla.setText(String.format("%.2f", personalEdition.getTalla_Usuario()).replace(",", "."));
                Perimetro.setText(String.format("%.2f", personalEdition.getPerimetro_Usuario()).replace(",", "."));
                IMC.setText(String.format("%.2f", personalEdition.getIMC_Usuario()).replace(",", "."));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LastNameUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        revision_medica = new com.toedter.calendar.JDateChooser();
        Peso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Talla = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Perimetro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        IMC = new javax.swing.JTextField();
        btn_Save = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Contacto_emergencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Contacto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Objetivo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Cual_enfermedad = new javax.swing.JTextField();
        Tiene_Enfermedades = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Toma_medicamentos = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Cual_medicamento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Tiene_lesiones = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        Cual_lesion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        imagePersonal = new javax.swing.JLabel();
        ImageInfo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(871, 451));
        setMinimumSize(new java.awt.Dimension(871, 451));
        setPreferredSize(new java.awt.Dimension(871, 451));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre(s)");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        NameUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NameUser.setName(""); // NOI18N
        NameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameUserActionPerformed(evt);
            }
        });
        bg.add(NameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Apellidos(s)");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 300, 40));

        LastNameUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        LastNameUser.setName(""); // NOI18N
        LastNameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameUserActionPerformed(evt);
            }
        });
        bg.add(LastNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha de Nacimiento");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 300, 40));
        bg.add(revision_medica, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 220, 40));

        Peso.setToolTipText("");
        Peso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Peso.setName(""); // NOI18N
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        bg.add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 150, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Peso");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 150, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Talla");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, 40));

        Talla.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Talla.setName(""); // NOI18N
        Talla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TallaActionPerformed(evt);
            }
        });
        bg.add(Talla, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 150, 40));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Perimetro");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 150, 40));

        Perimetro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Perimetro.setName(""); // NOI18N
        Perimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerimetroActionPerformed(evt);
            }
        });
        bg.add(Perimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 150, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("IMC");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 150, 40));

        IMC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        IMC.setFocusable(false);
        IMC.setName(""); // NOI18N
        IMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMCActionPerformed(evt);
            }
        });
        bg.add(IMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 150, 40));

        btn_Save.setBackground(new java.awt.Color(13, 71, 161));
        btn_Save.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(255, 255, 255));
        btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btn_Save.setText("Guardar");
        btn_Save.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Save.setBorderPainted(false);
        btn_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Save.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Save.setIconTextGap(20);
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        bg.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 404, 300, 45));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 10, 450));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Contacto de Emergencia");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 220, 40));

        Contacto_emergencia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Contacto_emergencia.setName(""); // NOI18N
        Contacto_emergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contacto_emergenciaActionPerformed(evt);
            }
        });
        bg.add(Contacto_emergencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 220, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Contacto");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 220, 40));

        Contacto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Contacto.setName(""); // NOI18N
        Contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactoActionPerformed(evt);
            }
        });
        bg.add(Contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 220, 40));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Objetivo");
        bg.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 220, 40));

        Objetivo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Objetivo.setName(""); // NOI18N
        Objetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjetivoActionPerformed(evt);
            }
        });
        bg.add(Objetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 220, 40));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("¿Tiene alguna enfermedad?");
        bg.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 220, 40));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("¿Cúal?");
        bg.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 220, 40));

        Cual_enfermedad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Cual_enfermedad.setName(""); // NOI18N
        Cual_enfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cual_enfermedadActionPerformed(evt);
            }
        });
        bg.add(Cual_enfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 220, 40));

        Tiene_Enfermedades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));
        Tiene_Enfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiene_EnfermedadesActionPerformed(evt);
            }
        });
        bg.add(Tiene_Enfermedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 220, 40));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("¿Consume medicamentos?");
        bg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 220, 40));

        Toma_medicamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));
        Toma_medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toma_medicamentosActionPerformed(evt);
            }
        });
        bg.add(Toma_medicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 220, 40));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("¿Cúal?");
        bg.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 220, 40));

        Cual_medicamento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Cual_medicamento.setName(""); // NOI18N
        Cual_medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cual_medicamentoActionPerformed(evt);
            }
        });
        bg.add(Cual_medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 220, 40));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("¿Ha sufrido alguna lesión?");
        bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 220, 40));

        Tiene_lesiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));
        Tiene_lesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiene_lesionesActionPerformed(evt);
            }
        });
        bg.add(Tiene_lesiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 220, 40));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("¿Cúal?");
        bg.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 220, 40));

        Cual_lesion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Cual_lesion.setName(""); // NOI18N
        Cual_lesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cual_lesionActionPerformed(evt);
            }
        });
        bg.add(Cual_lesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 220, 40));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Última Revisión Medica");
        bg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 220, 40));
        bg.add(fecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 10, 450));

        imagePersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pexels-angela-roma-7319158.jpg"))); // NOI18N
        bg.add(imagePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 450));

        ImageInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1020.jpg"))); // NOI18N
        bg.add(ImageInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 520, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameUserActionPerformed

    private void LastNameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameUserActionPerformed

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoActionPerformed

    private void TallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TallaActionPerformed

    private void PerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerimetroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PerimetroActionPerformed

    private void IMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMCActionPerformed

    private void Contacto_emergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contacto_emergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contacto_emergenciaActionPerformed

    private void ContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactoActionPerformed

    private void ObjetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjetivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ObjetivoActionPerformed

    private void Cual_enfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cual_enfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cual_enfermedadActionPerformed

    private void Tiene_EnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiene_EnfermedadesActionPerformed
        String enfermedades = (String) Tiene_Enfermedades.getSelectedItem();
        if (enfermedades.equals("No")) {
            Cual_enfermedad.setEnabled(false);
            Cual_enfermedad.setText("NO TIENE ENFERMEDADES");
        } else {
            Cual_enfermedad.setEnabled(true);
            Cual_enfermedad.setText("");
        }
    }//GEN-LAST:event_Tiene_EnfermedadesActionPerformed

    private void Toma_medicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toma_medicamentosActionPerformed
        String medicamentos = (String) Toma_medicamentos.getSelectedItem();
        if (medicamentos.equals("No")) {
            Cual_medicamento.setEnabled(false);
            Cual_medicamento.setText("NO TOMA MEDICAMENTOS");
        } else {
            Cual_medicamento.setEnabled(true);
            Cual_medicamento.setText("");
        }
    }//GEN-LAST:event_Toma_medicamentosActionPerformed

    private void Cual_medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cual_medicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cual_medicamentoActionPerformed

    private void Tiene_lesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiene_lesionesActionPerformed
        String lesiones = (String) Tiene_lesiones.getSelectedItem();
        if (lesiones.equals("No")) {
            Cual_lesion.setEnabled(false);
            Cual_lesion.setText("NO TIENE LESIONES");
        } else {
            Cual_lesion.setEnabled(true);
            Cual_lesion.setText("");
        }

    }//GEN-LAST:event_Tiene_lesionesActionPerformed

    private void Cual_lesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cual_lesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cual_lesionActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        //Formato para obtener la fecha como tal
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        //Obtener la fecha del Selector de la fecha de nacimiento
        java.util.Date fechaNacimiento = fecha_nacimiento.getDate();

        //Obtener la fecha del Selector de la fecha de la ultima revision medica
        java.util.Date Rmedica = revision_medica.getDate();

        //Aviso para rellenar la fecha
        if (fechaNacimiento == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha de nacimiento", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (Rmedica == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha de revisión médica", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        //Declaracion de variables
        String nombre = NameUser.getText();
        String apellido = LastNameUser.getText();
        String Fnacimiento = formatoFecha.format(fechaNacimiento);
        String telefono = Contacto.getText();
        String telefonoemergencia = Contacto_emergencia.getText();
        String objetivo = Objetivo.getText();
        String revision = formatoFecha.format(Rmedica);
        String enfermedades = (String) Tiene_Enfermedades.getSelectedItem();
        String lesion = (String) Tiene_lesiones.getSelectedItem();
        String medicamentos = (String) Toma_medicamentos.getSelectedItem();
        String cualenfermedad = Cual_enfermedad.getText();
        String cualmedicamento = Cual_medicamento.getText();
        String cuallesion = Cual_lesion.getText();

        //Aviso si el formato de escritura para el IMC es invalido
        if (!Peso.getText().matches("^[0-9]+(\\.[0-9]+)?$")) {
            JOptionPane.showMessageDialog(null, "El Peso: " + Peso.getText() + " No esta en un Formato Valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (!Talla.getText().matches("^[0-9]+(\\.[0-9]+)?$")) {
            JOptionPane.showMessageDialog(null, "La Talla: " + Talla.getText() + " No esta en un Formato Valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (!Perimetro.getText().matches("^[0-9]+(\\.[0-9]+)?$")) {
            JOptionPane.showMessageDialog(null, "El Perimetro: " + Perimetro.getText() + " No esta en un Formato Valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        if (Tiene_Enfermedades.getSelectedItem() == "Seleccione") {
            JOptionPane.showMessageDialog(null, "Indique si el usuario tiene enfermedades.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Tiene_lesiones.getSelectedItem() == "Seleccione") {
            JOptionPane.showMessageDialog(null, "Indique si el usuario tiene lesiones.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Toma_medicamentos.getSelectedItem() == "Seleccione") {
            JOptionPane.showMessageDialog(null, "Indique si el usuario toma medicamentos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //calcular imc
        String pesoStr = Peso.getText();
        double peso = Double.parseDouble(pesoStr);
        String tallaStr = Talla.getText();
        double talla = Double.parseDouble(tallaStr);
        String perimetroStr = Perimetro.getText();
        double perimetro = Double.parseDouble(perimetroStr);

        double imc = peso / (talla * talla);
        imc = Math.round(imc * 100.0) / 100.0;
        IMC.setText(Double.toString(imc));

        if (Objetivo.getText().isEmpty() || Objetivo.getText() == null) {
            Objetivo.setText("SIN OBJETIVO");
        } else {
            Objetivo.getText();
            //Validacion
            Personal user = isEdition ? personalEdition : new Personal();
            user.setNombre_Usuario(nombre);
            user.setApellido_Usuario(apellido);
            user.setFecha_Nacimiento_Usuario(Fnacimiento);
            user.setPeso_Usuario(peso);
            user.setTalla_Usuario(talla);
            user.setPerimetro_Usuario(perimetro);
            user.setIMC_Usuario(imc);
            user.setTelefono_Usuario(telefono);
            user.setTelefono_Emergencia_Usuario(telefonoemergencia);
            user.setObjetivo_Usuario(objetivo);
            user.setUltima_Revision_Medica_Usuario(revision);
            user.setTiene_Enfermedades_Usuario(enfermedades);
            user.setEnfermedades_Usuario(cualenfermedad);
            user.setConsume_Medicamentos_Usuario(medicamentos);
            user.setMedicamentos_Usuario(cualmedicamento);
            user.setTiene_Lesiones_Usuario(lesion);
            user.setLesiones_Usuario(cuallesion);

            try {
                DAOpersonal dao = new DAOpersonalImpl();
                if (!isEdition) {
                    dao.registrar(user);
                } else {
                    dao.modificar(user);
                }
                String SuccessMsg = isEdition ? "Actualizado" : "Registrado";

                JOptionPane.showMessageDialog(null, "Usuario " + SuccessMsg + " Exitosamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

                if (!isEdition) {
                    NameUser.setText(null);
                    LastNameUser.setText(null);
                    fecha_nacimiento.setDate(null);
                    Contacto.setText(null);
                    Contacto_emergencia.setText(null);
                    Objetivo.setText(null);
                    revision_medica.setDate(null);
                    Tiene_Enfermedades.setSelectedItem("Seleccione");
                    Tiene_lesiones.setSelectedItem("Seleccione");
                    Toma_medicamentos.setSelectedItem("Seleccione");
                    Cual_enfermedad.setText(null);
                    Cual_medicamento.setText(null);
                    Cual_lesion.setText(null);
                    Peso.setText(null);
                    Talla.setText(null);
                    Perimetro.setText(null);
                    IMC.setText(null);
                }
            } catch (Exception e) {
                String ErrorMsg = isEdition ? "Actualizar" : "Registrar";
                JOptionPane.showMessageDialog(null, "Ocurrio un error al " + ErrorMsg + " el usuario", "Advertencia", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contacto;
    private javax.swing.JTextField Contacto_emergencia;
    private javax.swing.JTextField Cual_enfermedad;
    private javax.swing.JTextField Cual_lesion;
    private javax.swing.JTextField Cual_medicamento;
    private javax.swing.JTextField IMC;
    private javax.swing.JLabel ImageInfo;
    private javax.swing.JTextField LastNameUser;
    private javax.swing.JTextField NameUser;
    private javax.swing.JTextField Objetivo;
    private javax.swing.JTextField Perimetro;
    private javax.swing.JTextField Peso;
    private javax.swing.JTextField Talla;
    private javax.swing.JComboBox<String> Tiene_Enfermedades;
    private javax.swing.JComboBox<String> Tiene_lesiones;
    private javax.swing.JComboBox<String> Toma_medicamentos;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Save;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JLabel imagePersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser revision_medica;
    // End of variables declaration//GEN-END:variables
}
