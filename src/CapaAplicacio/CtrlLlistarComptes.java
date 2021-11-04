package CapaAplicacio;

import CapaDomini.Compte;
import CapaPersistencia.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;


public class CtrlLlistarComptes {

    public FacanaBBDD facana;

    public CtrlLlistarComptes() throws Exception {

        facana = new FacanaBBDD();

    }

    public String[] Llistar_Comptes(String NIF) throws Exception {

        //Verificar camps no nulls:
        if (NIF.equals("")) {
            throw new IllegalArgumentException("El NIF no pot estar buit");
        }
        //Verificar lletra del NIF
        else if (!facana.comprovaLletraNIF(NIF)) {
            throw new IllegalArgumentException("La lletra del NIF no és correcte");
        }

        ArrayList<Compte> lista = facana.Llistar_Comptes(NIF);
        String[] llista_comptes =new String[lista.size()];


        for(int i=0;i<lista.size();i++){
            llista_comptes[i] = lista.get(i).numCompte;
        }


        return llista_comptes;
        }
    }
