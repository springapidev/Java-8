package areacount;

import java.util.Scanner;

public class AreaCounting {

    public static void main(String[] args) {
        double radius;//varaiable decleration
        double area;//varaiable decleration
        radius = 20;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Circle Radius: ");
        // radius = sc.nextDouble();
        area = radius * radius * 3.14159;
        System.out.println("Area:"
                + area);
    }

}
