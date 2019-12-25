package com.qilin.xing;/*
 * @author Xingqilin
 *
 *
 *
 */

//创建程序,在其中定义两个类:Person和TestPerson类。要求如下:
//1 ) Person类有姓名、年龄、性别、身份证、地址属性;
//2 )对年龄(0~ 130)进行合法性的验证;
//3 )对输入的身份证进行位数的合法性验证;
//4 )对性别进行合法性验证;
//5 )在TestPerson类中，输出这些属性的信息;
public class Person {
    private String name, address;
    private boolean sex = true;
    private int age = 0;
    private long idcard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(char sex) {
        switch (sex) {
            case '男':
                this.sex = true;
                break;
            case '女':
                this.sex = false;
                break;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (0 < age && age < 130) {
            this.age = age;
        }
    }

    public long getIdcard() {
        return idcard;
    }

    public void setIdcard(long idcard) {
        if ((Long.toString(idcard)).length() == 18) {
            this.idcard = idcard;
        }
    }

    @Override
    public String toString() {
        String sexout = sex ? "男" : "女";
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sexout +
                ", age=" + age +
                ", idcard=" + idcard +
                '}';
    }
}
