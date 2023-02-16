package com.mycompany.views.vistas;

import com.mycompany.interfaces.DAOrutinas;
import com.mycompany.models.Rutinas;
import com.mycompany.personal_sosa.DAOrutinasImpl;
import java.awt.Color;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class AddTrain extends javax.swing.JPanel {

    boolean isEdition = false;
    Rutinas trainEdition;

    public AddTrain() {
        initComponents();
        InitStyles();
    }

    public AddTrain(Rutinas rutina) throws ParseException {
        initComponents();
        isEdition = true;
        trainEdition = rutina;
        InitStyles();
    }

    private void InitStyles() {
        navtext.putClientProperty("FlatLaf.style", "font: bold 24 $h1.regular.font");
        navtext.setForeground(Color.white);
        jLabel1.setForeground(Color.white);
        jLabel2.setForeground(Color.white);
        jLabel3.setForeground(Color.white);
        NameTrain.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del ejercicio.");
        jTextArea1.putClientProperty("JTextField.placeholderText", "Ingrese una descripcion del ejercicio.");
        NameTrain.setForeground(Color.black);
        TypeTrain.setForeground(Color.black);
        CategoryItems.setForeground(Color.black);
        jTextArea1.setForeground(Color.black);

        if (isEdition) {
            btn_Save.setText("Actualizar");

            if (trainEdition != null) {
                NameTrain.setText(trainEdition.getNombre_Ejercicio());
                CategoryItems.setSelectedItem(trainEdition.getNivel_del_Ejercicio());
                TypeTrain.setSelectedItem(trainEdition.getTipo_de_Ejercicio());
                jTextArea1.setText(trainEdition.getDescripcion_ejercicio());
            }
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

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameTrain = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TypeTrain = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        CategoryItems = new javax.swing.JComboBox<>();
        btn_Save = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        navtext = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(871, 451));
        setMinimumSize(new java.awt.Dimension(871, 451));
        setPreferredSize(new java.awt.Dimension(871, 451));

        bg.setPreferredSize(new java.awt.Dimension(851, 471));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        NameTrain.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NameTrain.setName(""); // NOI18N
        NameTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTrainActionPerformed(evt);
            }
        });
        jPanel1.add(NameTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo de Ejercicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 300, 40));

        TypeTrain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Abdominal", "Bandas Elasticas", "Cardio", "Cuadriceps", "Espalda", "Gluteos", "Pecho", "Triceps", "TRX" }));
        TypeTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeTrainActionPerformed(evt);
            }
        });
        jPanel1.add(TypeTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nivel");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 300, 40));

        CategoryItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Principiante", "Intermedio", "Avanzado" }));
        CategoryItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryItemsActionPerformed(evt);
            }
        });
        jPanel1.add(CategoryItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 40));

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
        jPanel1.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 404, 300, 45));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pexels-eduardo-romero-1886487.jpg"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 450));

        header.setBackground(new java.awt.Color(13, 71, 161));
        header.setPreferredSize(new java.awt.Dimension(744, 150));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navtext.setText("Descripción");
        navtext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.add(navtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 80));

        jScrollPane1.setBorder(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(370, 370, 370))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TypeTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeTrainActionPerformed

    }//GEN-LAST:event_TypeTrainActionPerformed

    private void NameTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTrainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTrainActionPerformed

    private void CategoryItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryItemsActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        //Declaracion de variables
        String ejercicio = NameTrain.getText();
        String tipo = (String) TypeTrain.getSelectedItem();
        String categoria = (String) CategoryItems.getSelectedItem();
        String descripcion = jTextArea1.getText();

        if (TypeTrain.getSelectedItem() == "Seleccione") {
            JOptionPane.showMessageDialog(null, "Indique el tipo de ejercicio.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (CategoryItems.getSelectedItem() == "Seleccione") {
            JOptionPane.showMessageDialog(null, "Indique la categoria.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Rutinas user = isEdition ? trainEdition : new Rutinas();
        user.setNombre_Ejercicio(ejercicio);
        user.setTipo_de_Ejercicio(tipo);
        user.setNivel_del_Ejercicio(categoria);
        user.setDescripcion_ejercicio(descripcion);

        try {
            DAOrutinas dao = new DAOrutinasImpl();
            if (!isEdition) {
                dao.registrar(user);
            } else {
                dao.modificar(user);
            }
            String SuccessMsg = isEdition ? "Actualizado" : "Registrado";

            JOptionPane.showMessageDialog(null, "Ejercicio " + SuccessMsg + " Exitosamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                NameTrain.setText(null);
                CategoryItems.setSelectedItem("Seleccione");
                TypeTrain.setSelectedItem("Seleccione");
                jTextArea1.setText(null);
            }
        } catch (Exception e) {
            String ErrorMsg = isEdition ? "Actualizar" : "Registrar";
            JOptionPane.showMessageDialog(null, "Ocurrio un error al " + ErrorMsg + " el ejercicio", "Advertencia", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btn_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoryItems;
    private javax.swing.JTextField NameTrain;
    private javax.swing.JComboBox<String> TypeTrain;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Save;
    private javax.swing.JPanel header;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel navtext;
    // End of variables declaration//GEN-END:variables
}
