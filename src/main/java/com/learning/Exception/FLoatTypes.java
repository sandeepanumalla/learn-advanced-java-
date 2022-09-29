package com.learning.Exception;


import org.springframework.cglib.core.Local;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

public class FLoatTypes {
    public static void main(String[] args) {
        double a = 5.4;
        double b = 7.12;
        double ans = (b - a) / a;
//        System.out.println(ans);
        getPeriodBetween(LocalDate.parse("2019-01-15"), LocalDate.parse("2019-12-12"));
        double originalPrice = 154.89000000000;
        double currentPrice = 271.4600000000;
        double absoluteReturn = (currentPrice - originalPrice) / originalPrice;
//        double absoluteReturn = 1.38;
        double timeInYears =  0.916667;
//        double timeInYears =  0.1;
        double annualizedReturn = Math.pow((1 + absoluteReturn), 1/timeInYears) - 1;
        System.out.println(annualizedReturn);

    }

    public static void getPeriodBetween(LocalDate start, LocalDate  end) {
        Period period = Period.between(start, end);
        DecimalFormat df = new DecimalFormat("");
        System.out.println( (float) period.getMonths() / 12);
    }

    public static void getAnnualizedReturn(){

    }
}
