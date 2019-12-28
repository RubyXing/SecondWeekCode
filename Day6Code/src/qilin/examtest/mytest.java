package qilin.examtest;/*
 * @author Xingqilin
 */

public class mytest {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

class Father {
    public Father() {
        System.out.println("父无参");
    }

    public Father(String a) {
        System.out.println("父有参数");
    }
}

class Child extends Father {
    public Child() {
        this("dd");
        System.out.println("子无参数");
    }

    public Child(String a) {
        super("dd");
        System.out.println("子有参数");
    }
}