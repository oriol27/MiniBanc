package CapaAplicacio;

import CapaDomini.Compte;
import CapaPersistencia.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CtrlLlistarComptes {

    public FacanaBBDD facana;
    
    public CtrlLlistarComptes() throws Exception{
        
       facana = new FacanaBBDD();
        
    }
    
    public String[] Llistar_Comptes(String NIF)throws Exception{

        //Verificar camps no nulls:
        if(NIF.equals("")){
            System.out.println("El NIF no pot estar buit");
        }
        //Verificar lletra del NIF
        else if (!facana.comprovaLletraNIF(NIF)) {
            System.out.println("El DNI no es correcta");
        }else{
            return null;
        }
        return null;
    }
}
