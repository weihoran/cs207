package View;

import Controller.UserSystemFacde;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;

public class UserHomeFrame extends JFrame {


    private String username;
    private JButton ViewMyEvents;
    private JButton ViewAllEvents;
    private JList MyEvents;
    private JList SystemEvents;
    private JPanel panel;
    private final int FRAME_HEIGHT = 500;
    private final int FRAME_WIDTH = 500;
    private JPopupMenu AllEventsPopupMenu;
    UserSystemFacde facade;


    private ArrayList<String> myEvents = new ArrayList<>();
    private ArrayList<String> systemAllEvents = new ArrayList<String>();


    public UserHomeFrame(String username, UserSystemFacde facade){
        //Only for Simulation
        this.facade = facade;
        myEvents.add("Event A");
        systemAllEvents.add("Event B 2020/12/01/ David and Mario");
        systemAllEvents.add("Event C");
        systemAllEvents.add("Event D");
        //

        this.username = username;
        panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));

        ViewMyEvents = new JButton("MyEvents");
        panel.add(ViewMyEvents);

        MyEvents = new JList();
        panel.add(MyEvents);

        ViewAllEvents = new JButton("System AllEvents");
        panel.add(ViewAllEvents);

        SystemEvents = new JList();
        AllEventsPopupMenu = new JPopupMenu();
        JMenuItem addtoMyEvents = new JMenuItem("register event");
        JMenuItem removeEvents = new JMenuItem("remove");
        AllEventsPopupMenu.add(addtoMyEvents);
        AllEventsPopupMenu.add(removeEvents);
        SystemEvents.add(AllEventsPopupMenu);
        panel.add(SystemEvents);


        ViewMyEvents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyEvents.setListData(myEvents.toArray());
            }
        });

        ViewAllEvents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SystemEvents.setListData(systemAllEvents.toArray());
            }
        });

        SystemEvents.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == 3 && SystemEvents.getSelectedIndex()!=-1){
                    Object selected = SystemEvents.getModel().getElementAt(SystemEvents.getSelectedIndex());
                    AllEventsPopupMenu.show(e.getComponent(),e.getX(), e.getY());
                }

            }
        });



        addtoMyEvents.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                Object selected = SystemEvents.getModel().getElementAt(SystemEvents.getSelectedIndex());
                myEvents.add(selected.toString());
                ViewMyEvents.doClick();
            }
        });

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                facade.exit();
            }
        });

        this.add (panel, BorderLayout.CENTER);
        this.setSize (FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle (username + "'s Homepage");

    }

}
