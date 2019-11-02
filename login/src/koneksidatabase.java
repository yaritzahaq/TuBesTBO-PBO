import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class koneksidatabase {
    private static Connection koneksi;
   
   public static Connection GetConnection()throws SQLException{
       if (koneksi==null){
           Driver driver = new Driver();
           
       koneksi=DriverManager.getConnection("jdbc:mysql://localhost/tubes","root","");
       
       }
       return koneksi;
   }
   
   
}