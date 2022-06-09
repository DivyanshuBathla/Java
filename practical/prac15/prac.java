import java.util.Scanner;

import javax.xml.catalog.Catalog;
public class prac {
    int amount;
    void withdraw(int with)
    {
        try{
        if(amount<with)
        throw new NullPointerException("Cant deduct amount")  ;
        
        else
        amount=amount-with;
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
    // catch(int a)
    //     {
    //         System.out.println("Errro");
    //     }
    void deposit(int a)
    {
        amount=amount+a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        prac obj=new prac();
        System.out.println("Enter the amount to deposit=");
        a=sc.nextInt();
        obj.deposit(a);
        System.out.println("Enter the amount you wnat to withdraw=");
        a=sc.nextInt();
        obj.withdraw(a);
        System.out.println("Amount currently="+obj.amount);        
    }
}
