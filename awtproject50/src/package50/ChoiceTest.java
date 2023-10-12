
package package50;
import java.awt.*;
public class ChoiceTest {
        
        ChoiceTest()
        {
            Frame choices=new Frame();
            Choice obj=new Choice();
            obj.setBounds(80,80,100,100);
            obj.add("REd");
            obj.add("BLUE");
            obj.add("BLACK");
            obj.add("WHITE");
            obj.add("GREEN");
            
            choices.add(obj);
            choices.setSize(400,400);
            choices.setLayout(null);
            choices.setVisible(true);
        }
        public static void main(String[] args) {
            new ChoiceTest();
        }
    
}
