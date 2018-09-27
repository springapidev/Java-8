/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.arrays;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class DirectArray {
    
    public static void main(String[] args) {
        displayArrays(5, 8, 4, 5, 4, 5, 4,4,57,8,78,5,78,8);
    }
    
    static void displayArrays(int... n) {       
        System.out.println(Arrays.toString(n));
    }
}
