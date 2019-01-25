package com.coderbd.toweOfHanoi;

import java.util.Scanner;

public class TowerOfhanoi {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        // Find the solution recursively
        System.out.println("The moves are:");
        moveDisks(n, 'A', 'B', 'C');
    }

    /**
     * The method for finding the solution to move n disks from fromTower to
     * toTower with auxTower
     */
    static int numOfMove = 0;

    public static void moveDisks(int n, char fromTower,
            char toTower, char auxTower) {

        if (n == 1) // Stopping condition
        {
            numOfMove++;
            System.out.println("Move disk " + n + " from "
                    + fromTower + " to " + toTower);

        } else {
            numOfMove++;
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from "
                    + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);

        }

        System.out.println("Move: " + numOfMove);
    }
}
