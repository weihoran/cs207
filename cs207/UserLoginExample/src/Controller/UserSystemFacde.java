package Controller;

import Gateway.UserFileReaderWriter;
import Presenter.IUserSystemPresenter;
import Presenter.UserSystemPresenter;
import UseCases.UserManager;


import java.util.ArrayList;

public class UserSystemFacde {
    private UserSystemController uc;
    private UserManager um;
    private UserFileReaderWriter uf = new UserFileReaderWriter();
    private IUserSystemPresenter up;

    public UserSystemFacde(){
        ArrayList userList = uf.readUserFromFile();
        up = new UserSystemPresenter();
        um = new UserManager(userList, up);
        uc = new UserSystemController(um);
    }
    //public ArrayList loadingUserDataFromFile(){
      //  return uf.readUserFromFile();
    //}

    public void register(String username, String password){
        uc.register(username,password);

    }

    public void login(String username, String password){
        uc.login(username, password);
    }

    public void exit() {
        uf.saveUserToFile(UserManager.userlist);

    }
}
