import java.util.*;
public class Abc{
public static void main(String [] args){

Scanner s=new Scanner(System.in);
System.out.println("Enter Result");

String res=s.next();
res=res.toUpperCase();

if (res.equals("A")){
System.out.println("Excellent");
}
else if (res.equals("B")){
System.out.println("Good");
}
else if (res.equals("C")){
System.out.println("OK");
}
else {
System.out.println("Fail");
}
}}