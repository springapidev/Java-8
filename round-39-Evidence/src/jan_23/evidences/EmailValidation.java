package jan_23.evidences;

import java.util.*;

public class EmailValidation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Email");

        String email = s.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");

        if (atpos > 1 && (dotpos - atpos) > 2) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }
    
}
