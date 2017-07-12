
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Software to estimate the cost of painting
 * @author prachi, radhika, megha
 */

//declaration of class
class Painting {
    int roomLength , roomWidth , roomHeight , index;
    int choice,same,number = 1;
    Scanner input = new Scanner(System.in);
    public void getInput(){                              //method to get input from user
        for(index=1;index<=10;index++) {                 //loop to take input again
            
        System.out.println(" Enter the room details: ");
        System.out.println(" Enter the length of the room: ");
        roomLength = input.nextInt();
        System.out.println(" Enter the width of the room: ");
        roomWidth = input.nextInt();
        System.out.println(" Enter the height of the room: ");
        roomHeight = input.nextInt();
        
       // areaCalculator(roomLength,roomWidth,roomHeight);
       
       System.out.println(" Do you want to enter for more rooms?\n Press 1 for Yes or any other character for No\n ");
       choice = input.nextInt();
       if ( choice == 1 ) {
           getInput();
           }
          
       else {
           break;
       }
    }
}
    
    public void areaCalculator(int roomLength,int roomWidth,int roomHeight){
        
    }
    
}

public class miniproject {
    public static void main(String[] args) {
        Painting paint=new Painting();
        paint.getInput();
        //prachi
}
}
