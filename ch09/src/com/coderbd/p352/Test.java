package com.coderbd.p352;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
		Date[] date = new Date[8];		

		for(int i=0; i<8; i++){
			date[i]=new Date();
			date[i].setTime(date[i].getTime()-(long)Math.pow(10,i+4));
		}
		
		for(int j=0; j<8; j++){
			System.out.println(date[j].toString());
		}
		
}
}
