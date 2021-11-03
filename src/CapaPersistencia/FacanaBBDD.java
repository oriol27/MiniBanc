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
        compteBBDD.disminuir_saldoBBDD(numCompte, Quantitat);
    }
    
    public void cancelarCompte(String numCompte) throws Exception{
        compteBBDD.cancelarCompteBBDD(numCompte);
    }
    
    public boolean verificarCompte(String NIF,String numCompte) throws Exception{
        return compteBBDD.verificarCompteBBDD(NIF, numCompte);
    }
    
    public void introMoviment(String numCompte, Moviment m) throws Exception{
        movimentBBDD.introMovimentBBDD(numCompte, m);
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
    
    public void augmentarSaldo(String numCompte,int quantitat_final) throws Exception {
       compteBBDD.augmentarSaldoBBDD(numCompte, quantitat_final);
    }
    
    public ArrayList<Compte> Llistar_Comptes(String NIF)throws Exception{
        return compteBBDD.Llistar_Comptes(NIF);
    }
    
    public ArrayList<Moviment> FerExtracte(String numCompte,String data)throws Exception{
        return movimentBBDD.FerExtracte(numCompte, data);
    }

    public Connection getConnexio () throws Exception {
        return bbdd.getConnexio();
    }


    public boolean comprovaLletraNIF(String NIF) {
        int DNI = Integer.parseInt((NIF.substring(0,8)));
        int resta = 0;
        String lletra = "";
        String[] asignacio = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        resta = DNI%23;
        lletra = asignacio[resta];
        String ultimaLletra = NIF.substring(NIF.length() - 1);
        return ultimaLletra.equals(lletra);
    }

    public boolean compteCancelat(String numCompte) {
        return compteBBDD.compteCancelat(numCompte);
    }

    public boolean quantitatMenorSaldo(String numCompte, int quantitat) {
        return compteBBDD.quantitatMenorSaldo(numCompte, quantitat);
    }

    public boolean nifNumCompte(String NIF, String numCompte) {
        return compteBBDD.nifNumCompte(NIF, numCompte);
    }
}
