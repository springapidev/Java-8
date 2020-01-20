package com.coderbd.book;

import java.util.Arrays;

public class MinMaxFromASingleMethod {

    public static void main(String[] args) {
        int[] x = {4, 8, 2, 4, 5, 89, 7};
        getMinOrMax(x, "min");
    }

    public static void getMinOrMax(int[] nums, String status) {
        Arrays.sort(nums);
        if (status.equalsIgnoreCase("min")) {
            System.out.println("Min is " + nums[0]);
        } else {
            System.out.println("Max is " + nums[nums.length - 1]);
        }
    }

}
