package CapaAplicacio;

import CapaPersistencia.*;

public class CtrlReintegrament {

      public FacanaBBDD facana;
      
      public CtrlReintegrament()throws Exception{
          
          //Crear nova Façana:
          facana = new FacanaBBDD();
          
      }
      
      public void Fer_Reintegrament(String NIF,String numCompte,String Quantitat)throws Exception{
          
          
          //Verificar camps no nulls: 
          if (NIF.isEmpty() || NIF == null || NIF.isBlank()) {
              throw new IllegalArgumentException("El NIF no pot estar buit");
          }
          if (numCompte.isEmpty() || numCompte == null || numCompte.isBlank()) {
              throw new IllegalArgumentException("El número de compte no pot estar buit");
          }
          if (Quantitat.isEmpty() || Quantitat == null || Quantitat.isBlank()) {
              throw new IllegalArgumentException("La quantitat no pot estar buida");
          }

          //Verificar lletra del NIF:

            
          //Verificar que existeix el compte:
            
            
          //Verificar que el compte no està cancel·lat:
            
            
          //Verificar que la quantitat a reintegrar no és superior al saldo existent en el compte:
            
            
          //Verificar que el compte pertany al NIF:
            
            
          //Disminuir saldo:

          
          //Enregistrar moviment de reintegració:
       }
    }
