package com.hanabi.geometry;

public class Geometry {

    private int h;
    private int a;
    private int b;

    public Geometry(int h) {
        this.h = h;
    }

    public Geometry(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void triangle() {

        for (int i = 1; i <= h; i++) {

            String line = "";

            for (int j = h; j >= i; j--) {
                line += " ";
            }

            for (int j = 1; j <= i; j++) {
                line += " * ";
            }

            System.out.println(line);

        }

    }

    public void triangleEmpty() {

        for (int i = 1; i <= h; i++) {

            String line = "";

            for (int j = h; j >= i; j--) {
                line += " ";
            }

            if (i != h) {
                for (int j = 1; j <= i; j++) {

                    if (j == 1 || j == i) {
                        line += " * ";
                    } else {
                        line += "   ";
                    }

                }
            } else {
                for (int j = 1; j <= i; j++) {
                    line += " * ";
                }
            }

            System.out.println(line);

        }

    }

    public void triangleQuare() {
        for (int i = 1; i <= h; i++) {

            String line = "";

            for (int j = 1; j <= i; j++) {
                line += " * ";
            }

            System.out.println(line);

        }
    }

    public void triangleQuareEmpty() {

        for (int i = 1; i <= h; i++) {

            String line = "";

            if (i != h) {
                for (int j = 1; j <= i; j++) {

                    if (j == 1 || j == i) {
                        line += " * ";
                    } else {
                        line += "   ";
                    }

                }
            } else {
                for (int j = 1; j <= i; j++) {
                    line += " * ";
                }
            }

            System.out.println(line);

        }
    }

    public void Rectangle() {

        for (int i = 1; i <= a; i++) {

            String line = "";

            for (int j = 1; j <= b; j++) {
                line += " * ";
            }

            System.out.println(line);

        }

    }

    public void RectangleEmpty() {

        for (int i = 1; i <= a; i++) {

            String line = "";


            for (int j = 1; j <= b; j++) {

                if (i == 1 || i == a) {
                    line += " * ";
                } else {

                    if (j==1 || j ==b){
                        line += " * ";
                    } else {
                        line += "   ";
                    }

                }


            }


            System.out.println(line);

        }

    }

}
