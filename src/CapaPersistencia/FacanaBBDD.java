package CapaPersistencia;

import CapaDomini.*;
import CapaDomini.*;
import java.sql.Connection;
import java.util.ArrayList;

public class FacanaBBDD {

    private static FacanaBBDD instancia;
    private CompteBBDD compteBBDD;
    private ClientBBDD clientBBDD;
    private MovimentBBDD movimentBBDD;
    private BBDD bbdd;
    
    public FacanaBBDD() throws Exception{
        
    }
    
    public synchronized static FacanaBBDD getInstancia() throws Exception{
        
        return null;
    }
    
    public void disminuir_saldo(String numCompte,String Quantitat)throws Exception{
        
    }
    
    public void cancelarCompte(String numCompte) throws Exception{
        
    }
    
    public boolean verificarCompte(String NIF,String numCompte) throws Exception{
        
        return false;
        
    }
    
    public void introMoviment(String numCompte, Moviment m) throws Exception{
        
        
    }

    public Compte existeixCompte(String numCompte)throws Exception{
        
        return null;
        
    }
    
    public boolean existeixClient(String NIF)throws Exception{
        
        return false;
      
    }
    
    public void introClient(String NIF,String Nom)throws Exception{
        
    }
    
    public int introCompte(String NIF)throws Exception{
       
        return -1;
        
    }
    
    public void augmentarSaldo(String numCompte,int quantitat_final)throws Exception {
       
    }
    
    public ArrayList<Compte> Llistar_Comptes(String NIF)throws Exception{
        
        return null;
    }
    
    public ArrayList<Moviment> FerExtracte(String numCompte,String data)throws Exception{
        
        return null;
    }
    
    public Connection getConnexio()throws Exception{
  
         return null;
  
    }

    public static boolean comprovaLletraNIF(String NIF) {
        int DNI = Integer.parseInt((NIF.substring(0,8)));
        int resta = 0;
        String lletra = "";
        String[] asignacio = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        resta = DNI%23;
        lletra = asignacio[resta];

        String ultimaLletra = NIF.substring(NIF.length() - 1);
        if(ultimaLletra!=lletra){
            return false;
        }
        return true;
    }
   
}
