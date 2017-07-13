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
    painting paint;
    
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
         paint=new painting();
        
       
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
      @Test
    public void calculateAreawalls(){
        assertEquals(40,paint.calculateAreawalls(2,3,4),0.1);
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
    
    @Test
    public void calculatetotalArea(){
        paint.wallArea = 5;
         paint.ceilingArea = 4;
         paint.doorArea = 3;
          paint.windowArea = 2;    
        assertEquals(4,paint.calculatetotalArea(),0.1);
    }
      
    @Test
    public void quantityPaint(){
        paint.totalArea = 10;
        assertEquals(0.1,paint.quantityPaint(),0.1);
    } 
    @Test
    public void costPaint(){
        paint.qtyReqd = 5;
        assertEquals(1250,paint.costPaint(),0.1);
    } 
     @Test
    public void totalCost(){
        paint.costPaint = 10;
        paint.totalArea = 4;
        assertEquals(210,paint.totalCost(),0.1);
    } 
    
    
    
}