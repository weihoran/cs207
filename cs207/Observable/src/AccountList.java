import java.util.HashMap;

public class AccountList {
    private HashMap<String, Account>list;

    public AccountList(){
        this.list = new HashMap<String, Account>();
    }

    public Account createAccount(String username) {
        Account a  = new Account(username);
        list.put(username, a);
        return a;
    }

    public void recordFollows(String s1, String s2){
        Account a1 = this.list.get(s1);
        Account a2 = this.list.get(s2);
        a1.follows(a2);
    }

}
