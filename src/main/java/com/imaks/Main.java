package com.imaks;

import java.util.Scanner;

public class Main {
private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("App for measures converting.");
        System.out.println("Choose operation:");
        System.out.println("Enter 1 to convert KG to LB");
        System.out.println("Enter 2 to convert LB to KG");
        int choice = scanner.nextInt();

        System.out.println("Enter your number:");
        double number = scanner.nextDouble();

        switch(choice){
            case 1:
                double pounds = kgToLb(number);
                System.out.println(number + "kg = " + pounds + "lb");
                break;
            case 2:
                double kilograms = lbToKg(number);
                System.out.println(number + "lb = " + kilograms + "kg");
                break;
            default:
                System.out.println("Please make your choice. Enter 1 or 2");
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