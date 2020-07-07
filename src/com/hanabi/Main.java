package com.hanabi;

import com.hanabi.geometry.Geometry;
import com.hanabi.num.Num;
import com.hanabi.people.People;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
//
//        Year year = new Year(2020);
//        year.ex25();
//        System.out.println();
//
//        Num num = new Num(90);
//        System.out.println(num.ex27());
//
//
//
        Geometry geometry = new Geometry(5, 3);
        geometry.RectangleEmpty();
        System.out.println();
        geometry.Rectangle();

        Geometry geometry1 = new Geometry(5);
        geometry1.triangle();
        System.out.println();
        geometry1.triangleEmpty();
        System.out.println();
        geometry1.triangleQuare();
        System.out.println();
        geometry1.triangleQuareEmpty();

//        People people = new People(2000);
//        System.out.println(people.age());

    }
}
