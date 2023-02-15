/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.personal_sosa;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Login extends javax.swing.JFrame {

  int xMouse, yMouse;

  public Login() {
    initComponents();
    InitStyles();
    setIconImage(
      Toolkit
        .getDefaultToolkit()
        .getImage(getClass().getResource("/fitness.png"))
    );
  }

  private void InitStyles() {
    userTxt.setForeground(Color.black);
    userTxt.putClientProperty(
      "JTextField.placeholderText",
      "Ingrese su Usuario"
    );
    passTxt.setForeground(Color.black);
    passTxt.putClientProperty("JTextField.placeholderText", "********");
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    bg = new javax.swing.JPanel();
    logo = new javax.swing.JLabel();
    logoname = new javax.swing.JLabel();
    citybg = new javax.swing.JLabel();
    header = new javax.swing.JPanel();
    exitBtn = new javax.swing.JPanel();
    exitTxt = new javax.swing.JLabel();
    title = new javax.swing.JLabel();
    userLabel = new javax.swing.JLabel();
    userTxt = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    passLabel = new javax.swing.JLabel();
    passTxt = new javax.swing.JPasswordField();
    jSeparator2 = new javax.swing.JSeparator();
    loginBtn = new javax.swing.JPanel();
    loginBtnTxt = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setLocation(new java.awt.Point(0, 0));
    setLocationByPlatform(true);
    setUndecorated(true);
    setResizable(false);

    bg.setBackground(new java.awt.Color(255, 255, 255));
    bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    logo.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/logo.png"))
    ); // NOI18N
    bg.add(
      logo,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 290, 140)
    );

    logoname.setBackground(new java.awt.Color(255, 255, 255));
    logoname.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
    logoname.setForeground(new java.awt.Color(255, 255, 255));
    logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    logoname.setText("Personal Trainer");
    bg.add(
      logoname,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 250, 290, 20)
    );

    citybg.setBackground(new java.awt.Color(0, 134, 190));
    citybg.setIcon(
      new javax.swing.ImageIcon(getClass().getResource("/city.png"))
    ); // NOI18N
    bg.add(
      citybg,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 0, -1, 500)
    );

    header.setBackground(new java.awt.Color(255, 255, 255));
    header.addMouseMotionListener(
      new java.awt.event.MouseMotionAdapter() {
        public void mouseDragged(java.awt.event.MouseEvent evt) {
          headerMouseDragged(evt);
        }
      }
    );
    header.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
          headerMousePressed(evt);
        }
      }
    );

    exitBtn.setBackground(new java.awt.Color(255, 255, 255));
    exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
    exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    exitTxt.setText("X");
    exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
    exitTxt.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          exitTxtMouseClicked(evt);
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
          exitTxtMouseEntered(evt);
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
          exitTxtMouseExited(evt);
        }
      }
    );

    javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(
      exitBtn
    );
    exitBtn.setLayout(exitBtnLayout);
    exitBtnLayout.setHorizontalGroup(
      exitBtnLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          exitTxt,
          javax.swing.GroupLayout.PREFERRED_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.PREFERRED_SIZE
        )
    );
    exitBtnLayout.setVerticalGroup(
      exitBtnLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          exitTxt,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
    );

    javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
    header.setLayout(headerLayout);
    headerLayout.setHorizontalGroup(
      headerLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          headerLayout
            .createSequentialGroup()
            .addComponent(
              exitBtn,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(0, 800, Short.MAX_VALUE)
        )
    );
    headerLayout.setVerticalGroup(
      headerLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          exitBtn,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
    );

    bg.add(
      header,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40)
    );

    title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
    title.setText("INICIAR SESIÓN");
    bg.add(
      title,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1)
    );

    userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
    userLabel.setText("USUARIO");
    bg.add(
      userLabel,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1)
    );

    userTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
    userTxt.setForeground(new java.awt.Color(204, 204, 204));
    userTxt.setBorder(null);
    userTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    userTxt.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
          userTxtMousePressed(evt);
        }
      }
    );
    bg.add(
      userTxt,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 410, 30)
    );

    jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
    bg.add(
      jSeparator1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 410, 20)
    );

    passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
    passLabel.setText("CONTRASEÑA");
    bg.add(
      passLabel,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1)
    );

    passTxt.setForeground(new java.awt.Color(204, 204, 204));
    passTxt.setBorder(null);
    passTxt.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
          passTxtMousePressed(evt);
        }
      }
    );
    bg.add(
      passTxt,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 410, 30)
    );

    jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
    bg.add(
      jSeparator2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 410, 20)
    );

    loginBtn.setBackground(new java.awt.Color(0, 134, 190));
    loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
    loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
    loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    loginBtnTxt.setText("ENTRAR");
    loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    loginBtnTxt.addMouseListener(
      new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          loginBtnTxtMouseClicked(evt);
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
          loginBtnTxtMouseEntered(evt);
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
          loginBtnTxtMouseExited(evt);
        }
      }
    );

    javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(
      loginBtn
    );
    loginBtn.setLayout(loginBtnLayout);
    loginBtnLayout.setHorizontalGroup(
      loginBtnLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          loginBtnTxt,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          130,
          Short.MAX_VALUE
        )
    );
    loginBtnLayout.setVerticalGroup(
      loginBtnLayout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          loginBtnTxt,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          40,
          Short.MAX_VALUE
        )
    );

    bg.add(
      loginBtn,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, 40)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          bg,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(
          bg,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          javax.swing.GroupLayout.DEFAULT_SIZE,
          Short.MAX_VALUE
        )
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_exitTxtMouseClicked
    System.exit(0);
  } //GEN-LAST:event_exitTxtMouseClicked

  private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_exitTxtMouseEntered
    exitBtn.setBackground(Color.red);
    exitTxt.setForeground(Color.white);
  } //GEN-LAST:event_exitTxtMouseEntered

  private void exitTxtMouseExited(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_exitTxtMouseExited
    exitBtn.setBackground(Color.white);
    exitTxt.setForeground(Color.black);
  } //GEN-LAST:event_exitTxtMouseExited

  private void headerMouseDragged(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_headerMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x - xMouse, y - yMouse);
  } //GEN-LAST:event_headerMouseDragged

  private void headerMousePressed(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_headerMousePressed
    xMouse = evt.getX();
    yMouse = evt.getY();
  } //GEN-LAST:event_headerMousePressed

  private void userTxtMousePressed(java.awt.event.MouseEvent evt) {} //GEN-FIRST:event_userTxtMousePressed //GEN-LAST:event_userTxtMousePressed

  private void passTxtMousePressed(java.awt.event.MouseEvent evt) {} //GEN-FIRST:event_passTxtMousePressed //GEN-LAST:event_passTxtMousePressed

  private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_loginBtnTxtMouseClicked
    try {
      // Verificamos si el usuario, la contraseña y el ID proporcionados son correctos
      DAOloginImpl dao = new DAOloginImpl();
      boolean result = dao.login(userTxt.getText(), passTxt.getText());
      if (result) {
        // Si son correctos, abrimos el formulario Dashboard
        JOptionPane.showMessageDialog(
          null,
          "Bienvenido ",
          "Inicio de Sesión",
          JOptionPane.INFORMATION_MESSAGE
        );
        Dashboard form = new Dashboard();
        form.setVisible(true);
        dispose();
      } else {
        // Si son incorrectos, mostramos un mensaje de error
        JOptionPane.showMessageDialog(
          this,
          "Usuario O Contraseña Incorrectos",
          "Error",
          JOptionPane.ERROR_MESSAGE
        );
        userTxt.setText(null);
        passTxt.setText(null);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  } //GEN-LAST:event_loginBtnTxtMouseClicked

  private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_loginBtnTxtMouseEntered
    loginBtn.setBackground(new Color(0, 156, 223));
  } //GEN-LAST:event_loginBtnTxtMouseEntered

  private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) { //GEN-FIRST:event_loginBtnTxtMouseExited
    loginBtn.setBackground(new Color(0, 134, 190));
  } //GEN-LAST:event_loginBtnTxtMouseExited

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    FlatMaterialLighterIJTheme.setup();

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {
        public void run() {
          new Login().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel bg;
  private javax.swing.JLabel citybg;
  private javax.swing.JPanel exitBtn;
  private javax.swing.JLabel exitTxt;
  private javax.swing.JPanel header;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JPanel loginBtn;
  private javax.swing.JLabel loginBtnTxt;
  private javax.swing.JLabel logo;
  private javax.swing.JLabel logoname;
  private javax.swing.JLabel passLabel;
  private javax.swing.JPasswordField passTxt;
  private javax.swing.JLabel title;
  private javax.swing.JLabel userLabel;
  private javax.swing.JTextField userTxt;
  // End of variables declaration//GEN-END:variables
}
