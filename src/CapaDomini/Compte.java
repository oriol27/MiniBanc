package CapaDomini;

import java.util.Date;
import java.util.Objects;

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
        this.data_obertura = data_obertura;
        this.data_cancelacio = data_cancelacio;
        this.saldo = quantitat;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compte)) return false;
        Compte compte = (Compte) o;
        return saldo == compte.saldo && Objects.equals(numCompte, compte.numCompte) && Objects.equals(data_obertura, compte.data_obertura) && Objects.equals(data_cancelacio, compte.data_cancelacio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCompte, data_obertura, data_cancelacio, saldo);
    }
}
