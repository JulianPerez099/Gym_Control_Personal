/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personal_sosa;

import com.mycompany.DB.Database;
import com.mycompany.interfaces.DAOlogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Julian
 */
public class DAOloginImpl extends Database implements DAOlogin {

    @Override
    public boolean login(String User, String Password) throws Exception {
        PreparedStatement pst = null;
        ResultSet rs = null;
        this.Conectar();
        String Query = "SELECT * FROM login WHERE User = ? AND Password = ?";
        try {
            pst = conexion.prepareStatement(Query);
            pst.setString(1, User);
            pst.setString(2, Password);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

}
