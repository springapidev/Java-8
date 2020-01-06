package com.coderbd.strings.Conversion;

public class ConversionPrimitiveToString {

    static byte byteVar;
    static short shortVar;
    static int intVar;
    static float floatVar;
    static long longVar;
    static double doubleVar;
    static boolean booleanVar;
    static char charVar;

    public static void main(String[] args) {
        String s1FromByte = String.valueOf(byteVar);
        String s2FromShort = String.valueOf(shortVar);
        String s3FromInt = String.valueOf(intVar);
        String s4FromFloat = String.valueOf(floatVar);
        String s5FromLong = String.valueOf(longVar);
        String s6FromDouble = String.valueOf(doubleVar);
        String s7FromBooString = String.valueOf(booleanVar);
        String s8FromChar = String.valueOf(charVar);
    }

}
