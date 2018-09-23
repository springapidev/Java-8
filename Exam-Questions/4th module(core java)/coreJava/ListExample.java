import java.util.*;
public class ListExample{
public static void main(String [] args){
List list=new ArrayList();
list.add("one");
list.add("second");
list.add("3rd");
list.add(new Integer(4));
list.add(new Float(5.0F));
list.add("second");
list.add(new Integer(4));
System.out.println(list);
}
}


}