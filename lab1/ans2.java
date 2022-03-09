
import java.util.Scanner;
class account
{
   int acc;
   String name;
   float amount;
   
  void insert(String n,int a,float amou)
  {
      name=n;
       acc=a;
	amount=amou;
  }
 void display()
{
	System.out.println("Name="+name);
        System.out.println("account number="+acc);
	System.out.println("Amount="+amount);
}

void deposit(float f)
{
	amount=amount+f;
        System.out.println("Amount succefully deposited");
}

void withdraw(float f)
{
	if(f>amount)
         System.out.println("Amount can not be withdraw");
      else {
        amount=amount-f;
        System.out.println("Amount succesfully withdraw");	
}
}
void check_balance()
{
    System.out.println("The amount="+amount);
}
   
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in) ; 
        System.out.println("Enter the name=");
        String name=sc.nextLine();
	System.out.println("Enter the account number=");
        int acc=sc.nextInt(); 
	System.out.println("Enter the amount=");
        float amount=sc.nextFloat();

        account obj=new account();
 	 obj.insert(name,acc,amount);
  int cho=1;
        while(cho==1){
          System.out.println("Enter your choice\n1.deposit\n2.withdraw\n3.check balance\n4.Display");
          int ch=sc.nextInt(); 
          if(ch==1)
      { 
         System.out.println("Enter the amount you wnat to deposit");
         int d=sc.nextInt(); 
         obj.deposit(d); 
      } 
         else if(ch==2)
       {
         System.out.println("Enter the amount you wnat to withdraw");
         int w=sc.nextInt(); 
         obj.withdraw(w);
       }
       else if(ch==3)
         obj.check_balance();
     else if(ch==4)
          obj.display();
 System.out.println("Do you want to do more operation:(1/0)");
   cho=sc.nextInt();
     
  }
}
}
