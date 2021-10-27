package CapaPersistencia;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class BBDD {

    private static Connection connexio;
    private final String DNS = "MiniBanc";
    private static BBDD instancia;
    
    public BBDD()throws Exception {
       
   }
    
    public synchronized static BBDD getInstacia () throws Exception {
        return null;
    }

    public static Connection getConnexio () throws Exception {
        connexio = null;

        try(FileInputStream f = new FileInputStream("C:\\Users\\noelia.LAPTOP-L8KTAHI7\\Documents\\MiniBancGit\\resources\\connection.properties")){
            Properties pros = new Properties();
            pros.load(f);

            String url = pros.getProperty("url");
            String user = pros.getProperty("user");
            String password = pros.getProperty("password");

            connexio = DriverManager.getConnection(url,user,password);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
        return connexio;
    }
}
