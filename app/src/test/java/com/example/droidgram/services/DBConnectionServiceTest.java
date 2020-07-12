package com.example.droidgram.services;

import com.example.droidgram.models.Account;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DBConnectionService {
    @Test
    public void connectSuccess() {
        DBConnectionService dbService =  new DBConnectionService();
        assertEquals( dbService.createConnection(), "Connected..." );
    }
}
