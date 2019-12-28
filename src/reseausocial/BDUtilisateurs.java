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

/** Etant donné que nous utilisons une seule connecction à la base de données 
 * pour toute l'application, la classe qui représente la connexion sera de type
 * Singleton. Cela signifie que le constructeur sera PRIVÉ, et nous 
 * initialisons seulement une instance de la classe, qui sera crée SEULEMENT si 
 * elle n'existe pas déjà.
 * @author Catrina
 */
public class BDUtilisateurs {
    private static BDUtilisateurs instanceBDUtilisateurs;
    private ArrayList<Utilisateur> utilisateurs;

    private BDUtilisateurs() {
        this.utilisateurs = new ArrayList<>();
        
        Utilisateur u1 = new Utilisateur("Catrina", "abc123");
        Utilisateur u2 = new Utilisateur("maria", "12345678");
        Utilisateur u3 = new Utilisateur("Mara", "moonmoon");
        
        utilisateurs.add(u1);
        utilisateurs.add(u2);
        utilisateurs.add(u3);
    }
    
    public static BDUtilisateurs getInstance(){
        if(instanceBDUtilisateurs == null)
            instanceBDUtilisateurs = new BDUtilisateurs();
        return instanceBDUtilisateurs;
    }
    
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        
    }
    
    public boolean contientUtilisateur(Utilisateur u){
        if(this.utilisateurs.contains(u))
            return true;
        return false;
    }
    
    public void creerAdmin(Admin admin) {
        
    }
    
    public void eliminerAdmin(Admin admin) {
        
    }
    
    public void effacerUtilisateur(int ID) {
        
    }
    
    @Override
    public String toString(){
        String str="";
        for(int i = 0; i < this.utilisateurs.size(); i++)
            str += utilisateurs.get(i).getUsername() +  " ";
        return str;
    }
}
