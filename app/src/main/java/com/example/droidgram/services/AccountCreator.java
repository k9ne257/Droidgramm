package com.example.droidgram.services;

import com.example.droidgram.models.Account;

public class AccountCreator {
    DBConnectionService db;
    Account account;
    //TODO write tests for class


    public AccountCreator(Account account) {
        this.account = account;
    }

    public boolean create(){
        //TODO this methods adds the account to the DB

        if(account.getFirstName().equals("Max")){
            return true;
        }
        return false;
    }

}
