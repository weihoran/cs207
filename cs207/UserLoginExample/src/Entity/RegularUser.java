package Entity;

import java.io.Serializable;

public class RegularUser extends User implements Serializable{


    public RegularUser(String username,String password){
        super(username,password );
    }

    @Override
    public String toString() {
        return "Regular User{" +
                "username=" + username +
                '}';
    }

}

