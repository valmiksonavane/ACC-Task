
import java.sql.*;
class Connectivity {
 public static void main(String[] args) {
  try {
   Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productlogin?useSSL=false", "root", "root");
   Statement s = con.createStatement(); 
   ResultSet rs = s.executeQuery("select * from pro"); 
   while (rs.next()) {
    System.out.println(rs.getInt(1) + " " + rs.getString(2));
   }
   con.close();}
  catch (Exception e) {
   }
 }
}