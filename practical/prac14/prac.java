import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two number for divide");
       int a=sc.nextInt();
       int b=sc.nextInt();
       try{
             float c=a/b;
             System.out.println("Result="+c);
       }
       catch(Exception e)
       {
           
            System.out.println("Can not divide by zerp");
            
       }
       
       

    }    
}
