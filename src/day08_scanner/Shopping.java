package day08_scanner;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the item name");
        String item = input.nextLine();

        System.out.println("What is the item price");
        double price = input.nextDouble();

        System.out.println("How many " + item + " do you want");
        int quantity = input.nextInt();

        String order = "Your total for " + quantity + " " + item + "s + is " + price * quantity;
        System.out.println(order);



    }
}
