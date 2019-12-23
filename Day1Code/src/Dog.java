public class Dog {
    protected String name,type;
    protected int age;
    protected double weight;

    public Dog() {
    }

    public Dog(String name, int age, String type, double weight) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.weight = weight;
    }

    public void eat(String food) {
        System.out.println("吃了" + food);
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void play() {
        System.out.println("玩");
    }
}
