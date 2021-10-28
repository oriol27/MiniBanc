package CapaPersistencia;
import java.sql.*;

public class BBDD {

    private static Connection connexio;
    private final String DNS = "MiniBanc";
    private static BBDD instancia;
    
    public BBDD() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    public synchronized static BBDD getInstacia () throws Exception {
        if (connexio == null){
            instancia = new BBDD();
        }
        return instancia;
    }

    public Connection getConnexio () throws Exception {
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
        return connexio;
    }
}
