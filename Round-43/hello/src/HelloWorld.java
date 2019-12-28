
public class HelloWorld {

    String msg = "Hello Bangladesh";

    static byte p = 127;
    short z = 5;
    int x = 2147483647;
    float pi = 3.16f;
    static long y = 1474836489123456789L;
    static int k = (int) y;
    double salary = 5000.0;

    char letter = 'A';
    boolean status = true;

    public static void main(String[] args) {
        System.out.println("Hello Programmer!!!!!!!!!!!!!");
        System.out.println("k: " + k);

        System.out.println(Long.MAX_VALUE);
        // System.out.println(1 / 0);
        System.out.println(1.0 / 0);

        long value = Long.MAX_VALUE + 1;
        System.out.println(value);

    }
}
