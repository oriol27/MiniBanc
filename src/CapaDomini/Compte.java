package CapaDomini;

import java.util.Date;

public class Compte {

    public String numCompte;
    public Date data_obertura;
    public Date data_cancelacio;
    public int saldo;

    public Compte (){

    }

    public Compte(int numCompte,int quantitat,Date data_obertura){
        
    }
    
    public Compte(int numCompte,int quantitat,Date data_obertura,Date data_cancelacio){
        
    }
    
    public void setNumCompte(int numCompte){

    }
    
    public void setDataObertura(Date data_obertura){
        
    }
    
    public void setDataCancelacio(Date data_cancelacio){
        
    }
    
    public void setSaldo(int saldo){
        
    }
    
    public boolean estasCancelat(){
        if(data_cancelacio == null) {
        	return false;
        }
        return true;
    }
    
    public int getSaldo(){
        
        return -1;
    }
    
    public String toString(){
        
        return null;
    }
}
