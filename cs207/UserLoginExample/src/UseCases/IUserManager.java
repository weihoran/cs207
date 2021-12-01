package UseCases;

public interface IUserManager {
    String getUser(String username);
    void verifyUser(String id, String password);
    void createRegularUser(String username, String pw);

}
