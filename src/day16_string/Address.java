package day16_string;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        /*
    create a class Address
ask the user to enter their address as one input
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters
	houses that have a house number starting with the numbers 500 are on the right side of the street
	 while the address that start with the number 600 are on the left side of the street
	 they are on is given in the address
		print the street by checking for these streets:
			drive: house on drive
			lane: house on lane
			ave: house on avenue
	Ex:
		Input:
			500312 road w drive, 98404
		Output:
			500312 ROAD W DRIVE, 98404
			house on the right side
			house on drive
	Ex:
		Input:
			600134 South lane, 500415
		Output:
			600134 SOUTH LANE, 500415
			house on the left side
			house on lane
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your address:");
        String address = input.nextLine();
        address = address.toUpperCase();
        address = address.trim();

        /*
        at the point we create the address from the console made all the character uppercase and
        removed extra spaces from the beginning and end

        to do all the above steps at the same time we could also chain our methods

        String address = input.nextLine().to.UpperCase().trim();
                           String ---->   String ----->   String

         Invalid chaining:
         String s "abc";
         s.equels().trim();
         boolean ----> trying to use a String methods
         Invalid ---->  we cannot use String methods on a boolean type
         */

        System.out.println(address);

        if(address.startsWith("500")){
            System.out.println("house on the right side");
        }else if(address.startsWith("600")){

            System.out.println("house on the left side");
        }

        if(address.contains("DRIVE")){
            System.out.println("house on drive");
        }else if(address.contains("LANE")){
            System.out.println("house on line");
        }else if(address.contains("AVE")){
            System.out.println("house on avenue");
        }












    }
}
