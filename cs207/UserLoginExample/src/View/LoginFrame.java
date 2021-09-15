package View;

import Controller.UserSystemFacde;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JLabel userLabel;
    private JTextField useridInput;
    private JLabel passwordLabel;
    private JPasswordField passwordInput;
    private JButton registerbutton;
    private JButton loginbutton;
    private JPanel panel;
    final int FRAME_HEIGHT = 500;
    final int FRAME_WIDTH = 500;
    UserSystemFacde facade;

    public LoginFrame(UserSystemFacde facade){
        this.facade = facade;
        panel = new JPanel();

        userLabel  = new JLabel("Username: ");
        panel.add(userLabel);

        useridInput = new JTextField(20);
        panel.add(useridInput);

        passwordLabel  = new JLabel("Password: ");
        panel.add(passwordLabel);

        passwordInput = new JPasswordField(20);
        panel.add(passwordInput);

        registerbutton = new JButton("register");
        panel.add(registerbutton);

        loginbutton = new JButton("login");
        panel.add(loginbutton);


        registerbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //your code for registering
                String id = useridInput.getText();
                String password = passwordInput.getText();
                facade.register(id,password);
                JOptionPane.showMessageDialog(null,"success");
            }
        });


        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //your code for verifying user
                String id = useridInput.getText();
                String password = passwordInput.getText();
                boolean response = facade.login(id,password);
                if(response == false)
                    JOptionPane.showMessageDialog(null,"invalid user");
                else{
                    LoginFrame.this.setVisible(false);
                    JFrame userHomeframe = new UserHomeFrame(id,facade);
                    userHomeframe.setVisible(true);
                }

            }
        });


        this.setLayout (null);
        panel.setSize(250,250);
        panel.setLocation((FRAME_WIDTH-250) / 2, (FRAME_HEIGHT - 250) / 2);
        this.add (panel);
        this.setSize (FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle ("User Login");

    }


}







