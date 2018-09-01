import java.util.Scanner;

public class JustSumOfxAndY{
	
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Value for X:");
	  int x=sc.nextInt();
	   System.out.println("Enter Value for Y:");
	  int y=sc.nextInt();
	  int sum = x +y;
	  
	  System.out.println("Sum of "+x +" and "+y+" is "+sum);
  }
}