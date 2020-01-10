/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import static junit.framework.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import reseausocial.Utilisateur;



/**
 *
 * @author Catrina
 */
public class TestUtilisateur {
    
    String goodUser, goodUser2, badUser, goodPass, badPass;
    
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
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void loginTest(){
        Utilisateur u1 = new Utilisateur(goodUser, goodPass);
        Utilisateur u2 = new Utilisateur(goodUser2, badPass);
        Utilisateur u3 = new Utilisateur(badUser, goodPass);
        
        assertTrue(u1.seConnecter());
        assertFalse(u2.seConnecter());
        assertFalse(u3.seConnecter());
    }
    
}
