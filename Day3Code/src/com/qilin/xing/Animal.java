package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */
//创建一个Bird类 ,拥有type、food、 weight、 legCount属性 ，eat、fly行为;
public class Animal {
    protected String type,food;
    protected double weight;
    public int a=1;
    private int b=2;
    int c=3;

    static {
        System.out.println("Animal static");
    }
    {
        System.out.println("Animal Code");
    }
    public Animal(int i ){

    }
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
    protected void testfun(){
        System.out.println("test");
    }
}
