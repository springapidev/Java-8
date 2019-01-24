package jan_23.evidences;

public class Palindrome {

    public static boolean isPalinDrome(String m) {
        boolean isPalinDrome = false;

        if (m.equalsIgnoreCase(new StringBuilder(m).reverse().toString())) {
            isPalinDrome = true;
        }
        return isPalinDrome;
    }
}
