package com.example.droidgram.manager;

import com.example.droidgram.models.Account;
import com.example.droidgram.manager.AccountManager;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountManagerTest {


    @Test
    public void createSuccces() {
        Account acc =  Account.addAccount ("Max","Mustermann","Max123","max@email.com","password");
        AccountManager creator = new AccountManager(acc);
//        Boolean created = creator.create();
//        assertEquals( created, true );
    }

    @Test
    public void createFail() {
        Account acc =  Account.addAccount ("Steve","Beispiel","Stevie341","steve@email.com","password");
        AccountManager creator = new AccountManager(acc);
//        Boolean created = creator.create();
//        assertEquals( created, false );
    }
}
