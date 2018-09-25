package com.coderbd.baringChiti;

/**
 *
 * @author User
 */
public class Ex2 {

    public static void main(String[] args) {

        try {
            System.out.println(getDivision(10, 0));
        } catch (Exception e) {
            //e.printStackTrace();//it prints original error
            System.out.println("You can not divide by ZERO");
        }
        System.out.println("hiooooooo");

        System.out.println(getParseString("TEN"));

    }
// baring chiti style, reciever will (pay) / handle exception

    public static int getDivision(int x, int y) throws ArithmeticException, NumberFormatException {
        int rs = x / y;
        return rs;
    }

    //Q. String value  "1","5","100","5654" K int e transfer korbo HOW?
    /*
    Explanation: input: String and output: int
    output hobe method er data type and input hobe method er parameter
     */
    public static int getParseString(String str) {
        int rs = 0;
        try {
            rs = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("You can not Parse String Like Ten, Five etc");
        }

        return rs;
    }
}
