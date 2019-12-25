package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */
//二.创建一个Bird类 ,拥有type、food、 weight、 legCount属性 ，eat、fly行为;
public class Bird extends Animal{
    protected String legCount;

    public void fly(){
        System.out.println("bird fly");
    }
    public String getLegCount() {
        return legCount;
    }

    public void setLegCount(String legCount) {
        this.legCount = legCount;
    }

    @Override
    public String toString() {
        return "bird"+super.toString()+
                "legCount:"+legCount;
    }
}
