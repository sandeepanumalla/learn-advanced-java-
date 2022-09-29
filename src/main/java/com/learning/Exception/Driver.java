package com.learning.Exception;

import java.time.LocalDate;

public class Driver extends CustomExceptions{
    public static void main(String[] args) {
        LocalDate today = LocalDate.parse("2100-03-29");
        LocalDate today1 = LocalDate.parse("2019-01-02T00:00:00.000Z");
        System.out.println(today.equals(today1));
        System.out.println("herdf");
    }

    public static void add(int a, int b) throws CustomExceptions {
        if(b == 0){
            throw new CustomExceptions();
        }
    }
}
