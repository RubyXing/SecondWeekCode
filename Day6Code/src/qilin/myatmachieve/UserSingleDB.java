package qilin.myatmachieve;

import java.util.ArrayList;

public class UserSingleDB {
    private static UserSingleDB usersDB = null;
    private ArrayList<Users> userdb = new ArrayList<>();

    private UserSingleDB() {
        Users user1 = new Users(50000, "xing", "xing123");
        Users user2 = new Users(5000, "zhang", "zhang123");
        Users user3 = new Users(3000, "ruby", "ruby123");
        userdb.add(user1);
        userdb.add(user2);
        userdb.add(user3);
    }

    public static UserSingleDB getUsersDB() {
        if (usersDB == null) {
            usersDB = new UserSingleDB();
        }
        return usersDB;
    }

    public void saveuserdb(ArrayList<Users> userdb) {
        this.userdb = userdb;
    }

    public ArrayList<Users> getuserdb() {
        return userdb;
    }
}
