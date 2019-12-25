package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */

import java.text.DecimalFormat;

public class Circular extends PlaneFigure {
    private double radius;

    public Circular(double radius){
        this.radius=radius;
    }


    @Override
    public double countArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double countPerimeter() {
        return  radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Area="+
                new DecimalFormat("0.00").format(countArea())+
                " ,Perimeter="+
                new DecimalFormat("0.00").format(countPerimeter());
    }
}
