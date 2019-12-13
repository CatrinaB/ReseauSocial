/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseausocial;

import java.util.ArrayList;

/**
 *
 * @author Mara
 */
public class Utilisateur {
    private int ID;
    private String username;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String telephone;
    private String adresse;
    private ArrayList<Utilisateur> amis;
    private String type;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Utilisateur> getAmis() {
        return amis;
    }

    public void setAmis(ArrayList<Utilisateur> amis) {
        this.amis = amis;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void seConnecter(String username, String motDePasse) {
        
    }
    
    public void seDeconnecter() {
        
    }
    
    public void changerMotDePasse(String username, String ancienMotDePasse, String nouveauMotDePasse) {
        
    }
    
    public void editInfo(Utilisateur utilisateur) {
        
    }
    
    public void voirInfo(Utilisateur utilisateur) { 
        
    }
    
    public void envoyerDemandeAmi(Utilisateur utilisateur) {
        
    }
    
    public void changerPhotoProfil() {
        
    }
}
