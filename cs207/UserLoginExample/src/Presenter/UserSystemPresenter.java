package Presenter;

public class UserSystemPresenter implements IUserSystemPresenter{

    public void showRegisterResponse(Boolean registerResult){
        if(registerResult)
            System.out.println("user successfully registered");
        else
            System.out.println("register failed");

    }

    @Override
    public void showLoginResponse(Boolean loginResult) {
        if(loginResult)
            System.out.println("user successfully logined in");
        else
            System.out.println("login failed");
    }

}