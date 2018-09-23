
import java.util.Scanner;
import static java.lang.Math.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J2EE-27
 */
public class CompuntInterest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        double amount;
        double rate;
        double year;
        System.out.print("Enter Amount");
        amount=input.nextDouble();
        System.out.print("Enter Rate");
        rate=input.nextDouble();
        System.out.print("Enter Year");
        year=input.nextDouble();
        
        double finalAmount=amount*pow(1+rate, year);
        System.out.println("Final Amount"+finalAmount);
    }
    
}
