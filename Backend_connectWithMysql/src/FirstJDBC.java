import java.sql.*;
public class FirstJDBC {
      public static void main(String[]args){
          try{
              // Loading the driver
              Class.forName("com.mysql.jdbc.Driver");

              //creating a connection
              String url="jdbc:mysql://localhost:3306/Rahul";
              String username="Rahul";
              String password="GuptaRahul@1999";
              Connection con=DriverManager.getConnection(url,username,password);
                if(con.isClosed()){
                    System.out.println("Connection is Closed");
                }
                else{
                    System.out.println("Connection created");
                }
          }catch (Exception e){
             e.printStackTrace();
          }
      }
}
