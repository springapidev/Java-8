package jan_23.evidences;

import java.util.Scanner;

public class SentinelValue {

    static int n;
    static int sum;

    public static void main(String[] args) {
        sentinel();
    }
    public static void sentinel() {
        Scanner input = new Scanner(System.in);

        while (n != 7) {
            System.out.println("Enter number except 7:");
            n = input.nextInt();
            if (n != 7) {
                sum += n;
            }
        }
        System.out.println("Sum: " + sum);
    }

    
}
