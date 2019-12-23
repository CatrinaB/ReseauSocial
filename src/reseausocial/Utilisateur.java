/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseausocial;

import java.util.ArrayList;
import javafx.util.Pair;

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

    
    public Utilisateur(String username, String motDePasse) {
        this.username = username;
        this.motDePasse = motDePasse;
        this.ID = (int)(Math.random() * 10000);
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
    
    public void seConnecter() {
        ArrayList<Pair> users = new ArrayList<>();
        Pair<String, String> p1 = new Pair("Catrina", "abc123");
        Pair<String, String> p2 = new Pair("maria", "12345678");
        Pair<String, String> p3 = new Pair("Mara", "moonmoon");
        users.add(p1);
        users.add(p2);
        users.add(p3);
        
        Pair<String, String> checkUser = new Pair(this.username, this.motDePasse);
        if(users.contains(checkUser))
            System.out.println("good user");
        else
            System.out.println("bad user");
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
