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
        double basePrice;

        if (size.equals("regular")) { // Declaring price for regular size.
            basePrice = regularPrice;
            System.out.printf("Your total is currently $%.2f.\n", basePrice);
            System.out.println();
        } else { // Declaring price for large size.
            basePrice = largePrice;
            System.out.printf("Your total is currently $%.2f.\n", basePrice);
            System.out.println();
        }

        String loadQuestion = ("Would you like your sandwich loaded? N = No. YA = Yes, regular! YB = Yes, large!");
        System.out.printf(loadQuestion);
        String loaded = scanner.next();
        System.out.printf("You chose %s.\n", loaded);
        System.out.println();

        double N = 0 + basePrice;
        double YR = 1.00 + basePrice ;
        double YL = 1.75 + basePrice;
        double updatedPrice = 0.0;
        if (loaded.equals("N")) {
            System.out.println("No additional charge.");
            updatedPrice = N;
        } else if (loaded.equals("YA")) {
            System.out.printf("Your total is now $%.2f.\n", YR);
            updatedPrice = YR;
        } else if (loaded.equals("YB")) {
            System.out.printf("Your total is now $%.2f.\n", YL);
            updatedPrice = YL;
        }



        String ageQuestion = ("How old are you?\n");
            System.out.println(ageQuestion);
            int age = scanner.nextInt();
            System.out.println();
            if (age <= 17 && size.equals("regular")) {
                System.out.printf("Your total is $%.2f!", updatedPrice * 0.9);
            } else if (age <= 17 && size.equals("large")) {
                System.out.printf("Your total is $%.2f!",updatedPrice * 0.9);
            } else if (age >= 18 && age <= 64 && size.equals("regular")) {
                System.out.println("Your total is $" + updatedPrice + "!");

            }

            if (age >= 65 && size.equals("regular")) {
                System.out.printf(("Your total is $%.2f!"), updatedPrice * 0.8);
            } else if (age >= 65 && size.equals("large")) {
                System.out.printf(("Your total is %.2f!"), updatedPrice * 0.8);
            } else if (age >= 18 && age <= 64 && size.equals("large")) {
                System.out.println("Your total is $" + updatedPrice + "!");
            }
        }
    }
