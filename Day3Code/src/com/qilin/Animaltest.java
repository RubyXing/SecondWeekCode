package com.qilin;/*
 * @author Xingqilin
 *
 *
 *
 */

import com.qilin.xing.Animal;
public class Animaltest extends Animal {
    static {
        System.out.println("Animaltest static");
    }
    {
        System.out.println("Animaltest Code");
    }
    public static void main(String[] args) {
        Animaltest an=new Animaltest();
        Animal ani=new Animal();
        int s= an.a;
        s=ani.a;
        an.testfun();//不报错
    }
}
