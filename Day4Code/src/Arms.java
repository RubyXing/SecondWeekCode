//1.创建一-个Arms抽象类,拥有攻击力、防御力属性，平A、放大行为;
//2.创建一 个Arms的Knife子类,拥有长、厚度、损耗属性,修理行为,并实现平A、放大行为;
//3.创建一 个Arms的PoisonNeedle子类,拥有针长、毒药类型属性,绣花行为，并实现平A、放大行为;
public abstract class Arms {
    protected double aPwoer,defense;

    public Arms(double aPwoer, double defense) {
        this.aPwoer = aPwoer;
        this.defense = defense;
    }

    public Arms() {
    }
    protected abstract String attact(String str);
    protected abstract String ultimateskil(String str);

}
