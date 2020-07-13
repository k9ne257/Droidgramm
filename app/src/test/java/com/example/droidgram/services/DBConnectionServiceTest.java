package com.example.droidgram.services;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DBConnectionServiceTest {
    @Test
    public void connectSuccess() {
        String url = "jdbc:mysql://127.0.0.1:3307/droidgram";
        DBConnectionService dbService =  new DBConnectionService();
        assertEquals( dbService.createConnection(url), "Connected..." );
    }

    @Test
    public void connectFail() {
        String url = "jdbc:mysql://127.0.0.1:3447/droidgram";
        DBConnectionService dbService =  new DBConnectionService();
        assertEquals( dbService.createConnection(url), "Connection to Database failed..." );
    }
}
