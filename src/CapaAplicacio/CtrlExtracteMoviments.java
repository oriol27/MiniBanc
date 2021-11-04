package CapaAplicacio;

import CapaDomini.*;
import CapaPersistencia.*;
import java.util.ArrayList;

public class CtrlExtracteMoviments {

    public FacanaBBDD facana;
    
    public CtrlExtracteMoviments() throws Exception{
        facana = new FacanaBBDD();
    }
    
    public String[] FerExtracte(String numCompte,String data) throws Exception{
        
        //Verificar camps no nulls:
        if(numCompte.equals("")){
            System.out.println("El numero de compte no pot estar buit");
            throw new Exception();
        }else if(data.equals("")){
            System.out.println("La data no pot estar buit");
            throw new Exception();
        }
        else if(data.equals("") && numCompte.equals("")){
            System.out.println("El numero de compte i la data no poden estar buit");
        }else{
            //Verificar que existeix el compte:
            Compte compte = facana.existeixCompte(numCompte);
            String compteNull = "Compte{" +
                    "numCompte='" + null + '\'' +
                    ", data_obertura=" + null +
                    ", data_cancelacio=" + null +
                    ", saldo=" + 0 +
                    '}';
            if(compte.toString().equals(compteNull)){
                throw new IllegalArgumentException("Aquest compte no existeix");
            }
        }
        ArrayList<Moviment> extract= facana.FerExtracte(numCompte,data);
        String[] extracte= new String[extract.size()];


        for(int i=0;i<extract.size();i++){
            extracte[i] = extract.get(i).toString();
        }
        return extracte;
    }
}
