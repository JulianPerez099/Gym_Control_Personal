/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

/**
 *
 * @author Julian
 */
public class Login {
    private int ID_Login;
    private String UserName;
    private String Password;

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public int getID_Login() {
        return ID_Login;
    }

    public String getPassword() {
        return Password;
    }

    public void setID_Login(int ID_Login) {
        this.ID_Login = ID_Login;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
