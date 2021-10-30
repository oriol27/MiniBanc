package CapaDomini;

import java.util.Date;

public class Compte {

    public String numCompte;
    public Date data_obertura;
    public Date data_cancelacio;
    public int saldo;

    public Compte(){

    }
    
    public Compte(String numCompte, int quantitat, Date data_obertura){
        this.numCompte = numCompte;
        this.saldo = quantitat;
        this.data_obertura = data_obertura;
    }

    public Compte(String numCompte,int quantitat,Date data_obertura,Date data_cancelacio){

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

    public int getSaldo(){

        return -1;
    }

    public void setData_obertura(Date data_obertura) {
        this.data_obertura = data_obertura;
    }

    public void setData_cancelacio(Date data_cancelacio) {
        this.data_cancelacio = data_cancelacio;
    }

    public boolean estasCancelat(){
        if(data_cancelacio == null) {
        	return false;
        }
        return true;
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
