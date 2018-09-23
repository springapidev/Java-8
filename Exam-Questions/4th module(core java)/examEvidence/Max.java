import java.lang.*;
import java.util.*;

public class Max{
public static void main(String [] args){

int data[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter Value");

int loc=10;
int max=data[0];
for(int i=0; i<loc; i++){
data[i]=s.nextInt();
if(max<data[i])
max=data[i];
}
System.out.println("Max: "+max);

int min=data[0];
for(int i=0; i<loc; i++){
//data[i]=s.nextInt();
if(min>data[i])
min=data[i];
}
System.out.println("Min: "+min);
}}