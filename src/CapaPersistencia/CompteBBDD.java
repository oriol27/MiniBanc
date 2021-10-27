package CapaPersistencia;

import CapaDomini.Compte;

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
        Compte compte = null;
        PreparedStatement statement = null;
        try{
            conn = BBDD.getInstacia().getConnexio();
            statement = conn.prepareCall("{call dadesCompte(?)}");
            statement.setString(1, numCompte);

            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
                compte.numCompte = rs.getInt(1);
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
    
    public static int introCompteBBDD(String NIF) throws Exception{
        int numCompte = 0;
        try (Connection conn = BBDD.getConnexio();
             PreparedStatement pstmt = conn.prepareStatement("{call createCompte(?)}");){
            pstmt.setString(1, NIF);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                numCompte = rs.getInt(1);
            }

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
     
        return null;
    }
    
}
