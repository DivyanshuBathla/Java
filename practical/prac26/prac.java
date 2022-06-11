
import java.awt.*;
import javax.swing.*;
class smile extends Canvas
{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(0, 50, 200, 200);
        g.setColor(Color.yellow);
        // g.filloval(20,40,15,15);
        g.fillOval(20, 70, 150, 150);
        g.setColor(Color.white);
        g.fillOval(110, 100, 40, 40);
        g.fillOval(40, 100, 40, 40);
        g.setColor(Color.white);

        g.fillArc(55, 125, 80, 80,180, 180);
        
    }

    public static void main(String[] args) {
        smile s=new smile();
        JFrame obj=new JFrame();
        obj.setSize(300,400);
        obj.setBackground(Color.BLACK);
        obj.setBackground(Color.BLUE);
        obj.setVisible(true);
        obj.setBackground(Color.yellow);
    
        obj.add(s);
    }
}
