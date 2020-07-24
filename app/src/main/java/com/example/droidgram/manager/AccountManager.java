package com.example.droidgram.manager;

import com.example.droidgram.models.Account;
import com.example.droidgram.services.DBConnectionService;

import java.sql.*;

public class AccountManager {
    private static final String user = "hoster";
    private static final String password = "CYBERtroop.1994";
    private static final String url = "jdbc:mysql://188.166.164.42:3306/droidgram";

    Boolean successfull;

    //TODO write unit tests for class


    public void remove_from_DB(Account account){
        //TODO this method needs tests
        String query ="DELETE * from accounts WHERE username ='" + account.getUser() + "';";
        try {
            Statement st = DriverManager.getConnection( url, user, password).createStatement();
            int rs = st.executeUpdate(query);
            if (rs == 1){
                successfull = true;
            }
            else{
                successfull = false;
            }
        }
        catch (SQLException e) {
            System.out.println("unable to remove row from DB");
            e.printStackTrace();
        }

    }

    public void add_to_DB(Account account){
        //TODO manually test this method
        String query ="INSERT into accounts values ('" + account.getFirstName() + "', '" + account.getLastName() + "', '" + account.getUser() + "', '" + account.getEmail() + "', '" + account.getPassword() + "');";
        try {
            Connection con = DriverManager.getConnection( url, user, password);
            Statement st = con.createStatement();
            int rs = st.executeUpdate(query);
            if (rs == 1){
                successfull = true;
            }
            else{
                successfull = false;
            }
        }
        catch (SQLException e) {
            System.out.println("unable to add row to DB");
            e.printStackTrace();
        }
    }

}
