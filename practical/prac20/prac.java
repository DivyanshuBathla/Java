import  java.util.Scanner;
import java.lang.Thread;
public class prac extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println(i);
    }
    public static void main(String[] args) {
        prac obj =new prac();
        prac obj1 =new prac();
        obj.start();
        obj1.start();

    }
}
