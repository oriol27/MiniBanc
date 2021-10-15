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
        return null;
    }
}
