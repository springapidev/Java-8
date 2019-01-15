package com.coderbd.customException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class TestCustomException {

    public static void main(String[] a) {
        try {
            TestCustomException.myTestmethod("Okkkkkkkkkkk");
        } catch (CustomException ex) {
            Logger.getLogger(TestCustomException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void myTestmethod(String str) throws CustomException {
        if (str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}
