package qilin.myatmachieve;/*
 * @author Xingqilin
 */

import java.util.ArrayList;

public class UserDao {
    private UserSingleDB single = UserSingleDB.getUsersDB();

    //adduser
    public boolean add(double money, String uname, String upwd) {
        ArrayList<Users> userdb = single.getuserdb();
        if (find(uname) != -1) {
            return false;
        } else {
            Users nuser = new Users(money, uname, upwd);
            userdb.add(nuser);
            single.saveuserdb(userdb);
            return true;
        }

    }

    //modify
    public boolean modify(double money, String uname, String upwd) {
        ArrayList<Users> userdb = single.getuserdb();
        if (find(uname) == -1) {
            return false;
        }
        Users muser=userdb.get(find(uname));
        if (muser.getMoney()+money<0){
            return false;
        }
        muser.setMoney(muser.getMoney()+money);
        muser.setUname(uname);
        if (upwd!="-1"){
            muser.setUpwd(upwd);
        }
        userdb.set(find(uname),muser);
        single.saveuserdb(userdb);
        return true;
    }


    //find
    public int find(String uname) {
        ArrayList<Users> userdb = single.getuserdb();
        Users user;
        int i;
        for (i = 0; i < userdb.size(); i++) {
            user = userdb.get(i);
            if (uname.equals(user.getUname())) {
                return i;
            }
        }
        return -1;
    }

    //login
    public boolean login(String uname, String upwd) {
        if (find(uname)==-1){
            return false;
        }
        Users user = single.getuserdb().get(find(uname));
        if (uname.equals(user.getUname()) && upwd.equals(user.getUpwd())) {
            return true;
        }
        return false;
    }

    //showuser
    public String showuser(String uname) {
        Users showuser = single.getuserdb().get(find(uname));
        return showuser.toString();
    }
}
