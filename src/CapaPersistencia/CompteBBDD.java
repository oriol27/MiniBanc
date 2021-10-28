package CapaPersistencia;

import CapaDomini.Compte;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class CompteBBDD {

    public CompteBBDD(){
        
    }
    
    public static Compte existeixCompteBBDD(String numCompte)throws Exception{
        
        return null;
    }
    
    public int introCompteBBDD(String NIF) throws Exception{

            //Introduïr el nou compte a la BBDD:

            
            //Agafar número de compte de la BBDD del nou compte i retornar-lo:
            
            return -1;
        
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
