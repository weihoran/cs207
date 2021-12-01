package UseCases;

import Entity.*;
import Presenter.IUserSystemPresenter;

import java.util.ArrayList;

public class UserManager implements IUserManager{
    public static ArrayList<User> userlist;
    private IUserSystemPresenter presenter;

    public UserManager(ArrayList<User> userList, IUserSystemPresenter presenter){
        this.presenter = presenter;
        this.userlist = userList;
    } //denpendcy injection

    public String getUser(String username){
        for(User u : userlist){
            if(u.getUsername().equals(username))
                return u.toString();
        }
        return "no such user";
    }

    public void verifyUser(String id, String password){
        for(User u : userlist){
            if(u.getUsername().equals(id) && u.getPassword().equals(password)) {
                presenter.showLoginResponse(true);
                return;
            }
        }
        presenter.showLoginResponse(false);
    }

    public void createRegularUser(String username, String pw){
        User user = new RegularUser(username, pw);
        userlist.add(user);

        presenter.showRegisterResponse(true);
    }

}
