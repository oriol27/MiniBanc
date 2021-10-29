package CapaPersistencia;

import java.sql.*;

public class ClientBBDD {

    public ClientBBDD(){
       
    }
    
    public boolean existeixClientBBDD(String NIF)throws Exception {
        PreparedStatement statement = null;
        int existeix = -1;
        try  (Connection conn = BBDD.getInstacia().getConnexio()){
            CallableStatement cs = conn.prepareCall("{? = call existeixClient(?)}");
                cs.registerOutParameter(1, Types.VARCHAR);
                cs.setString(2, NIF);
                cs.execute();
                existeix = cs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existeix == 1;
    }
    
    
    public void introClientBBDD(String NIF,String Nom)throws Exception{
        try (Connection conn = BBDD.getInstacia().getConnexio()){
            CallableStatement cs = conn.prepareCall("{call createClient(?, ?)}");
            cs.setString(1, NIF);
            cs.setString(2, Nom);
            cs.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
