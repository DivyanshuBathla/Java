class student
{   
     int roll;
     String name;
     String branch;
     String uni;
     
    void set(int Roll,String Name,String Branch,String Uni)
    {
         roll=Roll;
         name=Name;
         branch=Branch;
         uni=Uni;
        
     }
   void display()
  {
	System.out.println(roll+" "+name+" "+branch+" "+uni);
  }   
    
  
    public static void main(String args[])
    {
         student s=new student();
         s.set(12,"divyanshu","cse","gehu");
         s.display();
    }
   
}
