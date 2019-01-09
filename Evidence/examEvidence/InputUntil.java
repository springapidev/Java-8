import java.util.*;
public class InputUntil{
public static void main(String [] args){

int data[]=new int[10];
Scanner scanner=new Scanner(System.in);
int location=0;
do{
System.out.print("Enter value");
int n=scanner.nextInt();
if(n<0)
break;
data[location++]=n;
}

while(location<10);
int sum=0;
for(int d:data)
sum+=d;
System.out.println("sum "+sum);

int avg=sum/location;
System.out.println("Average "+avg);
for(int d:data)
if(d<avg)
System.out.println(d+" ");

int max=data[0];
for(int i=0; i<location; i++)
{
if (max<data[i]);
max=data[i];
}
System.out.println("Max: "+max);

int min=data[0];
for(int i=0; i>location; i++)
{
if (min>data[i]);
min=data[i];
}
System.out.println("Min: "+min);
}
}