package CapaAplicacio;

import CapaPersistencia.*;

public class CtrlReintegrament {

      public FacanaBBDD facana;
      
      public CtrlReintegrament()throws Exception{
          
          //Crear nova Façana:
          
      }
      
      public void Fer_Reintegrament(String NIF,String numCompte,String Quantitat)throws Exception{
          
          
          //Verificar camps no nulls: 
          
          
          //Verificar lletra del NIF:
            
            
          //Verificar que existeix el compte:
            
            
          //Verificar que el compte no està cancel·lat:
            
            
          //Verificar que la quantitat a reintegrar no és superior al saldo existent en el compte:
            
            
          //Verificar que el compte pertany al NIF:
            
            
          //Disminuir saldo:

          
          //Enregistrar moviment de reintegració:
       }
    }
