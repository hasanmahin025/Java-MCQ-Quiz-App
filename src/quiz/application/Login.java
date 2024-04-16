package quiz.application;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    JButton b1, b2, b3;
    JTextField t1, t2;
      Login()
      {
           getContentPane().setBackground(Color.WHITE);
         setLayout(null);
         
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/labfinal.jpg"));
          
          JLabel I1 = new JLabel(i1);
          I1.setBounds(0 , 0 , 500 , 440);
          add(I1);
          JLabel l2 = new JLabel("MCQ TEST LOGIN");
        l2.setFont(new Font("Monospace", Font.BOLD, 35));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(510, 60, 350, 45);
        add(l2);
        
                JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(510, 130, 300, 20);
        add(l3);
        
       t1 = new JTextField();
        t1.setBounds(510, 160, 200, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
          JLabel l4 = new JLabel("Enter Your ID");
        l4.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l4.setForeground(new Color(30, 144, 254));
        l4.setBounds(510, 200, 300, 20);
        add(l4);
        
        t2 = new JTextField();
        t2.setBounds(510, 230, 300, 25);
        t2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t2);
        
      b1 = new JButton("Exit");
      b1.setBounds(510, 300, 120, 30);
      b1.setBackground(new Color(30, 144 , 254));
      b1.setForeground(Color.WHITE);
      b1.setFont(new Font("Times New Roman",Font.BOLD,20));
      b1.addActionListener(this);
      add(b1);
      
        b2 = new JButton("Start");
        b2.setBounds(660, 300, 120, 30);
        b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
          JLabel l5 = new JLabel("Developed by : Md. Mahedi Hasan Mahin");
        l5.setFont(new Font("Monospace", Font.BOLD, 20));
        l5.setForeground(new Color(30, 144, 254));
        l5.setBounds(500, 385, 400, 35);
        add(l5);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setSize(900 , 600);
          setLocation(200 , 50);
          setVisible(true);
      }
      public void actionPerformed(ActionEvent e) {
          
          if(e.getSource() == b1)
          {
              System.exit(0);
          }
          else
          {
              if(t1.getText().equals("") || t2.getText().equals(""))
              {
                  JOptionPane.showMessageDialog(this,"You have to fill your name and ID","Alert",JOptionPane.WARNING_MESSAGE);
                this.setVisible(true);
              }
            else
              {    this.setVisible(false);
                  new Rules(t1.getText(),t2.getText());
             }
       }
          
      }
    
    public static void main(String[] args) {
        
        new Login();
    }

  

  
   

  
}
