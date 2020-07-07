package com.hanabi.year;

public class Year {

    public int year;

    public Year(int year) {
        this.year = year;
    }

    public void ex25() {

        if (year % 4 == 0) {
            System.out.println("Năm " + year + " là năm nhuận.");
        } else {
            System.out.println("Năm " + year + " không phải năm nhuận.");
        }

    }

}
