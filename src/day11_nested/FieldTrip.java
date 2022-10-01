package day11_nested;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 4;
        String location = "";
        String teacher = "";
        int numberOfGroup = 0;


        if(grade > 0 && grade < 6){

            if(grade == 1){
                location = "Apple Orchard";
                teacher = "Ms Smith";
                numberOfGroup = 5;
            }else if(grade == 2){
                location = "Zoo";
                teacher = "Mt Bond";
                numberOfGroup = 6;
            }else if(grade == 3){
                location = "Aquarium";
                teacher = "Mr Reyes";
                numberOfGroup = 2;
            }else if(grade == 4){
                location = "Museum";
                teacher = "Mt Wilson";
                numberOfGroup = 6;
            }else if(grade == 5){
                location = "Movie Theater";
                teacher = "Ms Lee";
                numberOfGroup = 3;
            }else if(grade == 6){
                location = "Six Flags";
                teacher = "Mt Bond";
                numberOfGroup = 10;
            }
            System.out.println("Grade: " + grade);
            System.out.println("Location: " + location);
            System.out.println("Teacher: " + teacher);
            System.out.println("Number of group: "+ numberOfGroup);


        }else{
            System.out.println("Invalid grade");
        }



    }
}
