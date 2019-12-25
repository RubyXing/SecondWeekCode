package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */

public class Square extends PlaneFigure {
    private double width;
    private double flong;

    public Square(double width, double flong) {
        this.width = width;
        this.flong = flong;
    }

    @Override
    public double countArea() {
        return width*flong;
    }

    @Override
    public double countPerimeter() {
        return (width+flong)*2;
    }

    @Override
    public String toString() {
        return "Area="+countArea()+" ,Perimeter="+countPerimeter();
    }
}
