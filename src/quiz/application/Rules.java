
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * @author hasan Mahin
 */

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username, id;
    Rules(String username, String id){
        this.username = username;
        this.id = id;
        setBounds(300, 200, 900, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setLocation(250,100);
        this.setVisible(true);
        
        JLabel l1 = new JLabel("Welcome " + username + " to Java MCQ Test");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Monospace", Font.BOLD, 28));
        l1.setBounds(50, 20, 800, 30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Time New Roman", Font.PLAIN, 16));
        l2.setBounds(50, 70, 700, 350);
        l2.setText(
            "<html>"+ 
                "1. You just click the correct answer's checkbox to answer the question" + "<br><br>" +
                "2. For every MCQ you get 60 seconds to complete" + "<br><br>" +
                "3. You can't go back, You can go just forward" + "<br><br>" +
                "4. Don't cheat on exam." + "<br><br>" +
                "5. May you know more than your friends.So,don't take help form others, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(l2);

        b2 = new JButton("Start Test");
        b2.setBounds(500, 380, 120, 40);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
       new MCQ(username, id);
    }
    
}