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
        compteBBDD = new CompteBBDD();
        clientBBDD = new ClientBBDD();
        movimentBBDD = new MovimentBBDD();
       bbdd = new BBDD();
    }
    
    public synchronized static FacanaBBDD getInstancia() throws Exception{
        if (instancia == null){
            instancia = new FacanaBBDD();
        }
        return instancia;
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
        return compteBBDD.existeixCompteBBDD(numCompte);
    }
    
    public boolean existeixClient(String NIF)throws Exception{
       return clientBBDD.existeixClientBBDD(NIF);
    }
    
    public void introClient(String NIF,String Nom)throws Exception{
        clientBBDD.introClientBBDD(NIF, Nom);
    }
    
    public String introCompte(String NIF)throws Exception{
       return compteBBDD.introCompteBBDD(NIF);
    }
    
    public void augmentarSaldo(String numCompte,int quantitat_final)throws Exception {
       
    }
    
    public ArrayList<Compte> Llistar_Comptes(String NIF)throws Exception{
        
        return null;
    }
    
    public ArrayList<Moviment> FerExtracte(String numCompte,String data)throws Exception{
        return null;
    }

    public Connection getConnexio () throws Exception {
        return bbdd.getConnexio();
    }
}
