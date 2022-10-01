package day05_arithmetic_operators;

public class Employee {

    public static void main(String[] args) {

        String firstName = "James";
        String lastName = "Bond";
        String companyName = "M16";
        String jobTitle = "Secret Agent";
        char suite = 'C';
        int employeeId = 7;
        int numberOfPTO = 15;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName;
        String email = firstName + employeeId + '@' + companyName + ".com";
        String benefits = "$" + salary +  " salary a year, " + numberOfPTO + " PTO days and WFH";

       String summary = "Employment Information for " + fullName + ". " + jobTitle + " for" + companyName +
               ", based in suite " + suite + ". Mr. " + lastName + " is full time: " + isFullTime + ". Contact Mr. " +
               lastName + " at " + email + ". Current benefits include " + benefits + ".";

        System.out.println(summary);






    }



}
