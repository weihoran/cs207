package twitter;

public class Twitter {

    public static void main(String[] args) {

           AccountList accounts = new AccountList();
           Account a1 = accounts.createAccount("dianelynn");
           Account a2 = accounts.createAccount("barack");
           Account a3 = accounts.createAccount("Oprah");


            a2.tweet("Hello World");
            accounts.recordFollows("dianelynn","barack");


            a2.tweet("I love rutabagas");
            a1.tweet("Me too");
            accounts.recordFollows("barack","Oprah");
            a2.tweet("Totally");
            a3.tweet("Are you kidding @barack?");



    }



}
