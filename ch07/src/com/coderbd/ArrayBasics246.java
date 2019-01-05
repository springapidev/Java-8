package com.coderbd;

public class ArrayBasics246 {

    public static void main(String[] args) {
        int[] intArr = new int[3];
        intArr[0] = 10;
        intArr[1] = 15;
        intArr[2] = 25;
        System.out.println("intArr Length: " + intArr.length);
        System.out.println("intArr[0]" + intArr[0]);

        String str[] = new String[3];
        str[0] = "A.......";

        double[] doubleArr = new double[3];//Not Good
        doubleArr[0] = 100.0;
        System.out.println(" doubleArr[0]: " + doubleArr[0]);

        int intArray[] = {5, 10, 15, 20, 25};
        System.out.println("Min: " + intArray[0]);
        System.out.println("Max: " + intArray[intArray.length - 1]);
        System.out.println("20: " + intArray[3]);

        for (int i = 0; i <= intArray.length - 1; i++) {
            System.out.println(i + " : " + intArray[i]);
        }

        char[] city = {'D', 'a', 'l', 'a', 's'};
        System.out.println(city);
        char[] country = {};
        System.out.println("Size of country" + country.length);

        //////////////////////////////////////
        int[] intNumbers = new int[100];

        for (int j = 0; j < intNumbers.length; j++) {
            intNumbers[j] = j;
        }
        System.out.println("Length of intNumbers: " + intNumbers.length);

        for (int p = 0; p < intNumbers.length; p++) {
            if (intNumbers[p] % 5 == 0) {
                System.out.println(p + " : " + intNumbers[p]);
            }
        }

        /////////////For each Loop Or for in ////////////
        for (int i : intNumbers) {
            System.out.println(" :: " + i);
        }

    }
}
