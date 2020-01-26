package com.coderbd.genericsex;

import java.util.List;

public class OperationImpl2 implements Operation<Long> {

    @Override
    public Long add(List<Long> list) {
        long sum = 0;
        for (long i : list) {
            sum += i;
        }
        return sum; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long factorial(Long num) {
       
        return 2000L;
    }

}
