package pack2;
import pack1.*;
import java.util.Scanner;
public class c2 extends c1 implements i1{
    public int div(int a,int b)
    {
        return(a/b);
    }
    public static void main(String[] args) {
    
        c2 obj=new c2();
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println("Sum="+obj.sum(a,b));
        System.out.println("Difference="+obj.sub(a,b));
        System.out.println("Divide="+obj.div(a, b));
    }
}
