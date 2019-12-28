package areacount;

import java.util.Scanner;

public class AverageCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int n1 = sc.nextInt();
        byte n2 = sc.nextByte();
        short n3 = sc.nextShort();
        double avg = (double) (n1 + n2 + n3) / 3;
        System.out.println("Avg: " + avg);
        

    }

}
