package com.pluralsight;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeQuestion = ("Would you like a 'regular' or 'large' sandwich?\n"); // Prompts the question about size.
        System.out.printf(sizeQuestion); // Prints the question.
        String size = scanner.next();
        System.out.printf("You chose %s.\n", size); // Declares the size you chose.
        System.out.println();

        double regularPrice = 5.45;
        double largePrice = 8.95;

        if (size.equals("regular")) { // Declaring price for regular size.
            System.out.printf("Your total is currently $%.2f.\n", regularPrice);
            System.out.println();
        } else { // Declaring price for large size.
            System.out.printf("Your total is currently $%.2f.\n", largePrice);
            System.out.println();
        }


        String ageQuestion = ("How old are you?\n");
        System.out.println(ageQuestion);
        int age = scanner.nextInt();
        System.out.println();
        if (age <= 17 && size.equals("regular")) {
            System.out.printf("Your total is $%.2f!",regularPrice*0.9);
        } else if (age <= 17 && size.equals("large")) {
            System.out.printf("Your total is $%.2f!",largePrice*0.9);
        } else if (age >= 18 && size.equals("regular")) {
            System.out.println("Your total is $" + regularPrice + "!");

        }

        if (age >= 65 && size.equals("regular")) {
            System.out.printf(("Your total is %.2f!"), regularPrice * 0.8);
        } else if (age >= 65 && size.equals("large")) {
            System.out.printf(("Your total is %.2f!"), largePrice * 0.8);
        } else if (age >= 18 && age <=64 && size.equals("large")){
            System.out.println("Your total is $" + largePrice + "!");
        }
    }
}