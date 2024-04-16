package quiz.application;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * @author Hasan mahin
 */
public class Score extends JFrame implements ActionListener{
    
    Score(String username,String id, int score){
        setBounds(300, 200, 900, 550);
        getContentPane().setBackground(Color.WHITE);
        setLocation(250,100);
        setLayout(null);
        this.setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        
        JLabel l2 = new JLabel("Thank you " + username + " for participating the quiz exam");
        l2.setBounds(45, 30, 850, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);
        
        JLabel l3 = new JLabel("Your Name : " + username);
        l3.setBounds(350, 150, 380, 30);
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBackground(Color.BLUE);
        add(l3);
                
        JLabel l4 = new JLabel("Your ID      : " + id);
        l4.setBounds(350, 190, 380, 30);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 26));
        l4.setForeground(new Color(30, 144, 254));
        add(l4);
        
        JLabel l5 = new JLabel("Your Score is : " + score);
        l5.setBounds(350, 250, 300, 30);
        l5.setFont(new Font("Bold", Font.PLAIN, 30));
        l5.setForeground(new Color(30, 144, 254));
        add(l5);
        
        JButton b1 = new JButton("Exit");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("time new roman", Font.PLAIN, 20));
        b1.addActionListener(this);
        b1.setBounds(600, 400, 120, 40);
        add(b1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        System.exit(0);
    }
    
}