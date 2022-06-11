import javax.swing.*;
import java.awt.*;
public class prac extends JFrame {
    
    prac()
    {
        setLayout(new FlowLayout());
        JLabel jl1=new JLabel("Enter your name");
        JTextField jtf1=new JTextField(15);
        add(jl1);
        add(jtf1);
        JLabel jl2=new JLabel("Enter university roll no");
        JTextField jtf2=new JTextField(15);
        add(jl2);
        add(jtf2);
        JLabel jl3=new JLabel("Enter Student ID");
        JTextField jtf3=new JTextField(15);
        add(jl3);
        add(jtf3);
    
       
        JLabel jl5=new JLabel("Select your campus");
        JRadioButton jrb1=new JRadioButton("Deemed");
        JRadioButton jrb2=new JRadioButton("Hill");
        ButtonGroup bg1=new ButtonGroup();
        add(jl5);
        
        bg1.add(jrb1);
        bg1.add(jrb2);
        add(jrb1);
        add(jrb2);


        JLabel jl6=new JLabel("Choose your course");
        JRadioButton jrb7=new JRadioButton("CSE");
        JRadioButton jrb8=new JRadioButton("ECE");
        JRadioButton jrb9=new JRadioButton("mechnical");
       
        ButtonGroup bg3=new ButtonGroup();
        add(jl6);
        bg3.add(jrb7);
        bg3.add(jrb8);
        bg3.add(jrb9);
        
        add(jrb7);
        add(jrb8);
        add(jrb9);
        
        

        JLabel jl4=new JLabel("Choose your current year");
        JRadioButton jrb3=new JRadioButton("1");
        JRadioButton jrb4=new JRadioButton("2");
        JRadioButton jrb5=new JRadioButton("3");
        JRadioButton jrb6=new JRadioButton("4");
        ButtonGroup bg2=new ButtonGroup();
        add(jl4);

        bg2.add(jrb3);
        bg2.add(jrb4);
        bg2.add(jrb5);
        bg2.add(jrb6);
        add(jrb3);
        add(jrb4);
        add(jrb5);
        add(jrb6);
        


        
    }
    public static void main(String[] args) {
        prac obj=new prac();
        obj.setVisible(true);
        obj.setSize(370,400);


    }
}
