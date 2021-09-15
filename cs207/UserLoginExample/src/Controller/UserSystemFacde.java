package Controller;

import Gateway.UserFileReaderWriter;
import UseCases.UserManager;


import java.util.ArrayList;

public class UserSystemFacde {
    UserSystemController uc;
    UserManager um;
    private UserFileReaderWriter uf = new UserFileReaderWriter();


    public UserSystemFacde(){
        ArrayList userList = uf.readUserFromFile();
        um = new UserManager(userList);
        uc = new UserSystemController(um);
        //up = new UserSystemPresenter(um);

    }
    public ArrayList loadingUserDataFromFile(){
        return uf.readUserFromFile();
    }

    public void register(String username, String password){
        uc.create(username,password);
    }

    public boolean login(String username, String password){

        return uc.verify(username, password);

    }

    public void exit() {
        uf.saveUserToFile(UserManager.userlist);

    }
}
