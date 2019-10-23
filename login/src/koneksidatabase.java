import java.sql.*;

public class koneksidatabase {
 private static Connection koneksi;
 public static Connection getKoneksi(){
  if (koneksi == null){
   try {String url = "jdbc:mysql://localhost:127.0.0.1/tubes"; 
          String user="root";
          String pass=""; 

 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
koneksi = DriverManager.getConnection(url , user, pass);

 } 
   catch(SQLException t){
     System.out.print("Gagal melakukan koneksi ke database");
 }
}

return koneksi;
}

    static Connection getkoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 } 