package com.imaks;

import java.util.Scanner;

public class Main {
private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter app.");
        System.out.println("Version 1.0.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("Enter 1 to convert KG to LB");
            System.out.println("Enter 2 to convert LB to KG");
            System.out.println("Enter 0 to exit");
            int choice = scanner.nextInt();

            if (choice == 0){
                System.out.println("Byeee!!!");
                break;
            }

            System.out.println("Enter your number:");
            double number = scanner.nextDouble();

            if (number == 0 || number < 0) {
                System.out.println("Number must be more than 0. Try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    double pounds = kgToLb(number);
                    System.out.println(number + " kg = " + pounds + " lb");
                    break;
                case 2:
                    double kilograms = lbToKg(number);
                    System.out.println(number + " lb = " + kilograms + " kg");
                    break;
                default:
                    System.out.println("Please, enter 1 or 2 to convert or 0 to exit");
            }
        }
        scanner.close();

    }
private static double kgToLb(double kg){
        return kg * CONV_K;
}
private static double lbToKg(double lb){
        return lb / CONV_K;
}

}