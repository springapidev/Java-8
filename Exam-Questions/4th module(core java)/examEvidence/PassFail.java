import java.util.*;
public class PassFail{
public static void main(String [] args){

Scanner s=new Scanner(System.in);
System.out.println("Enter Mcq");

int mcq=s.nextInt();
System.out.println("Enter Des");

int des=s.nextInt();
System.out.println("Enter Evd");

int evd=s.nextInt();

int total=mcq+des+evd;
if ((mcq+des)>=70 && evd>=30)
System.out.println("Pass");
else
System.out.println("Fail");
}}