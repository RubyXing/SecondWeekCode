package qilin.animal;
/*
 * @author Xingqilin
 */

//三.定义Fish类，继承Animal类,拥有fins属性，eat、 swim行为，必须通过构造方法为属性赋值
public class Fish extends Animal {
    private int fins;


    public Fish( String name,int fins, double energy) {
        this.name = name;
        this.energy = energy;
        this.fins = fins;
    }

    public Fish() {
    }

    public void eat(String food) {
        happyValue += 10;
        energy += 5;
        System.out.println(name+"吃了" + food);
    }

    public void swim() {
        System.out.println("游泳");
    }

    @Override
    public void call() {
        System.out.println("吐泡泡");
    }

    @Override
    public String toString() {
        return name;
    }
}
