package day12_switch;

import java.util.Scanner;

public class Verify {
    public static void main(String[] args) {
         /*
    declare and assign two expected numbers:
	pincode: 1234
	ssn: 1111

ask the user to enter the two numbers and compare them with the system values defined above.
If they match print Authentication successful

if they don't match print all the reasons that authentication failed:

	if the pincode was incorrect print: Pin Code is incorrect
	if the ssn was incorrect print: Last 4 SSN numbers are incorrect
     */
        int systemPin = 1234;
        int systemSsn = 1112;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your pin code:");
        int inputPin = input.nextInt() ;

        System.out.println("Please enter your last 4 SSN numbers:");
        int inputSsn = input.nextInt();

        if (inputPin == systemPin && inputSsn == systemSsn){
            System.out.println("Authentication successful");
        }else{
            if (inputPin != systemPin){
                System.out.println("Pin Code is incorrect");
            }if (inputSsn != systemSsn){
                System.out.println("Last 4 SSN numbers are incorrect");
            }
        }

















    }
}
