package com.mycompany.personal_sosa;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.views.vistas.SearchAsistencia;
import com.mycompany.views.vistas.Index;
import com.mycompany.views.vistas.SearchReportes;
import com.mycompany.views.vistas.SearchTrain;
import com.mycompany.views.vistas.SearchUsers;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.time.LocalDate;
import javax.swing.JPanel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Dashboard extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Dashboard() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/fitness.png")));
    }

    private void InitStyles() {
        mensaje.putClientProperty("FlatLaf.style", "font: bold $h1.light.font");
        mensaje.setForeground(Color.black);
        navtext.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        navtext.setForeground(Color.white);
        date.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        date.setForeground(Color.white);
        dateText.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        dateText.setForeground(Color.white);
        day.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        day.setForeground(Color.white);
        dayText.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        dayText.setForeground(Color.white);
        Hour.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        Hour.setForeground(Color.white);
        hourText.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        hourText.setForeground(Color.white);
        AppName.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        AppName.setForeground(Color.white);
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        LocalDateTime LocalDate = LocalDateTime.now();
        Locale spanishLocale = new Locale("es", "COL");
        date.setText(now.format(DateTimeFormatter.ofPattern("dd'-'MM'-'yyyy", spanishLocale)));
        day.setText(now.format(DateTimeFormatter.ofPattern("EEEE", spanishLocale)).substring(0, 1).toUpperCase() + now.format(DateTimeFormatter.ofPattern("EEEE", spanishLocale)).substring(1));
        int hours = LocalDate.getHour();
        int minutes = LocalDate.getMinute();
        int seconds = LocalDate.getSecond();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss", spanishLocale);
        String formattedTime = LocalDate.format(formatter);
        Hour.setText(formattedTime);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss", spanishLocale);
                String formattedTime = now.format(formatter);
                Hour.setText(formattedTime);
            }
        }, 0, 1000);  // 1000ms = 1s  
    }

    private void InitContent() {
        ShowPanel(new Index());
    }

    public static void ShowPanel(JPanel p) {
        p.setSize(871, 451);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        AppName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Index = new javax.swing.JButton();
        btn_SearchTrainings = new javax.swing.JButton();
        btn_SearchUsers = new javax.swing.JButton();
        btn_CloseSession = new javax.swing.JButton();
        btn_Asistencia = new javax.swing.JButton();
        btn_Reportes = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        navtext = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        hourText = new javax.swing.JLabel();
        dayText = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Hour = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        header1 = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1141, 670));

        menu.setBackground(new java.awt.Color(13, 71, 161));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        AppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppName.setText("Personal Training");

        btn_Index.setBackground(new java.awt.Color(21, 101, 192));
        btn_Index.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Index.setForeground(new java.awt.Color(255, 255, 255));
        btn_Index.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-outline.png"))); // NOI18N
        btn_Index.setText("Inicio");
        btn_Index.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Index.setBorderPainted(false);
        btn_Index.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Index.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Index.setIconTextGap(15);
        btn_Index.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IndexActionPerformed(evt);
            }
        });

        btn_SearchTrainings.setBackground(new java.awt.Color(21, 101, 192));
        btn_SearchTrainings.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_SearchTrainings.setForeground(new java.awt.Color(255, 255, 255));
        btn_SearchTrainings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchRutina.png"))); // NOI18N
        btn_SearchTrainings.setText("Rutinas");
        btn_SearchTrainings.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_SearchTrainings.setBorderPainted(false);
        btn_SearchTrainings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SearchTrainings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_SearchTrainings.setIconTextGap(15);
        btn_SearchTrainings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchTrainingsActionPerformed(evt);
            }
        });

        btn_SearchUsers.setBackground(new java.awt.Color(21, 101, 192));
        btn_SearchUsers.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_SearchUsers.setForeground(new java.awt.Color(255, 255, 255));
        btn_SearchUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SearchuSER.png"))); // NOI18N
        btn_SearchUsers.setText("Usuarios");
        btn_SearchUsers.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_SearchUsers.setBorderPainted(false);
        btn_SearchUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SearchUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_SearchUsers.setIconTextGap(15);
        btn_SearchUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchUsersActionPerformed(evt);
            }
        });

        btn_CloseSession.setBackground(new java.awt.Color(21, 101, 192));
        btn_CloseSession.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_CloseSession.setForeground(new java.awt.Color(255, 255, 255));
        btn_CloseSession.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teacher-and-open-class-door.png"))); // NOI18N
        btn_CloseSession.setText("Cerrar Sesión");
        btn_CloseSession.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_CloseSession.setBorderPainted(false);
        btn_CloseSession.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CloseSession.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_CloseSession.setIconTextGap(15);
        btn_CloseSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseSessionActionPerformed(evt);
            }
        });

        btn_Asistencia.setBackground(new java.awt.Color(21, 101, 192));
        btn_Asistencia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Asistencia.setForeground(new java.awt.Color(255, 255, 255));
        btn_Asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contrato.png"))); // NOI18N
        btn_Asistencia.setText("Asistencia");
        btn_Asistencia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Asistencia.setBorderPainted(false);
        btn_Asistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Asistencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Asistencia.setIconTextGap(15);
        btn_Asistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AsistenciaActionPerformed(evt);
            }
        });

        btn_Reportes.setBackground(new java.awt.Color(21, 101, 192));
        btn_Reportes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Reportes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pago-por-clic.png"))); // NOI18N
        btn_Reportes.setText("Reportes");
        btn_Reportes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Reportes.setBorderPainted(false);
        btn_Reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Reportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Reportes.setIconTextGap(15);
        btn_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_SearchTrainings, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_Asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_SearchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_Index, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_CloseSession, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_SearchTrainings, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btn_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btn_Asistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btn_SearchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Index, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197)
                .addComponent(btn_CloseSession, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(871, 451));

        navtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navtext.setText("NOMBRE DE USUARIO");
        navtext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        dateText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateText.setText("Fecha Actual:");

        hourText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hourText.setText("Hora:");

        dayText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dayText.setText("Día:");

        date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date.setText("{day}/{month}/{year}");

        Hour.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Hour.setText("{hh:mm:ss a}");
        Hour.setPreferredSize(new java.awt.Dimension(56, 16));

        day.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        day.setText("{dayname}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hourText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dayText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(day, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(navtext, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(871, 451));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        header1.setBackground(new java.awt.Color(255, 255, 255));
        header1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header1MouseDragged(evt);
            }
        });
        header1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header1MousePressed(evt);
            }
        });

        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(header, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE))
                .addGap(8, 8, 8))
            .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IndexActionPerformed
        ShowPanel(new Index());
    }//GEN-LAST:event_btn_IndexActionPerformed

    private void btn_SearchTrainingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchTrainingsActionPerformed
        ShowPanel(new SearchTrain());
    }//GEN-LAST:event_btn_SearchTrainingsActionPerformed

    private void btn_SearchUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchUsersActionPerformed
        ShowPanel(new SearchUsers());
    }//GEN-LAST:event_btn_SearchUsersActionPerformed

    private void btn_AsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AsistenciaActionPerformed
        ShowPanel(new SearchAsistencia());
    }//GEN-LAST:event_btn_AsistenciaActionPerformed

    private void btn_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReportesActionPerformed
        ShowPanel(new SearchReportes());
    }//GEN-LAST:event_btn_ReportesActionPerformed

    private void header1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header1MouseDragged

    private void header1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header1MousePressed

    private void btn_CloseSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseSessionActionPerformed
        int valor = JOptionPane.showConfirmDialog(this, "Cerrar Sesión", "Advetencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_CloseSessionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppName;
    private javax.swing.JLabel Hour;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_Asistencia;
    private javax.swing.JButton btn_CloseSession;
    private javax.swing.JButton btn_Index;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JButton btn_SearchTrainings;
    private javax.swing.JButton btn_SearchUsers;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel day;
    private javax.swing.JLabel dayText;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel hourText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel navtext;
    // End of variables declaration//GEN-END:variables
}
