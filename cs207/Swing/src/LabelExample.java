import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelExample extends JFrame{
    JTextField tf;
    JLabel l;
    JButton b;

    LabelExample(){
        l = new JLabel("enter");
        tf = new JTextField(20);
        tf.setBounds(50,50, 150,20);
        l.setBounds(50,100, 250,20);
        b = new JButton("Find IP");
        b.setSize(95,30);
        b.setLocation(50,150);
        this.setSize(400,400);
        this.add(b);
        this.add(tf);
        this.add(l);
        this.setLayout(null);
        this.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"success");try{
                    String host=tf.getText();
                    String ip=java.net.InetAddress.getByName(host).getHostAddress();
                    l.setText("IP of "+host+" is: "+ip);
                }catch(Exception ex){System.out.println(ex);}
            }

        });
    }

    public static void main(String[] args) {
        new LabelExample();
    } }
