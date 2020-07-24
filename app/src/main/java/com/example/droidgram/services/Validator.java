package com.example.droidgram.services;

import com.example.droidgram.models.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Validator {
    //TODO tests for Validator class required

    public static final String user = "hoster";
    public static final String password = "CYBERtroop.1994";
    public static final String url = "jdbc:mysql://188.166.164.42:3306/droidgram";
    private Boolean valid = true;

    //TODO SQL injection vulnerability
    public boolean validateLogin(String inputUsername, String inputPassword){

        String query = "SELECT * from accounts WHERE username = '" + inputUsername + "';";
        try {

            Statement st = DriverManager.getConnection( url, user, password).createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                if(inputPassword.equals(rs.getString(5))) {
                    return valid;
                }
                else {
                    return !valid;
                }
            }
            return !valid;
        }
        catch (SQLException e) {
            e.printStackTrace();
            return !valid;
        }
    }

    /**
     * This method makes sure that a valid email address is entered
     */
    public boolean validateEmailInput(String email) {
        if (email.equals("")){
            return true;
        }
        //TODO validate with a regex
        else if(!email.contains("@")){
            return true;
        }
        return false;
    }

    /**
     * This method makes sure that a valid password is entered
     */
    public boolean validatePassowordInput(String password) {
        if (password.equals("")){
            return true;
        }
        else if (password.length() < 6){
            return true;
        }

        return false;
    }


}
