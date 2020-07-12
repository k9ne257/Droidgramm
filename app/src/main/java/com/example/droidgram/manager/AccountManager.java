package com.example.droidgram.services;

import com.example.droidgram.models.Account;
import java.sql.*;

public class AccountCreator {
    Connection con = new DBConnectionService().getCon();
    Boolean successfull;

    Account account;
    //TODO write tests for class

    public AccountCreator(Account account) {
        this.account = account;
    }

    public void add_to_DB(){
        //TODO this methods adds the account to the DB
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
            e.printStackTrace();
        }


    }

}
