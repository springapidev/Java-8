import java.util.*;
public class ResultSheet{
public static void main(String[]args){

Scanner s=new Scanner(System.in);
System.out.println("Enter MCQ Mark");

int mcq=s.nextInt();
System.out.println("Enter DES Mark");

int des=s.nextInt();
System.out.println("Enter EVI Mark");

int evi=s.nextInt();

int total=mcq+des+evi;
if((mcq+des)>=70 && evi>=30)
System.out.println("Pass");

else
System.out.println("fail");
}}