package CapaAplicacio;

import CapaPersistencia.*;


public class CtrlAltaCompte {

    public FacanaBBDD facana;
    
    public CtrlAltaCompte() throws Exception{
        facana = new FacanaBBDD();
    }
    
    public String Alta_Compte(String NIF,String Nom)throws Exception {
        //Verificar camps no nulls:
        if (NIF == null && Nom == null) {
            System.out.println("El Nom i el NIF no poden estar buits");
        } else if (Nom == null) {
            System.out.println("El Nom no pot estar buit");
        } else if (NIF == null) {
            System.out.println("El NIF no pot estar buit");
        } else {
            //Verificar lletra del NIF:
            int DNI = Integer.parseInt((NIF.substring(0, 8)));
            int resta = 0;
            String lletra = "";
            String[] asignacio = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
            resta = DNI % 23;
            lletra = asignacio[resta];

            String ultimaLletra = NIF.substring(NIF.length() - 1);
            if (!ultimaLletra.equals(lletra)) {
                System.out.println("El DNI no es correcte");
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
        return null;
    }
}
