
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
    int roomLength , roomWidth , roomHeight;
    int choice,same,number = 1;
    Scanner input = new Scanner(System.in);
    public void getInput(){         //method to get input from user
        
        System.out.println(" Enter the room details:\n ");
        System.out.println(" Enter the length of the room:\n ");
        roomLength = input.nextInt();
        System.out.println(" Enter the width of the room:\n ");
        roomWidth = input.nextInt();
        System.out.println(" Enter the height of the room:\n ");
        roomHeight = input.nextInt();
        
       // areaCalculator(roomLength,roomWidth,roomHeight);
       
       System.out.println(" Do you want to enter for more rooms?\n Press 1 for Yes or any other character for No\n ");
       choice = input.nextInt();
       if ( choice == 1 ) {
           System.out.println(" If the dimensions of room is same press 1\n");
           same = input.nextInt();
           if ( same == 1 ) {
               number++;
           }
           else {
               getInput();
           }
           
       }
    }
    
}
/* public class miniproject {

    public static void main(String[] args) {
        
        Painting paint=new Painting();
        paint.getInput();
    }
} */