package com.hanabi.student;

public class Student {

    private double scoreMath;
    private double scorePhysical;
    private double scoreChemistry;
    private int studentId;
    private String studentName;

    public Student(double scoreMath, double scorePhysical, double scoreChemistry, int studentId, String studentName) {
        this.scoreMath = scoreMath;
        this.scorePhysical = scorePhysical;
        this.scoreChemistry = scoreChemistry;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    private double avgScore() {
        return (scoreMath + scoreChemistry + scorePhysical) / 3;
    }

    private void ex34(){

        double avg = this.avgScore();

        if ( avg < 5 ){
            System.out.println("Xếp loại yếu");
        } else if ( avg > 5 &&  avg < 6.5 ){
            System.out.println("Xếp loại trung bình");
        } else if ( avg > 6.5 && avg < 8 ){
            System.out.println("Xếp loại khá");
        } else {
            System.out.println("Xếp loại giỏi");
        }

    }

}
