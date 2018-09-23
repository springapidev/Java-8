import java.util.*;
public class Min{
public static void main(String [] args){

int data[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter Value");
data[i]=s.nextInt();

int loc=10;
int min=data[0];

for(int i=0; i<loc; i++){
if(min>data[i])
min=data[i];
}
System.out.println("Min: "+min);
}
}