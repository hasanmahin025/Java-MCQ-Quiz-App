package quiz.application;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/*
 * @author Hasan Mahhin
 */
public class MCQ extends JFrame implements ActionListener{
    
    JButton next, submit;
    public static int count = 0;
    public static int timer = 59;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username, id;
    MCQ(String username, String id){
        this.username = username;
        this.id = id;
        setBounds(300, 200, 900, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setLocation(250,100);
        this.setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/cover.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 900, 150);
        add(l1);
        
        qno = new JLabel("");
        qno.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        qno.setBounds(80, 160, 50, 30);
        qno.setForeground(new Color(30, 144, 254));
        qno.setBackground(Color.WHITE);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        question.setBounds(100, 160, 900, 30);
        question.setForeground(new Color(30, 144, 254));
        question.setBackground(Color.WHITE);
        add(question);
        
        q[0][0] = "Number of primitive data types in Java are?";
        q[0][1] = "6";
        q[0][2] = "7";
        q[0][3] = "9";
        q[0][4] = "8";

        q[1][0] = "Automatic type conversion is possible in which of the possible cases?";
        q[1][1] = "int to long";
        q[1][2] = "byte to int";
        q[1][3] = "long to int";
        q[1][4] = "short to byte";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "When is the object created with new keyword?";
        q[3][1] = "At run time";
        q[3][2] = "At compile time";
        q[3][3] = "Depends on the code";
        q[3][4] = "None";

        q[4][0] = "Identify the corrected definition of a package?";
        q[4][1] = "A package is collection of editing tools";
        q[4][2] = "A package is collection of classes";
        q[4][3] = "A package is collection of classes and interfaces";
        q[4][4] = "A package is collection of interfaces";

        q[5][0] = "Total constructor string class have?";
        q[5][1] = "3";
        q[5][2] = "7";
        q[5][3] = "13";
        q[5][4] = "12";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "Identify the return type of a method that does not return any value?";
        q[7][1] = "int";
        q[7][2] = "void";
        q[7][3] = "double";
        q[7][4] = "None";

        q[8][0] = "Where does the system stores parameters and local variables whenever a method is invoked?";
        q[8][1] = "Heap";
        q[8][2] = "Stack";
        q[8][3] = "Array";
        q[8][4] = "Tree";

        q[9][0] = "  Identify the modifier which cannot be used for constructor?";
        q[9][1] = "Public";
        q[9][2] = "Protected";
        q[9][3] = "private";
        q[9][4] = "static";
        
        qa[0][1] = "8";
        qa[1][1] = "int to long";
        qa[2][1] = "java.util package";
        qa[3][1] = "At run time";
        qa[4][1] = "A package is collection of classes and interfaces";
        qa[5][1] = "13";
        qa[6][1] = "import";
        qa[7][1] = "void";
        qa[8][1] = "Stack";
        qa[9][1] = "static";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(160, 200, 700, 30);
        opt1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        opt1.setForeground(new Color(30, 144, 254));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(160, 240, 700, 30);
        opt2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        opt2.setForeground(new Color(30, 144, 254));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(160, 280, 700, 30);
        opt3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        opt3.setForeground(new Color(30, 144, 254));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(160, 320, 700, 30);
        opt4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        opt4.setForeground(new Color(30, 144, 254));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(520, 400, 90, 40);
        add(next);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 140, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(620, 400, 100, 40);
        add(submit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else{
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=1;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, id, score).setVisible(true);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Times New Roman", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 100, 470);
        }else {
            g.drawString("Times Up!!", 100, 470);
        }
        
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 59;
        }else if(timer < 0){
            timer = 59;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=1;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                //new Result(username,id, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    
}