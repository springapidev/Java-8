package com.coderbd;

public class ArrayDeclerationEx {

    // Array Index starts from 0 Zero
    // Array is Fixed in length
    // Array performance is good
    /* Array works with homogenious(same type like int 
    or String or double) data*/
    //Array Decleration
    // int []y = new int[3];// Not Good
    int z[] = new int[5];

    public static void main(String[] args) {
        //One or Single diementional Array
        int[] x = new int[2];// Here 2 is length of the Array x
        x[0] = 10;
        x[1] = 25;
        // x[2] = 15;// Wrong
        System.out.println("x[0]: " + x[0]);
        System.out.println("x[1]: " + x[1]);
        // System.out.println("x[2]: " + x[2]); //Wrong, If we use any index out of length, then it will produce ArrayIndexOutOfBoundsException Exception
        for (int i : x) {
            System.out.println(i);
        }
        // Alternative Way Array Decleration
        int p[] = {10, 25, 35, 23, 14, 32, 44, 91};//length 8
        // Index    0   1   2   3   4   5   6   7
        System.out.println("Lenth of p: " + p.length);
        // System.out.println("Out Of Bound: "+p[8]);// Wrong
        System.out.println("p[5]: " + p[5]);
        //  p = new int[9];
        for (int j : p) {
            System.out.println(j);
        }

    }
}
