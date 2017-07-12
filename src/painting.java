
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BL01
 */




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prachi Sharma
 */
public class painting {
    
    public int roomLength , roomWidth , roomHeight , index ;
    public int no_of_Rooms , no_of_Doors , no_of_Windows;
    public int choice,same,number = 1;
    public int flag;
    int doorHeight , doorWidth , windowHeight , windowWidth;
    public double wallArea=0,ceilingArea=0,totalArea=0,qtyreqd=0,costpaint=0,totalCost=0;
    public double doorArea , windowArea;
    public double cost,area;
    Scanner input = new Scanner(System.in);
    public int getInput(){                              //method to get input from user
        System.out.println(" Enter the number of rooms: ");
        no_of_Rooms = input.nextInt();
        System.out.println(" Enter the number of doors: ");
        no_of_Doors = input.nextInt();
        System.out.println(" Enter the number of windows: ");
        no_of_Windows = input.nextInt();
        System.out.println(" Enter the height of the room: "+index);
        roomHeight = input.nextInt();
        for(index=1;index<=no_of_Rooms;index++) {                 //loop to take input again
            
                System.out.println(" Enter the length of the room: "+index);
                roomLength = input.nextInt();  
                
                System.out.println(" Enter the width of the room: "+index);
                roomWidth = input.nextInt();
                calculateAreawalls(roomLength,roomHeight);
                calculateAreaceiling(roomLength,roomWidth);
            }
        flag=1;
            
        System.out.println(" Enter the height of door: ");   
        doorHeight = input.nextInt();
        System.out.println(" Enter the width of door: ");
        doorWidth = input.nextInt();
        calculateAreadoor(doorHeight , doorWidth);
        System.out.println(" Enter the height of window: ");
        windowHeight = input.nextInt();
        System.out.println(" Enter the width of window: ");
        windowWidth = input.nextInt();
            
       
          /*  System.out.println(" Do you want to enter for more rooms?\n Press 1 for Yes or any other character for No\n ");
            choice = input.nextInt();
            if ( choice == 1 ) {
                getInput();
                flag=1;
            }
            else {
                break;
            }
        } */
       
  
         return flag;
 }
    
    public double calculateAreawalls(int roomLength, int roomHeight ){
        
        double tempWall = roomLength * roomHeight;
        wallArea = wallArea + tempWall;
        
       // printArea(wallArea);
        return wallArea;
    } 
    
    public double calculateAreaceiling(int roomLength, int roomWidth ) {
        
        double tempCeiling = roomLength * roomWidth;
        ceilingArea = ceilingArea + tempCeiling;
       
        //printArea(ceilingArea);
        return ceilingArea;
    }
    
     public double calculateAreadoor(int doorHeight , int doorWidth ) {
        
        double tempdoor = doorHeight * doorWidth;
        doorArea = doorArea + tempdoor;
        
        printArea(doorArea);
        return doorArea;
    }
     
      public double calculateAreawindow(int windowHeight , int windowWidth ) {
        
        double tempwindow = windowHeight * windowWidth;
        windowArea = windowArea + tempwindow;
        
        //printArea(windowArea);
        return windowArea;
    }
    
   public double calculatetotalArea() {
       totalArea = ( wallArea + ceilingArea ) - ( doorArea + windowArea );
       printArea(totalArea);
       return totalArea;
   
}
   public double quantityPaint() {
       calculatetotalArea();
       qtyreqd = totalArea/100;     //100sqft requires 1litre of paint
       //printCost(qtyreqd);
       return qtyreqd;
   
}
   
   public double costPaint() {
       quantityPaint();
        costpaint = qtyreqd * 250;   //1litre of paint cost Rs.250
        //printCost(costpaint);
        return costpaint;
   }
   
   
   public double totalCost() {
       costPaint();
       totalCost = totalArea*50;     //labourcost = Rs.50 per sqft
       printCost(totalCost);
       return totalCost;
       
   }
  
   public void printArea(double area) {
       System.out.println(" The area is  "+area);
       
   }
   
    public void printCost(double cost) {
       System.out.println(" The cost is  "+cost);
       
   }
}

   

