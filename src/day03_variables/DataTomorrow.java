package day03_variables;

public class DataTomorrow {

    /*
            declare and assign 3 variables(numbers)
            month, day, year

            print the date in this format:
                Date: month \ day \ year

            also update the day for tomorrow date
            print tomorrow's date in this format:
               Tomorrow's Date: month \ day \ year


         */

    public static void main(String[] args) {

        int month, day, year;
        month = 6; day= 13; year = 2022;

        System.out.println("Date: " + month + "\\" + day + "\\" + year);

        day = 14;

        System.out.println("Tomorrow's Date: " + month + "\\" + day + "\\" + year);




    }

}
