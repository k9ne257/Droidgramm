package com.example.droidgram.services;

import com.example.droidgram.models.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Validator {
    Connection con = new DBConnectionService().getCon();
    private Boolean valid = true;


    public boolean validateLogin(String inputUsername, String inputPassword){

        String query = "Select * From accounts Where username = '" + inputUsername + "';";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                String userDB = rs.getString(3);
                String passwprdDB = rs.getString(5);
                if(inputUsername.equals(userDB) && inputPassword.equals(passwprdDB)){
                    return valid;
                }
            }
            return !valid;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
