package day13_switch_string;

import day12_switch.SwitchExample;

import javax.swing.*;
import java.util.Scanner;

public class VendingMachine {
    /*
        vending machine
            snacks
                1
                2
                3
            drinks
                4
                5
                6
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vending Machine. Select the menu you want to see: \n\tSnacks\n\tDrinks");
        String menu = input.next();

        switch(menu){
            case "Snacks":
            System.out.println("Pick the snack number:\n 1)Chips 2)Cookies 3)Pretzels 4)Candy");
            int snackOption = input.nextInt();
            if(snackOption == 1){
                System.out.println("Chips are selected");
            }else if(snackOption == 2){
                System.out.println("Cookies are selected");
            }else if(snackOption == 3){
                System.out.println("Pretzels are selected");
            }else if(snackOption == 4){
                System.out.println("Candy are selected");
            }else{
                System.out.println("Not are valid item");
            }
            break;

            case "Drinks":
                System.out.println("Pick up the drink number: \n 1)Water 2)Fruit Juice 3)Mango Juice 4)Orange Juice");
                int drinkNumber = input.nextInt();

                if(drinkNumber == 1){
                    System.out.println("Water is selected");
                }else if(drinkNumber == 2){
                System.out.println("Fruit Juice is selected");
            }else if(drinkNumber == 3){
                    System.out.println("Mango Juice is selected");
                }else if(drinkNumber == 4){
                    System.out.println("Orange Juice is selected");
                }else{
                    System.out.println("Not a valid item");
                }





        }

    }
}
