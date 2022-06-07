//export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar^C
///usr/bin/mysql -u root -p
//sudo apt-get install libmysql.java
import java.sql.*;
class jdbctest
{
  public static void main(String args[])
  {  Connection con=null;
     try{
        Class.forName("com.mysql.jdbc.Driver");    //drivers linking optional
        System.out.println("Success");
     }
     catch(Exception e)
     {
     
     System.out.println("failure");
     }
     try{
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?autoReconnect=true&useSSL=false","root","gehu");  //stablishing connection
           System.out.println("Success");
     }
     catch(Exception e)
     {
     
     System.out.println("connection not conect");
     }
     try{
        Statement st=con.createStatement();               //creating vechicle
        st.executeUpdate("insert into emp1 (id,name) values(12,'Ravi')");// firing
                st.executeUpdate("insert into emp1 (id,name) values(12,'Raghav')");
        ResultSet rs=st.executeQuery("Select * from sys.emp1");   //printing
        while(rs.next())
        {
          System.out.println(rs.getInt(1));
          System.out.println(rs.getString(2));
        }
     }
     catch(Exception e)
     {
     
     System.out.println("failure");
     }
  }
}
