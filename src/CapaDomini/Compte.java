package CapaDomini;

import java.util.Date;

public class Compte {

    public String numCompte;
    public Date data_obertura;
    public Date data_cancelacio;
    public int saldo;

    public Compte (){

    }

    public Compte(String numCompte,int quantitat,Date data_obertura){
        this.numCompte = numCompte;
        this.saldo = quantitat;
        this.data_obertura = data_obertura;
    }
    
    public Compte(String numCompte,int quantitat,Date data_obertura,Date data_cancelacio){
        
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

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte='" + numCompte + '\'' +
                ", data_obertura=" + data_obertura +
                ", data_cancelacio=" + data_cancelacio +
                ", saldo=" + saldo +
                '}';
    }
}
