package com.example.droidgram.manager;

import com.example.droidgram.models.Account;
import com.example.droidgram.services.DBConnectionService;

import java.sql.*;

public class AccountManager {
    Connection con = new DBConnectionService().getCon();
    Boolean successfull;

    Account account;
    //TODO write unit tests for class

    public AccountManager(Account account) {
        this.account = account;
    }


    public void remove_from_DB(){
        //TODO this method needs tests
        String query ="DELETE FROM accounts WHERE username ='" + account.getUser() + "';";
        try {
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
            System.out.println("unable to remove row from DB");
            e.printStackTrace();
        }

    }

    public void add_to_DB(){
        //TODO manually test this method
        String query ="insert into accounts values ('" + account.getFirstName() + "', '" + account.getLastName() + "', '" + account.getUser() + "', '" + account.getEmail() + "',' " + account.getPassword() + "');";
        try {
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
