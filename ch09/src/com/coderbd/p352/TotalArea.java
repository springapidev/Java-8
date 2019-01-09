package com.coderbd.p352;

import java.util.Scanner;

public class TotalArea {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        // Declare circleArray
        CircleWithPrivateDataFields[] circleArray;
        int count;
        System.out.print("Enter the number of circles:");
        count = input.nextInt();

        // Create circleArray
        circleArray = createCircleArray(count);

        // Print circleArray and total areas of the circles
        printCircleArray(circleArray);
    }

    /**
     * Create an array of Circle objects
     */
    public static CircleWithPrivateDataFields[] createCircleArray(int count) {
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[count];
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + count + " radii :");
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivateDataFields(input.nextDouble());
        }

        // Return Circle array
        return circleArray;
    }

    /**
     * Print an array of circles and their total area
     */
    public static void printCircleArray(
            CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }

        System.out.println("-----------------------------------------");

        // Compute and display the result
        System.out.printf("%-30s%-15f\n", "The total areas of circles is",
                sum(circleArray));
    }

    /**
     * Add circle areas
     */
    public static double sum(
            CircleWithPrivateDataFields[] circleArray) {
        // Initialize sum
        double sum = 0;

        // Add areas to sum
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }

        return sum;
    }
}
