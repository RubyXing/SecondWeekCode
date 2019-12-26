package abcpractest;/*
 * @author Xingqilin
 *
 *
 *
 */

public class Bird extends Animal {
    private int footnum;

    public Bird(int footnum,String name,String food) {
        this.footnum = footnum;
        this.name=name;
        this.food=food;
    }

    public Bird() {
    }

    public void fly(){
        System.out.println("飞行");
    }
    @Override
    public void eat() {
        System.out.println("吃了" + food);
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public void breathe() {
        System.out.println("空气呼吸");
    }

    public void setFootnum(int footnum) {
        this.footnum = footnum;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "footnum=" + footnum +
                ", name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
