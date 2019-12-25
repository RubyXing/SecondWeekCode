package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */

//    创建一个Fish类,拥有type、 food. weight. color属性 ，eat、swam、bubble行为;
public class Fish extends Animal {
    private String color;

    public void swam(){
        System.out.println("fish swam");
    }
    public void bubble(){
        System.out.println("fish bubble");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "fish"+super.toString()+
                "color:"+color;
    }
}
