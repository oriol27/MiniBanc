package CapaAplicacio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import CapaDomini.Compte;
import CapaPersistencia.CompteBBDD;
import CapaPersistencia.FacanaBBDD;

public class CtrlCancelarCompte {

    public FacanaBBDD facana;
    
    public CtrlCancelarCompte() throws Exception{
        
        //Crear nova Façana:
        
    }
    
    public void Cancelar_Compte(String NIF,String numCompte)throws Exception{

    	if(NIF.isEmpty() || numCompte.isEmpty()) { //Comprova si hi ha valors nulls
			System.out.println("Hi ha valors nulls");
			
		}else if(!NIF.matches("^\\d{1}[A-Z]{8}")) { //Comprova si el NIF esta en fomrat de DNI
			System.out.println("El NIF no est� ben escrit");
		}else {
			Compte compte = facana.existeixCompte(numCompte); //Comprova si la compta existeix, si es aixi la retorna
			String compteNull = "Compte{" +
					"numCompte='" + null + '\'' +
					", data_obertura=" + null +
					", data_cancelacio=" + null +
					", saldo=" + 0 +
					'}';
			if(compte.toString().equals(compteNull)){
				System.out.println("No existeix aquesta compte");
				
			}else {	
				if(compte.estasCancelat() == true) { //Comprova si la compta ja esta cancelada
					System.out.println("Aquesta compta ya esta cancelada");
					
				}else {
					if(!facana.verificarCompte(NIF, numCompte)) { //Verifica que la compta pertanyi a aquesta persona
						System.out.println("Aquesta compta no pertany a aquesta persona");
						
					}else {
						facana.cancelarCompte(numCompte); //Si tot esta b�, es cancela la compte
					}
				}
			}
        }
    }
}

