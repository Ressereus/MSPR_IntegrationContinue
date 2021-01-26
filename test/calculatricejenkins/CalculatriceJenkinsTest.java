/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricejenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author remsr
 */
public class CalculatriceJenkinsTest {
    
    public CalculatriceJenkinsTest() {
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

    /**
     * Test of main method, of class CalculatriceJenkins.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatriceJenkins.main(args);
        
        CalculatriceJenkins test;
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void TestAddition()
    {
        
        String TextEntree = "3";
        String TextSortie = "2";
        float Valeur1 = Float.parseFloat(TextEntree);
        float Valeur2 = Float.parseFloat(TextSortie);
        Valeur2 = Valeur1 + Valeur2;
        TextSortie = String.format("%f", Valeur2);
        
        assertEquals(5, Valeur2,0.001);
        
    }
    @Test
    public void TestSoustraction()
    {
        String TextEntree = "3";
        String TextSortie = "2";
        float Valeur1 = Float.parseFloat(TextEntree);
        float Valeur2 = Float.parseFloat(TextSortie);
        Valeur2 = Valeur1 - Valeur2;
        TextSortie = String.format("%.01f", Valeur2);
        
        assertEquals(1, Valeur2,0.001);
    }
    @Test
    public void TestMultiplication()
    {
        
        String TextEntree = "3";
        String TextSortie = "2";
        float Valeur1 = Float.parseFloat(TextEntree);
        float Valeur2 = Float.parseFloat(TextSortie);
        Valeur2 = Valeur1 * Valeur2;
        TextSortie = String.format("%.01f", Valeur2);
        
        assertEquals(6, Valeur2,0.001);
    }
    @Test
    public void TestDivision()
    {
        String TextEntree = "25";
        String TextSortie = "5";
        float Valeur1 = Float.parseFloat(TextEntree);
        float Valeur2 = Float.parseFloat(TextSortie);
        Valeur2 = Valeur1 / Valeur2;
        TextSortie = String.format("%.01f", Valeur2);
        
        assertEquals(5, Valeur2,0.001);
    }
    
}
