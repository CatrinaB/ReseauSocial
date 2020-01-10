/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseausocial;

/**
 *
 * @author Mara
 */
public class Etudiant extends Utilisateur {
    private int ID;
    private String groupe;

    public Etudiant(String groupe, int ID, String username, String motDePasse) {
        super(ID, username, motDePasse);
        this.groupe = groupe;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }
    
}
