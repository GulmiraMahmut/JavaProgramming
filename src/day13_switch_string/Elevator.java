package day13_switch_string;

import java.util.Scanner;

public class Elevator {
     /*
    add new class Elevator

declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After
getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected
     */
     public static void main(String[] args) {
         /*

       Scanner input = new Scanner(System.in);
         System.out.println("Please enter your floor number: ");
         int inputFloor = input.nextInt();

         if(floor == 1) {
             System.out.println("Lobby, StarBucks, Amazon Pick Up");
         } else if(floor == 2) {
             System.out.println("NASA, Cydeo, Discover");
         }else if(floor == 3) {
             System.out.println("Uber, Lyft, Chase");
         }else if(floor == 1){
                         System.out.println("Rooftop, Lounge");

         }else{
             System.out.println("Invalid Floor Selected");
       }

         */

         int floor =1;
         String companies;

        switch (floor) {
             case 1:
                 companies = "Lobby, StarBucks, Amazon Pick Up";
                 break;

             case 2:
                 companies = "NASA, Cydeo, Discover";
                 break;

             case 3:
                 companies = "NASA, Cydeo, Discover";
                 break;

             case 4:
                 companies = "Rooftop, Lounge";
                 break;

             default:
                companies = (" Invalid Floor Selected");
         }

         System.out.println("Floor " + floor + ": " + companies);


     }
}


