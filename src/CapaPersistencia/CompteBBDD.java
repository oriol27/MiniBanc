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
    
    public Compte existeixCompteBBDD(String numCompte)throws Exception{
        PreparedStatement statement = null;
        Compte compte = new Compte();
        try (Connection conn = BBDD.getInstacia().getConnexio()){

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
        } catch (SQLException e) {
            System.out.print("Error de connexió");
        } finally {
            statement.close();
        }
        return compte;
    }
    
    public String introCompteBBDD(String NIF) throws Exception{
        String numCompte = "";
        try (Connection conn = BBDD.getInstacia().getConnexio();
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
    	try {
	    	String sql = "Update sql11446603.Compte set saldo=? where numCompte=?";
	    	Connection conne = BBDD.getConnexio();
	    	PreparedStatement ps=conne.prepareStatement(sql);
	    	ps.setInt(1,quantitat_final);
	    	ps.setString(2,numCompte);
	    	ps.executeUpdate();
    	}catch(SQLException e){e.printStackTrace();}
    }
    
    public boolean verificarCompteBBDD(String NIF, String numCompte) throws Exception{
    	CallableStatement statement = null;//
    	ResultSet rs = null;
    	boolean verificacio = false;
        try {
        	Connection conexio = BBDD.getConnexio();
        	statement = conexio.prepareCall("{? = call verificarCompte(?, ?)}");
            statement.registerOutParameter(1, Types.BOOLEAN);
			statement.setString(2, NIF);
			statement.setString(3, numCompte);
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
    
    public void cancelarCompteBBDD(String numCompte) throws Exception {
        PreparedStatement statement = null;
        try {
            conn = BBDD.getConnexio();
            statement = conn.prepareCall("{call cancelarCompte(?)}");
            statement.setString(1, numCompte);
            statement.execute();
        }catch(SQLException e){
            System.out.println("Error sql: "+e.getMessage());
        } finally {
            statement.close();
        }
    }
    
    public void disminuir_saldoBBDD(String numCompte,String Quantitat)throws Exception{
        String sql = "Select * From Compte Where num_compte = ? ;";
        PreparedStatement pst = BBDD.getInstacia().getConnexio().prepareStatement(sql);
        pst.setString(1, numCompte);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int s = rs.getInt("saldo");
            int quantitat_final = s - new Integer(Quantitat);
            String q = String.valueOf(quantitat_final);
            String sqll = "UPDATE Compte SET Compte.saldo=" + q + " WHERE num_compte=" + numCompte + "";
            pst = BBDD.getInstacia().getConnexio().prepareStatement(sqll);
            pst.executeUpdate();
        }

        pst.close();
    }
    
    public ArrayList<Compte> Llistar_Comptes(String NIF)throws Exception{
        ArrayList<Compte> compte = new ArrayList<Compte>();
        try (Connection conn = BBDD.getInstacia().getConnexio();
             PreparedStatement pstmt = conn.prepareStatement("select * from Compte where dni='"+NIF+"'");) {
            ResultSet rs = pstmt.executeQuery();
            Compte compte_selecionat = new Compte(rs.getString(1), Integer.parseInt(rs.getString(4)) ,rs.getDate(2),rs.getDate(3));
            compte.add(compte_selecionat);
            return compte;
        }
    }
    
}
