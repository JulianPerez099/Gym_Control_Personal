package com.mycompany.DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class Database {

  protected Connection conexion;

  private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  private final String DB_URL = "jdbc:mysql://localhost/YOUR_DATABASE_NAME";

  private final String USER = "root";
  private final String PASS = "";

  public void Conectar() throws ClassNotFoundException {
    try {
      conexion = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
      Class.forName(JDBC_DRIVER);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        null,
        "Error al conectarse a la base de datos",
        "Error",
        JOptionPane.ERROR_MESSAGE
      );
      Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public void Cerrar() throws SQLException {
    if (conexion != null) {
      if (!conexion.isClosed()) {
        conexion.close();
      }
    }
  }
}
