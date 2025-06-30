package com.bmi.calculator.bmiCalculator;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        System.out.print("Enter age in years: ");
        int age = input.nextInt();

        input.nextLine(); // consume newline
        System.out.print("Enter sex (male/female): ");
        String sex = input.nextLine().trim().toLowerCase();

        System.out.println("Select Activity Level:");
        System.out.println("1. Sedentary");
        System.out.println("2. Lightly Active");
        System.out.println("3. Moderately Active");
        System.out.println("4. Very Active");
        System.out.println("5. Extra Active");
        System.out.print("Enter choice (1-5): ");
        int activityChoice = input.nextInt();

        double heightCm = height * 100;
        double bmi = weight / (height * height);

        // BMR Calculation
        double bmr;
        if (sex.equals("male")) {
            bmr = (10 * weight) + (6.25 * heightCm) - (5 * age) + 5;
        } else if (sex.equals("female")) {
            bmr = (10 * weight) + (6.25 * heightCm) - (5 * age) - 161;
        } else {
            System.out.println("Invalid sex entered.");
            input.close();
            return;
        }

        // Activity factor
        double activityFactor;
        switch (activityChoice) {
            case 1: activityFactor = 1.2; break;
            case 2: activityFactor = 1.375; break;
            case 3: activityFactor = 1.55; break;
            case 4: activityFactor = 1.725; break;
            case 5: activityFactor = 1.9; break;
            default:
                System.out.println("Invalid activity choice.");
                input.close();
                return;
        }

        double maintenanceCalories = bmr * activityFactor;

        // Output
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5)
            System.out.println("You are underweight.");
        else if (bmi < 25)
            System.out.println("You have a normal weight.");
        else if (bmi < 30)
            System.out.println("You are overweight.");
        else
            System.out.println("You are obese.");

        System.out.printf("Your BMR is: %.2f\n", bmr);
        System.out.printf("Your Maintenance Calories (daily requirement): %.2f kcal\n", maintenanceCalories);

        input.close();
    }
}
