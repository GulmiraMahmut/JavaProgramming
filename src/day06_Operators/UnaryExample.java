package day06_Operators;

public class UnaryExample {
    public static void main(String[] args) {

        int n = 0;  // 0
        n++;       // post increment, values becomes 1
        System.out.println(n); // 1
        ++n;        // pre increment, values becomes 2
        System.out.println(n); // 2

        System.out.println(++n); // pre increment, values becomes 3, it prints the value

        System.out.println(++n); // pre increment, values becomes 4, it prints the value

        System.out.println(n++); /* post increment, prints the current value witch is 4,
        then it will be increment by 1 */

        System.out.println(n); // 5

        System.out.println("-----------------------------");

        int x = 4;
        int y = x;
        int z = ++x;
        System.out.println("x " + x);
        System.out.println("y " + y);
        System.out.println("z " + z);

        System.out.println("----------------------");

        int candy = 5;
        System.out.println("Your kid asks for candy, you have " + candy) ;
        System.out.println("You give them, so now you have " + --candy); /* pre decrement,
         subtract 1 first, then I am print it*/
        System.out.println("The sibling comes in and they want one, you check how many there then give them one "
                +  candy-- ); // post decrement
        System.out.println("Total candy in jar now " + candy);

        // USE CASE counting:
        // your name, we want find how many times your name as the letter 'a'
        int counter = 0;
        counter++;
        // we found another a
        counter++;
















    }
}
