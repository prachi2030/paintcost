
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
    
    int roomLength , roomWidth , roomHeight , index ;
    int noRooms;
    int choice,same,number = 1;
    public int flag;
    public double wallArea=0,ceilingArea=0,totalArea=0;
    Scanner input = new Scanner(System.in);
    public int getInput(){                              //method to get input from user
        System.out.println(" Enter the number of rooms: ");
        noRooms = input.nextInt();
        for(index=1;index<=noRooms;index++) {                 //loop to take input again
            
                System.out.println(" Enter the length of the room: ");
                roomLength = input.nextInt();  
                System.out.println(" Enter the height of the room: ");
                roomHeight = input.nextInt();
                System.out.println(" Enter the width of the room: ");
                roomWidth = input.nextInt();
                calculateAreawalls(roomLength,roomHeight);
                calculateAreaceiling(roomLength,roomWidth);
            }
            flag=1;
            
       
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
        
        return wallArea;
        
    } 
    
    public double calculateAreaceiling(int roomLength, int roomWidth ){
        
        double tempCeiling = roomLength * roomWidth;
        ceilingArea = ceilingArea + tempCeiling;
        
        return ceilingArea;
    }
    
   public double calculatetotalArea(){
       totalArea = wallArea + ceilingArea;
       return totalArea;
   }
}

   

