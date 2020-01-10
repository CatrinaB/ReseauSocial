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
public class Admin {
    private int ID;
    private BDUtilisateurs conn = BDUtilisateurs.getInstance();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void ajouterProfesseur(Professeur professeur) {
        conn.ajouterUtilisateur(professeur);
    }
    
    public void ajouterEtudiant(Etudiant etudiant) {
        conn.ajouterUtilisateur(etudiant);
    }
    
    public void creerAdmin(Admin admin) {
        
    }
    
    public void eliminerAdmin(int ID) {
        
    }
    
    public void effacerProfesseur(int ID) {
        conn.effacerUtilisateur(ID);
    }
    
    public void effacerEtudiant(int ID) {
        conn.effacerUtilisateur(ID);
    }
}
