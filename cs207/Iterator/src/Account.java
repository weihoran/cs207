/*import java.util.Observable;
import java.util.Observer;

public class Account extends Observable implements Observer {

    private String username;
    private int numOfTweets;
    //private String message;

    public Account(String username){
        this.username = username;
    }

    public void follows(Account a){
        a.addObserver(this);
    }

    public void tweet(String message){
        //this.message = message;
        ++numOfTweets;
        setChanged();
        notifyObservers(message);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("%s (%d tweets) found out that %s (%d tweets) tweeted '%s' \n", this.username, this.numOfTweets, ((Account)o).username, ((Account)o).numOfTweets, arg);
    }
}
*/

import java.util.Observable;
import java.util.Observer;

public class Account extends Observable implements Observer{
    private String username;
    private int numOfTweets;

    public Account(String username){
        this.username = username;
    }

    public void follows(Account target){
        target.addObserver(this);
    }

    public void tweet(String message){
        setChanged();
        numOfTweets++;
        notifyObservers(message);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("%s (%d tweets) found out that %s(%d tweets) tweeted '%s' \n",this.username,this.numOfTweets,((Account)o).username, ((Account)o).numOfTweets, arg);
        //System.out.println(this.username + "("+ this.numOfTweets + "tweets"+")");
    }
}
























































