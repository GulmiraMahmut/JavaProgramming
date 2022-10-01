package day04_variables;

public class Cellphone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "Iphone X";
        String color = "Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';

        System.out.println("\tPhone Information:\nBrand: " + brand);
        System.out.println(model + "in " + color);
        System.out.println("With " + size + "gb the price is $" + price);
        System.out.println("Sim type: " + sim + " and has a camera: " + hasCamera);
        System.out.println();

        // alternative solution:

        String report = "\tPhone Information:\nBrand: " + brand + "\n" + model + " in " + color + "\nWith " +
                size + "gb the price is $" + price + "\nSim type: " + sim + " and has a camera: " + hasCamera;

        System.out.println(report);







    }
}
