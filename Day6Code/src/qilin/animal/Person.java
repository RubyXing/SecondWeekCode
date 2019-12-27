package qilin.animal;

/*
 * @author Xingqilin
 */
//四.定义Person类,拥有name、happyValue属性 ，feed行为，喂了宠物后,主人愉悦度可以增加、宠物的愉悦度和能量会增加，必须通过构造方法为属性赋值
public class Person {
    private String name;
    private double happyValue = 50, energy = 100;
    private boolean animaleater = false;

    public Person(String name, double happyValue, double energy) {
        this.name = name;
        this.happyValue = happyValue;
        this.energy = energy;
    }

    public Person() {
    }

    public boolean checkHappy() {
        if (happyValue <= 0) {
            System.out.println("你已经死了不能操作");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkEnergy() {
        if (energy <= 0) {
            System.out.println("你太累了不能操作");
            return false;
        } else {
            return true;
        }
    }

    public void feed(Animal animal, String food) {
        if (checkHappy() && checkEnergy()) {
            happyValue += 5;
            animal.eat(food);
            System.out.println("你喂了" + animal.name + "，你的快乐提高了5，当前快乐值:" + happyValue);
        }
    }

    public void eat(){
        if (!animaleater){
            energy+=5;
            System.out.println("你吃了饭，energy+5");
        }else {
            energy+=0.5;
            System.out.println("由于红烧菜太好吃了，你吃饭味同嚼蜡，energy+0.5");
        }
    }
    public void eat(Animal animal) {
        if (checkHappy()) {
            happyValue -= 50;
            energy += animal.energy;
            System.out.println("由于饥饿你吃了" + animal.beEat() + "快乐降低50,能量增加：" + animal.energy);
            animaleater=true;
            if (happyValue <= 0) {
                System.out.println("你虽然吃饱了，但由于太难过所以选择自杀了");
            } else {
                System.out.println("你虽然吃饱的但很难过，警惕：太难过会自杀");
            }
        }
    }

    @Override
    public String toString() {
        return "当前属性：{" +
                "name='" + name + '\'' +
                ", happyValue=" + happyValue +
                ", energy=" + energy +
                '}';
    }

    public boolean isAnimaleater() {
        return animaleater;
    }

    public void setAnimaleater(boolean animaleater) {
        this.animaleater = animaleater;
    }

    public void energyLost(int i) {
        energy -= 2 * i;
        System.out.println("你的energy 损失:" + (i * 2));
    }
}
