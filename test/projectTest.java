/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BL01
 */
public class projectTest {
    painting paint=new painting();
    
    public projectTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void getInput() {
         
     
     
     }
      @Test
    public void calculateAreawalls(){
        assertEquals(84,paint.calculateAreawalls(3,4,6),0.1);
    }
    
    @Test
    public void calculateAreaceiling(){
        assertEquals(12,paint.calculateAreaceiling(3,4),0.1);
    }
    
    @Test
    public void calculateAreadoor(){
        paint.no_of_Doors = 4 ;
        assertEquals(32,paint.calculateAreadoor(2,4),0.1);
    }
    
    @Test
    public void calculateAreawindow(){
        paint.no_of_Windows = 4;
        assertEquals(16,paint.calculateAreawindow(2,2),0.1);
    }
    
    /* @Test
    public void calculatetotalArea(){
      
        assertEquals(48,paint.calculatetotalArea(),0.1);
    } */
    
    
    
}
