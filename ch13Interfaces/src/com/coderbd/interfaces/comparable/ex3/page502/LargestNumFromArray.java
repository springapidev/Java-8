package com.coderbd.interfaces.comparable.ex3.page502;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumFromArray {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(15);
        numbers.add(12);
        numbers.add(21);
        System.out.println(getLargestNum2(numbers));
    }

    ///////// Way -1, Best way for Proggraming
    public static int getLargestNum(List<Integer> nums) {
        int largestNum = 0;
        for (int i : nums) {
            if (largestNum < i) {
                largestNum = i;
            }
        }
        return largestNum;
    }

    ///////// Way -2
    public static int getLargestNum2(List<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1);
    }
}
