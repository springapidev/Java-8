import java.util.*;
import java.lang.*;
public class Interest{
public static void main(String [] args){

Scanner s = new Scanner(System.in);
System.out.println("enter amount");

double amount=s.nextDouble();
System.out.println("enter rate");

double rate=s.nextDouble();
System.out.println("enter year");

double year=s.nextDouble();

double total = amount*Math.pow(1+rate,year);
System.out.println("Total Amount "+total);
}}