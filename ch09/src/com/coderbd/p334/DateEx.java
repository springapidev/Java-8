package com.coderbd.p334;

import java.util.Date;

public class DateEx {

    public static void main(String[] args) {
        System.out.println(new Date());
        Date date = new Date();
        System.out.println("Time in ms; " + date.getTime());
        System.out.println("Date in ms; " + date.getDate());
        System.out.println("Day in ms; " + date.getDay());

    }

}
