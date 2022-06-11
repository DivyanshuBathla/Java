import java.lang.Thread;
public class prac extends Thread {
    
    public void run()
    {
            for(int i=0;i<100000;i++)
              if(i==9999)
             System.out.println("Thread name="+Thread.currentThread().getName()+" Thread priority="+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        prac obj1=new prac();
        prac obj2=new prac();
        obj1.setName("thread-1");
        obj2.setName("thread-2");
        obj1.setPriority(7);
        obj2.setPriority(2);
        obj1.start();
        obj2.start();



    }
}
