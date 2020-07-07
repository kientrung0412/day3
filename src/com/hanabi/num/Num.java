package com.hanabi.num;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num {

    private int powValue;
    private int numValue;

    private int a;
    private int b;

    public Num(int numValue) {
        this.numValue = numValue;
    }

    public Num(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int ex1() {

        int sum = 0;

        for (int i = 1; i <= numValue; i++) {
            sum += i;
        }

        return sum;


    }

    public int ex2() {
        int sum = 0;

        for (int i = 1; i <= numValue; i++) {
            sum += Math.pow(i, 2);
        }

        return sum;
    }


    public float ex3() {
        float sum = 0f;

        for (int i = 1; i <= numValue; i++) {
            sum += (1f / i);
        }

        return sum;
    }

    public float ex4() {

        float sum = 0f;

        for (int i = 1; i <= numValue; i++) {
            sum += 1f / (2f * i);
        }

        return sum;

    }

    public float ex5() {

        float sum = 0f;

        for (int i = 1; i <= numValue; i++) {
            sum += 1f / ((2f * i) + 1f);
        }

        return sum;

    }

    public float ex6() {

        float sum = 0f;

        for (int i = 1; i <= numValue; i++) {
            sum += 1f / (i * (i + 1f));
        }

        return sum;

    }

    public float ex8() {

        float sum = 0f;

        for (int i = 1; i <= numValue; i++) {
            sum += 1f / (2 * i + 1) * (2 * i + 2);
        }

        return sum;

    }

    public long ex9() {
        long sum = 1;

        for (int i = 1; i <= numValue; i++) {
            sum *= i;
        }

        return sum;
    }

    public int ex10() {

        int kq = (int) Math.pow(numValue, powValue);

        return kq;

    }

    public long ex11() {

        int sum = 0;

        for (int i = 1; i <= numValue; i++) {

            int earn = 1;

            for (int j = 1; j <= i; j++) {
                earn *= j;
            }

            sum += earn;

        }

        return sum;

    }

    public ArrayList<Integer> ex16() {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= numValue; i++) {

            if (numValue % i == 0) {
                list.add(i);
            }

        }

        return list;

    }

    public void ex17() {

        long sum = 0;
        long tich = 1;

        for (int i : this.ex16()) {
            sum += i;
            tich *= i;
        }

        System.out.println("Tổng là: " + sum);
        System.out.println("Tích là: " + tich);

    }

    public void ex18() {

        long chan = 0;
        long le = 0;

        for (int i : this.ex16()) {

            if (i % 2 == 0) {
                chan++;
            } else {
                le++;
            }

        }

        System.out.println("Số số chẵn: " + chan);
        System.out.println("Số số lẻ: " + le);

    }

    public Boolean isPrimeNumber() {
        Boolean isPrime = true;

        for (int i = 2; i < numValue; i++) {

            if (numValue % i == 0) {
                isPrime = false;
                break;
            }

        }

        return isPrime;

    }

    public boolean ex20() {
        double num = Math.sqrt(numValue);
        return (num % 1 == 0);
    }

    public void ex21_22() {

        ArrayList<Integer> list1 = new Num(a).ex16();
        ArrayList<Integer> list2 = new Num(b).ex16();

        int ucln = 1;

        for (int i : list1) {

            for (int j : list2) {

                if (i == j) {

                    if (ucln < i) {
                        ucln = j;
                    }

                }

            }

        }

        int bcnn = Math.abs((a * b)) / ucln;

        System.out.println("Ước chung lớn nhất: " + ucln);
        System.out.println("Bội chung nhỏ nhất: " + bcnn);


    }

    public ArrayList<Integer> ex26() {

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 1; i < numValue; i++) {
            if (i % 2 == 1) {
                integers.add(i);
            }
        }

        return integers;

    }

    public ArrayList<Integer> ex27() {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 1; i < numValue; i++) {

            if (i % 2 == 1) {
                if (!(i == 7 || i == 21 || i == 41)) {
                    integers.add(i);
                }
            }
        }

        return integers;
    }


}