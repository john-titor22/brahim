/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.applicationlocationdevoiture;

import Singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class Admin {
            private long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    
    /**
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param nom
     * @param prenom
     * @param email
     * @param password
     */
    public Admin(String nom, String prenom, String email , String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }

    /**
     *
     * @param email
     * @param password
     * @return
     */
    public static boolean authentification(String email,String password){
    
        boolean res= false;

            String sql = "SELECT * FROM `admin` WHERE email = '" +email + "' " + "AND password = '" + password + "' ";
            
            System.out.println("req = " + sql);
            
            try {
                 System.out.println("req = " + sql);
                Connection cnx;
                cnx = Singleton.getconn();
                PreparedStatement stmt = cnx.prepareStatement(sql);
                
                ResultSet rs = stmt.executeQuery();
                
                if (rs.next()) {
                    res=true;
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
            return res;
    }

    /**
     *
     * @param email
     * @param password
     * @return
     */
    public static int authentification2(String email,String password){
    
        int res= -1;

            String sql = "SELECT * FROM `admin` WHERE email = '" +email + "' " + "AND password = '" + password + "' ";
            
            System.out.println("req = " + sql);
            
            try {
                 System.out.println("req = " + sql);
                Connection cnx;
                cnx = Singleton.getconn();
                PreparedStatement stmt = cnx.prepareStatement(sql);
                
                ResultSet rs = stmt.executeQuery();
                
                if (rs.next()) {
                    res= rs.getInt(1);
                    
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
            return res;
    }
}
