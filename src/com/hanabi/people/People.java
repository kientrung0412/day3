package com.hanabi.people;

import java.time.Year;

public class People {

    private int birth;

    public People(int birth) {
        this.birth = birth;
    }

    public int age() {

        int yearNow = Integer.parseInt(Year.now().toString());

        return yearNow - birth;

    }

}
