package Entity;

import java.io.Serializable;

public class SuperUser extends User implements Serializable {
    String privilige;

    public SuperUser(String username,String password){
        super(username,password );
    }

    @Override
    public String toString() {
        return "Regular User{" +
                "username=" + username +
                '}';
    }
}
