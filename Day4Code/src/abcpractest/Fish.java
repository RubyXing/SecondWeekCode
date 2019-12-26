package abcpractest;/*
 * @author Xingqilin
 *
 *
 *
 */

public class Fish extends Animal {
    private int finnum;

    public Fish(int finnum,String name,String food) {
        this.finnum = finnum;
        this.name=name;
        this.food=food;
    }

    public Fish() {
    }

    public void swim(){
        System.out.println("游泳的方法");
    }
    @Override
    public void eat() {
        System.out.println("吃了" + food);
    }

    @Override
    public void sleep() {
        System.out.println("水里睡觉");
    }

    @Override
    public void breathe() {
        System.out.println("水之呼吸");
    }

    public void setFinnum(int finnum) {
        this.finnum = finnum;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "finnum=" + finnum +
                ", name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
