package day06_Operators;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 21;

        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        boolean over18 = age >= 18;

        boolean isEligible = isCitizen && over18 && !hasCriminalBackground;
        System.out.println("Is eligible: " +  isEligible);





    }
}