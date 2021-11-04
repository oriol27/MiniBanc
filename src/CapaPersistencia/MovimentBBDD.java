package CapaPersistencia;

import CapaDomini.Moviment;


import java.sql.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class MovimentBBDD {

    public MovimentBBDD(){


    }

    public void introMovimentBBDD(String numCompte, Moviment m)throws Exception{
        java.util.Date dt = new java.util.Date();

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String currentTime = sdf.format(dt);
        try(Connection conn = BBDD.getConnexio();
            PreparedStatement pst = conn.prepareStatement("INSERT INTO Moviment (quantitat,tipus,numCompte, data) VALUES (?,?,?,?);")){
            pst.setInt(1, m.getQuantitat());
            pst.setInt(2, m.getTipus());
            pst.setString(3, numCompte);
            pst.setString(4, currentTime);
            pst.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public ArrayList<Moviment> FerExtracte(String numCompte,String data)throws Exception{

        Connection conn = BBDD.getConnexio();
        ResultSet rs;
        try (PreparedStatement pst = conn.prepareStatement("Select * From Moviment Where numCompte = ? ;")) {
            pst.setString(1, numCompte);
            rs = pst.executeQuery();
            ArrayList moviments = new ArrayList();
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date d = date.parse(data);
            while(rs.next()) {
                Date fecha = rs.getDate("data");
                if (d.before(fecha)) {
                    Moviment m = new Moviment(rs.getInt("numOperacio"), rs.getInt("tipus"), rs.getInt("quantitat"), fecha);
                    moviments.add(m);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
}
