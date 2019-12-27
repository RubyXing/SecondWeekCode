package qilin.xing;

/*
 * @author Xingqilin
 */
//创建Food抽象类,拥有name、energy属性 ，deteriorate()行为;
//二.创建Noodle、Bread子类 ,继承Food ,并实现其行为;
//三.创建Person类，拥有name、energy属性 ,吃面条、吃面包的行为,将面条和面包的能量转给当前Person对象
public abstract class Food {
    protected String name;
    double energy;

    public abstract String deteriorate();
}
