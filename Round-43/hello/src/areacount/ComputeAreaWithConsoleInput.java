package areacount;

//import java.util.*;// wildcard import
import java.util.Random;// specific import
import java.util.Scanner;//secific import

public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {
        double radius;//varaiable decleration
        double area;//varaiable decleration
        Random random = new Random(100000);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Circle Radius: ");
        radius = sc.nextDouble();
        area = radius * radius * 3.14159;
        System.out.println("Area:"
                + area);
    }
}
