package day07_scanner;

public class ShortCircuitEX {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(true && false);

        // System.out.println(5/0); you can not divide by 0
        System.out.println();

        // System.out.println(true && 5/0 == 0);
        System.out.println(false && 5/0 == 0);

        // System.out.println(false & 5/0 == 0);
        System.out.println();

        System.out.println(true || false);
        System.out.println();

        int count = 0;
        System.out.println(true || count++ == 1);
        System.out.println(count);








    }
}