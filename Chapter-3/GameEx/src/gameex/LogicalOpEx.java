package gameex;

public class LogicalOpEx {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x < 4 || y < 20 && x != 4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
