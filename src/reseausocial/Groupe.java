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
public class Groupe {
    private int ID;
    private String nom;
    private ArrayList<Utilisateur> membres;

    public Groupe(int ID, String nom, ArrayList<Utilisateur> membres) {
        this.ID = ID;
        this.nom = nom;
        this.membres = membres;
    }
    
    public Groupe(int ID, String nom) {
        this.ID = ID;
        this.nom = nom;
        this.membres = new ArrayList<>();
    }
    
    public Groupe( String nom) {
        this.ID = (int)(Math.random() * 10);
        this.nom = nom;
        this.membres = new ArrayList<>();
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    public void creerGroupe(Groupe groupe) {
        
    }
    
    public void effacerGroupe(Groupe groupe) {
        
    }
    
    public boolean ajouterMembre(Utilisateur membre) {
        for(int i = 0; i < this.membres.size(); i++)
            if(this.membres.get(i).getID() == membre.getID()){
                return false;
            }
        this.membres.add(membre);
        return false;
    }
    
    public boolean eliminerMembre(Utilisateur membre) {
        for(int i = 0; i < this.membres.size(); i++)
            if(this.membres.get(i).getID() == membre.getID()){
                this.membres.remove(membre);
                return true;
            }
        return false;
    }
}
