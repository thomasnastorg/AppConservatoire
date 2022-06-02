package Controleur;

import Model.Adherent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static Controleur.ClientSql.getConnection;

public class DataSQL {

    public static ArrayList<Adherent> getUsers(){
        ArrayList<Adherent> users = new ArrayList<Adherent>();
        Connection con = getConnection();
        Statement st;
        ResultSet rs;
        Adherent u;


        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM `client`");
            System.out.println(rs);
            while (rs.next()){
                u = new Adherent(
                        rs.getString("id"),
                        rs.getString("id"),
                        rs.getString("id"),
                        rs.getString("id"),
                        rs.getString("niveaux"));
                users.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return users;
    }
}
