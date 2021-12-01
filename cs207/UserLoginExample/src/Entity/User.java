package Entity;

import java.io.Serializable;

public abstract class User implements Serializable {

    public String username;
    public String password;

    public User(String username,String password){
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
