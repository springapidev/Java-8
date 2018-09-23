import java.util.*;
public class Test{
public static void main(String args[]){
int age=Integer.parseInt(args[0]);
assert age>0:"test wrong value";
System.out.println(age);
}
}