/*
 * Name: Chapter 3 Programming Exercise
 * Purpose: Meant to find all of the roots within a quadratic equation
 * Programmer: Alex Kurcan
 * Date: 8/26/2025
 */


import java.util.Scanner;
public class Exercise{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // also used to get input from the user
        System.out.println("Enter a, b, and c,: ");
        double a = input.nextDouble(); // gets the users answer, applies to all of them
        double b = input.nextDouble(); 
        double c = input.nextDouble(); 
        double discriminantCalculator = b * b - 4 * a * c; // for: b^2 - 4ac

        // check to decide how many roots it has or exist
        if (discriminantCalculator > 0){
            // meant for two real roots
            double rootFoo = (-b + Math.pow(discriminantCalculator, 0.5)) / (2 * a);
            double rootBar = (-b - Math.pow(discriminantCalculator, 0.5)) / (2 * a);
            System.out.println("The roots are " + rootFoo + " and " + rootBar);
        }
        else if (discriminantCalculator == 0) { // this is for when there is only one root :(
            double rootC = -b / (2 * a);
            System.out.println("The root is " + rootC);
        } else {
            System.out.print("This has no real roots"); // this is of course for no real roots
        }
        input.close(); // you have to close the scanner to avoid any leaks (of resources)
    }
}