package day12_switch;

public class NumberToWord {
    public static void main(String[] args) {
        /*

       number from 1-5
       1 ---> one
       2 ---> two
       3 ---> three
       4 ---> four
       5 ---> five

       default case

        */

        int number = 3;
        switch(number){
            case 5:
            System.out.println("five");
            break;
            case 4:
                System.out.println("four");
                break;
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;

            default:
                System.out.println("Number should be between 1 and 5");










        }



    }

}

