package CapaPersistencia;

import java.sql.*;

public class BBDD {

    private Connection connexio;
    private final String DNS = "MiniBanc";
    private static BBDD instancia;
    
    public BBDD()throws Exception {
       
   }
    
    public synchronized static BBDD getInstacia () throws Exception {
        return null;
    }

    public Connection getConnexio () throws Exception {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(
                    "jdbc:mysql://sql11.freemysqlhosting.net/sql11446603", "sql11446603", "egTL9R7wLN");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
