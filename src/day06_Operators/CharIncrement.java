package day06_Operators;

public class CharIncrement {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter++);
        System.out.println(letter);

        System.out.println("------------------------");

        char letter1 = 'A';
        System.out.println(letter1++);
        System.out.println(letter1++);
        System.out.println(letter1++);
        System.out.println(letter1++);
        System.out.println();

        char letter2 = 'a';
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println();

        char digits = '9'; // this is the character 9, not the number 9
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits);  // this is printing the character
        System.out.println((int)digits); // cast the character to an int. witch mean that is prints the ascii number for
        // that character
        System.out.println();

        System.out.println(65);
        System.out.println((char)65); // casting int 65 to char, it will print the character that has ascii number 65










    }
}
