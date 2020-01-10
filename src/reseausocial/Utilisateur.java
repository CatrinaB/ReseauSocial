/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseausocial;

import java.util.ArrayList;
import java.util.Objects;

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

    
    public Utilisateur(int ID, String username, String motDePasse) {
        this.username = username;
        this.motDePasse = motDePasse;
        this.ID = ID;
    }
    
    public Utilisateur(String username, String motDePasse) {
        this.username = username;
        this.motDePasse = motDePasse;
        this.ID = (int)(Math.random() * 10);
    }

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
    
    public boolean seConnecter() {
        BDUtilisateurs baseDonnees = BDUtilisateurs.getInstance();
        
        if(baseDonnees.contientUtilisateur(this)){
            System.out.println("Bienvenu(e), " + this.username + "!");
            return true;
        }
        else
            System.out.println("Desolée, vous n'avez encore un compte. S'il "
                    + "vous plaît contactez votre chef d'année pour résoudre "
                    + "le problème.");
        return false;
    }
    
    public void seDeconnecter() {
        
    }
    
    public void changerMotDePasse(String username, String ancienMotDePasse, String nouveauMotDePasse) {
        
    }
    
    public void editInfo(Utilisateur utilisateur) {
        this.setUsername(utilisateur.username);
        this.setAdresse(utilisateur.adresse);
        this.setAmis(utilisateur.amis);
        this.setEmail(utilisateur.email);
        this.setMotDePasse(utilisateur.motDePasse);
        this.setNom(utilisateur.nom);
        this.setPrenom(utilisateur.prenom);
        this.setTelephone(utilisateur.telephone);
        this.setType(utilisateur.type);
    }
    
    public void voirInfo(Utilisateur utilisateur) { 
        
    }
    
    public void envoyerDemandeAmi(Utilisateur utilisateur) {
        
    }
    
    public void changerPhotoProfil() {
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.motDePasse, other.motDePasse)) {
            return false;
        }
        return true;
    }
    
    
}
