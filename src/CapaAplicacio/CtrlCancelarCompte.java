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
            System.out.println("Hi ha valors nulls");
            throw new Exception();
        } else {
            Compte compte = facana.existeixCompte(numCompte); //Comprova si la compta existeix, si es aixi la retorna
            String compteNull = "Compte{" +
                    "numCompte='" + null + '\'' +
                    ", data_obertura=" + null +
                    ", data_cancelacio=" + null +
                    ", saldo=" + 0 +
                    '}';
            if (compte.toString().equals(compteNull)) {
                System.out.println("No existeix aquest compte");
                throw new Exception();
            } else {
                if (compte.estasCancelat()) { //Comprova si la compta ja esta cancelada
                    System.out.println("Aquest compte ya està cancelat");
                    throw new Exception();
                } else {
                    if (!facana.verificarCompte(NIF, numCompte)) { //Verifica que la compta pertanyi a aquesta persona
                        System.out.println("Aquest compte no pertany a aquesta persona");
                        throw new Exception();
                    } else {
                        facana.cancelarCompte(numCompte); //Si tot esta b�, es cancela la compte
                    }
                }
            }
        }
    }
}

