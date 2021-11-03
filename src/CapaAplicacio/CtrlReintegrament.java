package CapaAplicacio;

import CapaDomini.Compte;
import CapaDomini.Moviment;
import CapaPersistencia.*;

public class CtrlReintegrament {

    public FacanaBBDD facana;

    public CtrlReintegrament() throws Exception {

        //Crear nova Façana:
        facana = new FacanaBBDD();

    }

    public void Fer_Reintegrament(String NIF, String numCompte, String Quantitat) throws Exception {


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
        if (!facana.comprovaLletraNIF(NIF)) {
            throw new IllegalArgumentException("La lletra del dni no és vàlida");
        }

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

        //Verificar que el compte no està cancel·lat:
        if (!facana.compteCancelat(NIF, numCompte)) {
            throw new IllegalArgumentException("Aquest compte està cancel·lat");
        }

        //Verificar que la quantitat a reintegrar no és superior al saldo existent en el compte:
        if (!facana.quantitatMenorSaldo(numCompte, Integer.parseInt(Quantitat))) {
            throw new IllegalArgumentException("No disposes de saldo suficient per realitzar la operació");
        }

        //Verificar que el compte pertany al NIF:
        if (!facana.nifNumCompte(NIF, numCompte)) {
            throw new IllegalArgumentException("El NIF no es correspon amb el número de compte");
        }

        //Disminuir saldo:
        facana.disminuir_saldo(numCompte, Quantitat);

        //Enregistrar moviment de reintegració:
        Moviment m = new Moviment(-1, Integer.parseInt(Quantitat));
        facana.introMoviment(numCompte, m);
    }
}
