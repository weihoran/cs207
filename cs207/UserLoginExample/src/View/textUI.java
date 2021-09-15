package View;

import Controller.UserSystemController;
import Controller.UserSystemFacde;
import UseCases.UserManager;

import java.util.Scanner;

public class textUI {
    public static void main(String[] args){
        UserSystemFacde facade = new UserSystemFacde();

        Scanner in = new Scanner (System.in);

        while(true) {
            System.out.println("enter 1 to register, 2 to login, 0 to exit");
            int option = in.nextInt();
            if (option == 1) {
                System.out.println("Please enter username");
                in.nextLine();
                String username = in.nextLine();
                System.out.println("Please enter password");
                String pw = in.nextLine();
                facade.register(username, pw);
            }

            else if (option == 2) {
                System.out.println("Please enter username");
                in.nextLine();
                String username = in.nextLine();
                System.out.println("Please enter password");
                String pw = in.nextLine();
                if (facade.login(username, pw)) {
                    System.out.println("login successful");
                } else
                    System.out.println("wrong username or password");
            }
            else if (option == 0){
                facade.exit();
                break;
            }


        }

    }




}
