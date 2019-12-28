package numericPower;

public class Test {

    public static void main(String[] args) {
        byte x1 = 127;
        short x2 = x1;
        int x3 = x2;
        long x4 = x3;
        float x5 = x4;
        double x6 = x5;
        Long x99 = new Long(20);

        int x7 = x1 * x2 * x3;
        float x8 = x7 * x1 * x2 * x5;
        float x9 = x8 * x7 * x1 * x2 * x5 * 25L;
        double x10 = x8 * x7 * x1 * x2 * x5 * 25L * x6;
    }

}
