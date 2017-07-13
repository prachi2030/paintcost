
import java.util.Scanner;


/**
 *Software for estimation of cost for painting 
 * @author Prachi,radhika,megha
 */
public class painting {
   //Assuming all dimensions in square feet
    public int roomLength, roomWidth, roomHeight, index = 1;
    public int no_of_Rooms, no_of_Doors, no_of_Windows;
    public int choice, same, number = 1;
    public int doorHeight, doorWidth, windowHeight, windowWidth;
    public int flag;
    
    public double wallArea = 0, ceilingArea = 0, totalArea = 0, qtyPaint = 0, costPaint = 0, totalCost = 0;
    public double doorArea, windowArea;
    public double cost, area;
    
    double feet = 100;                                             // assuming 100 feet = 1 litre
    double cost_of_Paint = 250;                                    // assuming 1 litre of paint costs Rs.250
    double labourCharge = 50;                                       //assuming labourcost = Rs.50 per sqft
    
    Scanner input = new Scanner(System.in);

    public int getInput() {                                                  //method to get input from user
        
        System.out.println(" Enter the number of rooms: ");
        no_of_Rooms = input.nextInt();
        System.out.println(" Enter the number of doors: ");
        no_of_Doors = input.nextInt();
        System.out.println(" Enter the number of windows: ");
        no_of_Windows = input.nextInt();
        System.out.println(" Enter the height of the room");
        roomHeight = input.nextInt();
        
        for (index = 1; index <= no_of_Rooms; index++) {                     //loop to take input 

            System.out.println(" Enter the length of the room" + index);
            roomLength = input.nextInt();

            System.out.println(" Enter the width of the room" + index);
            roomWidth = input.nextInt();
            calculateAreawalls(roomLength, roomWidth, roomHeight);
            calculateAreaceiling(roomLength, roomWidth);
        }
        
        flag = 1;

        System.out.println(" Enter the height of door: ");
        doorHeight = input.nextInt();
        System.out.println(" Enter the width of door: ");
        doorWidth = input.nextInt();
        calculateAreadoor(doorHeight, doorWidth);             //function call
        System.out.println(" Enter the height of window: ");
        windowHeight = input.nextInt();
        System.out.println(" Enter the width of window: ");
        windowWidth = input.nextInt();
        
        
        calculateAreawindow(windowHeight, windowWidth);      //function call
        calculatetotalArea();
        quantityPaint();
        costPaint();
        totalCost();                                         //function call

        return flag;
    }

    public double calculateAreawalls(int roomLength, int roomWidth, int roomHeight) {   //function for calculating area of walls
            
        // considering rectangular rooms 
        
        double temp1 = 2 * ( roomLength + roomWidth) * roomHeight;                            // area of the other 2 shorter walls 
        wallArea = wallArea + temp1 ;
        
        return wallArea;                                                  //returns the area of walls
    }

    public double calculateAreaceiling(int roomLength, int roomWidth) {   //function for calculating area of ceiling

        double tempCeiling = roomLength * roomWidth;
        ceilingArea = ceilingArea + tempCeiling;
        
        return ceilingArea;                                                //returns the area of ceiling
    }

    public double calculateAreadoor(int doorHeight, int doorWidth) {     //function for calculating area of door

        double tempdoor = no_of_Doors * doorHeight * doorWidth;
        doorArea = doorArea + tempdoor;
        
       // printArea(doorArea);
        return doorArea;                                                 //returns the area of door
    }

    public double calculateAreawindow(int windowHeight, int windowWidth) {     //function for calculating area of window

        double tempwindow = no_of_Windows * windowHeight * windowWidth;
        windowArea = windowArea + tempwindow;
        
        return windowArea;                                                       //returns the area of window
    }

    public double calculatetotalArea() {        //function for calculating total area
        
        totalArea = ( (wallArea + ceilingArea) - (doorArea + windowArea) ) ;
        printArea(totalArea);
        
        return totalArea;

    }

    public double quantityPaint() {

        qtyPaint = totalArea / feet;     //100sqft requires 1litre of paint
        return qtyPaint ;                //returns the quantity of paint

    }

    public double costPaint() {

        costPaint = qtyPaint * cost_of_Paint ;   // assuming 1 litre of paint costs Rs.250
        //printCost(costpaint);
        
        return costPaint;               //returns the cost of paint
    }

    public double totalCost() {         //function for calculating totalcost of painting

        totalCost = costPaint + totalArea * labourCharge ;    
        printCost(totalCost);
        
        return totalCost;                //returns total cost estimated

    }

    public void printArea(double area) {             //function for printing area
        
        System.out.println(" The  Total area is  " + area);

    }

    public void printCost(double cost){                 //function for printing of totalcost
        
        System.out.println(" The  Total cost required for painting is " + cost);
        

    }
}
