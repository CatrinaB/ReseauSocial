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
public class Fichier {
    private int ID;
    private String nomFichier;

    public Fichier(int ID, String nomFichier) {
        this.ID = ID;
        this.nomFichier = nomFichier;
    }
    
    public Fichier(String nomFichier) {
        this.ID = (int)(Math.random() * 10);
        this.nomFichier = nomFichier;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }
    
    public void getPath() {
        
    }
    
    public void checkExtension() {
        
    }
}
