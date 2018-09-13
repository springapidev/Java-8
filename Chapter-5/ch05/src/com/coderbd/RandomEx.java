package com.coderbd;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomEx {
    public static void main(String[] args) {
        Random r=new Random();     
        for(int i=1; i <=10; i++){
            int randomNumber=r.nextInt(999898)+100001;         
            
           System.out.println("Num: "+i+" : "+randomNumber);
        }
    }
}
