package UseCases;

import Entity.IUser;
import Entity.regularUser;

import java.util.ArrayList;

public class UserManager {
    public static ArrayList<IUser> userlist;

    public UserManager(ArrayList<IUser> userList){
        userlist = userList;
    } //denpendcy injection

    public String getUser(String username){
        for(IUser u : userlist){
            if(u.getUsername().equals(username))
                return u.toString();
        }
        return "no such user";
    }

    public boolean verifyUser(String id, String password){
        for(IUser u : userlist){
            if(u.getUsername().equals(id) && u.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public void createRegularUser(String username, String pw){
        regularUser user = new regularUser(username, pw);
        userlist.add(user);
    }

}
