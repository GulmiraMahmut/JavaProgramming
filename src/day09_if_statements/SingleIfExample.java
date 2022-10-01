package day09_if_statements;

import java.util.Scanner;

public class SingleIfExample {
    public static void main(String[] args) {
        if(true){
            System.out.println("Hello");
        }

        System.out.println("break"); // normal print statement, not part of any if

        if(false){
            System.out.println("Bye");
        }

        System.out.println("------------------");

        // int year = 2020; or

        Scanner input = new Scanner((System.in));
        System.out.println("Please enter year number?");
        int year = input.nextInt();

        if(year == 2020 || year == 2021){
            System.out.println("Stay home");
            System.out.println("Wash your hands");
            System.out.println("Social distance");
        }
        System.out.println("------------------");

        double price = 39.99;

        if(price >= 20){
            System.out.println("Free shipping");
        }







    }
}
