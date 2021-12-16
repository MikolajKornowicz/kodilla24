package com.kodilla.challenges;

public class Buyer {

    private String username;
    private String name;
    private String surname;
    public String eMail;

    public Buyer(String username, String name, String surname, String eMail) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String geteMail() {
        return eMail;
    }
}
