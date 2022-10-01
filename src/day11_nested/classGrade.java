package day11_nested;

public class classGrade {
    public static void main(String[] args) {

        int score = 45;

        if(score >= 75){
            System.out.println("Passed");

            if(score > 92){
                System.out.println("You did very well");
            }else if(score > 80){
                System.out.println("Good Job");
            }else{
                System.out.println("Not bad");
            }

        }else{
            System.out.println("Failed");

            if(score > 50){
                System.out.println("try harder");
            }else{
                System.out.println("Study much more");
            }
        }







    }
}
