package CapaAplicacio;

import CapaPersistencia.*;


public class CtrlAltaCompte {

    public FacanaBBDD facana;
    
    public CtrlAltaCompte() throws Exception{
        facana = new FacanaBBDD();
    }
    
    public String Alta_Compte(String NIF,String Nom)throws Exception {
        //Verificar camps no nulls:
        if (NIF.equals("") && Nom.equals("")) {
            System.out.println("El Nom i el NIF no poden estar buits");
            throw new Exception();
        } else if (Nom.equals("")) {
            System.out.println("El Nom no pot estar buit");
            throw new Exception();
        } else if (NIF.equals("")) {
            System.out.println("El NIF no pot estar buit");
            throw new Exception();
        } else {
            if (!facana.comprovaLletraNIF(NIF)) {
                System.out.println("El DNI no es correcte");
                throw new Exception();
            } else {
                //Verificar si existeix el Client a la base de dades:
                boolean existeixClient = facana.existeixClient(NIF);
                if (!existeixClient) {
                    //Introduïm el nou compte a la BBDD i retornem el nou número de compte:
                    facana.introClient(NIF, Nom);
                } else {
                    System.out.println("El client ja existeix, compte afegit al client");
                }
                return facana.introCompte(NIF);
            }
        }
    }
}
