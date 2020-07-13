package com.example.droidgram.manager;

import com.example.droidgram.models.User;
import com.example.droidgram.services.DBConnectionService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Usermanager {

    Connection con = new DBConnectionService().getCon();
    User user;
    Boolean successfull;

    public Usermanager(User user) {
        this.user = user;
    }

    public void remove_from_DB(){
        //TODO this querry should delete a row from the account tabl in the DB
        String query ="DELETE FROM accounts WHERE username ='" + user.getUsername() + "';";
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
        String query ="insert into users values ('" +
                user.getUsername() + "', '" +
                user.getFollowers() + "', '" +
                user.getNumberOfProjects() + "', '" +
                user.getFollowing() + "',' " +
                user.getLocation() + "');";

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
