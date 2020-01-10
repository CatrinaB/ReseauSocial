/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.ArrayList;
import static junit.framework.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import reseausocial.CollectionUtilisateurs;
import reseausocial.Etudiant;
import reseausocial.Message;
import reseausocial.Professeur;
import reseausocial.Texte;
import static reseausocial.TypeUtilisateur.ETUDIANT;
import static reseausocial.TypeUtilisateur.PROFESSEUR;
import reseausocial.Utilisateur;

/**
 *
 * @author Catrina
 */
public class TestUtilisateur {
    
    String goodUser, goodUser2, badUser, goodPass, badPass;
    Utilisateur u1, u2, u3;
    CollectionUtilisateurs bd;
    
    public TestUtilisateur() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        goodUser = "Catrina";
        badUser = "Ana";
        goodUser2 = "maria";
        goodPass = "abc123";
        badPass = "nuasta";
        
        bd = CollectionUtilisateurs.getInstance();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void loginTest(){
        Utilisateur t1 = new Utilisateur(goodUser, goodPass);
        Utilisateur t2 = new Utilisateur(goodUser2, badPass);
        Utilisateur t3 = new Utilisateur(badUser, goodPass);
        
        assertTrue(t1.seConnecter());
        assertFalse(t2.seConnecter());
        assertFalse(t3.seConnecter());
    }
    
    @Test
    public void messageTest(){
        Message mess = new Message(12, 3, 1, new Texte("testjunit"));
        
        u3 = bd.getUtilisateur(3);
        u3.envoyerMessage(mess);
        
        u1 = bd.getUtilisateur(1);
        u2 = bd.getUtilisateur(2);
        u3 = bd.getUtilisateur(3);
        
        assertEquals(u1.getMessagesRecus().size(), 1);
        assertEquals(u3.getMessagesEnvoyes().size(), 1);
        assertFalse(u2.getMessagesEnvoyes().size() == 1);
    }
    
    @Test
    public void demandeAmiTest(){
        u1 = bd.getUtilisateur(1);
        
        u1.envoyerDemandeAmi(2);
        u1.envoyerDemandeAmi(3);
        
        u2 = bd.getUtilisateur(2);
        u3 = bd.getUtilisateur(3);
        u1 = bd.getUtilisateur(1);
        
        ArrayList<Integer> al = (ArrayList<Integer>) u1.getDemandesEnvoyes().clone();
        Object[] arr = al.toArray();
        Object[] arr2 = {2, 3};
        
        assertEquals(u2.getDemandesRecues().size(), 1);
        assertEquals(u3.getDemandesRecues().size(), 1);
        assertEquals(u1.getDemandesEnvoyes().size(), 2);
        assertArrayEquals(arr2, arr);
    }
    
    @Test
    public void typeTest(){
        Etudiant e = new Etudiant("1240F", 5, "elev", "paaaroolaaa");
        Professeur p = new Professeur("physique", 8, "prof", "pass");
        
        assertEquals(ETUDIANT,e.getType());
        assertEquals(PROFESSEUR, p.getType());
    }
}
