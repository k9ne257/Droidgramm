package com.example.droidgram.models;

public class Account {
    private String firstName;
    private String lastName;
    private String user;
    private String email;
    private String password;

    private Account(String firstName, String lastName, String user, String email, String password) {
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

        //TODO should craete new user with the username
    }

    public static Account addAccount(String firstName, String lastName, String user, String email, String password) {
        return new Account(firstName,lastName, user, email, password);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
