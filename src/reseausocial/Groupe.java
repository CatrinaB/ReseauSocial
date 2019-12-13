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
    
    public void ajouterMembre(Utilisateur membre) {
        
    }
    
    public void eliminerMembre(Utilisateur membre) {
        
    }
}
