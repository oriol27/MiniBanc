package CapaPersistencia;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class BBDD {

    private static Connection connexio;
    private final String DNS = "MiniBanc";
    private static BBDD instancia;
    
    public BBDD() {
        String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11446603";
        String driver = "com.mysql.cj.jdbc.Driver";
        String usuario = "sql11446603";
        String password = "egTL9R7wLN";

        try{
            Class.forName(driver);
            connexio = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexió exitosa");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public synchronized static BBDD getInstacia () throws Exception {
        if (connexio == null){
            instancia = new BBDD();
            System.out.println("Entra a crear BBDD");
        }
        return instancia;
    }

    public static Connection getConnexio () throws Exception {
            getInstacia();
            return connexio;
    }
}
