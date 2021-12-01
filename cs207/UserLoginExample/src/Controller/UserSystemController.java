package Controller;

import Gateway.UserFileReaderWriter;
import UseCases.IUserManager;
import UseCases.UserManager;

import java.util.ArrayList;
/*
public class UserSystemController {

    private UserManager um;

    public UserSystemController(UserManager um){
        this.um = um;
    }

    public void create(String username, String password){
        um.createRegularUser(username,password);
    }

    public boolean verify(String username, String password){

        return um.verifyUser(username, password);

    }

}
*/
public class UserSystemController {
    private IUserManager um;
    public UserSystemController(UserManager um){
        this.um = um;
    }
    public void register(String username, String password){
        um.createRegularUser(username,password);
    }

    public void login(String username, String password){
        um.verifyUser(username, password);
    }

}













