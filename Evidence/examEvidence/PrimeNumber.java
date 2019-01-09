import java.util.*;
public class PrimeNumber{
public static void main(String[]args){

Scanner s=new Scanner(System.in);
System.out.println("Enter number");

int number=s.nextInt();
int i;

for(i=2; i<number; i++){
if(number%2==0)
break;}

if(i==number)
System.out.println(number+" is prime");
else
System.out.println(number+" is not prime");

}}