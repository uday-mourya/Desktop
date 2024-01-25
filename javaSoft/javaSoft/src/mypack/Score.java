
package mypack;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
   
    public Score(String name,int score)
    {
    
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("mypack/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,200,300, 250);
        add(image);
        
        JLabel heading=new JLabel("ThankYou "+name+" For Playing Reading Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        
        JLabel lbscore=new JLabel("Your score is "+score);
        lbscore.setBounds(350,200,300,30);
        lbscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(lbscore);
        
        JButton submit=new JButton("Play again");
        submit.setBounds(380, 270, 120, 30);
        setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        
        setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        setVisible(false); 
        new Login();
    }
    
}
