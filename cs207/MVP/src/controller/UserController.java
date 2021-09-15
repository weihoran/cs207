package controller;

import entity.User;
import useCases.userManager;

public class UserController implements IController{
    private userManager um = new userManager();

    public void createUser(String id, String password){
        User user = new User(id,password);
        um.adduser(user);
    }

    public boolean loginUser(String id, String password){
        return um.verifyuser(id,password);

    }


}
