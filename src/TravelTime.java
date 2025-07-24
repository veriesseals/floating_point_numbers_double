/* 
Floating-point (double) variables
A floating-point number is a real number containing a decimal point that can appear anywhere (or "float") in the number. Ex: 98.6, 0.0001, or -55.667. A double variable stores a floating-point number. Ex: double milesTravel; declares a double variable.

A floating-point literal is a number with a fractional part, even if the fraction is 0, as in 1.0, 0.0, or 99.573. Good practice is to always have a digit before the decimal point, as in 0.5, since .5 might mistakenly be viewed as 5.

Scanner's nextDouble() method reads a floating-point value from input. Ex: currentTemp = scnr.nextDouble(); reads a floating-point value from the input and assigns currentTemp with that value.
*/


import java.util.Scanner;

public class TravelTime {
    
    public static void main(String[] args) {
        // Here’s how you can use try-with-resources to ensure the Scanner is closed automatically:
        // Using try-with-resources ensures the Scanner is closed even if an exception occurs. This is a best practice for managing resources like input streams.
        try(Scanner scnr = new Scanner(System.in)) {
            double milesTravel; // User input of miles to travel
            double hoursFly;    // Travel hours if flying those miles
            double hoursDrive;  // Travel hours if driving those miles

            System.out.print("Enter distance in miles: ");
            milesTravel = scnr.nextDouble();
            // scnr.close();

            hoursFly   = milesTravel / 500.0;
            hoursDrive = milesTravel / 60.0;

            System.out.println(milesTravel + " miles would take:");
            System.out.println("   " + hoursFly + " hours to fly,");
            System.out.println("   " + hoursDrive + " hours to drive.");
        }
    }
}
