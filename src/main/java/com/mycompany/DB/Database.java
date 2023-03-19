package com.mycompany.DB;

/*

Conecction for MySQL

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 */

 /* Conecction for Access */
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Database {

    /*

Conecction for MySQL


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
     */

 /* Conecction for Access */
    protected Connection conexion;

    private final String JDBC_DRIVER = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String DB_URL = "jdbc:ucanaccess://C:/Users/" + System.getProperty("user.name") + "/Documents/Sosa.accdb";

    private final String USER = "";
    private final String PASS = "";

    public void Conectar() throws ClassNotFoundException {
        try {
            Class.forName(JDBC_DRIVER);
            conexion = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
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
