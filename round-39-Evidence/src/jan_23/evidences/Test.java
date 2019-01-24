package jan_23.evidences;

import static jan_23.evidences.Factorial.factorial;
import static jan_23.evidences.IsPrime.checkPrime;

public class Test {

    public static void main(String[] args) {
        //Factorial number......................................................
        System.out.println("Factorial of  5 is: " + factorial(5));

        //Prime number between 1 to 10................................
        System.out.println("\n"+"Prime numbers between 1 - 10: ");
        checkPrime(1, 10);

        //Largest & Smallest Number...........................................................
        System.out.println("\n"+"Largest & Smallest Number among given numbers:");
        LargeSmallNum.largestNum(18, 29, 47);
        LargeSmallNum.smallNum(18, 29, 47);

        //Palindrome...............................................................
        System.out.println("\n"+"Is huh Palindrome: " + Palindrome.isPalinDrome("Huh"));

        //Pass Fail...............................................
        System.out.println("\n"+"Grading point: ");
        GradeSystem.passFail();

    }
}
