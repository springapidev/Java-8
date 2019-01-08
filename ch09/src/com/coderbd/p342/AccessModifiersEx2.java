package com.coderbd.p342;

/**
 *
 * @author User
 */
public class AccessModifiersEx2 {

    public static void main(String[] args) {
        AccessModifiersEx obj = new AccessModifiersEx();
      //  System.out.println(obj.privateVar);// you can not access private propeter of someone
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);
    }

}
