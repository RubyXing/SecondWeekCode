package qilin.myatmachieve;/*
 * @author Xingqilin
 */

public class Users {
    private double money;
    private String uname,upwd;

    public Users(double money, String uname, String upwd) {
        this.money = money;
        this.uname = uname;
        this.upwd = upwd;
    }

    public Users() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    @Override
    public String toString() {
        return  "当前用户："+uname + ',' + "当前余额:" + money + '}';
    }
}
