package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */

public class Teacher extends Person {
    protected int workingAge;


    public void teach(){
        System.out.println("上了节课");
    }
    public int getWorkingAge() {
        return workingAge;
    }

    public void setWorkingAge(int workingAge) {
        this.workingAge = workingAge;
    }
}
