package Controleur;

import Model.Adherent;
import Model.Inscription;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static DAL.ClientSql.getConnection;

public class DataSQL {

    public static ArrayList<Adherent> getUsers(){
        ArrayList<Adherent> users = new ArrayList<Adherent>();
        Connection con = getConnection();
        Statement st;
        ResultSet rs;
        Adherent u;


        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM personne c INNER JOIN adherent p on c.id = p.id ");
            System.out.println(rs);
            while (rs.next()){
                u = new Adherent(
                        rs.getString("nom"),
                        rs.getString("prénom"),
                        rs.getInt("tel"),
                        rs.getString("adres"),
                        rs.getString("mail"),
                        rs.getString("niveaux"));
                users.add(u);
            }
        } catch (SQLException e) {
            System.out.println("pas de connection possible avec la BDD");
            e.printStackTrace();
        }


        return users;
    }


    public static ArrayList<Inscription> getCours(int numadcour){
        ArrayList<Inscription> users = new ArrayList<Inscription>();
        Connection con = getConnection();
        Statement st;
        ResultSet rs;
        Inscription u;


        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT b.idad, b.idcours, b.paye ,ccour.id, ccour.heur, ccour.prix, ccour.instrument, instru.id, instru.nomintru " +
                    "FROM inscription b, cours ccour, instrument instru " +
                    "where instru.id = ccour.instrument and b.idcours = ccour.id and b.idad =" + numadcour);
            System.out.println(rs);
            while (rs.next()){
                u = new Inscription(
                        rs.getString("nomintru"),
                        rs.getString("heur"),
                        rs.getInt("paye"),
                        rs.getInt("prix"));
                users.add(u);
            }
        } catch (SQLException e) {
            System.out.println("pas de connection possible avec la BDD");
            e.printStackTrace();
        }


        return users;
    }
}
