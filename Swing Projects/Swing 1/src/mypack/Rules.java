
package mypack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    public Rules( String name ){
        
        
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
   
        JLabel heading=new JLabel("Welcome"+name+" to Reading Minds ");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,244));
        add(heading);
        
        JLabel rules=new JLabel("Welcome"+name+" to Reading Minds ");
        rules.setBounds(20, 60, 700, 400);
        rules.setFont(new Font("Tohoma",Font.PLAIN,16));
        //rules.setForeground(new Color(30,144,244));
        rules.setText( "<html>"+ 
                "<br><br>"+
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>");
        add(rules);
        
        back =new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start =new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
        
        setSize(800,650);
        setLocation(50,50);
        setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(e.getSource()==start)
        {
        
        }
        else 
        {
             setVisible(false);
             new Login();
        }
                
    }
    
}
