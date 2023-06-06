/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.applicationlocationdevoiture;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class Voiture {
    private long id;
    private String marque,modele,couleur;

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
    public String getModele() {
        return modele;
    }

    /**
     *
     * @param modele
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     *
     * @return
     */
    public String getMarque() {
        return marque;
    }

    /**
     *
     * @param marque
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     *
     * @return
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     *
     * @param couleur
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     *
     * @param marque
     * @param modele
     * @param couleur
     */
    public Voiture( String marque, String modele, String couleur) {
       this.marque = marque;
       this.modele = modele;  
       this.couleur = couleur;
    }

    /**
     *
     * @return
     * @throws SQLException
     * @throws IndexOutOfBoundsException
     */
    public boolean addVoiture()throws SQLException,IndexOutOfBoundsException{
    boolean res= false;
    
    String sql = "INSERT INTO `voiture`(`marque` , `modele`, `couleur`) VALUES (?,?,?)";
        try {
            Connection cnx = Singleton.Singleton.getconn();
            
            PreparedStatement stmt =cnx.prepareStatement(sql);
          
               
            stmt.setString(1,marque);
            stmt.setString(2,modele);
            stmt.setString(3,couleur);
         

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
