package CapaDomini;

import java.util.Date;

public class Compte {

    public String numCompte;
    public Date data_obertura;
    public Date data_cancelacio;
    public int saldo;
    
    public Compte(String numCompte, int quantitat, Date data_obertura){
        this.numCompte = numCompte;
        this.saldo = quantitat;
        this.data_obertura = data_obertura;
    }
    
    public Compte(String numCompte, int quantitat, Date data_obertura, Date data_cancelacio){
        this.numCompte = numCompte;
        this.saldo = quantitat;
        this.data_obertura = data_obertura;
        this.data_cancelacio = data_cancelacio;
    }
    
    public void setNumCompte(String numCompte){
        this.numCompte = numCompte;
    }
    
    public void setDataObertura(Date data_obertura){
        this.data_obertura = data_obertura;
    }
    
    public void setDataCancelacio(Date data_cancelacio){
        this.data_cancelacio = data_cancelacio;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public boolean estasCancelat(){
        
        return this.data_cancelacio != null;;
    }
    
    public int getSaldo(){
        
        return this.saldo;;
    }
    
    public String toString(){
        return this.data_cancelacio == null ? "Número de Compte: " + this.numCompte + " Data d'obertura: " + this.data_obertura + " Saldo: " + this.saldo : "Número de Compte: " + this.numCompte + " Data d'obertura: " + this.data_obertura + " Data de Cancel·lació: " + this.data_cancelacio + " Saldo: " + this.saldo;
    }
}
