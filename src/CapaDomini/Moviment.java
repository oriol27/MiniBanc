package CapaDomini;

import java.util.Date;

public class Moviment {
    
    public int num_operacio;
    public int tipus; // 1=INGRES;
                      //-1=REINTEGRAMENT
    public int quantitat;
    public Date data;
    
    public Moviment(int tipus,int quantitat){
        
    }
    
    public Moviment(int num_operacio,int tipus,int quantitat, Date data){
        
    }
    
    public int getQuantitat(){
        
        return -1;
    }
    
    public int getTipus(){
        
        return -1;
    }
            
    public String toString(){
        
        return null;
    }
    
}
