package com.example.droidgram.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionService {
    Connection con;

    public Connection getCon() {
        return con;
    }

    public static final String user = "root";
    public static final String password = "root";
    public static final String url = "jdbc:mysql://127.0.0.1:3307/droidgram";

    //TODO write test for DBConnectionService class

    /**
     * Default connects to "jdbc:mysql://127.0.0.1:3307/droidgram"
     */
    public String createConnection(){
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            this.con = con;
            return "Connected...";
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
            return "Connection to Database failed...";

        }
    }

    /**
     *  Connects to specified URL
     */
    public String createConnection(String dbURL ){
        try {
            Connection con = DriverManager.getConnection(dbURL, user, password);
            this.con = con;
            return "Connected...";
        }
        catch (SQLException throwables) {
            return "Connection to Database failed...";

        }
    }
}




