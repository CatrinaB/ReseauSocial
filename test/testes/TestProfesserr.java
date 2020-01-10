/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import reseausocial.Professeur;

/**
 *
 * @author Catrina
 */
public class TestProfesserr {
    
    public TestProfesserr() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void setTest(){
        Professeur p = new Professeur("departament", 12, "Nume", "Parola");
        
        p.setID(88);
        assertEquals(88, p.getID());
        
        p.setDepartement("mathematique");
        assertEquals("mathematique", p.getDepartement());
        
        p.setUsername("Profesor");
        assertEquals("Profesor", p.getUsername());
        
        p.setMotDePasse("ParolaNoua");
        assertEquals("ParolaNoua", p.getMotDePasse());
        
        assertEquals(new Professeur("mathematique", 88, "Profesor", "ParolaNoua"), p);
    }
}
