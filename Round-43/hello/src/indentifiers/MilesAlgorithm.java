package indentifiers;

public class MilesAlgorithm {

    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println("kilometers: " + kilometers);
    }
}
