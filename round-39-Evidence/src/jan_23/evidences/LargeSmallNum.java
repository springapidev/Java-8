package jan_23.evidences;

public class LargeSmallNum {

    public static void largestNum(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the largest");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is the largest");
        } else if (n3 > n2 && n3 > n1) {
            System.out.println(n3 + " is the largest");
        } else {
            System.out.println("All are equal");
        }
    }

    public static void smallNum(int x1, int x2, int x3) {
        if (x1 < x2 && x1 < x3) {
            System.out.println(x1 + " is the smallest");
        } else if (x2 < x1 && x2 < x3) {
            System.out.println(x2 + " is the smallest");
        } else if (x3 < x2 && x3 < x1) {
            System.out.println(x3 + " is the smallest");
        } else {
            System.out.println("All are equal");
        }
    }
}
