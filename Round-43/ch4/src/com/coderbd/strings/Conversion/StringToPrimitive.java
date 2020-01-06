package com.coderbd.strings.Conversion;

public class StringToPrimitive {

    static String s1 = "10";
    byte byteVar = Byte.parseByte(s1);
    short shortVar = Short.parseShort(s1);
    int intVar = Integer.parseInt(s1);
    float floatVar = Float.parseFloat(s1);
    long longVar = Long.parseLong(s1);
    double doubleVar = Double.parseDouble(s1);
    static String s2 = "false";
    boolean booVar = Boolean.parseBoolean(s2);

    public static void main(String[] args) {

    }

}
