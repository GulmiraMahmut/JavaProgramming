package day06_Operators;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalExample {

    public static void main(String[] args) {

       boolean isWeekend = false;
       boolean isGoodTempr = true;
       boolean doBbq = isWeekend && isGoodTempr; // && and both boolean need to be true, for true result
        System.out.println("Do bbq: " + doBbq);
        System.out.println();

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFirefighter = false;
        boolean getDiscount = isTeacher || isPolice || isFirefighter; // || or only one of the boolean need to be true,
        // for the result to be true
        System.out.println("Get a discount: " + getDiscount);
        System.out.println();

        // goal: 5< number <10

        int number = 8;
        System.out.println(number > 5 && number < 10 ); // true && true --> true
        System.out.println(number > 0 && number < 5); // tue && false --> false
        System.out.println();

        int age = 40;
        boolean inValidAge = age < 0 || age > 120; // false || false || --> false
        System.out.println("Invalid age: " + inValidAge);




    }
}
