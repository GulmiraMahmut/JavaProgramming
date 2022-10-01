package day16_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
          /*
         ask the user enter there first name
         ask the user enter their last name

         print both name in proper format

         upper case first letter + everything lower case
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next().toLowerCase();
        // firstName = firstName.toLowerCase();
        System.out.println("Enter your last name:");
        String lastName = input.next().toLowerCase();
        // lastName = lastName.toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
