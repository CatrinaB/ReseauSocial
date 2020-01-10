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
    private ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
        
    Utilisateur u1 = new Utilisateur(1, "Catrina", "abc123");
    Utilisateur u2 = new Utilisateur(2, "maria", "12345678");
    Utilisateur u3 = new Utilisateur(3, "Mara", "moonmoon");


    private BDUtilisateurs() {
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
    
    public Utilisateur getUtilisateur(int ID){
        for(int i = 0; i < this.utilisateurs.size(); i++){
            if (this.utilisateurs.get(i).getID() == ID)
                return this.utilisateurs.get(i);
        }
        return null;
    }
    
    public void updateUtilisateur(Utilisateur u) {
        for(int i = 0; i < this.utilisateurs.size(); i++){
            if (this.utilisateurs.get(i).getID() == u.getID())
                this.utilisateurs.get(i).editInfo(u);
        }
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
        ArrayList<Message> messRec, messEnv;
        for(int i = 0; i < this.utilisateurs.size(); i++){
            str += utilisateurs.get(i).getUsername() +  "\n";//System.out.println(str);
            messRec = (ArrayList<Message>) utilisateurs.get(i).getMessagesRecus().clone();
            for (int j = 0; j < messRec.size(); j++){
                str += "recu " + messRec.get(j).toString();
            }
            messEnv = (ArrayList<Message>) utilisateurs.get(i).getMessagesEnvoyes().clone();
            for (int j = 0; j < messEnv.size(); j++){
                str += "envoye " + messEnv.get(j).toString();
            }
        }
        return str;
    }
}
