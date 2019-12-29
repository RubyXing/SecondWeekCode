package qilin.myatmachieve;/*
 * @author Xingqilin
 */

public class MenuUI {
    //homePage
    public void homePage(){
        System.out.println("**********************************************");
        System.out.println("*               欢迎使用ATM1.0                *");
        System.out.println("*                 请输入选项                  *");
        System.out.println("**********************************************");
        System.out.println();
        System.out.println("  1.登录");
        System.out.println();
        System.out.println("  2.注册");
    }

    //login
    public void login() {
        System.out.println("**********************************************");
        System.out.println("*               欢迎使用ATM1.0                *");
        System.out.println("*                  登录页面                   *");
        System.out.println("**********************************************");
    }

    //register
    public void register() {
        System.out.println("**********************************************");
        System.out.println("*               欢迎使用ATM1.0                *");
        System.out.println("*                  注册页面                   *");
        System.out.println("**********************************************");
    }

    //personal
    public void personal(String uname) {
        System.out.println("**********************************************");
        System.out.println("                欢迎登录："+uname);
        System.out.println("*                  个人页面                   *");
        System.out.println("**********************************************");
        System.out.println();
        System.out.println("  1.存钱");
        System.out.println("  2.取钱");
        System.out.println("  3.转账");
        System.out.println("  4.退出");
        System.out.println();
    }

    //saveMoney
    public void saveMoney(String uname) {
        System.out.println("**********************************************");
        System.out.println("                欢迎登录"+uname);
        System.out.println("*                  存钱页面                   *");
        System.out.println("**********************************************");

    }

    //withdrawMoney
    public void withdrawMoney(String uname) {
        System.out.println("**********************************************");
        System.out.println("          欢迎登录"+uname);
        System.out.println("*                  取钱页面                   *");
        System.out.println("**********************************************");

    }

    //transfer
    public void transfer(String uname) {
        System.out.println("**********************************************");
        System.out.println("          欢迎登录"+uname);
        System.out.println("*                  转账页面                   *");
        System.out.println("**********************************************");
    }
}
