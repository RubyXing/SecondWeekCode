package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */
//练习:
//1、创建人类，拥有姓名、性别、年龄、身高、体重等属性，吃饭、睡觉等行为
//2、创建学生类，继承人类特征，拥有成绩属性，学习行为
//3、创建教师类，继承人类特征，拥有工龄属性，授课行为
public class Person {
    protected String name;
    protected int age;
    protected double height,weight;
    protected boolean sex;

    static {
        System.out.println("Person static ");
    }
    {
        System.out.println("Person Code");
    }
    public Person(){
        System.out.println("Person public");
    }

    public void eat(String food){
        System.out.println("吃了" + food);
    }
    public void sleep(){
        System.out.println("睡了一觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
