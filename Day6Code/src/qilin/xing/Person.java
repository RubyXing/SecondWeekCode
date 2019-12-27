package qilin.xing;/*
 * @author Xingqilin
 */
//三.创建Person类，拥有name、energy属性 ,吃面条、吃面包的行为,将面条和面包的能量转给当前Person对象
public class Person {
    protected String name;
    protected double energy=0;
    protected Food food;

    public Person(String name, double energy) {
        this.name = name;
        this.energy = energy;
    }

    public Person() {
    }

    public void eatFood(Food food){
        energy+=food.energy;
        System.out.println("吃了"+food.name+",能量增加"+food.energy+",当前能量:"+energy);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                '}';
    }

    public static void main(String[] args) {
        Person pser=new Person("xing",100);
        Food food1=new Noodle("拉面",20);
        Food food2=new Bread("法棍",10);
        pser.eatFood(food1);
        System.out.println(pser.toString());
        System.out.println(food2.deteriorate());
        pser.eatFood(food2);
        System.out.println(pser.toString());
    }
}
