/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritances;

/**
 *
 * @author Students
 */
public class Test {

    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();
        b1 = (A) b2;
        A b3 = (B) b2;
        b1.test();
        b3.test();

    }
}
