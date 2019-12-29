package qilin.myatmachieve;/*
 * @author Xingqilin
 */

import javax.swing.*;
import java.util.Scanner;

public class Service {
    private boolean loginf = false;
    private UserDao userDao = new UserDao();
    private MenuUI menuUI = new MenuUI();
    Scanner scanner = new Scanner(System.in);

    //startATM
    public void startATM() {
        menuUI.homePage();
        while (true) {
            int i = Integer.parseInt(scanner.nextLine());
            if (i == 1) {
                login();
                break;
            } else if (i == 2) {
                register();
                break;
            } else {
                System.out.println("输入错误");
            }
        }
    }

    //login
    public void login() {
        menuUI.login();
        boolean logflag = true;
        int logtime = 0;
        String uname = "", upwd;
        while (logflag && logtime < 3) {
            System.out.println("请输入账号：");
            uname = scanner.nextLine();
            System.out.println("请输入密码：");
            upwd = scanner.nextLine();
            boolean login = userDao.login(uname, upwd);
            logflag = !login;
            logtime++;
            if (logtime == 3) {
                System.out.println("密码或账号错误次数过多");
                return;
            } else if (!login) {
                System.out.println("输入信息有误，请检查后重新输入");
            }
        }
        if (!logflag) {
            personal(uname);
        }
    }

    //register
    public void register() {
        menuUI.register();
        String uname = "", upwd;
        double money;
        System.out.println("请输入用户名：");
        uname = scanner.nextLine();
        System.out.println("请输入密码：");
        upwd = scanner.nextLine();
        System.out.println("请输入金额：");
        money = Double.parseDouble(scanner.nextLine());
        boolean addin = userDao.add(money, uname, upwd);
        if (!addin) {
            System.out.println("用户已存在，请直接登录");
            login();
        } else {
            personal(uname);
        }
    }

    //personal 存起转每次都要重新查找用户，可优化
    public void personal(String uname) {
        menuUI.personal(uname);
        System.out.println(userDao.showuser(uname));
        int chose = Integer.parseInt(scanner.nextLine());
        switch (chose) {
            case 1:
                accessMoney(uname, 1);
                break;
            case 2:
                accessMoney(uname, -1);
                break;
            case 3:
                transfer(uname);
                break;
            case 4:
                startATM();
                break;
            default:
                System.out.println("输入错误，感谢使用");
                break;
        }


    }

    //saveMoney
    public void accessMoney(String uname, int inout) {
        menuUI.saveMoney(uname);
        System.out.println("请输入操作金额：");
        double money = Double.parseDouble(scanner.nextLine());
        boolean savem = userDao.modify(money * inout, uname, "-1");
        if (savem && inout > 0) {
            System.out.println("存钱成功");
            personal(uname);
        } else if (savem && inout < 0) {
            System.out.println("取钱成功");
            personal(uname);
        } else {
            System.out.println("存钱失败，请重试");
            accessMoney(uname, inout);

        }
    }


    //transfer
    public void transfer(String uname) {
        menuUI.transfer(uname);
        System.out.println("请输入对方账号：");
        String otheracc = scanner.nextLine();
        System.out.println("请输入转账金额：");
        double money = Double.parseDouble(scanner.nextLine());
        if (userDao.find(otheracc)==-1){
            System.out.println("对方账号不存在,请检查");
            transfer(uname);
            return;
        }
        if (userDao.modify(money * -1, uname, "-1")) {
            userDao.modify(money, otheracc, "-1");
            System.out.println("转账成功");
        }else {
            System.out.println("余额不足");
        }
        personal(uname);

    }

}
