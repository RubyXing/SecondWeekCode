package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */

public class TestPerson {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setAddress("yiasd123");
        person1.setAge(23);
        person1.setIdcard(500112312312312318l);
        person1.setName("张三");
        person1.setSex('男');
        System.out.println(person1.toString());
    }
}
