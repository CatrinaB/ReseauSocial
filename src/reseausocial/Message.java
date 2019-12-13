/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseausocial;

import java.util.Date;

/**
 *
 * @author Mara
 */
public class Message {
    private int ID;
    private Utilisateur deQui;
    private Utilisateur aQui;
    private Contenu contenu;
    private Date date;
    private Date heure;
    private boolean lu;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Utilisateur getDeQui() {
        return deQui;
    }

    public void setDeQui(Utilisateur deQui) {
        this.deQui = deQui;
    }

    public Utilisateur getaQui() {
        return aQui;
    }

    public void setaQui(Utilisateur aQui) {
        this.aQui = aQui;
    }

    public Contenu getContenu() {
        return contenu;
    }

    public void setContenu(Contenu contenu) {
        this.contenu = contenu;
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

    public boolean isLu() {
        return lu;
    }

    public void setLu(boolean lu) {
        this.lu = lu;
    }
    
    public void envoyerMessage(Utilisateur deQui, Utilisateur aQui, Contenu contenu) {
        
    }
    
    public void recevoirMessage(Utilisateur deQui, Utilisateur aQui, Contenu contenu) {
        
    }
    
    public boolean messageLu(Utilisateur deQui, Utilisateur aQui, Contenu contenu) {
        
        return true;
    }
    
    public void effacerMessage(Utilisateur deQui, Utilisateur aQui, Contenu contenu) {
        
    }
}
