package com.bmi.calculator.bmiCalculator;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5)
            System.out.println("You are underweight.");
        else if (bmi < 25)
            System.out.println("You have a normal weight.");
        else if (bmi < 30)
            System.out.println("You are overweight.");
        else
            System.out.println("You are obese.");
        
        input.close();
    }
}
