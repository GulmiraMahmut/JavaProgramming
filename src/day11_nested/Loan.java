package day11_nested;

public class Loan {
    public static void main(String[] args) {

            /*
    create a class Loan
declare and assign a credit score variable
try to use ternary to determine of you are eligible for a loan
you are eligible if you have a credit score of 700 or above
if you are eligible print "loan approved"
otherwise print "loan rejected. Sign up for our credit program"

     ? if
     : else
     */

     double creditScore = 800;
     String result = creditScore >= 700 ? "Loan approved" : "loan rejected. Sign up for our credit " +
             "program";
        System.out.println(result);

    }
}
