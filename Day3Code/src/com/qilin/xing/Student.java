package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */

public class Student extends Person {
    protected double grade;

    public void study(){
        System.out.println("学习了");
    }
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
