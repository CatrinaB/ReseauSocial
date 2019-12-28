/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseausocial;

/**
 *
 * @author Catrina
 */
public class ReseauSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utilisateur u1 = new Utilisateur("Catrina", "abc123");
        Utilisateur u2 = new Utilisateur("aaa", "sss");
        
        u1.seConnecter();
        u2.seConnecter();
        
        //System.out.println(u1.getID());
        //System.out.println(u2.getID());
    }
    
}
