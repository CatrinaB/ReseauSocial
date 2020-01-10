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
public class Professeur extends Utilisateur {
    private String departement;

    public Professeur(String departement, int ID, String username, String motDePasse) {
        super(ID, username, motDePasse);
        this.departement = departement;
        super.setType(TypeUtilisateur.PROFESSEUR);
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
    
    @Override
    public String toString(){
        return super.getUsername() + " " + super.getID() + " " +
                super.getMotDePasse() + " " + this.getDepartement();
    }
    
}
