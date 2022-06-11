import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import ActionListner;
class p1 extends JFrame implements ActionListener{

    JLabel jl1,jl2,jl3;
JTextField jtf1,jtf2,jtf3;
JButton jb1,jb2,jb3,jb4;
    p1()
    {
        setLayout(new FlowLayout());
        
        JLabel jl1=new JLabel("Enter  1st number");
        add(jl1);
        
         jtf1=new JTextField(5);
        jtf2=new JTextField(5);
        add(jtf1);
        add(jtf2);
        
         jb1=new JButton("add");
        jb2=new JButton("Sub");
        add(jb1);
        add(jb2);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        
         jl3=new JLabel("result");
        add(jl3);
         jtf3=new JTextField(5);
        add(jtf3);
    }

    public void actionPerformed( ActionEvent e)
    {
              String s= e.getActionCommand();
              if(s.equals("add")){
                jtf3.setText(Integer.toString(Integer.parseInt(jtf1.getText())+Integer.parseInt(jtf2.getText())));

              }
              else if(s.equals("Sub")){
                jtf3.setText(Integer.toString(Integer.parseInt(jtf1.getText())-Integer.parseInt(jtf2.getText())));

              }
             
              


    }
    public static void main(String[] args) {
        p1 obj=new p1();
        obj.setSize(300,400);
        obj.setVisible(true);
    }
}
