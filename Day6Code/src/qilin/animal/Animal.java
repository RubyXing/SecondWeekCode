package qilin.animal;/*
 * @author Xingqilin
 */

//定义Animal抽象类,拥有name、happyValue、 energy属性，call行为;
//二.定义Cat类,继承Animal类，拥有earC ount属性，eat行为，必须通过构造方法为属性赋值
//三.定义Fish类，继承Animal类,拥有fins属性，eat、 swim行为，必须通过构造方法为属性赋值
//四.定义Person类,拥有name、happyValue属性 ，feed行为，喂了宠物后,主人愉悦度可以增加、宠物的愉悦度和能量会增加，必须通过构造方法为属性赋值
public abstract class Animal {
    protected String name;
    protected double happyValue=0,energy=0;

    public abstract void call();
    public abstract void eat(String food);
    public String beEat(){
        return "红烧"+name;
    }

}
