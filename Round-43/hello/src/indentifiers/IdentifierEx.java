package indentifiers;

public class IdentifierEx {

    static int x;//variab;le deleration

    int y = 10;//variable deleration and initialization
    int p, q, r;// multiple variable decleration
    int m = 10, n = 5, o;
    int e;
    int f = 20;
    int b = x = y = 1000;
    String abc;
    String $abc;
    String _abc;
    String abc2;
    String abc$$;
    String a_bc;
    String ab855445_545c;
    String __;
    //  String, a,b&c; // invalid
    // String ab&c; // invalid
    //String ab#c;// invalid
    //  String ab@c;//   invalid
    // String ab-c2;//   invalid
    //String ab+c2;//   invalid
    // String ab*c2;//   invalid
    // String ab/c2;//   invalid
    //String ab-c2;//   invalid

    /////////////////////when class, interface, enum as identifier////////////////////
    /*
    start with capital letter
    if there is more words, use camelCase system
    example..........
    class HelloWorld {         }
     */
    /////////////////////when variable as identifier////////////////////
    /*
    start with small letter
    if there is more words, use camelCase system
    example..........
    String myMessage;
     */
    /////////////////////when method as identifier////////////////////
    /*
    start with small letter
    start with verb
    if there is more words, use camelCase system
    example..........
    public void sayHello(){
    
    }
     */
    final static double PI = 3.14159;

    public static void main(String[] args) {
        x = 20000000;
        int x = 100;

        System.out.println(IdentifierEx.x);
        IdentifierEx i2 = new IdentifierEx();
        i2.y = 300;
        System.out.println(i2.y);
        int g = 5;
        System.out.println(g);
    }
}
