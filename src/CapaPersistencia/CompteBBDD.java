package CapaPersistencia;

import CapaDomini.Compte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        
        //Verificar que el compte és del NIF:
        
        return false;

    }
    
    public static void cancelarCompteBBDD(String numCompte) throws Exception {
        
    }
    
    public void disminuir_saldoBBDD(String numCompte,String Quantitat)throws Exception{
        
    }
    
    public ArrayList<Compte> Llistar_Comptes(String NIF)throws Exception{
     
        return null;
    }
    
}
