package com.example.droidgram.services;

import com.mysql.cj.xdevapi.DbDoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionService {
    //TODO requires implementation
    Connection con;
    private static final String user = "hoster";
    private static final String password = "CYBERtroop.1994";
    private static final String url = "jdbc:mysql://188.166.164.42:3306/droidgram";

    //TODO write test for DBConnectionService class

    public DBConnectionService() {

    }

    public Connection getCon() {
        return con;
    }
}





