package useCases;

import entity.User;

import java.util.ArrayList;
import java.util.HashMap;

public class userManager {
    private static ArrayList<User> userlist = new ArrayList<User>();

    public User getuser(String id){
        for(User u : userlist){
            if(u.getId().equals(id))
                return u;
        }
        return null;
    }

    public void adduser(User u){
        userlist.add(u);

    }
    public boolean verifyuser(String id, String password){
        for(User u : userlist){
            if(u.getId().equals(id) && u.getPassword().equals(password))
                return true;
        }
        return false;
    }

}
