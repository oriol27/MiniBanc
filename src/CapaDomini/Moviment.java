package CapaDomini;

import java.util.Date;

public class Moviment {
    
    public int num_operacio;
    public int tipus; // 1=INGRES;
                      //-1=REINTEGRAMENT
    public int quantitat;
    public Date data;
    
    public Moviment(int tipus,int quantitat){
        this.tipus = tipus;
        this.quantitat= quantitat;
    }
    
    public Moviment(int num_operacio,int tipus,int quantitat, Date data){
        this.num_operacio = num_operacio;
        this.tipus = tipus;
        this.quantitat = quantitat;
        this.data = data;
    }
    
    public int getQuantitat(){
        
        return this.quantitat;
    }
    
    public int getTipus(){
        
        return this.tipus;
    }
            
    public String toString(){
        return this.tipus == 1 ? "Número operació: " + this.num_operacio + ", Tipus: Ingrés, Quantitat: " + this.quantitat + ", Data: " + this.data : "Número operació: " + this.num_operacio + ", Tipus: Reintegrament, Quantitat: " + this.quantitat + ", Data: " + this.data;

    }
    
}
