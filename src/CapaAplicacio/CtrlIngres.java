package CapaAplicacio;

import CapaDomini.Compte;
import CapaDomini.Moviment;
import CapaPersistencia.*;

public class CtrlIngres {

    public FacanaBBDD facana;
    
    public CtrlIngres() throws Exception {
        
        //Crear nova Façana:
        facana = new FacanaBBDD();
    }
    
    public void Fer_Ingres(String numCompte,String Quantitat) throws Exception {

        //Verificar camps no nulls:
        if (numCompte.isEmpty() || numCompte == null || numCompte.isBlank()) {
            throw new IllegalArgumentException("El número de compte no pot estar buit");
        }
        if (Quantitat.isEmpty() || Quantitat == null || Quantitat.isBlank()) {
            throw new IllegalArgumentException("La quantitat no pot estar buida");
        }

        //Verificar que existeix el compte:
        Compte compte = facana.existeixCompte(numCompte);
        String compteNull = "Compte{" +
                "numCompte='" + null + '\'' +
                ", data_obertura=" + null +
                ", data_cancelacio=" + null +
                ", saldo=" + 0 +
                '}';
        if (compte.toString().equals(compteNull)) {
            throw new IllegalArgumentException("Aquest compte no existeix");
        }

        //Verificar que el compte no està cancel·lat:
        if (!facana.compteCancelat(numCompte)) {
            throw new IllegalArgumentException("Aquest compte està cancel·lat");
        }

        //Enregistrar el moviment d'ingrés:
        Moviment m = new Moviment(1, Integer.parseInt(Quantitat));
        facana.introMoviment(numCompte, m);

        //Augmentar el saldo del compte de la B.D:
        int Quantitat_final = compte.saldo + Integer.parseInt(Quantitat);
        facana.augmentarSaldo(numCompte, Quantitat_final);
    }
}
