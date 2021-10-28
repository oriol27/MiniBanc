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
        this.data_obertura = data_obertura;
        saldo = quantitat;
    }
    
    public Compte(String numCompte,int quantitat,Date data_obertura,Date data_cancelacio){
        this.numCompte = numCompte;
        this.data_obertura = data_obertura;
        saldo = quantitat;
        this.data_cancelacio = data_cancelacio;
        
    }

    public String getNumCompte() {
        return numCompte;
    }

    public Date getData_obertura() {
        return data_obertura;
    }

    public Date getData_cancelacio() {
        return data_cancelacio;
    }
    public int getSaldo(){

        return -1;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public void setData_obertura(Date data_obertura) {
        this.data_obertura = data_obertura;
    }

    public void setData_cancelacio(Date data_cancelacio) {
        this.data_cancelacio = data_cancelacio;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
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
    public String toString(){
        
        return null;
    }
}
