package day06_Operators;

public class RelationalTasks {
    public static void main(String[] args) {


        /*

        Declare a speed variables
        speed limit is 50

        find out if you are speeding
        true/false
         */

        int currentSpeed = 45;
        int speedLimit = 50;

        boolean isSpeeding  = currentSpeed > speedLimit;
        System.out.println("Is speeding  " + isSpeeding );
        System.out.println();

        /*
        declare a number variable
        find out if the number is positive, negative or zero
        */

        int number = -5;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        System.out.println("Is positive = " + isPositive );
        System.out.println("Is negative = " + isNegative);
        System.out.println("Is zero = " + isZero);
        System.out.println();

        /*
        define a number
        find out it is it even or odd
       */

        int num = 15;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0; // num % 2 == 1 // isEven != true
        System.out.println("Is even " + isEven);
        System.out.println("Is odd " + isOdd);





    }
}
