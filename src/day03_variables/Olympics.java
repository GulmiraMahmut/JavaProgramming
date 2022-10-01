package day03_variables;

public class Olympics {
    /*
    Add a new class Olympics
add main method

        declare and assign all these variables:
    years: starting at 2022

    use the following data to print this message for the coming years of the Olympics. Reassign the year variable each time

    years - location
        2022 - China
        2024 - France
        2026 - Italy

    message: The Olympics will be in these locations for the coming years: $years

    */
    public static void main(String[] args) {

        int year;
        year = 2022;

        System.out.println("The olympic in " + year + " will take place in China");

        year = 2024;
        System.out.println("The olympic in " + year + " is being planned in France");

        year = 2026;
        System.out.println("The olympic in " + year + " is being planned in Italy");


    }
}
