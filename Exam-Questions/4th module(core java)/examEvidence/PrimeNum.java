import java.util.*;
public class PrimeNum{
public static void main(String[]args){

Scanner s=new Scanner(System.in);
System.out.println("Enter num");

int num=s.nextInt();
int i;

for(i=2; i<num; i++){
if(num%i==0)
break;}

if(i==num)
System.out.println(num+" is prime");
else
System.out.println(num+" is not prime");
}}