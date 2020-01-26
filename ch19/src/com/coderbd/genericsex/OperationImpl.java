package com.coderbd.genericsex;

import java.util.List;

public class OperationImpl implements Operation<Integer> {

    @Override
    public Integer add(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    @Override
    public Integer factorial(Integer num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

}
