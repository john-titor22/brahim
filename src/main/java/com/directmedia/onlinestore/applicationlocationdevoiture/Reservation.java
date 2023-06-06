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
public class Reservation {
    private long id;
    private String marqueVoiture, modeleVoiture, couleurVoiture, nomClient,dateDebut,dateFin,date;
    private boolean valide;

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
    public String getMarqueVoiture() {
        return marqueVoiture;
    }

    /**
     *
     * @param marqueVoiture
     */
    public void setMarqueVoiture(String marqueVoiture) {
        this.marqueVoiture = marqueVoiture;
    }

    /**
     *
     * @return
     */
    public String getModeleVoiture() {
        return modeleVoiture;
    }

    /**
     *
     * @param modeleVoiture
     */
    public void setModeleVoiture(String modeleVoiture) {
        this.modeleVoiture = modeleVoiture;
    }

    /**
     *
     * @return
     */
    public String getCouleurVoiture() {
        return couleurVoiture;
    }

    /**
     *
     * @param couleurVoiture
     */
    public void setCouleurVoiture(String couleurVoiture) {
        this.couleurVoiture = couleurVoiture;
    }

    /**
     *
     * @return
     */
    public String getNomClient() {
        return nomClient;
    }

    /**
     *
     * @param nomClient
     */
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    /**
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    /**
     *
     * @return
     */
    public boolean isValide() {
        return valide;
    }

    /**
     *
     * @param valide
     */
    public void setValide(boolean valide) {
        this.valide = valide;
    }

    /**
     *
     * @param marqueVoiture
     * @param modeleVoiture
     * @param couleurVoiture
     * @param nomClient
     * @param date
     * @param valide
     */
    public Reservation(String marqueVoiture, String modeleVoiture, String couleurVoiture, String nomClient, String date, boolean valide) {
        this.marqueVoiture = marqueVoiture;
        this.modeleVoiture = modeleVoiture;
        this.couleurVoiture = couleurVoiture;
        this.nomClient = nomClient;
        this.date = date;
        this.valide = valide;
    }

   
    
    
}
