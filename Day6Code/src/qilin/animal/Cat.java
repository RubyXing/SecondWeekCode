package qilin.animal;/*
 * @author Xingqilin
 */

//二.定义Cat类,继承Animal类，拥有earCount属性，eat行为，必须通过构造方法为属性赋值
public class Cat extends Animal {
    private int earCount;


    public Cat(String name,int earCount,double energy) {
        this.name=name;
        this.energy=energy;
        this.earCount = earCount;
    }

    public Cat() {
    }

    public void eat(String food){
        happyValue+=10;
        energy+=5;
        System.out.println(name+"吃了" + food);
    }

    @Override
    public void call() {
        System.out.println("喵喵~");
    }

    @Override
    public String toString() {
        return name;
    }
}
