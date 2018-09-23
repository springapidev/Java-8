public class Test{
public enum TrafficSignal {STOP, CAUTION, GO};

public static void main(String [] args){

TrafficSignal theLight=TrafficSignal.GO;
switch(theLight){

case STOP:
System.out.print("red");
break;

case CAUTION:
System.out.print("yellow");
break;

case GO:
System.out.print("green");
break; 
}
}
}