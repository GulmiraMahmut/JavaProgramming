package day03_variables;

public class School {
    /*
Add a new class School
add main method

declare and assign all these variables:
    (all int) grade1, grade2, grade3, grade4, grade5

    assign the number of students in each grade

    extra: try to create another variable to find the total number of students in the whole school

    (all double) average gpa, number of school days, number of snow days
     */

    public static void main(String[] args) {
        int grade1, grade2, grade3, grade4, grade5;
        grade1 = 100;
        grade2 = 120;
        grade3 = 130;
        grade4 = 140;
        grade5 = 150;
        int totalNumber = grade1 + grade2 + grade3 + grade4 + grade5;
        System.out.println("grade1 = " + grade1);
        System.out.println("grade2 = " + grade2);
        System.out.println("grade3 = " + grade3);
        System.out.println("grade4 = " + grade4);
        System.out.println("grade5 = " + grade5);

        System.out.println("total number of students in the whole school = " + totalNumber);

        double averageGpa = 3.2;
        double numberOfSchoolDays = 240;
        double numberOfSnowDays = 10;

        System.out.println("averageGpa = " + averageGpa);
        System.out.println("numberOfSchoolDays = " + numberOfSchoolDays);
        System.out.println("numberOfSnowDays = " + numberOfSnowDays);



    }
}
