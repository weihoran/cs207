package controller;

public interface IController {
    void createUser(String id, String password);
    boolean loginUser(String id, String password);
}
