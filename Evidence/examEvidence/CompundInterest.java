
import java.util.*;
import java.lang.*;
public class CompundInterest{
public static void main(String [] args){

Scanner s=new Scanner(System.in);
System.out.println("Enter Amount");

double amount=s.nextDouble();
System.out.println("Enter rate");

double rate=s.nextDouble();
System.out.println("Enter rate");

double year=s.nextDouble();

double total= amount*Math.pow(1+rate,year);
System.out.println("Total Amount "+total);
}}
