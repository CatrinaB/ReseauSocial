/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseausocial;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mara
 */
public class Post {
    private int ID;
    private Utilisateur utilisateur;
    private Date date;
    private Date heure;
    private Groupe quiPeutVoir;
    private Contenu contenu;
    private ArrayList<Utilisateur> aimePar;

    public Post(int ID, Utilisateur utilisateur, Date date, Date heure, Contenu contenu) {
        this.ID = ID;
        this.utilisateur = utilisateur;
        this.date = date;
        this.heure = heure;
        this.contenu = contenu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHeure() {
        return heure;
    }

    public void setHeure(Date heure) {
        this.heure = heure;
    }

    public Groupe getQuiPeutVoir() {
        return quiPeutVoir;
    }

    public void setQuiPeutVoir(Groupe quiPeutVoir) {
        this.quiPeutVoir = quiPeutVoir;
    }

    public Contenu getContenu() {
        return contenu;
    }

    public void setContenu(Contenu contenu) {
        this.contenu = contenu;
    }

    public ArrayList<Utilisateur> getAimePar() {
        return aimePar;
    }

    public void setAimePar(ArrayList<Utilisateur> aimePar) {
        this.aimePar = aimePar;
    }
    
    public void editerPost(Post post) {
        
    }
    
    public void effacerPost(Post post) { 
        
    } 
    
    public void changerQuiPeutVoir() {
        
    }
    
    public void aimerPost(Utilisateur utilisateur) {
        
    }
}
