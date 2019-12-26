package abcpackage;/*
 * @author Xingqilin
 *
 *
 *
 */

import java.text.DecimalFormat;

public class Cylinder implements C {
    private double radius, height;
    private String color;

    public Cylinder(double radius, double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    public Cylinder() {
    }

    @Override
    public void volume() {
        String vol = new DecimalFormat("0.00").format(radius * PI * radius * height);
        System.out.print("volume=" + vol);
    }

    @Override
    public double area() {
        double area = radius * radius * PI*2 + (radius * 2 * PI * height);
        return area;
    }

    @Override
    public void setColor(String str) {
        this.color = color;
    }

    @Override
    public String toString() {
        System.out.print("圆柱体:");
        volume();
        return ",area=" + area() +
                ", color='" + color +"'";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
