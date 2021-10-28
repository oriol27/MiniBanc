package CapaPersistencia;

import CapaDomini.Compte;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class CompteBBDD {
    private static Connection conn = null;

    public CompteBBDD(){
        
    }
    
    public static Compte existeixCompteBBDD(String numCompte)throws Exception{
        Compte compte = new Compte();
        PreparedStatement statement = null;
        try{
            conn = BBDD.getConnexio();
            statement = conn.prepareCall("{call dadesCompte(?)}");
            statement.setString(1, numCompte);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                compte.numCompte = rs.getString(1);
                compte.data_obertura = rs.getDate(2);
                compte.data_cancelacio = rs.getDate(3);
                compte.saldo = rs.getInt(4);
            }
        }catch(SQLException e){
            System.out.print("Error de connexió");
        } finally {
            statement.close();
            conn.close();
        }
        return compte;
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
    
    public boolean verificarCompteBBDD(String NIF, String numCompte) throws Exception{
        
        //Verificar que el compte és del NIF:
        
        return false;

    }
    
    public void cancelarCompteBBDD(String numCompte) throws Exception {
        
    }
    
    public void disminuir_saldoBBDD(String numCompte,String Quantitat)throws Exception{
        
    }
    
    public ArrayList<Compte> Llistar_Comptes(String NIF)throws Exception{
        ArrayList<Compte> compte = new ArrayList<Compte>();
        try (Connection conn = BBDD.getConnexio();
             PreparedStatement pstmt = conn.prepareStatement("select * from Compte where dni='"+NIF+"'");) {
            ResultSet rs = pstmt.executeQuery();
            Compte compte_selecionat = new Compte(rs.getString(1), Integer.parseInt(rs.getString(4)) ,rs.getDate(2),rs.getDate(3));
            compte.add(compte_selecionat);
            return compte;
        }
    }
    
}
