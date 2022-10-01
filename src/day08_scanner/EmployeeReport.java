package day08_scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class EmployeeReport {
    /*
    full name
    job title
    salary --> ask each part
    company HQ
    full time

   Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52)
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your job title:");
        String jobTitle = input.nextLine();

        System.out.println("What is your hourly rate:");
        double hourlyRate = input.nextDouble();

        System.out.println("What is the average number of hours in a week");
        int weeklyHours = input.nextInt();

        double salary = weeklyHours * 52 * hourlyRate; // 52 weeks in a year

        System.out.println("Where is the company HQ");
        input.nextLine(); // empty one to catch the enter input
        String hqLocation = input.nextLine();

        System.out.println("Are you full: true or false");
        boolean isFullTime = input.nextBoolean();

        String report = fullName + " is a " + jobTitle + " they make " + salary + " because they are full time: " +
                isFullTime + ". The HQ located in " + hqLocation;

        System.out.println(report);








    }
}
