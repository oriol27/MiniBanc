package CapaPersistencia;

import CapaDomini.Compte;

import java.sql.*;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class CompteBBDD {
    private static Connection conn = null;

    public CompteBBDD(){
        
    }
    
    public static Compte existeixCompteBBDD(String numCompte)throws Exception{
        PreparedStatement statement = null;
        Compte compte = new Compte();
        try{
            conn = BBDD.getConnexio();
            statement = conn.prepareCall("{call dadesCompte(?)}");
            statement.setString(1, numCompte);
            ResultSet rs = statement.executeQuery();

            if (rs.next()){
                System.out.println(rs.getString("data_obertura"));
                compte.numCompte = rs.getString("numCompte");
                compte.data_obertura = rs.getDate("data_obertura");
                compte.data_cancelacio = rs.getDate("data_cancelacio");
                compte.saldo = rs.getInt("saldo");
            }
        }catch(SQLException e){
            System.out.print("Error de connexió");
        } finally {
            statement.close();
            conn.close();
        }
        return compte;
    public static Compte existeixCompteBBDD(String numCompte)throws Exception{

        return null;
    }
    
    public static String introCompteBBDD(String NIF) throws Exception{
        String numCompte = "";
        try (Connection conn = BBDD.getConnexio();
             CallableStatement cs = conn.prepareCall("{? = call createCompte(?)}");){
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setString(2, NIF);
            cs.execute();
            numCompte = cs.getString(1);

        }catch(SQLException e){
            e.printStackTrace();
        }
        return numCompte;
    }
    
    public void augmentarSaldoBBDD(String numCompte,int quantitat_final)throws Exception{
        
    }
    
    public static boolean verificarCompteBBDD(String NIF, String numCompte) throws Exception{
    	CallableStatement statement = null;//
    	ResultSet rs = null;
    	boolean verificacio = false;
        try {
        	Connection conexio = BBDD.getConnexio();
        	statement = conexio.prepareCall("{call verificarCompte(?, ?)}");
			statement.setString(1, NIF);
			statement.setString(2, numCompte);
			rs = statement.executeQuery();
			rs.next();
			verificacio = rs.getBoolean(1);
		}catch(SQLException e){
			System.out.println("Error sql: "+e.getMessage()); //
		} finally {
			statement.close();
        }
        return verificacio;

    }
    
    public static void cancelarCompteBBDD(String numCompte) throws Exception {
        
    }
    
    public void disminuir_saldoBBDD(String numCompte,String Quantitat)throws Exception{
        
    }
    
    public ArrayList<Compte> Llistar_Comptes(String NIF)throws Exception{
     
        return null;
    }
    
}
