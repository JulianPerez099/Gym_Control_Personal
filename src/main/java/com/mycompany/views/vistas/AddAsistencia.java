package com.mycompany.views.vistas;

import com.mycompany.interfaces.DAOasistencia;
import com.mycompany.personal_sosa.DAOasistenciaImpl;
import com.mycompany.interfaces.DAOpersonal;
import com.mycompany.personal_sosa.DAOpersonalImpl;
import com.mycompany.interfaces.DAOrutinas;
import com.mycompany.personal_sosa.DAOrutinasImpl;
import com.mycompany.models.Asistencia;
import com.mycompany.models.Personal;
import com.mycompany.models.Rutinas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class AddAsistencia extends javax.swing.JPanel {

    boolean isEdition = false;
    Asistencia personalEdition;

    public AddAsistencia() throws ParseException {
        initComponents();
        InitStyles();
        llenarCombo();
    }

    public AddAsistencia(Asistencia personal) throws ParseException {
        initComponents();
        InitStyles();
        llenarCombo();
        isEdition = true;
        personalEdition = personal;
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
        jLabel8.setForeground(Color.black);
        jLabel9.setForeground(Color.black);
        jLabel10.setForeground(Color.black);
        jLabel21.setForeground(Color.black);
        jLabel41.setForeground(Color.black);
        jLabel42.setForeground(Color.black);
        jLabel43.setForeground(Color.black);
        jLabel21.setForeground(Color.black);
        jLabel22.setForeground(Color.black);
        jLabel23.setForeground(Color.black);
        jLabel24.setForeground(Color.black);
        jLabel25.setForeground(Color.black);
        jLabel26.setForeground(Color.black);
        jLabel35.setForeground(Color.black);
        jLabel36.setForeground(Color.black);
        jLabel37.setForeground(Color.black);
        jLabel38.setForeground(Color.black);
        jLabel39.setForeground(Color.black);
        jLabel40.setForeground(Color.black);
        jLabel41.setForeground(Color.black);
        jLabel42.setForeground(Color.black);
        jLabel43.setForeground(Color.black);
        jLabel44.setForeground(Color.black);
        jLabel45.setForeground(Color.black);
        jLabel46.setForeground(Color.black);
        jLabel47.setForeground(Color.black);
        jLabel48.setForeground(Color.black);
        jLabel49.setForeground(Color.black);
        jLabel50.setForeground(Color.black);
        jLabel51.setForeground(Color.black);
        jLabel52.setForeground(Color.black);
        jLabel53.setForeground(Color.black);
        jLabel54.setForeground(Color.black);
        jLabel55.setForeground(Color.black);
        jLabel56.setForeground(Color.black);
        jLabel57.setForeground(Color.black);
        jLabel58.setForeground(Color.black);
        jLabel59.setForeground(Color.black);
        jLabel60.setForeground(Color.black);
        jLabel61.setForeground(Color.black);
        jLabel62.setForeground(Color.black);
        jLabel63.setForeground(Color.black);
        jLabel64.setForeground(Color.black);
        jLabel65.setForeground(Color.black);
        jLabel66.setForeground(Color.black);
        jLabel67.setForeground(Color.black);
        jLabel68.setForeground(Color.black);
        jLabel69.setForeground(Color.black);
        jLabel70.setForeground(Color.black);
        jLabel71.setForeground(Color.black);
        Usuario.setForeground(Color.black);
        Total.setForeground(Color.black);
        ID.setForeground(Color.black);
        Fecha_de_Entrenamiento.setForeground(Color.black);
        Estado.setForeground(Color.black);

        Ejercicio1.setForeground(Color.black);
        Ejercicio2.setForeground(Color.black);
        Ejercicio3.setForeground(Color.black);
        Ejercicio4.setForeground(Color.black);
        Ejercicio5.setForeground(Color.black);
        Ejercicio16.setForeground(Color.black);
        Ejercicio17.setForeground(Color.black);
        Ejercicio18.setForeground(Color.black);
        Ejercicio19.setForeground(Color.black);
        Ejercicio20.setForeground(Color.black);
        Ejercicio21.setForeground(Color.black);
        Ejercicio22.setForeground(Color.black);
        Ejercicio23.setForeground(Color.black);
        Ejercicio24.setForeground(Color.black);
        Ejercicio25.setForeground(Color.black);
        Tiempo1.setForeground(Color.black);
        Tiempo2.setForeground(Color.black);
        Tiempo3.setForeground(Color.black);
        Tiempo4.setForeground(Color.black);
        Tiempo5.setForeground(Color.black);
        Tiempo16.setForeground(Color.black);
        Tiempo17.setForeground(Color.black);
        Tiempo18.setForeground(Color.black);
        Tiempo19.setForeground(Color.black);
        Tiempo20.setForeground(Color.black);
        Tiempo21.setForeground(Color.black);
        Tiempo22.setForeground(Color.black);
        Tiempo23.setForeground(Color.black);
        Tiempo24.setForeground(Color.black);
        Tiempo25.setForeground(Color.black);
        Repeticiones1.setForeground(Color.black);
        Repeticiones2.setForeground(Color.black);
        Repeticiones3.setForeground(Color.black);
        Repeticiones4.setForeground(Color.black);
        Repeticiones5.setForeground(Color.black);
        Repeticiones6.setForeground(Color.black);
        Repeticiones7.setForeground(Color.black);
        Repeticiones8.setForeground(Color.black);
        Repeticiones9.setForeground(Color.black);
        Repeticiones10.setForeground(Color.black);
        Repeticiones11.setForeground(Color.black);
        Repeticiones12.setForeground(Color.black);
        Repeticiones13.setForeground(Color.black);
        Repeticiones14.setForeground(Color.black);
        Repeticiones15.setForeground(Color.black);
        Series.setForeground(Color.black);
        Series1.setForeground(Color.black);
        Series2.setForeground(Color.black);

        if (isEdition) {
            btn_Save.setText("Actualizar");

            if (personalEdition != null) {
                ID.setSelectedItem(personalEdition.getID_Usuario());
                Fecha_de_Entrenamiento.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(personalEdition.getFecha_de_Entrenamiento()));
                Estado.setSelectedItem(personalEdition.getDebe());
                Total.setText(String.valueOf(personalEdition.getTotal_Deuda()));

                Ejercicio1.setSelectedItem(personalEdition.getEjercicio_1());
                Ejercicio2.setSelectedItem(personalEdition.getEjercicio_2());
                Ejercicio3.setSelectedItem(personalEdition.getEjercicio_3());
                Ejercicio4.setSelectedItem(personalEdition.getEjercicio_4());
                Ejercicio5.setSelectedItem(personalEdition.getEjercicio_5());
                Ejercicio16.setSelectedItem(personalEdition.getEjercicio_6());
                Ejercicio17.setSelectedItem(personalEdition.getEjercicio_7());
                Ejercicio18.setSelectedItem(personalEdition.getEjercicio_8());
                Ejercicio19.setSelectedItem(personalEdition.getEjercicio_9());
                Ejercicio20.setSelectedItem(personalEdition.getEjercicio_10());
                Ejercicio21.setSelectedItem(personalEdition.getEjercicio_11());
                Ejercicio22.setSelectedItem(personalEdition.getEjercicio_12());
                Ejercicio23.setSelectedItem(personalEdition.getEjercicio_13());
                Ejercicio24.setSelectedItem(personalEdition.getEjercicio_14());
                Ejercicio25.setSelectedItem(personalEdition.getEjercicio_15());

                Tiempo1.setSelectedItem(personalEdition.getTiempo_1());
                Tiempo2.setSelectedItem(personalEdition.getTiempo_2());
                Tiempo3.setSelectedItem(personalEdition.getTiempo_3());
                Tiempo4.setSelectedItem(personalEdition.getTiempo_4());
                Tiempo5.setSelectedItem(personalEdition.getTiempo_5());
                Tiempo16.setSelectedItem(personalEdition.getTiempo_6());
                Tiempo17.setSelectedItem(personalEdition.getTiempo_7());
                Tiempo18.setSelectedItem(personalEdition.getTiempo_8());
                Tiempo19.setSelectedItem(personalEdition.getTiempo_9());
                Tiempo20.setSelectedItem(personalEdition.getTiempo_10());
                Tiempo21.setSelectedItem(personalEdition.getTiempo_11());
                Tiempo22.setSelectedItem(personalEdition.getTiempo_12());
                Tiempo23.setSelectedItem(personalEdition.getTiempo_13());
                Tiempo24.setSelectedItem(personalEdition.getTiempo_14());
                Tiempo25.setSelectedItem(personalEdition.getTiempo_15());

                Repeticiones1.setSelectedItem(personalEdition.getRepeticion_1());
                Repeticiones2.setSelectedItem(personalEdition.getRepeticion_2());
                Repeticiones3.setSelectedItem(personalEdition.getRepeticion_3());
                Repeticiones4.setSelectedItem(personalEdition.getRepeticion_4());
                Repeticiones5.setSelectedItem(personalEdition.getRepeticion_5());
                Repeticiones6.setSelectedItem(personalEdition.getRepeticion_6());
                Repeticiones7.setSelectedItem(personalEdition.getRepeticion_7());
                Repeticiones8.setSelectedItem(personalEdition.getRepeticion_8());
                Repeticiones9.setSelectedItem(personalEdition.getRepeticion_9());
                Repeticiones10.setSelectedItem(personalEdition.getRepeticion_10());
                Repeticiones11.setSelectedItem(personalEdition.getRepeticion_11());
                Repeticiones12.setSelectedItem(personalEdition.getRepeticion_12());
                Repeticiones13.setSelectedItem(personalEdition.getRepeticion_13());
                Repeticiones14.setSelectedItem(personalEdition.getRepeticion_14());
                Repeticiones15.setSelectedItem(personalEdition.getRepeticion_15());

                Series.setSelectedItem(personalEdition.getSerie_1());
                Series1.setSelectedItem(personalEdition.getSerie_2());
                Series2.setSelectedItem(personalEdition.getSerie_3());
            }
        }
    }

    private void llenarCombo() {
        try {
            DAOpersonal dao = new DAOpersonalImpl();
            final List<Personal> usuarios = dao.listar("", "");
            for (Personal u : usuarios) {
                int id = u.getID_Usuario();
                ID.addItem(String.valueOf(id));
            }
            ID.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedID = (String) ID.getSelectedItem();
                    int id = Integer.parseInt(selectedID);
                    for (Personal u : usuarios) {
                        if (u.getID_Usuario() == id) {
                            String nombreApellido = u.getNombre_Usuario() + " " + u.getApellido_Usuario();
                            Usuario.setText(nombreApellido);
                            break;
                        }
                    }
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            DAOrutinas dao = new DAOrutinasImpl();
            List<Rutinas> usuarios = dao.listar("", "", "");
            for (Rutinas u : usuarios) {
                Ejercicio1.addItem(u.getNombre_Ejercicio());
                Ejercicio2.addItem(u.getNombre_Ejercicio());
                Ejercicio3.addItem(u.getNombre_Ejercicio());
                Ejercicio4.addItem(u.getNombre_Ejercicio());
                Ejercicio5.addItem(u.getNombre_Ejercicio());
                Ejercicio16.addItem(u.getNombre_Ejercicio());
                Ejercicio17.addItem(u.getNombre_Ejercicio());
                Ejercicio18.addItem(u.getNombre_Ejercicio());
                Ejercicio19.addItem(u.getNombre_Ejercicio());
                Ejercicio20.addItem(u.getNombre_Ejercicio());
                Ejercicio21.addItem(u.getNombre_Ejercicio());
                Ejercicio22.addItem(u.getNombre_Ejercicio());
                Ejercicio23.addItem(u.getNombre_Ejercicio());
                Ejercicio24.addItem(u.getNombre_Ejercicio());
                Ejercicio25.addItem(u.getNombre_Ejercicio());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Fecha_de_Entrenamiento = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Estado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        btn_Cancel = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Ejercicio1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Ejercicio2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Ejercicio3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Ejercicio4 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Ejercicio5 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        Tiempo1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        Tiempo2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        Tiempo3 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        Tiempo4 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        Tiempo5 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        Repeticiones1 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        Repeticiones2 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        Repeticiones3 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        Repeticiones4 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        Repeticiones5 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        Series = new javax.swing.JComboBox<>();
        ImageInfo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        Ejercicio16 = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        Ejercicio17 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        Ejercicio18 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        Ejercicio19 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        Ejercicio20 = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        Tiempo16 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        Tiempo17 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        Tiempo18 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        Tiempo19 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        Tiempo20 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        Repeticiones6 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        Repeticiones7 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        Repeticiones8 = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        Repeticiones9 = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        Repeticiones10 = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        Series1 = new javax.swing.JComboBox<>();
        ImageInfo3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        Ejercicio21 = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        Ejercicio22 = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        Ejercicio23 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        Ejercicio24 = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        Ejercicio25 = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        Tiempo21 = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        Tiempo22 = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        Tiempo23 = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        Tiempo24 = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        Tiempo25 = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        Repeticiones11 = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        Repeticiones12 = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        Repeticiones13 = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        Repeticiones14 = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        Repeticiones15 = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        Series2 = new javax.swing.JComboBox<>();
        ImageInfo4 = new javax.swing.JLabel();
        imagePersonal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(871, 451));
        setMinimumSize(new java.awt.Dimension(871, 451));
        setPreferredSize(new java.awt.Dimension(871, 451));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        ID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 220, 40));

        Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Usuario.setFocusable(false);
        Usuario.setName(""); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        bg.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 200, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 300, 40));

        Fecha_de_Entrenamiento.setBackground(new java.awt.Color(255, 255, 255));
        bg.add(Fecha_de_Entrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pago");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, 40));

        Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Debe", "Pago" }));
        Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoActionPerformed(evt);
            }
        });
        bg.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 40));

        Total.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Total.setName(""); // NOI18N
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        bg.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 100, 40));

        btn_Cancel.setBackground(new java.awt.Color(13, 71, 161));
        btn_Cancel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        btn_Cancel.setText("Cancelar");
        btn_Cancel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Cancel.setBorderPainted(false);
        btn_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cancel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Cancel.setIconTextGap(15);
        bg.add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 404, 160, 45));

        btn_Save.setBackground(new java.awt.Color(13, 71, 161));
        btn_Save.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Save.setForeground(new java.awt.Color(255, 255, 255));
        btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btn_Save.setText("Guardar");
        btn_Save.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Save.setBorderPainted(false);
        btn_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Save.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Save.setIconTextGap(15);
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        bg.add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 404, 140, 45));

        jTabbedPane1.setToolTipText("");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ejercicio 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 135, 40));

        Ejercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio1ActionPerformed(evt);
            }
        });
        jPanel1.add(Ejercicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 135, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ejercicio 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 135, 40));

        Ejercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio2ActionPerformed(evt);
            }
        });
        jPanel1.add(Ejercicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 135, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ejercicio 3");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 135, 40));

        Ejercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio3ActionPerformed(evt);
            }
        });
        jPanel1.add(Ejercicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 135, 40));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ejercicio 4");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 135, 40));

        Ejercicio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio4ActionPerformed(evt);
            }
        });
        jPanel1.add(Ejercicio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 135, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ejercicio 5");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 135, 40));

        Ejercicio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio5ActionPerformed(evt);
            }
        });
        jPanel1.add(Ejercicio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 135, 40));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Tiempo (s)");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 135, 40));

        Tiempo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo1ActionPerformed(evt);
            }
        });
        jPanel1.add(Tiempo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 135, 40));

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Tiempo (s)");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 135, 40));

        Tiempo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo2ActionPerformed(evt);
            }
        });
        jPanel1.add(Tiempo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 135, 40));

        jLabel25.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Tiempo (s)");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 135, 40));

        Tiempo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo3ActionPerformed(evt);
            }
        });
        jPanel1.add(Tiempo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 135, 40));

        jLabel26.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Tiempo (s)");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 135, 40));

        Tiempo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo4ActionPerformed(evt);
            }
        });
        jPanel1.add(Tiempo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 135, 40));

        jLabel35.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Tiempo (s)");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 135, 40));

        Tiempo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo5ActionPerformed(evt);
            }
        });
        jPanel1.add(Tiempo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 135, 40));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Repeticiones");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 135, 40));

        Repeticiones1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones1ActionPerformed(evt);
            }
        });
        jPanel1.add(Repeticiones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 135, 40));

        jLabel36.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Repeticiones");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 135, 40));

        Repeticiones2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones2ActionPerformed(evt);
            }
        });
        jPanel1.add(Repeticiones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 135, 40));

        jLabel37.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Repeticiones");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 135, 40));

        Repeticiones3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones3ActionPerformed(evt);
            }
        });
        jPanel1.add(Repeticiones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 135, 40));

        jLabel38.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Repeticiones");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 135, 40));

        Repeticiones4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones4ActionPerformed(evt);
            }
        });
        jPanel1.add(Repeticiones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 135, 40));

        jLabel39.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Repeticiones");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 135, 40));

        Repeticiones5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones5ActionPerformed(evt);
            }
        });
        jPanel1.add(Repeticiones5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 135, 40));

        jLabel40.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Series");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 60, 40));

        Series.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Series.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeriesActionPerformed(evt);
            }
        });
        jPanel1.add(Series, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 60, 40));

        ImageInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/No Pain No Gain.jpg"))); // NOI18N
        jPanel1.add(ImageInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        jTabbedPane1.addTab("Ejercicio 1 - 5", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Ejercicio 6");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 135, 40));

        Ejercicio16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio16ActionPerformed(evt);
            }
        });
        jPanel2.add(Ejercicio16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 135, 40));

        jLabel41.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Ejercicio 7");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 135, 40));

        Ejercicio17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio17ActionPerformed(evt);
            }
        });
        jPanel2.add(Ejercicio17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 135, 40));

        jLabel42.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Ejercicio 8");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 135, 40));

        Ejercicio18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio18ActionPerformed(evt);
            }
        });
        jPanel2.add(Ejercicio18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 135, 40));

        jLabel43.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Ejercicio 9");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 135, 40));

        Ejercicio19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio19ActionPerformed(evt);
            }
        });
        jPanel2.add(Ejercicio19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 135, 40));

        jLabel44.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Ejercicio 10");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 135, 40));

        Ejercicio20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio20ActionPerformed(evt);
            }
        });
        jPanel2.add(Ejercicio20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 135, 40));

        jLabel45.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Tiempo (s)");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 135, 40));

        Tiempo16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo16ActionPerformed(evt);
            }
        });
        jPanel2.add(Tiempo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 135, 40));

        jLabel46.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Tiempo (s)");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 135, 40));

        Tiempo17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo17ActionPerformed(evt);
            }
        });
        jPanel2.add(Tiempo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 135, 40));

        jLabel47.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Tiempo (s)");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 135, 40));

        Tiempo18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo18ActionPerformed(evt);
            }
        });
        jPanel2.add(Tiempo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 135, 40));

        jLabel48.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Tiempo (s)");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 135, 40));

        Tiempo19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo19ActionPerformed(evt);
            }
        });
        jPanel2.add(Tiempo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 135, 40));

        jLabel49.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Tiempo (s)");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 135, 40));

        Tiempo20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo20ActionPerformed(evt);
            }
        });
        jPanel2.add(Tiempo20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 135, 40));

        jLabel50.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Repeticiones");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 135, 40));

        Repeticiones6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones6ActionPerformed(evt);
            }
        });
        jPanel2.add(Repeticiones6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 135, 40));

        jLabel51.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Repeticiones");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 135, 40));

        Repeticiones7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones7ActionPerformed(evt);
            }
        });
        jPanel2.add(Repeticiones7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 135, 40));

        jLabel52.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Repeticiones");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 135, 40));

        Repeticiones8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones8ActionPerformed(evt);
            }
        });
        jPanel2.add(Repeticiones8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 135, 40));

        jLabel53.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Repeticiones");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 135, 40));

        Repeticiones9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones9ActionPerformed(evt);
            }
        });
        jPanel2.add(Repeticiones9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 135, 40));

        jLabel54.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Repeticiones");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 135, 40));

        Repeticiones10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones10ActionPerformed(evt);
            }
        });
        jPanel2.add(Repeticiones10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 135, 40));

        jLabel55.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Series");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 60, 40));

        Series1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Series1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Series1ActionPerformed(evt);
            }
        });
        jPanel2.add(Series1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 60, 40));

        ImageInfo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/No Pain No Gain.jpg"))); // NOI18N
        jPanel2.add(ImageInfo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        jTabbedPane1.addTab("Ejercicio 6 - 10", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Ejercicio 11");
        jPanel3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 135, 40));

        Ejercicio21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio21ActionPerformed(evt);
            }
        });
        jPanel3.add(Ejercicio21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 135, 40));

        jLabel57.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Ejercicio 12");
        jPanel3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 135, 40));

        Ejercicio22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio22ActionPerformed(evt);
            }
        });
        jPanel3.add(Ejercicio22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 135, 40));

        jLabel58.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Ejercicio 13");
        jPanel3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 135, 40));

        Ejercicio23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio23ActionPerformed(evt);
            }
        });
        jPanel3.add(Ejercicio23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 135, 40));

        jLabel59.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Ejercicio 14");
        jPanel3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 135, 40));

        Ejercicio24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio24ActionPerformed(evt);
            }
        });
        jPanel3.add(Ejercicio24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 135, 40));

        jLabel60.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Ejercicio 15");
        jPanel3.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 135, 40));

        Ejercicio25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejercicio25ActionPerformed(evt);
            }
        });
        jPanel3.add(Ejercicio25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 135, 40));

        jLabel61.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Tiempo (s)");
        jPanel3.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 135, 40));

        Tiempo21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo21ActionPerformed(evt);
            }
        });
        jPanel3.add(Tiempo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 135, 40));

        jLabel62.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Tiempo (s)");
        jPanel3.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 135, 40));

        Tiempo22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo22ActionPerformed(evt);
            }
        });
        jPanel3.add(Tiempo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 135, 40));

        jLabel63.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Tiempo (s)");
        jPanel3.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 135, 40));

        Tiempo23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo23ActionPerformed(evt);
            }
        });
        jPanel3.add(Tiempo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 135, 40));

        jLabel64.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Tiempo (s)");
        jPanel3.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 135, 40));

        Tiempo24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo24ActionPerformed(evt);
            }
        });
        jPanel3.add(Tiempo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 135, 40));

        jLabel65.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Tiempo (s)");
        jPanel3.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 135, 40));

        Tiempo25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        Tiempo25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tiempo25ActionPerformed(evt);
            }
        });
        jPanel3.add(Tiempo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 135, 40));

        jLabel66.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Repeticiones");
        jPanel3.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 135, 40));

        Repeticiones11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones11ActionPerformed(evt);
            }
        });
        jPanel3.add(Repeticiones11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 135, 40));

        jLabel67.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Repeticiones");
        jPanel3.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 135, 40));

        Repeticiones12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones12ActionPerformed(evt);
            }
        });
        jPanel3.add(Repeticiones12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 135, 40));

        jLabel68.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Repeticiones");
        jPanel3.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 135, 40));

        Repeticiones13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones13ActionPerformed(evt);
            }
        });
        jPanel3.add(Repeticiones13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 135, 40));

        jLabel69.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Repeticiones");
        jPanel3.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 135, 40));

        Repeticiones14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones14ActionPerformed(evt);
            }
        });
        jPanel3.add(Repeticiones14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 135, 40));

        jLabel70.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Repeticiones");
        jPanel3.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 135, 40));

        Repeticiones15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Repeticiones15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Repeticiones15ActionPerformed(evt);
            }
        });
        jPanel3.add(Repeticiones15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 135, 40));

        jLabel71.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Series");
        jPanel3.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 60, 40));

        Series2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Series2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Series2ActionPerformed(evt);
            }
        });
        jPanel3.add(Series2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 60, 40));

        ImageInfo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/No Pain No Gain.jpg"))); // NOI18N
        jPanel3.add(ImageInfo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        jTabbedPane1.addTab("Ejercicio 11 - 15", jPanel3);

        bg.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 530, 450));

        imagePersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pexels-leon-ardho-9602285.jpg"))); // NOI18N
        bg.add(imagePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 450));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 450));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 60, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        //Formato para obtener la fecha como tal
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        //Obtener la fecha del Selector de la fecha de nacimiento
        java.util.Date fecha_de_entrenamiento = Fecha_de_Entrenamiento.getDate();

        //Aviso para rellenar la fecha
        if (fecha_de_entrenamiento == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha de entrenamiento", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        String Ejercicio_1 = (String) Ejercicio1.getSelectedItem();
        String Ejercicio_2 = (String) Ejercicio2.getSelectedItem();
        String Ejercicio_3 = (String) Ejercicio3.getSelectedItem();
        String Ejercicio_4 = (String) Ejercicio4.getSelectedItem();
        String Ejercicio_5 = (String) Ejercicio5.getSelectedItem();
        String Ejercicio_6 = (String) Ejercicio16.getSelectedItem();
        String Ejercicio_7 = (String) Ejercicio17.getSelectedItem();
        String Ejercicio_8 = (String) Ejercicio18.getSelectedItem();
        String Ejercicio_9 = (String) Ejercicio19.getSelectedItem();
        String Ejercicio_10 = (String) Ejercicio20.getSelectedItem();
        String Ejercicio_11 = (String) Ejercicio21.getSelectedItem();
        String Ejercicio_12 = (String) Ejercicio22.getSelectedItem();
        String Ejercicio_13 = (String) Ejercicio23.getSelectedItem();
        String Ejercicio_14 = (String) Ejercicio24.getSelectedItem();
        String Ejercicio_15 = (String) Ejercicio25.getSelectedItem();

        String Tiempo_1 = (String) Tiempo1.getSelectedItem();
        String Tiempo_2 = (String) Tiempo2.getSelectedItem();
        String Tiempo_3 = (String) Tiempo3.getSelectedItem();
        String Tiempo_4 = (String) Tiempo4.getSelectedItem();
        String Tiempo_5 = (String) Tiempo5.getSelectedItem();
        String Tiempo_6 = (String) Tiempo16.getSelectedItem();
        String Tiempo_7 = (String) Tiempo17.getSelectedItem();
        String Tiempo_8 = (String) Tiempo18.getSelectedItem();
        String Tiempo_9 = (String) Tiempo19.getSelectedItem();
        String Tiempo_10 = (String) Tiempo20.getSelectedItem();
        String Tiempo_11 = (String) Tiempo21.getSelectedItem();
        String Tiempo_12 = (String) Tiempo22.getSelectedItem();
        String Tiempo_13 = (String) Tiempo23.getSelectedItem();
        String Tiempo_14 = (String) Tiempo24.getSelectedItem();
        String Tiempo_15 = (String) Tiempo25.getSelectedItem();

        String Repeticiones_1 = (String) Repeticiones1.getSelectedItem();
        String Repeticiones_2 = (String) Repeticiones2.getSelectedItem();
        String Repeticiones_3 = (String) Repeticiones3.getSelectedItem();
        String Repeticiones_4 = (String) Repeticiones4.getSelectedItem();
        String Repeticiones_5 = (String) Repeticiones5.getSelectedItem();
        String Repeticiones_6 = (String) Repeticiones6.getSelectedItem();
        String Repeticiones_7 = (String) Repeticiones7.getSelectedItem();
        String Repeticiones_8 = (String) Repeticiones8.getSelectedItem();
        String Repeticiones_9 = (String) Repeticiones9.getSelectedItem();
        String Repeticiones_10 = (String) Repeticiones10.getSelectedItem();
        String Repeticiones_11 = (String) Repeticiones11.getSelectedItem();
        String Repeticiones_12 = (String) Repeticiones12.getSelectedItem();
        String Repeticiones_13 = (String) Repeticiones13.getSelectedItem();
        String Repeticiones_14 = (String) Repeticiones14.getSelectedItem();
        String Repeticiones_15 = (String) Repeticiones15.getSelectedItem();

        String Series_0 = (String) Series.getSelectedItem();
        String Series_1 = (String) Series1.getSelectedItem();
        String Series_2 = (String) Series2.getSelectedItem();

        if (fecha_de_entrenamiento == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha de entrenamiento", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Total.getText().matches("^[0-9]+(\\.[0-9]+)?$")) {
            JOptionPane.showMessageDialog(null, "El Total: " + Total.getText() + " No esta en un Formato Valido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        if (Total.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Indique el Total", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        String Fentrenamiento = formatoFecha.format(fecha_de_entrenamiento);

        int ID_Usuario = Integer.parseInt((String) ID.getSelectedItem());

        String Pago = (String) Estado.getSelectedItem();

        String deudaStr = Total.getText();
        double deuda = Double.parseDouble(deudaStr);

        //Validacion
        Asistencia user = isEdition ? personalEdition : new Asistencia();
        user.setEjercicio_1(Ejercicio_1);
        user.setEjercicio_2(Ejercicio_2);
        user.setEjercicio_3(Ejercicio_3);
        user.setEjercicio_4(Ejercicio_4);
        user.setEjercicio_5(Ejercicio_5);
        user.setEjercicio_6(Ejercicio_6);
        user.setEjercicio_7(Ejercicio_7);
        user.setEjercicio_8(Ejercicio_8);
        user.setEjercicio_9(Ejercicio_9);
        user.setEjercicio_10(Ejercicio_10);
        user.setEjercicio_11(Ejercicio_11);
        user.setEjercicio_12(Ejercicio_12);
        user.setEjercicio_13(Ejercicio_13);
        user.setEjercicio_14(Ejercicio_14);
        user.setEjercicio_15(Ejercicio_15);

        user.setTiempo_1(Tiempo_1);
        user.setTiempo_2(Tiempo_2);
        user.setTiempo_3(Tiempo_3);
        user.setTiempo_4(Tiempo_4);
        user.setTiempo_5(Tiempo_5);
        user.setTiempo_6(Tiempo_6);
        user.setTiempo_7(Tiempo_7);
        user.setTiempo_8(Tiempo_8);
        user.setTiempo_9(Tiempo_9);
        user.setTiempo_10(Tiempo_10);
        user.setTiempo_11(Tiempo_11);
        user.setTiempo_12(Tiempo_12);
        user.setTiempo_13(Tiempo_13);
        user.setTiempo_14(Tiempo_14);
        user.setTiempo_15(Tiempo_15);

        user.setRepeticion_1(Repeticiones_1);
        user.setRepeticion_2(Repeticiones_2);
        user.setRepeticion_3(Repeticiones_3);
        user.setRepeticion_4(Repeticiones_4);
        user.setRepeticion_5(Repeticiones_5);
        user.setRepeticion_6(Repeticiones_6);
        user.setRepeticion_7(Repeticiones_7);
        user.setRepeticion_8(Repeticiones_8);
        user.setRepeticion_9(Repeticiones_9);
        user.setRepeticion_10(Repeticiones_10);
        user.setRepeticion_11(Repeticiones_11);
        user.setRepeticion_12(Repeticiones_12);
        user.setRepeticion_13(Repeticiones_13);
        user.setRepeticion_14(Repeticiones_14);
        user.setRepeticion_15(Repeticiones_15);

        user.setSerie_1(Series_0);
        user.setSerie_2(Series_1);
        user.setSerie_3(Series_2);

        user.setID_Usuario(ID_Usuario);
        user.setDebe(Pago);
        user.setTotal_Deuda(deuda);

        user.setFecha_de_Entrenamiento(Fentrenamiento);
        try {
            DAOasistencia dao = new DAOasistenciaImpl();
            if (!isEdition) {
                dao.registrar(user);
            } else {
                dao.modificar(user);
            }
            String SuccessMsg = isEdition ? "Actualizada" : "Registrada";

            JOptionPane.showMessageDialog(null, "Asistencia " + SuccessMsg + " Exitosamente", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                Fecha_de_Entrenamiento.setDate(null);
                Estado.setSelectedItem(null);
                Total.setText(null);
                Tiempo1.setSelectedItem(null);
                Tiempo2.setSelectedItem(null);
                Tiempo3.setSelectedItem(null);
                Tiempo4.setSelectedItem(null);
                Tiempo5.setSelectedItem(null);
                Tiempo16.setSelectedItem(null);
                Tiempo17.setSelectedItem(null);
                Tiempo18.setSelectedItem(null);
                Tiempo19.setSelectedItem(null);
                Tiempo20.setSelectedItem(null);
                Tiempo21.setSelectedItem(null);
                Tiempo22.setSelectedItem(null);
                Tiempo23.setSelectedItem(null);
                Tiempo24.setSelectedItem(null);
                Tiempo25.setSelectedItem(null);
                Ejercicio1.setSelectedItem(null);
                Ejercicio2.setSelectedItem(null);
                Ejercicio3.setSelectedItem(null);
                Ejercicio4.setSelectedItem(null);
                Ejercicio5.setSelectedItem(null);
                Ejercicio16.setSelectedItem(null);
                Ejercicio17.setSelectedItem(null);
                Ejercicio18.setSelectedItem(null);
                Ejercicio19.setSelectedItem(null);
                Ejercicio20.setSelectedItem(null);
                Ejercicio21.setSelectedItem(null);
                Ejercicio22.setSelectedItem(null);
                Ejercicio23.setSelectedItem(null);
                Ejercicio24.setSelectedItem(null);
                Ejercicio25.setSelectedItem(null);
                Repeticiones1.setSelectedItem(null);
                Repeticiones2.setSelectedItem(null);
                Repeticiones3.setSelectedItem(null);
                Repeticiones4.setSelectedItem(null);
                Repeticiones5.setSelectedItem(null);
                Repeticiones6.setSelectedItem(null);
                Repeticiones7.setSelectedItem(null);
                Repeticiones8.setSelectedItem(null);
                Repeticiones9.setSelectedItem(null);
                Repeticiones10.setSelectedItem(null);
                Repeticiones11.setSelectedItem(null);
                Repeticiones12.setSelectedItem(null);
                Repeticiones13.setSelectedItem(null);
                Repeticiones14.setSelectedItem(null);
                Repeticiones15.setSelectedItem(null);
                Series.setSelectedItem(null);
                Series1.setSelectedItem(null);
                Series2.setSelectedItem(null);
            }
        } catch (Exception e) {
            String ErrorMsg = isEdition ? "Actualizar" : "Registrar";
            JOptionPane.showMessageDialog(null, "Ocurrio un error al " + ErrorMsg + " la asistencia", "Advertencia", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void Ejercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio1ActionPerformed

    private void Ejercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio2ActionPerformed

    private void Ejercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio3ActionPerformed

    private void Ejercicio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio4ActionPerformed

    private void Ejercicio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio5ActionPerformed

    private void Repeticiones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones1ActionPerformed

    private void Tiempo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo1ActionPerformed

    private void Tiempo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo2ActionPerformed

    private void Tiempo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo3ActionPerformed

    private void Tiempo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo4ActionPerformed

    private void Tiempo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo5ActionPerformed

    private void Repeticiones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones2ActionPerformed

    private void Repeticiones3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones3ActionPerformed

    private void Repeticiones4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones4ActionPerformed

    private void Repeticiones5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones5ActionPerformed

    private void SeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeriesActionPerformed

    private void Ejercicio16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio16ActionPerformed

    private void Ejercicio17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio17ActionPerformed

    private void Ejercicio18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio18ActionPerformed

    private void Ejercicio19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio19ActionPerformed

    private void Ejercicio20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio20ActionPerformed

    private void Tiempo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo16ActionPerformed

    private void Tiempo17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo17ActionPerformed

    private void Tiempo18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo18ActionPerformed

    private void Tiempo19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo19ActionPerformed

    private void Tiempo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo20ActionPerformed

    private void Repeticiones6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones6ActionPerformed

    private void Repeticiones7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones7ActionPerformed

    private void Repeticiones8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones8ActionPerformed

    private void Repeticiones9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones9ActionPerformed

    private void Repeticiones10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones10ActionPerformed

    private void Series1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Series1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Series1ActionPerformed

    private void Ejercicio21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio21ActionPerformed

    private void Ejercicio22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio22ActionPerformed

    private void Ejercicio23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio23ActionPerformed

    private void Ejercicio24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio24ActionPerformed

    private void Ejercicio25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejercicio25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ejercicio25ActionPerformed

    private void Tiempo21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo21ActionPerformed

    private void Tiempo22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo22ActionPerformed

    private void Tiempo23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo23ActionPerformed

    private void Tiempo24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo24ActionPerformed

    private void Tiempo25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tiempo25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tiempo25ActionPerformed

    private void Repeticiones11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones11ActionPerformed

    private void Repeticiones12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones12ActionPerformed

    private void Repeticiones13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones13ActionPerformed

    private void Repeticiones14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones14ActionPerformed

    private void Repeticiones15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Repeticiones15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Repeticiones15ActionPerformed

    private void Series2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Series2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Series2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ejercicio1;
    private javax.swing.JComboBox<String> Ejercicio16;
    private javax.swing.JComboBox<String> Ejercicio17;
    private javax.swing.JComboBox<String> Ejercicio18;
    private javax.swing.JComboBox<String> Ejercicio19;
    private javax.swing.JComboBox<String> Ejercicio2;
    private javax.swing.JComboBox<String> Ejercicio20;
    private javax.swing.JComboBox<String> Ejercicio21;
    private javax.swing.JComboBox<String> Ejercicio22;
    private javax.swing.JComboBox<String> Ejercicio23;
    private javax.swing.JComboBox<String> Ejercicio24;
    private javax.swing.JComboBox<String> Ejercicio25;
    private javax.swing.JComboBox<String> Ejercicio3;
    private javax.swing.JComboBox<String> Ejercicio4;
    private javax.swing.JComboBox<String> Ejercicio5;
    private javax.swing.JComboBox<String> Estado;
    private com.toedter.calendar.JDateChooser Fecha_de_Entrenamiento;
    private javax.swing.JComboBox<String> ID;
    private javax.swing.JLabel ImageInfo;
    private javax.swing.JLabel ImageInfo3;
    private javax.swing.JLabel ImageInfo4;
    private javax.swing.JComboBox<String> Repeticiones1;
    private javax.swing.JComboBox<String> Repeticiones10;
    private javax.swing.JComboBox<String> Repeticiones11;
    private javax.swing.JComboBox<String> Repeticiones12;
    private javax.swing.JComboBox<String> Repeticiones13;
    private javax.swing.JComboBox<String> Repeticiones14;
    private javax.swing.JComboBox<String> Repeticiones15;
    private javax.swing.JComboBox<String> Repeticiones2;
    private javax.swing.JComboBox<String> Repeticiones3;
    private javax.swing.JComboBox<String> Repeticiones4;
    private javax.swing.JComboBox<String> Repeticiones5;
    private javax.swing.JComboBox<String> Repeticiones6;
    private javax.swing.JComboBox<String> Repeticiones7;
    private javax.swing.JComboBox<String> Repeticiones8;
    private javax.swing.JComboBox<String> Repeticiones9;
    private javax.swing.JComboBox<String> Series;
    private javax.swing.JComboBox<String> Series1;
    private javax.swing.JComboBox<String> Series2;
    private javax.swing.JComboBox<String> Tiempo1;
    private javax.swing.JComboBox<String> Tiempo16;
    private javax.swing.JComboBox<String> Tiempo17;
    private javax.swing.JComboBox<String> Tiempo18;
    private javax.swing.JComboBox<String> Tiempo19;
    private javax.swing.JComboBox<String> Tiempo2;
    private javax.swing.JComboBox<String> Tiempo20;
    private javax.swing.JComboBox<String> Tiempo21;
    private javax.swing.JComboBox<String> Tiempo22;
    private javax.swing.JComboBox<String> Tiempo23;
    private javax.swing.JComboBox<String> Tiempo24;
    private javax.swing.JComboBox<String> Tiempo25;
    private javax.swing.JComboBox<String> Tiempo3;
    private javax.swing.JComboBox<String> Tiempo4;
    private javax.swing.JComboBox<String> Tiempo5;
    private javax.swing.JTextField Total;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Save;
    private javax.swing.JLabel imagePersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
