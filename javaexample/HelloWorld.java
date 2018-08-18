//public is an access modiifer
//class is a java keyword for creating java class
//HelloWorld is the name of class, Always starts with Capital letter and camelCase system
// {} is the body of class
//We need to use semicolon ( ; ) end of every statement, it is mandatory
public class HelloWorld{
// class body contains class properties or members  or variables, methods or another class
public static String msg;//only variable declaration
public static String name="Arefin";//variable declaration and initialization 
//A java program must need a main methods, like bellow
//static is a java keyword/mofifer, it helps to call properties without object initiating

public static void main(String[] args){
	msg="Hello world!!!!";// variable initialization
	System.out.println("Message: "+msg);
	System.out.println("Name: "+name);
}

}
//Class name and file must be same like file Name:  HelloWorld.java
//java file extension is .java

//////////////////How to Run java program/////////////////////
//Step-1: compile java program , command: javac HelloWorld.java
//Step-2: Run java program , command: java HelloWorld












