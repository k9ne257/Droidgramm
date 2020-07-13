package com.example.droidgram.services;

import com.example.droidgram.models.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Validate {
    Connection con = new DBConnectionService().getCon();


    public boolean validateUsername(Account acc){
        String username = acc.getUser();
        String query = "Select * From accounts Where username = '" + username + "';";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                String userDB = rs.getString(3);
                String passwprdDB = 
                if()
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validatePassword(Account acc){
        String username = acc.getPassword();
        return false;

    }

}
