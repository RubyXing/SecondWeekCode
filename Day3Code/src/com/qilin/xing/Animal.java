package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */
//创建一个Bird类 ,拥有type、food、 weight、 legCount属性 ，eat、fly行为;
public class Animal {
    private String type,food;
    private double weight;

    public String eat(String eat){
        return "吃" + eat;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", food='" + food + '\'' +
                ", weight=" + weight
                ;
    }
}
