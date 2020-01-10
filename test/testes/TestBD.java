/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import reseausocial.CollectionUtilisateurs;
import reseausocial.Utilisateur;

/**
 *
 * @author Catrina
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestBD {
    
    CollectionUtilisateurs bd;
    
    public TestBD() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        bd = CollectionUtilisateurs.getInstance();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void containsTest(){
        Utilisateur u1 = new Utilisateur("Mara", "moonmoon");
        Utilisateur u2 = new Utilisateur("Mirela", "5584llE");
        
        assertTrue(bd.contientUtilisateur(u1));
        assertFalse(bd.contientUtilisateur(u2));
    }
    
    @Test
    public void ajouterUtilisateurTest(){
        Utilisateur u1 = new Utilisateur("Mara", "moonmoon");
        Utilisateur u2 = new Utilisateur("Mara", "5584llE");
        Utilisateur u3 = new Utilisateur(2, "Cineva", "nou");
        Utilisateur u4 = new Utilisateur(4, "Alta", "persoana");
        
        assertFalse(bd.ajouterUtilisateur(u1));
        assertFalse(bd.ajouterUtilisateur(u2));
        assertFalse(bd.ajouterUtilisateur(u3));
        assertTrue(bd.ajouterUtilisateur(u4));
        
        assertEquals(bd.getBDSize(), 4);
    }
    
    @Test
    public void getUtilisateurTest() {
        Utilisateur u = bd.getUtilisateur(2);
        Utilisateur check = new Utilisateur(2, "maria", "12345678");
        
        assertEquals(check, u);
    }
    
    @Test
    public void effacerTest(){
        assertTrue(bd.effacerUtilisateur(3));
        assertFalse(bd.effacerUtilisateur(9));
    }
}
