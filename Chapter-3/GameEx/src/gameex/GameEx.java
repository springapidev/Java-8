package gameex;

import java.util.Scanner;

public class GameEx {

    public static void main(String[] args) {
        double earnings = 0;
       // Scanner sc = new Scanner(System.in);
       // System.out.print("tell me a lucky number between 10 to 1000:");
        int luckyNumber = 408;
        earnings = luckyNumber;
        //400
        if (earnings % 10 > 2) { //8 > 2, True, IF block e IN korbe
            earnings += 300;
            if (earnings % 10 > 2) {
                earnings -= 200;
                if (earnings % 10 > 1) {
                    earnings *= 20;
                }
            }
        } else {
            earnings -= 200;

        }
        System.out.println("Final Result: " + earnings);
    }

}
