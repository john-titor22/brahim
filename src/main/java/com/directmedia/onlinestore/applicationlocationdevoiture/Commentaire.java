/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.directmedia.onlinestore.applicationlocationdevoiture;

/**
 *
 * @author bengh
 */
public class Commentaire {
     private long id;
    private int note;
    private String commentaire;
    private String nomClient;

    public Commentaire(long id, int note, String commentaire, String nomClient) {
        this.id = id;
        this.note = note;
        this.commentaire = commentaire;
        this.nomClient = nomClient;
    }

    public long getId() {
        return id;
    }

    public int getNote() {
        return note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    
   
    
}
