package Entity;

import java.io.Serializable;

public class regularUser implements IUser, Serializable {

    private String username;
    private String password;


    public regularUser(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userid) {
        this.username = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Regular User{" +
                "username=" + username +
                '}';
    }
}

