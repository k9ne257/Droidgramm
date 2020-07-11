package com.example.droidgram.services;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionService {

    static Connection con;

    public static final String dbUser = "user";
    public static final String dbPassword = "user";
    public static final String url = "jdbc:mysql://localhost/droidgram";

    public static void main(String[] args) {
        try {
            con = DriverManager.getConnection(url,dbUser,dbPassword);
            System.out.println("Connected...");
        } catch (SQLException e) {
            System.out.println("could not get a connection");
        }
    }
}




