package CapaAplicacio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import CapaDomini.Compte;
import CapaPersistencia.CompteBBDD;
import CapaPersistencia.FacanaBBDD;

public class CtrlCancelarCompte {

    public FacanaBBDD facana;

    public CtrlCancelarCompte() throws Exception {
        facana = new FacanaBBDD();
    }

    public void Cancelar_Compte(String NIF, String numCompte) throws Exception {

        if (NIF.isEmpty() || numCompte.isEmpty()) { //Comprova si hi ha valors nulls
            throw new Exception("Cal omplir totes les dades");
        } else {
            Compte compte = facana.existeixCompte(numCompte); //Comprova si la compta existeix, si es aixi la retorna
            String compteNull = "Compte{" +
                    "numCompte='" + null + '\'' +
                    ", data_obertura=" + null +
                    ", data_cancelacio=" + null +
                    ", saldo=" + 0 +
                    '}';
            if (compte.toString().equals(compteNull)) {
                throw new Exception("No existeix aquest compte");
            } else if (!facana.verificarCompte(NIF, numCompte)) { //Comprova si la compta ja esta cancelada
                throw new Exception("Aquest compte no pertany a aquesta persona");
            } else if (compte.estasCancelat()) { //Verifica que la compta pertanyi a aquesta persona
                throw new Exception("Aquest compte ja està cancel·lat");
            } else {
                facana.cancelarCompte(numCompte); //Si tot esta b�, es cancela la compte
            }
        }
    }
}


