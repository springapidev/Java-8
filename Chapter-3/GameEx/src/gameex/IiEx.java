package gameex;

public class IiEx {

    public static void main(String[] args) {
        double marks = 50;

        if (marks >= 70 && marks <= 79.99) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("A+");
        } else {
            System.out.println("failed");
        }

    }
}
