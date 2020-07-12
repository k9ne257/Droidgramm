package com.example.droidgram.services;

import com.example.droidgram.models.Account;
import com.example.droidgram.services.AccountCreator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountCreatorTest {


    @Test
    public void createSuccces() {
        Account acc =  Account.addAccount ("Max","Mustermann","Max123","max@email.com","password");
        AccountCreator creator = new AccountCreator(acc);
        Boolean created = creator.create();
        assertEquals( created, true );
    }

    @Test
    public void createFail() {
        Account acc =  Account.addAccount ("Steve","Beispiel","Stevie341","steve@email.com","password");
        AccountCreator creator = new AccountCreator(acc);
        Boolean created = creator.create();
        assertEquals( created, false );
    }
}
