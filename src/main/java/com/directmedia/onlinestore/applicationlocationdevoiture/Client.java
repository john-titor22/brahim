/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.applicationlocationdevoiture;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class Client {
        private long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String cin;
    
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
     * @return
     */
    public String getCin() {
        return cin;
    }

    /**
     *
     * @param cin
     */
    public void setCin(String cin) {
        this.cin = cin;
    }

    /**
     *
     * @param nom
     * @param prenom
     * @param email
     * @param password
     * @param cin
     */
    public Client( String nom, String prenom, String email, String password, String cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.cin = cin;
    }

    /**
     *
     * @param email
     * @param password
     * @return
     */
    public static boolean authentification(String email,String password){
    
        boolean res= false;

            String sql = "SELECT * FROM `client` WHERE email = '" +email + "' " + "AND password = '" + password + "' ";
            
            System.out.println("req = " + sql);
            
            try {
                 System.out.println("req = " + sql);
                Connection cnx;
                cnx = Singleton.Singleton.getconn();
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

            String sql = "SELECT * FROM `client` WHERE email = '" +email + "' " + "AND password = '" + password + "' ";
            
            System.out.println("req = " + sql);
            
            try {
                 System.out.println("req = " + sql);
                Connection cnx;
                cnx = Singleton.Singleton.getconn();
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

    /**
     *
     * @return
     * @throws SQLException
     * @throws IndexOutOfBoundsException
     */
    public boolean addUser()throws SQLException,IndexOutOfBoundsException{
    boolean res= false;
    
    String sql = "INSERT INTO `client`(`nom` , `prenom`, `email`, `password`, `cin` ) VALUES (?,?,?,?,?)";
        try {
            Connection cnx = Singleton.Singleton.getconn();
            
            PreparedStatement stmt =cnx.prepareStatement(sql);
          
            stmt.setString(1,nom);
            stmt.setString(2,prenom);
            stmt.setString(3,email);
            stmt.setString(4,password);
            stmt.setString(5, cin);

            int rs =stmt.executeUpdate();
            
            if (rs==1){
            res=true;
            }
            
            
        } catch (SQLException e) {
            System.err.println(e);
        }
    return res;
    }


}
