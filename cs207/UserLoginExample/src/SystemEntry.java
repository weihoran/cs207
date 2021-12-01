import Controller.UserSystemFacde;
import View.LoginFrame;

import javax.swing.*;

public class SystemEntry {

    public static void main (String [] args) {

        UserSystemFacde facade = new UserSystemFacde();
        LoginFrame frame = new LoginFrame(facade);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                facade.exit();
            }
        });

        frame.setVisible (true);
    }
}
