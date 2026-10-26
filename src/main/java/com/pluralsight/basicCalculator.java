package com.pluralsight;

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);


        System.out.print("What's your name:  ");
        String name = myscanner.nextLine();
        System.out.print("How many hours have you worked? ");
        double hours = myscanner.nextDouble();
        System.out.println("What's your payrate? ");
        double rate = myscanner.nextDouble();

        double grossPay = hours * rate;


        System.out.println("Name: " + name);
        System.out.println("Gross pay: $" + String.format("%.2f", grossPay));
    }
}
